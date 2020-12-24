package com.touchkiss.dy.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateModelPremium {
    public static final String LINE_SEPERATOR = "";
    public final static String BASE_PACKAGE = "com.touchkiss.";
    public final static String JDBC_URL = "jdbc:mysql://112.126.56.26:3306/aweme?characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai&nullCatalogMeansCurrent=true&allowPublicKeyRetrieval=true";
    public final static String DATABASE_USERNAME = "root";
    public final static String DATABASE_PASSWORD = "mouse";


    final static DateFormat DF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private final String type_char = "char";
    private final String type_int = "int";
    private final String type_bigint = "bigint";
    private final String type_text = "text";
    private final String type_decimal = "decimal";
    private final String type_bit = "bit";
    private final String type_date = "date";

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 3);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        CreateModelPremium ctfile = new CreateModelPremium();
        List<String> columns = new ArrayList<String>();
        List<String> fields = new ArrayList<String>();
        List<String> types = new ArrayList<String>();
        List<String> comments = new ArrayList<String>();
        List<Boolean> canNulls = new ArrayList<>();
        String autoIncrementColumn = null;
        //本地创建文件夹，G:\NewWork\code
        String filepath = "D:\\aweme";
        List<TableInfo> tableInfoList = new ArrayList<>();
        tableInfoList.add(new TableInfo("AwemeUserInfo", "aweme_user_info", "aweme", "aweme"));
        tableInfoList.add(new TableInfo("AwemeUserFollowersDetail", "aweme_user_followers_detail", "aweme", "aweme"));
        tableInfoList.add(new TableInfo("AwemeStickerInfo", "aweme_sticker_info", "aweme", "aweme"));
        tableInfoList.add(new TableInfo("AwemeMusicInfo", "aweme_music_info", "aweme", "aweme"));
        tableInfoList.add(new TableInfo("AwemeMixInfo", "aweme_mix_info", "aweme", "aweme"));
        tableInfoList.add(new TableInfo("AwemeItemStatus", "aweme_item_status", "aweme", "aweme"));
        tableInfoList.add(new TableInfo("AwemeItemStatistics", "aweme_item_statistics", "aweme", "aweme"));
        tableInfoList.add(new TableInfo("AwemeItemStatistics", "aweme_item_statistics", "aweme", "aweme"));
        tableInfoList.add(new TableInfo("AwemeItemComment", "aweme_item_comment", "aweme", "aweme"));
        tableInfoList.add(new TableInfo("AwemeItemChallenge", "aweme_item_challenge", "aweme", "aweme"));
        tableInfoList.add(new TableInfo("AwemeItem", "aweme_item", "aweme", "aweme"));
        tableInfoList.add(new TableInfo("AwemeChallengeInfo", "aweme_challenge_info", "aweme", "aweme"));

        DruidPooledConnection con = ctfile.getConnect();
        Pattern compile = Pattern.compile("_[a-z]");
        for (TableInfo tableInfo : tableInfoList) {
            if (con != null) {
                try {
                    PreparedStatement preparedStatement = con.prepareStatement("show full columns from " + tableInfo.getTableName());
                    ResultSet rs = preparedStatement.executeQuery();
                    columns.clear();
                    autoIncrementColumn = null;
                    types.clear();
                    fields.clear();
                    comments.clear();
                    canNulls.clear();
                    while (rs.next()) {
                        String column = rs.getString("FIELD");
                        columns.add(column);
                        Matcher matcher = compile.matcher(column);
                        String field = column;
                        while (matcher.find()) {
                            String group = matcher.group(0);
                            field = field.replaceFirst(group, group.substring(1).toUpperCase());
                        }
                        fields.add(field);
                        types.add(rs.getString("TYPE"));
                        comments.add(rs.getString("comment"));
                        canNulls.add("YES".equalsIgnoreCase(rs.getString("NULL")));
                        if ("auto_increment".equalsIgnoreCase(rs.getString("Extra"))) {
                            autoIncrementColumn = column;
                        }
                    }
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            try {
                ctfile.createModel(columns, fields, types, comments, filepath, tableInfo.getBeanName(), tableInfo.getModuleName(), tableInfo.getTableName(), true);
                ctfile.createDao(filepath, tableInfo.getBeanName(), tableInfo.getModuleName(), ctfile.Jtype(types.get(0)), fields.get(0), autoIncrementColumn);
                ctfile.createService(filepath, tableInfo.getBeanName(), tableInfo.getModuleName(), ctfile.Jtype(types.get(0)), fields.get(0), autoIncrementColumn);
                ctfile.createServiceImpl(filepath, tableInfo.getBeanName(), tableInfo.getModuleName(), ctfile.Jtype(types.get(0)), fields, autoIncrementColumn);
                ctfile.createXml(columns, fields, types, filepath, tableInfo.getBeanName(), tableInfo.getModuleName(), tableInfo.getTableName(), autoIncrementColumn);
                ctfile.createRestController(filepath, tableInfo.getBeanName(), tableInfo.getModuleName(), ctfile.Jtype(types.get(0)), fields, tableInfo.getRequestPath(), autoIncrementColumn);
                ctfile.createItemView(filepath, tableInfo.getBeanName(), columns, fields, types, comments, canNulls, columns.get(0), tableInfo.getRequestPath(), tableInfo.getModuleName());
                ctfile.createListView(columns, fields, types, comments, filepath, tableInfo.getBeanName(), tableInfo.getModuleName(), tableInfo.getTableName(), fields.get(0), tableInfo.getRequestPath());
                ctfile.createItemReadonly(filepath, tableInfo.getBeanName(), columns, fields, comments);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    //bean
    private void createModel(List<String> columns, List<String> fields, List<String> types, List<String> comments, String path, String bean, String module, String tab, boolean useLombok) throws Exception {
        FileUtils.forceMkdir(new File(path + "/" + module + "/bean"));
        String fullPath = path + "/" + module + "/bean/" + bean + ".java";
        File myFilePath = new File(fullPath);
        if (!myFilePath.exists()) {
            myFilePath.createNewFile();
        }
        FileWriter resultFile = new FileWriter(myFilePath);
        PrintWriter myFile = new PrintWriter(resultFile);
        myFile.println("package " + BASE_PACKAGE + module + ".bean;");
        if (useLombok) {
            myFile.println(LINE_SEPERATOR);
            myFile.println("import lombok.Data;");
        }
        if (types.stream().anyMatch("date"::equals)) {
            myFile.println(LINE_SEPERATOR);
            myFile.println("import java.sql.Date;");
        }
        myFile.println(LINE_SEPERATOR);
        myFile.println("/**");
        myFile.println(" * Created on " + DF.format(new Date()));
        myFile.println(" *");
        myFile.println(" * @author Touchkiss");
        myFile.println(" */");
        if (useLombok) {
            myFile.println("@Data");
        }
        myFile.println("public class " + bean + " {");
        String colName; // 列名
        String type; // 类型
        String comment; // 备注
        String colNameUp;
        int size = columns.size();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            colName = fields.get(i);
            colNameUp = colName.substring(0, 1).toUpperCase()
                    + colName.substring(1);
            type = types.get(i);
            comment = comments.get(i);
            myFile.println("	private " + Jtype(type) + " " + colName + "; //" + comment);
            if (!useLombok) {
                stringBuilder.append("	public ").append(Jtype(type)).append(" get").append(colNameUp).append("() { \r").append("\n")
                        .append("		return this." + colName + ";\r" + "\n")
                        .append("	}\r" + "\n")
                        .append(LINE_SEPERATOR + "\n")
                        .append("	public void set" + colNameUp + "(" + Jtype(type) + " " + colName + ") { \r" + "\n")
                        .append("		this." + colName + "=" + colName + ";\r" + "\n")
                        .append("	}\r" + "\n")
                        .append(LINE_SEPERATOR + "\n");
            }
        }
        if (!useLombok) {
            myFile.println(LINE_SEPERATOR);
            myFile.println(stringBuilder.toString());
        }
        myFile.println("}");
        resultFile.close();
    }

    //dao层  ptype主键类型 pname主键名称
    private void createDao(String path, String bean, String module, String ptype, String pname, String autoIncrementColumn) throws Exception {
        boolean audoIncrement = false;
        if (autoIncrementColumn != null && !"".equals(autoIncrementColumn.trim())) {
            audoIncrement = true;
            autoIncrementColumn = autoIncrementColumn.substring(0, 1).toUpperCase() + autoIncrementColumn.substring(1);
        }
        String pnameUpperFirst = pname.substring(0, 1).toUpperCase() + pname.substring(1);
        String beanLowerFirst = bean.substring(0, 1).toLowerCase() + bean.substring(1);
        FileUtils.forceMkdir(new File(path + "/" + module + "/dao/"));
        String fullPath = path + "/" + module + "/dao/" + bean + "DaoM.java";
        File myFilePath = new File(fullPath);
        if (!myFilePath.exists()) {
            myFilePath.createNewFile();
        }
        FileWriter resultFile = new FileWriter(myFilePath);
        PrintWriter myFile = new PrintWriter(resultFile);
        myFile.println("package " + BASE_PACKAGE + module + ".mapper;");
        myFile.println(LINE_SEPERATOR);
        myFile.println("import " + BASE_PACKAGE + module + ".bean." + bean + ";");
        myFile.println("import com.github.pagehelper.Page;");
        myFile.println("import org.apache.ibatis.annotations.Mapper;");
        myFile.println("import org.apache.ibatis.annotations.Param;");
        myFile.println(LINE_SEPERATOR);
        myFile.println("import java.util.List;");
        myFile.println("import java.util.Map;");
        myFile.println(LINE_SEPERATOR);
        myFile.println("/**");
        myFile.println(" * Created on " + DF.format(new Date()));
        myFile.println(" *");
        myFile.println(" * @author Touchkiss");
        myFile.println(" */");
        myFile.println("@Mapper");
        myFile.println("public interface " + bean + "DaoM {");
        myFile.println("	int insert(" + bean + " " + beanLowerFirst + ");");
        myFile.println(LINE_SEPERATOR);
        if (audoIncrement) {
            myFile.println("	int insertWithout" + autoIncrementColumn + "(" + bean + " " + beanLowerFirst + ");");
            myFile.println(LINE_SEPERATOR);
        }
        myFile.println("    int deleteBy" + pnameUpperFirst + "(" + ptype + " " + pname + ");");
        myFile.println(LINE_SEPERATOR);
        myFile.println("    int deleteByMap(@Param(\"wheres\") Map<String,String> wheres);");
        myFile.println(LINE_SEPERATOR);
        myFile.println("    int updateBy" + pnameUpperFirst + "(@Param(\"" + beanLowerFirst + "\") " + bean + " " + beanLowerFirst + ", @Param(\"" + pname + "\") " + ptype + " " + pname + ");");
        myFile.println(LINE_SEPERATOR);
        myFile.println("    int updateSelectiveBy" + pnameUpperFirst + "(@Param(\"" + beanLowerFirst + "\") " + bean + " " + beanLowerFirst + ", @Param(\"" + pname + "\") " + ptype + " " + pname + ");");
        myFile.println(LINE_SEPERATOR);
        myFile.println("    int updateSelectiveByMap(@Param(\"" + beanLowerFirst + "\") " + bean + " " + beanLowerFirst + ", @Param(\"wheres\") Map<String,String> wheres);");
        myFile.println(LINE_SEPERATOR);
        myFile.println("    " + bean + " selectBy" + pnameUpperFirst + "(" + ptype + " " + pname + ");");
        myFile.println(LINE_SEPERATOR);
        myFile.println("    List<" + bean + "> query" + bean + "List(@Param(\"wheres\") Map<String,String> wheres);");
        myFile.println(LINE_SEPERATOR);
        myFile.println("	Page<" + bean + "> findByPage(@Param(\"wheres\") Map<String, String> wheres);");
        myFile.println("}");
        resultFile.close();
    }

    //service
    private void createService(String path, String bean, String module, String ptype, String pname, String autoIncrementColumn) throws Exception {
        boolean audoIncrement = false;
        if (autoIncrementColumn != null && !"".equals(autoIncrementColumn.trim())) {
            audoIncrement = true;
            autoIncrementColumn = autoIncrementColumn.substring(0, 1).toUpperCase() + autoIncrementColumn.substring(1);
        }
        String pnameUpperFirst = pname.substring(0, 1).toUpperCase() + pname.substring(1);
        String beanLowerFirst = bean.substring(0, 1).toLowerCase() + bean.substring(1);
        FileUtils.forceMkdir(new File(path + "/" + module + "/services/"));
        String fullPath = path + "/" + module + "/services/" + bean + "DaoService.java";
        File myFilePath = new File(fullPath);
        if (!myFilePath.exists()) {
            myFilePath.createNewFile();
        }
        FileWriter resultFile = new FileWriter(myFilePath);
        PrintWriter myFile = new PrintWriter(resultFile);
        myFile.println("package " + BASE_PACKAGE + module + ".services;");
        myFile.println(LINE_SEPERATOR);
        myFile.println("import com.github.pagehelper.Page;");
        myFile.println("import " + BASE_PACKAGE + module + ".bean." + bean + ";");
        myFile.println("import java.util.Map;");
        myFile.println("import java.util.List;");
        myFile.println(LINE_SEPERATOR);
        myFile.println("/**");
        myFile.println(" * Created on " + DF.format(new Date()));
        myFile.println(" *");
        myFile.println(" * @author Touchkiss");
        myFile.println(" */");
        myFile.println("public interface " + bean + "DaoService {");
        myFile.println("	boolean insert(" + bean + " " + beanLowerFirst + ");");
        myFile.println(LINE_SEPERATOR);
        myFile.println("	boolean deleteBy" + pnameUpperFirst + "(" + ptype + " " + pname + ");");
        myFile.println(LINE_SEPERATOR);
        myFile.println("    int deleteByMap(Map<String, String> wheres);");
        myFile.println(LINE_SEPERATOR);
        myFile.println("    boolean updateBy" + pnameUpperFirst + "(" + bean + " " + beanLowerFirst + ", " + ptype + " " + pname + ");");
        myFile.println(LINE_SEPERATOR);
        myFile.println("    boolean updateSelectiveBy" + pnameUpperFirst + "(" + bean + " " + beanLowerFirst + ", " + ptype + " " + pname + ");");
        myFile.println(LINE_SEPERATOR);
        myFile.println("    int updateSelectiveByMap(" + bean + " " + beanLowerFirst + ", Map<String, String> wheres);");
        myFile.println(LINE_SEPERATOR);
        myFile.println("	" + bean + " selectBy" + pnameUpperFirst + "(" + ptype + " " + pname + ");");
        myFile.println(LINE_SEPERATOR);
        myFile.println("	List<" + bean + "> query" + bean + "List(Map<String, String> map);");
        myFile.println(LINE_SEPERATOR);
        myFile.println("	Page<" + bean + "> findByPage(int pageNo, int pageSize, Map<String, String> map);");
        myFile.println("}");
        resultFile.close();
    }

    //impl
    private void createServiceImpl(String path, String bean, String module, String ptype, List<String> fields, String autoIncrementColumn) throws Exception {
        boolean audoIncrement = false;
        String pname = fields.get(0);
        if (autoIncrementColumn != null && !"".equals(autoIncrementColumn.trim())) {
            audoIncrement = true;
            autoIncrementColumn = autoIncrementColumn.substring(0, 1).toUpperCase() + autoIncrementColumn.substring(1);
        }
        String pnameUpperFirst = pname.substring(0, 1).toUpperCase() + pname.substring(1);
        String beanLowerFirst = bean.substring(0, 1).toLowerCase() + bean.substring(1);
        FileUtils.forceMkdir(new File(path + "/" + module + "/services/impl/"));
        String fullPath = path + "/" + module + "/services/impl/" + bean + "DaoServiceImpl.java";
        File myFilePath = new File(fullPath);
        if (!myFilePath.exists()) {
            myFilePath.createNewFile();
        }
        boolean hasCreatetime = false, hasLastModifyTime = false;
        if (fields.stream().anyMatch("createTime"::equals)) {
            hasCreatetime = true;
        }
        if (fields.stream().anyMatch("lastModifyTime"::equals)) {
            hasLastModifyTime = true;
        }
        String colNameUp = pname.substring(0, 1).toUpperCase() + pname.substring(1);
        FileWriter resultFile = new FileWriter(myFilePath);
        PrintWriter myFile = new PrintWriter(resultFile);
        myFile.println("package " + BASE_PACKAGE + module + ".services.impl;");
        myFile.println(LINE_SEPERATOR);
        myFile.println("import " + BASE_PACKAGE + module + ".bean." + bean + ";");
        myFile.println("import " + BASE_PACKAGE + module + ".mapper." + bean + "DaoM;");
        myFile.println("import " + BASE_PACKAGE + module + ".services." + bean + "DaoService;");
        myFile.println("import com.github.pagehelper.Page;");
        myFile.println("import com.github.pagehelper.PageHelper;");
        myFile.println("import org.springframework.stereotype.Service;");
        myFile.println("import org.springframework.transaction.annotation.Transactional;");
        myFile.println(LINE_SEPERATOR);
        myFile.println("import javax.annotation.Resource;");
        myFile.println("import java.util.Map;");
        myFile.println("import java.util.List;");
        myFile.println(LINE_SEPERATOR);
        myFile.println("/**");
        myFile.println(" * Created on " + DF.format(new Date()));
        myFile.println(" *");
        myFile.println(" * @author Touchkiss");
        myFile.println(" */");
        myFile.println("@Service");
        myFile.println("@Transactional");
        myFile.println("public class " + bean + "DaoServiceImpl implements " + bean + "DaoService {");
        myFile.println("	@Resource");
        myFile.println("	" + bean + "DaoM " + beanLowerFirst + "DaoM;");
        myFile.println(LINE_SEPERATOR);
        myFile.println("	@Override");
        myFile.println("	public boolean insert(" + bean + " " + beanLowerFirst + ") {");
        if (hasCreatetime || hasLastModifyTime) {
            myFile.println("        long currentTimeMillis = System.currentTimeMillis();");
            if (hasCreatetime) {
                myFile.println("        if (" + beanLowerFirst + ".getCreateTime() == null) {");
                myFile.println("            " + beanLowerFirst + ".setCreateTime(currentTimeMillis);");
                myFile.println("        }");
            }
            if (hasLastModifyTime) {
                myFile.println("        if (" + beanLowerFirst + ".getLastModifyTime() == null) {");
                myFile.println("            " + beanLowerFirst + ".setLastModifyTime(currentTimeMillis);");
                myFile.println("        }");
            }
        }
        if (audoIncrement) {
            myFile.println("        if (" + beanLowerFirst + ".get" + pnameUpperFirst + "() == null) {");
            myFile.println("            return " + beanLowerFirst + "DaoM.insertWithout" + pnameUpperFirst + "(" + beanLowerFirst + ") == 1;");
            myFile.println("        }");
        }
        myFile.println("        return " + beanLowerFirst + "DaoM.insert(" + beanLowerFirst + ") == 1;");
        myFile.println("	}");
        myFile.println(LINE_SEPERATOR);
        myFile.println("	@Override");
        myFile.println("	public boolean deleteBy" + pnameUpperFirst + "(" + ptype + " " + pname + ") {");
        myFile.println("        return " + beanLowerFirst + "DaoM.deleteBy" + pnameUpperFirst + "(" + pname + ") == 1;");
        myFile.println("	}");
        myFile.println(LINE_SEPERATOR);
        myFile.println("    @Override");
        myFile.println("    public int deleteByMap(Map<String, String> wheres) {");
        myFile.println("        return " + beanLowerFirst + "DaoM.deleteByMap(wheres);");
        myFile.println("    }");
        myFile.println(LINE_SEPERATOR);
        myFile.println("    @Override");
        myFile.println("    public boolean updateBy" + pnameUpperFirst + "(" + bean + " " + beanLowerFirst + ", " + ptype + " " + pname + ") {");
        if (hasLastModifyTime) {
            myFile.println("        long currentTimeMillis = System.currentTimeMillis();");
            myFile.println("        " + beanLowerFirst + ".setLastModifyTime(currentTimeMillis);");
        }
        myFile.println("        return " + beanLowerFirst + "DaoM.updateBy" + pnameUpperFirst + "(" + beanLowerFirst + ", " + pname + ") == 1;");
        myFile.println("    }");
        myFile.println(LINE_SEPERATOR);
        myFile.println("    @Override");
        myFile.println("    public boolean updateSelectiveBy" + pnameUpperFirst + "(" + bean + " " + beanLowerFirst + ", " + ptype + " " + pname + ") {");
        if (hasLastModifyTime) {
            myFile.println("        long currentTimeMillis = System.currentTimeMillis();");
            myFile.println("        " + beanLowerFirst + ".setLastModifyTime(currentTimeMillis);");
        }
        myFile.println("        return " + beanLowerFirst + "DaoM.updateSelectiveBy" + pnameUpperFirst + "(" + beanLowerFirst + ", " + pname + ") == 1;");
        myFile.println("    }");
        myFile.println(LINE_SEPERATOR);
        myFile.println("    @Override");
        myFile.println("    public int updateSelectiveByMap(" + bean + " " + beanLowerFirst + ", Map<String, String> wheres) {");
        if (hasLastModifyTime) {
            myFile.println("        long currentTimeMillis = System.currentTimeMillis();");
            myFile.println("        " + beanLowerFirst + ".setLastModifyTime(currentTimeMillis);");
        }
        myFile.println("        return " + beanLowerFirst + "DaoM.updateSelectiveByMap(" + beanLowerFirst + ", wheres);");
        myFile.println("    }");
        myFile.println(LINE_SEPERATOR);
        myFile.println("    @Override");
        myFile.println("    public " + bean + " selectBy" + pnameUpperFirst + "(" + ptype + " " + pname + ") {");
        myFile.println("        return " + beanLowerFirst + "DaoM.selectBy" + pnameUpperFirst + "(" + pname + ");");
        myFile.println("    }");
        myFile.println(LINE_SEPERATOR);
        myFile.println("	@Override");
        myFile.println("	public List<" + bean + "> query" + bean + "List(Map<String, String> map) {");
        myFile.println("		return " + beanLowerFirst + "DaoM.query" + bean + "List(map);");
        myFile.println("	}");
        myFile.println(LINE_SEPERATOR);
        myFile.println("	@Override");
        myFile.println("	public Page<" + bean + "> findByPage(int pageNo, int pageSize, Map<String, String> map) {");
        myFile.println("		PageHelper.startPage(pageNo, pageSize);");
        myFile.println("		return " + beanLowerFirst + "DaoM.findByPage(map);");
        myFile.println("	}");
        myFile.println("}");
        resultFile.close();
    }

    private void createRestController(String path, String bean, String module, String ptype, List<String> fields, String requestPath, String autoIncrementColumn) throws Exception {
        boolean audoIncrement = false;
        String pname = fields.get(0);
        if (autoIncrementColumn != null && !"".equals(autoIncrementColumn.trim())) {
            audoIncrement = true;
            autoIncrementColumn = autoIncrementColumn.substring(0, 1).toUpperCase() + autoIncrementColumn.substring(1);
        }
        String pnameUpperFirst = pname.substring(0, 1).toUpperCase() + pname.substring(1);
        String beanLowerFirst = bean.substring(0, 1).toLowerCase() + bean.substring(1);
        FileUtils.forceMkdir(new File(path + "/" + module + "/controller/"));
        String fullPath = path + "/" + module + "/controller/" + bean + "Controller.java";
        File myFilePath = new File(fullPath);
        if (!myFilePath.exists()) {
            myFilePath.createNewFile();
        }
        FileWriter resultFile = new FileWriter(myFilePath);
        PrintWriter myFile = new PrintWriter(resultFile);
        myFile.println("package " + BASE_PACKAGE + module + ".controller;");
        myFile.println(LINE_SEPERATOR);
        myFile.println("import " + BASE_PACKAGE + module + ".bean." + bean + ";");
        myFile.println("import " + BASE_PACKAGE + module + ".services." + bean + "DaoService;");
        myFile.println("import " + BASE_PACKAGE + "common.resp.PageResult;");
        myFile.println("import " + BASE_PACKAGE + "managerweb.controller.BaseController;");
        myFile.println("import org.springframework.beans.factory.annotation.Autowired;");
        myFile.println("import org.springframework.web.bind.annotation.*;");
        myFile.println(LINE_SEPERATOR);
        myFile.println("import javax.servlet.http.HttpServletRequest;");
        myFile.println("import java.util.HashMap;");
        myFile.println(LINE_SEPERATOR);
        myFile.println("/**");
        myFile.println(" * Created on " + DF.format(new Date()));
        myFile.println(" *");
        myFile.println(" * @author Touchkiss");
        myFile.println(" */");
        myFile.println("@RestController");
        myFile.println("@RequestMapping(\"" + requestPath + "\")");
        myFile.println("public class " + bean + "Controller implements BaseController {");
        myFile.println("    @Autowired");
        myFile.println("    private " + bean + "DaoService " + beanLowerFirst + "DaoService;");
        myFile.println(LINE_SEPERATOR);
        myFile.println("    @GetMapping(\"" + beanLowerFirst + "\")");
        myFile.println("    public PageResult list(HttpServletRequest request, Integer p, Integer pagesize) {");
        myFile.println("        HashMap<String, String> whereMap = parameterMap(request);");
        myFile.println("        return new PageResult(" + beanLowerFirst + "DaoService.findByPage(p == null ? 1 : p, pagesize == null ? 10 : pagesize, whereMap));");
        myFile.println("    }");
        myFile.println(LINE_SEPERATOR);
        myFile.println("    @GetMapping(\"/" + beanLowerFirst + "/{" + pname + "}\")");
        myFile.println("    public " + bean + " getOne(@PathVariable(\"" + pname + "\") " + ptype + " " + pname + ") {");
        myFile.println("        return " + beanLowerFirst + "DaoService.selectBy" + pnameUpperFirst + "(" + pname + ");");
        myFile.println("    }");
        myFile.println(LINE_SEPERATOR);
        myFile.println("    @DeleteMapping(\"/" + beanLowerFirst + "/{" + pname + "}\")");
        myFile.println("    public boolean deleteOne(@PathVariable(\"" + pname + "\") " + ptype + " " + pname + ") {");
        myFile.println("        return " + beanLowerFirst + "DaoService.deleteBy" + pnameUpperFirst + "(" + pname + ");");
        myFile.println("    }");
        myFile.println(LINE_SEPERATOR);
        myFile.println("    @PostMapping(\"" + beanLowerFirst + "\")");
        myFile.println("    public boolean insertOne(@RequestBody " + bean + " " + beanLowerFirst + ") {");
        myFile.println("        return " + beanLowerFirst + "DaoService.insert(" + beanLowerFirst + ");");
        myFile.println("    }");
        myFile.println(LINE_SEPERATOR);
        myFile.println("    @PutMapping(\"" + beanLowerFirst + "/{" + pname + "}\")");
        myFile.println("    public boolean updateOne(@RequestBody " + bean + " " + beanLowerFirst + ", @PathVariable(\"" + pname + "\") " + ptype + " " + pname + ") {");
        myFile.println("        return " + beanLowerFirst + "DaoService.updateBy" + pnameUpperFirst + "(" + beanLowerFirst + ", " + pname + ");");
        myFile.println("    }");
        myFile.println(LINE_SEPERATOR);
        myFile.println("    @PatchMapping(\"" + beanLowerFirst + "/{" + pname + "}\")");
        myFile.println("    public boolean updateSelective(@RequestBody " + bean + " " + beanLowerFirst + ", @PathVariable(\"" + pname + "\") " + ptype + " " + pname + ") {");
        myFile.println("        return " + beanLowerFirst + "DaoService.updateSelectiveBy" + pnameUpperFirst + "(" + beanLowerFirst + ", " + pname + ");");
        myFile.println("    }");
        myFile.println("}");
        resultFile.close();
    }

    private void createItemReadonly(String path, String bean, List<String> columns, List<String> fields, List<String> comments) throws Exception {
        FileUtils.forceMkdir(new File(path + "/templates/"));
        String sxBean = bean.substring(0, 1).toLowerCase() + bean.substring(1);
        String fullPath = path + "/templates/" + sxBean + "ItemRead.html";
        File myFilePath = new File(fullPath);
        if (!myFilePath.exists()) {
            myFilePath.createNewFile();
        }
        FileWriter resultFile = new FileWriter(myFilePath);
        PrintWriter myFile = new PrintWriter(resultFile);
        myFile.println("<!DOCTYPE html>");
        myFile.println("<html xmlns:th=\"http://www.thymeleaf.org\">");
        myFile.println("<html lang=\"en\">");
        myFile.println("<head>");
        myFile.println("    <meta charset=\"utf-8\">");
        myFile.println("    <title></title>");
        myFile.println("    <meta name=\"author\" content=\"Touchkiss\">");
        myFile.println("    <meta name=\"renderer\" content=\"webkit\">");
        myFile.println("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">");
        myFile.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">");
        myFile.println("    <link rel=\"stylesheet\" th:href=\"@{/plugins/layui/css/layui.css}\" media=\"all\"/>");
        myFile.println("    <link rel=\"stylesheet\" th:href=\"@{/plugins/layui/css/modules/layui.css}\" media=\"all\"/>");
        myFile.println("    <link rel=\"stylesheet\" th:href=\"@{/css/global.css}\" media=\"all\">");
        myFile.println("    <link href=\"//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">");
        myFile.println("    <style>");
        myFile.println("        .layui-form-label{");
        myFile.println("            width:100px;");
        myFile.println("        }");
        myFile.println("        .layui-form-item{");
        myFile.println("            margin-bottom:8px;");
        myFile.println("            font-size:12px;");
        myFile.println("        }");
        myFile.println("        .simbtnbox{");
        myFile.println("           float:right;");
        myFile.println("        }");
        myFile.println("        .layui-btn{");
        myFile.println("            padding:0 14px;");
        myFile.println("        }");
        myFile.println("    </style>");
        myFile.println("</head>");
        myFile.println("<body>");
        myFile.println("<div style=\"margin: 15px;padding: 10px 30px;\">");
        myFile.println("<div class=\"btnlist searchlist\">");
        myFile.println("<div class=\"layui-form\">");
        for (int i = 1; i < columns.size(); i++) {
            myFile.println("    <div class=\"layui-form-item\">");
            myFile.println("        <label class=\"layui-form-label\">" + comments.get(i) + "</label>");
            myFile.println("        <div class=\"layui-inline\">");
            myFile.println("            <input class=\"layui-input\" th:value=\"${" + sxBean + "." + fields.get(i) + "}\" readonly=\"readonly\"/>");
            myFile.println("        </div>");
            myFile.println("    </div>");
        }
        myFile.println("</div>");
        myFile.println("</div>");
        myFile.println("</div>");
        myFile.println("</body>");
        myFile.println("</html>");
        resultFile.close();
    }

    private void createListView(List<String> columns, List<String> fields, List<String> types, List<String> comments, String path, String bean, String module, String tab, String pname, String requestPath) throws Exception {
        FileUtils.forceMkdir(new File(path + "/templates/"));
        String sxBean = bean.substring(0, 1).toLowerCase() + bean.substring(1);
        String fullPath = path + "/templates/" + sxBean + "List.html";
        File myFilePath = new File(fullPath);
        if (!myFilePath.exists()) {
            myFilePath.createNewFile();
        }
        FileWriter resultFile = new FileWriter(myFilePath);
        PrintWriter myFile = new PrintWriter(resultFile);
        myFile.println("<!DOCTYPE html>");
        myFile.println("<html xmlns:th=\"http://www.thymeleaf.org\">");
        myFile.println("<html lang=\"en\">");
        myFile.println("<head>");
        myFile.println("    <meta charset=\"utf-8\">");
        myFile.println("    <title></title>");
        myFile.println("    <meta name=\"author\" content=\"Touchkiss\">");
        myFile.println("    <meta name=\"renderer\" content=\"webkit\">");
        myFile.println("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">");
        myFile.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">");
        myFile.println("    <link rel=\"stylesheet\" th:href=\"@{/plugins/layui/css/layui.css}\" media=\"all\"/>");
        myFile.println("    <link rel=\"stylesheet\" th:href=\"@{/plugins/layui/css/modules/layui.css}\" media=\"all\"/>");
        myFile.println("    <link rel=\"stylesheet\" th:href=\"@{/css/global.css}\" media=\"all\">");
        myFile.println("    <link href=\"//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">");
        myFile.println("    <link rel=\"stylesheet\" href=\"/plugins/datatables/css/jquery.dataTables1.10.15.css\"/>");
        myFile.println("    <style>");
        myFile.println("        .layui-inline {");
        myFile.println("            width: auto;");
        myFile.println("        }");
        myFile.println("");
        myFile.println("        .layui-form-label {");
        myFile.println("            width: 90px;");
        myFile.println("            text-align: right;");
        myFile.println("        }");
        myFile.println("");
        myFile.println("        .searchbox {");
        myFile.println("            margin: 0 8px;");
        myFile.println("            margin-top: 8px;");
        myFile.println("        }");
        myFile.println("");
        myFile.println("        .layui-form {");
        myFile.println("            background: #fff;");
        myFile.println("        }");
        myFile.println("");
        myFile.println("        .contentbox {");
        myFile.println("            background: #fff;");
        myFile.println("            margin: 8px 8px;");
        myFile.println("            padding: 5px;");
        myFile.println("        }");
        myFile.println("");
        myFile.println("        #add" + bean + " {");
        myFile.println("            margin: 10px;");
        myFile.println("        }");
        myFile.println("");
        myFile.println("        .dataTables_length {");
        myFile.println("            margin: 10px;");
        myFile.println("        }");
        myFile.println("");
        myFile.println("        .row {");
        myFile.println("            border-top: 1px solid #e4e5e7;");
        myFile.println("            border-left: 1px solid #e4e5e7;");
        myFile.println("        }");
        myFile.println("");
        myFile.println("        .btns {");
        myFile.println("            background: #fff;");
        myFile.println("            margin: 0 8px;");
        myFile.println("            padding: 10px;");
        myFile.println("            border-top: 1px solid #e4e5e7;");
        myFile.println("            clear: both;");
        myFile.println("        }");
        myFile.println("");
        myFile.println("        .simlists {");
        myFile.println("            border: none;");
        myFile.println("        }");
        myFile.println("");
        myFile.println("        .layui-input {");
        myFile.println("            height: 30px;");
        myFile.println("            line-height: 30px;");
        myFile.println("        }");
        myFile.println("");
        myFile.println("        .layui-input-block {");
        myFile.println("            margin-left: 120px;");
        myFile.println("            margin-top: 10px;");
        myFile.println("        }");
        myFile.println("");
        myFile.println("        .layui-form-label {");
        myFile.println("            line-height: 30px;");
        myFile.println("            height: 30px;");
        myFile.println("        }");
        myFile.println("");
        myFile.println("        .layui-btn-sm {");
        myFile.println("            margin-top: 1px;");
        myFile.println("        }");
        myFile.println("");
        myFile.println("        .layui-form-select {");
        myFile.println("            width: 182px;");
        myFile.println("        }");
        myFile.println("    </style>");
        myFile.println("</head>");
        myFile.println("<body>");
        myFile.println("<div class=\"searchbox\">");
        myFile.println("    <!-- 表单div -->");
        myFile.println("    <form class=\"layui-form we-search\">");
        for (int i = 0; i < columns.size(); i++) {
            myFile.println("        <div class=\"layui-inline\">");
            myFile.println("            <div class=\"layui-inline\">");
            myFile.println("                <label class=\"layui-form-label\">" + comments.get(i) + "</label>");
            myFile.println("                <div class=\"layui-input-block\">");
            myFile.println("                    <input type=\"" + (types.get(i).contains("int") ? "number" : "text") + "\" class=\"layui-input\" placeholder=\"" + comments.get(i) + "\" id=\"" + fields.get(i) + "\">");
            myFile.println("                </div>");
            myFile.println("            </div>");
            myFile.println("        </div>");
        }
        myFile.println("        <div class=\"layui-btn layui-btn-sm\" id=\"search\">");
        myFile.println("            <i class=\"layui-icon layui-icon-search\"></i>");
        myFile.println("        </div>");
        myFile.println("    </form>");
        myFile.println("</div>");
        myFile.println("<div class=\"btns\">");
        myFile.println("    <a href=\"javascript:;\" class=\"layui-btn layui-btn-sm\" id=\"add" + bean + "\">");
        myFile.println("        <i class=\"layui-icon\">&#xe608;</i> 添加");
        myFile.println("    </a>");
        myFile.println("</div>");
        myFile.println("<div class=\"contentbox\">");
        myFile.println("    <table id=\"" + sxBean + "List\" class=\"table table-striped table-bordered display\" width=\"98%\">");
        myFile.println("        <thead>");
        myFile.println("        <tr>");
        for (int i = 0; i < columns.size(); i++) {
            myFile.println("            <th>" + comments.get(i) + "</th>");
        }
        myFile.println("            <th>操作</th>");
        myFile.println("        </tr>");
        myFile.println("        </thead>");
        myFile.println("    </table>");
        myFile.println("</div>");
        myFile.println("<script type=\"text/javascript\" src=\"/plugins/layui/layui.js\"></script>");
        myFile.println("<script type=\"text/javascript\" src=\"/public/public.js\"></script>");
        myFile.println("<script type=\"text/javascript\" src=\"/public/form-valid.js\"></script>");
        myFile.println("<script src=\"/js/jquery.js\"></script>");
        myFile.println("<script src=\"/plugins/datatables/js/jquery.dataTables1.10.15.js\"></script>");
        myFile.println("<script src=\"/jsModel/common/common.js\"></script>");
        myFile.println("<script th:inline=\"none\">");
        myFile.println("    layui.use(['form', 'layedit', 'laydate', 'upload'], ()=> {");
        myFile.println("        var form = layui.form");
        myFile.println("        var laydate = layui.laydate;");
        myFile.println("        form.render();");
        for (int i = 0; i < columns.size(); i++) {
            if (columns.get(i).contains("date")) {
                myFile.println("        //执行一个laydate实例");
                myFile.println("        laydate.render({");
                myFile.println("            elem: '#" + columns.get(i) + "' //指定元素");
                myFile.println("            ,format: 'yyyyMMdd' //指定格式");
                myFile.println("        });");
            }
        }
        myFile.println("    });");
        myFile.println("");
        myFile.println("    $(()=> {");
        myFile.println("        $(\"#search\").bind(\"click\", ()=> {");
        myFile.println("            //按钮 点击事件触发table重新请求服务器");
        myFile.println("            $(\"#" + sxBean + "List\").dataTable().fnDraw(false);");
        myFile.println("        });");
        myFile.println("        $('#" + sxBean + "List').dataTable({");
        myFile.println("            \"processing\": true,");
        myFile.println("            \"paging\": true,//开启表格分页");
        myFile.println("            \"serverSide\": true,");
        myFile.println("            \"pagingType\": \"full_numbers\",");
        myFile.println("            \"searching\": false,");
        myFile.println("            \"iDisplayLength\": 50,");
        myFile.println("            \"aaSorting\": [[0, 'desc']],");
        myFile.println("            \"language\": {");
        myFile.println("                \"url\": \"/plugins/datatables/js/Chinese.json\"");
        myFile.println("            },");
        myFile.println("            \"ajax\": {");
        myFile.println("                \"url\": \"/" + requestPath + "/" + sxBean + "Json\",");
        myFile.println("                \"type\": \"POST\",");
        myFile.println("                \"data\": (d)=> {");
        for (int i = 0; i < columns.size(); i++) {
            myFile.println("                    d." + columns.get(i) + " = $(\"#" + fields.get(i) + "\").val();");
        }
        myFile.println("                }");
        myFile.println("            },");
        myFile.println("            \"columns\": [");
        for (int i = 0; i < columns.size(); i++) {
            myFile.println("                {");
            myFile.println("                    \"data\": \"" + fields.get(i) + "\"");
            myFile.println("                    , \"defaultContent\": \"\"");
            if (columns.get(i).endsWith("time")) {
                myFile.println("                    , \"fnCreatedCell\": (nTd, sData, oData, iRow, iCol)=> {");
                myFile.println("                    $(nTd).text(formatStampToDate(sData));");
                myFile.println("                }");
            }
            myFile.println("                },");
        }
        myFile.println("                {");
        myFile.println("                    \"data\": null");
        myFile.println("                    , \"fnCreatedCell\": (nTd, sData, oData, iRow, iCol)=> {");
        myFile.println("                        $(nTd).empty().css(\"white-space\",\"nowrap\");");
        myFile.println("                        $(\"<a></a>\").text(\"修改\").attr(\"href\",\"javascript:void(0);\").click(()=>{editThis" + bean + "(oData." + pname + ");}).appendTo($(nTd));");
        myFile.println("                        $(nTd).append(\"&nbsp;&nbsp;\");");
        myFile.println("                        $(\"<a></a>\").text(\"删除\").attr(\"href\",\"javascript:void(0);\").click(()=>{deleteThis" + bean + "(oData." + pname + ");}).appendTo($(nTd));");
        myFile.println("                    }");
        myFile.println("                },");
        myFile.println("            ],");
        myFile.println("            \"aoColumnDefs\": [");
        myFile.println("                {");
        myFile.println("                    \"bSortable\": false,");
        myFile.println("                    \"aTargets\": [" + columns.size() + "]");
        myFile.println("                }");
        myFile.println("            ]");
        myFile.println("        });");
        myFile.println("    });");
        myFile.println("");
        myFile.println("    var deleteThis" + bean + "=(" + pname + ")=> {");
        myFile.println("        top.layer.confirm('真的要删除吗？', {icon: 3, title: '提示'}, (index)=> {");
        myFile.println("            tmp = top.layer.load(2);");
        myFile.println("            $.ajax({");
        myFile.println("                \"url\": \"/" + requestPath + "/" + sxBean + "Del\",");
        myFile.println("                \"type\": \"POST\",");
        myFile.println("                \"dataType\": \"json\",");
        myFile.println("                \"async\": true,");
        myFile.println("                \"data\": {");
        myFile.println("                    " + pname + ": " + pname + "");
        myFile.println("                },");
        myFile.println("                \"success\": (data)=> {");
        myFile.println("                    top.layer.close(tmp);");
        myFile.println("                    if (data.status == 1) {");
        myFile.println("                        top.layer.msg(\"删除成功!\", {icon: 1});");
        myFile.println("                        $(\"#" + sxBean + "List\").dataTable().fnDraw(false);");
        myFile.println("                    } else {");
        myFile.println("                        top.layer.msg(data.message, {icon: 5});");
        myFile.println("                    }");
        myFile.println("                },");
        myFile.println("                \"error\": ()=> {");
        myFile.println("                }");
        myFile.println("            });");
        myFile.println("        });");
        myFile.println("    };");
        myFile.println("");
        myFile.println("    var editThis" + bean + "=(" + pname + ")=> {");
        myFile.println("        top.layer.open({");
        myFile.println("            title: '修改',");
        myFile.println("            maxmin: true,");
        myFile.println("            type: 2,");
        myFile.println("            content: '/" + requestPath + "/" + sxBean + "Item.do?" + pname + "=' + " + pname + ",");
        myFile.println("            area: ['55%', '650px'],");
        myFile.println("            end: ()=> {");
        myFile.println("                $(\"#" + sxBean + "List\").dataTable().fnDraw(false);");
        myFile.println("            }");
        myFile.println("        });");
        myFile.println("    };");
        myFile.println("");
        myFile.println("    var formatStampToDate=(nowIntDate)=> {");
        myFile.println("        var tt = parseInt(nowIntDate + \"000\");");
        myFile.println("        var date = new Date(tt);");
        myFile.println("        Y = date.getFullYear() + '-';");
        myFile.println("        M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '-';");
        myFile.println("        D = (date.getDate() < 10 ? '0' + date.getDate() : date.getDate()) + ' ';");
        myFile.println("        h = (date.getHours() < 10 ? '0' + date.getHours() : date.getHours()) + ':';");
        myFile.println("        m = (date.getMinutes() < 10 ? '0' + date.getMinutes() : date.getMinutes()) + ':';");
        myFile.println("        s = (date.getSeconds() < 10 ? '0' + date.getSeconds() : date.getSeconds());");
        myFile.println("        return Y + M + D + h + m + s;");
        myFile.println("    };");
        myFile.println("");
        myFile.println("    $('#add" + bean + "').on('click', ()=> {");
        myFile.println("        top.layer.open({");
        myFile.println("            title: '新增',");
        myFile.println("            maxmin: true,");
        myFile.println("            type: 2,");
        myFile.println("            content: '/" + requestPath + "/" + sxBean + "Item.do',");
        myFile.println("            area: ['55%', '650px'],");
        myFile.println("            end: ()=> {");
        myFile.println("                $(\"#" + sxBean + "List\").dataTable().fnDraw(false);");
        myFile.println("            }");
        myFile.println("        })");
        myFile.println("    })");
        myFile.println("");
        myFile.println("</script>");
        myFile.println("</body>");
        myFile.println("</html>");
        resultFile.close();
    }

    private void createItemView(String path, String bean, List<String> columns, List<String> fields, List<String> types, List<String> comments, List<Boolean> canNulls, String pname, String requestPath, String module) throws Exception {
        FileUtils.forceMkdir(new File(path + "/templates/"));
        String sxBean = bean.substring(0, 1).toLowerCase() + bean.substring(1);
        String fullPath = path + "/templates/" + sxBean + "Item.html";
        File myFilePath = new File(fullPath);
        if (!myFilePath.exists()) {
            myFilePath.createNewFile();
        }
        FileWriter resultFile = new FileWriter(myFilePath);
        PrintWriter myFile = new PrintWriter(resultFile);
        myFile.println("<!DOCTYPE html>");
        myFile.println("<html xmlns:th=\"http://www.thymeleaf.org\">");
        myFile.println("<html lang=\"en\">");
        myFile.println("<head>");
        myFile.println("    <meta charset=\"utf-8\">");
        myFile.println("    <title></title>");
        myFile.println("    <meta name=\"author\" content=\"Touchkiss\">");
        myFile.println("    <meta name=\"renderer\" content=\"webkit\">");
        myFile.println("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">");
        myFile.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">");
        myFile.println("    <link rel=\"stylesheet\" th:href=\"@{/plugins/layui/css/layui.css}\" media=\"all\"/>");
        myFile.println("    <link rel=\"stylesheet\" th:href=\"@{/plugins/layui/css/modules/layui.css}\" media=\"all\"/>");
        myFile.println("    <link rel=\"stylesheet\" th:href=\"@{/css/global.css}\" media=\"all\">");
        myFile.println("    <link href=\"//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">");
        myFile.println("    <link rel=\"stylesheet\" href=\"/plugins/datatables/css/jquery.dataTables1.10.15.css\"/>");
        myFile.println("    <style>");
        myFile.println("        .layui-form-label{");
        myFile.println("            width:100px;");
        myFile.println("        }");
        myFile.println("        .layui-form-item{");
        myFile.println("            margin-bottom:8px;");
        myFile.println("            font-size:12px;");
        myFile.println("        }");
        myFile.println("        .simbtnbox{");
        myFile.println("           float:right;");
        myFile.println("        }");
        myFile.println("        .layui-btn{");
        myFile.println("            padding:0 14px;");
        myFile.println("        }");
        myFile.println("    </style>");
        myFile.println("</head>");
        myFile.println("<body>");
        myFile.println("<div style=\"margin: 15px;padding: 10px 30px;\">");
        myFile.println("<div class=\"btnlist searchlist\">");
        myFile.println("<form class=\"layui-form\" id=\"" + sxBean + "Form\" th:object=\"${" + sxBean + "}\" method=\"post\" lay-filter=\"formConfig\" onsubmit=\"return false\">");
        for (int i = 1; i < columns.size(); i++) {
            myFile.println("    <div class=\"layui-form-item\">");
            myFile.println("        <label class=\"layui-form-label\">" + comments.get(i) + "</label>");
            myFile.println("        <div class=\"layui-inline\">");
            myFile.println("            <input type=\"" + (types.get(i).contains("int") ? "number" : "text") + "\" th:field=\"*{" + fields.get(i) + "}\" ");
            myFile.println("                   autocomplete=\"off\" placeholder=\"请输入" + comments.get(i) + "\" class=\"layui-input\" " + (canNulls.get(i).equals(false) ? "lay-verify=\"required\"" : "") + "/>");
            if (i == 1) {
                myFile.println("                    <input type=\"hidden\" th:field=\"*{" + pname + "}\"/>");
            }
            myFile.println("        </div>");
            myFile.println("    </div>");
        }
        myFile.println("    <div class=\"simbtnbox\">");
        myFile.println("        <button class=\"layui-btn layui-btn-sm\" lay-filter=\"demo1\" lay-submit=\"\">提交</button>");
        myFile.println("        <button class=\"layui-btn layui-btn-sm layui-btn-primary\" type=\"reset\" id=\"cancel\">取消</button>");
        myFile.println("    </div>");
        myFile.println("</form>");
        myFile.println("</div>");
        myFile.println("</div>");
        myFile.println("<script type=\"text/javascript\" src=\"/plugins/layui/layui.js\"></script>");
        myFile.println("<script type=\"text/javascript\" src=\"/public/public.js\"></script>");
        myFile.println("<script type=\"text/javascript\" src=\"/public/form-valid.js\"></script>");
        myFile.println("<script src=\"/js/jquery.js\"></script>");
        myFile.println("<script src=\"/jsModel/common/common.js\"></script>");
        myFile.println("<script>");
        myFile.println("    layui.use(['form', 'layedit', 'laydate', 'upload'], ()=> {");
        myFile.println("        var form = layui.form");
        myFile.println("        var laydate = layui.laydate;");
        myFile.println("        form.render();");
        myFile.println("");
        myFile.println("        //监听提交");
        myFile.println("        form.on('submit(demo1)', (data)=> {");
        myFile.println("            tmp = parent.layer.load(2);");
        myFile.println("            $.ajax({");
        myFile.println("                \"url\": \"/" + requestPath + "/" + sxBean + "Item\",");
        myFile.println("                \"type\": \"POST\",");
        myFile.println("                \"dataType\": \"json\",");
        myFile.println("                \"async\": true,");
        myFile.println("                \"data\": $(\"#" + sxBean + "Form\").serialize(),");
        myFile.println("                \"success\": (data)=> {");
        myFile.println("                    parent.layer.close(tmp);");
        myFile.println("                    if (data.status == 1) {");
        myFile.println("                        var index = parent.layer.getFrameIndex(window.name);");
        myFile.println("                        window.parent.layer.msg(\"保存成功!\");");
        myFile.println("                        parent.layer.close(index);");
        myFile.println("                    } else {");
        myFile.println("                        alert(data.message);");
        myFile.println("                    }");
        myFile.println("                },");
        myFile.println("                \"error\": ()=> {");
        myFile.println("                }");
        myFile.println("            });");
        myFile.println("        });");
        myFile.println("        //自定义验证");
        myFile.println("        form.verify({});");
        myFile.println("");
        myFile.println("        var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引");
        myFile.println("");
        for (int i = 0; i < columns.size(); i++) {
            if (columns.get(i).contains("date")) {
                myFile.println("        //执行一个laydate实例");
                myFile.println("        laydate.render({");
                myFile.println("            elem: '#" + fields.get(i) + "' //指定元素");
                myFile.println("            ,format: 'yyyyMMdd' //指定格式");
                myFile.println("        });");
            }
        }
        myFile.println("        $(\"#cancel\").click(()=> {");
        myFile.println("            var index = parent.layer.getFrameIndex(window.name);");
        myFile.println("            parent.layer.close(index);");
        myFile.println("        });");
        myFile.println("    });");
        myFile.println("</script>");
        myFile.println("</body>");
        myFile.println("</html>");
        myFile.println("");
        resultFile.close();
    }

    //xml
    private void createXml(List<String> columns, List<String> fields, List<String> types, String path, String bean, String module, String tab, String autoIncrementColumn) throws Exception {
        FileUtils.forceMkdir(new File(path + "/" + module + "/mapper/"));
        String fullPath = path + "/" + module + "/mapper/" + bean + "Mapper.xml";
        File myFilePath = new File(fullPath);
        if (!myFilePath.exists()) {
            myFilePath.createNewFile();
        }
        FileWriter resultFile = new FileWriter(myFilePath);
        PrintWriter myFile = new PrintWriter(resultFile);
        myFile.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        myFile.println("<!DOCTYPE mapper PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\" ");
        myFile.println("    \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\">");
        myFile.println("<mapper namespace=\"" + BASE_PACKAGE + module + ".mapper." + bean + "DaoM\">");
        appsql(columns, fields, types, myFile, bean, module, tab, autoIncrementColumn);
        myFile.println("</mapper>");
        resultFile.close();
    }

    private void appsql(List<String> columns, List<String> fields, List<String> types, PrintWriter myFile, String bean, String module, String tab, String autoIncrementColumn) {
        boolean audoIncrement = false;
        String pname = fields.get(0);
        if (autoIncrementColumn != null && !"".equals(autoIncrementColumn.trim())) {
            audoIncrement = true;
            autoIncrementColumn = autoIncrementColumn.substring(0, 1).toUpperCase() + autoIncrementColumn.substring(1);
        }
        String pnameUpperFirst = pname.substring(0, 1).toUpperCase() + pname.substring(1);
        String beanLowerFirst = bean.substring(0, 1).toLowerCase() + bean.substring(1);
        //实体类映射
        myFile.println("  <resultMap id=\"BaseResultMap\" type=\"" + BASE_PACKAGE + module + ".bean." + bean + "\">");
        myFile.println("    <id column=\"" + columns.get(0) + "\" jdbcType=\"" + Xtype(types.get(0)) + "\" "
                + "property=\"" + fields.get(0) + "\" />");
        int size = columns.size();
        for (int i = 1; i < size; i++) {
            myFile.println("    <result column=\"" + columns.get(i) + "\" jdbcType=\"" + Xtype(types.get(i)) + "\" "
                    + "property=\"" + fields.get(i) + "\" />");
        }
        myFile.println("  </resultMap>");
        //查询结果结合
        myFile.println("  <sql id=\"Base_Column_List\">");
        String lstr = String.join(",", columns);
        myFile.println("    " + lstr);
        myFile.println("  </sql>");
        //添加
        myFile.println("  <insert id=\"insert\" parameterType=\"" + BASE_PACKAGE + module + ".bean." + bean + "\">");
        myFile.println("     insert into " + tab + "(<include refid=\"Base_Column_List\"></include>)");
        myFile.println("     values (");
        StringBuffer zstr = new StringBuffer();
        for (int i = 0; i < size; i++) {
            zstr.append("#{").append(fields.get(i)).append(",jdbcType=").append(Xtype(types.get(i))).append("}");
            if (i != size - 1) {
                zstr.append(",");
            }
        }
        myFile.println("     " + zstr.toString() + ") ");
        myFile.println("  </insert>");
        if (audoIncrement) {
            myFile.println("  <insert id=\"insertWithout" + pnameUpperFirst + "\" parameterType=\"" + BASE_PACKAGE + module + ".bean." + bean + "\" useGeneratedKeys=\"true\" keyProperty=\"" + pname + "\">");
            myFile.println("     insert into " + tab + "(" + String.join(",", columns.subList(1, columns.size())) + ")");
            myFile.println("     values (");
            zstr = new StringBuffer();
            for (int i = 1; i < size; i++) {
                zstr.append("#{").append(fields.get(i)).append(",jdbcType=").append(Xtype(types.get(i))).append("}");
                if (i != size - 1) {
                    zstr.append(",");
                }
            }
            myFile.println("     " + zstr.toString() + ") ");
            myFile.println("  </insert>");
        }
        //根据主键ID删除
        myFile.println("  <delete id=\"deleteBy" + pnameUpperFirst + "\" parameterType=\"java.lang." + Jtype(types.get(0)) + "\">");
        myFile.println("     delete from " + tab);
        myFile.println("     where " + columns.get(0) + " = #{" + fields.get(0) + ",jdbcType=" + Xtype(types.get(0)) + "}");
        myFile.println("  </delete>");
        myFile.println("    <delete id=\"deleteByMap\">");
        myFile.println("        delete from " + tab);
        myFile.println("        <include refid=\"whereSql\"></include>");
        myFile.println("    </delete>");
        //根据主键id修改
        myFile.println("  <update id=\"updateBy" + pnameUpperFirst + "\">");
        myFile.println("     update " + tab);
        myFile.println("     set");
        for (int i = 1; i < size; i++) {
            myFile.print("       " + columns.get(i) + " = #{" + beanLowerFirst + "." + fields.get(i) + ",jdbcType=" + Xtype(types.get(i)) + "}");
            if (i != size - 1) {
                myFile.print(",\n");
            } else {
                myFile.print("\n");
            }
        }
        myFile.println("     where " + columns.get(0) + " = #{" + fields.get(0) + ",jdbcType=" + Xtype(types.get(0)) + "}");
        myFile.println("  </update>");
        //根据主键id修改(有值的字段)
        myFile.println("  <update id=\"updateSelectiveBy" + pnameUpperFirst + "\">");
        myFile.println("     update " + tab);
        myFile.println("     set");
        myFile.println("        <trim suffixOverrides=\",\">");
        for (int i = 1; i < size; i++) {
            myFile.println("     <if test=\"" + beanLowerFirst + "." + fields.get(i) + " != null\">");
            myFile.print("       " + columns.get(i) + " = #{" + beanLowerFirst + "." + fields.get(i) + ",jdbcType=" + Xtype(types.get(i)) + "}");
            if (i != size - 1) {
                myFile.print(",\n");
            } else {
                myFile.print("\n");
            }
            myFile.println("     </if>");
        }
        myFile.println("        </trim>");
        myFile.println("     where " + columns.get(0) + " = #{" + fields.get(0) + ",jdbcType=" +

                Xtype(types.get(0)) + "}");
        myFile.println("  </update>");
        //根据map修改(有值的字段)
        myFile.println("  <update id=\"updateSelectiveByMap\">");
        myFile.println("     update " + tab);
        myFile.println("     set");
        myFile.println("        <trim suffixOverrides=\",\">");
        for (int i = 1; i < size; i++) {
            myFile.println("     <if test=\"" + beanLowerFirst + "." + fields.get(i) + " != null\">");
            myFile.print("       " + columns.get(i) + " = #{" + beanLowerFirst + "." + fields.get(i) + ",jdbcType=" + Xtype(types.get(i)) + "}");
            if (i != size - 1) {
                myFile.print(",\n");
            } else {
                myFile.print("\n");
            }
            myFile.println("     </if>");
        }
        myFile.println("        </trim>");
        myFile.println("        <include refid=\"whereSql\"></include>");
        myFile.println("  </update>");
        //根据主键ID查询
        myFile.println("  <select id=\"selectBy" + pnameUpperFirst + "\" resultMap=\"BaseResultMap\" parameterType=\"java.lang." +

                Jtype(types.get(0)) + "\" >");
        myFile.println("     select");
        myFile.println("     <include refid=\"Base_Column_List\" />");
        myFile.println("     from " + tab + "");
        myFile.println("     where " + columns.get(0) + " = #{" + fields.get(0) + ",jdbcType=" +

                Xtype(types.get(0)) + "}");
        myFile.println("  </select>");
        //查询列表
        myFile.println("  <select id=\"query" + bean + "List\" parameterType=\"java.util.HashMap\"  resultMap=\"BaseResultMap\">");
        myFile.println("     select ");
        myFile.println("             <if test=\"wheres.get('columns')!=null and wheres.get('columns')!='' \">");
        myFile.println("                 ${wheres.get('columns')}");
        myFile.println("             </if>");
        myFile.println("             <if test=\"wheres.get('columns')==null or wheres.get('columns')==''\">");
        myFile.println("                 <include refid=\"Base_Column_List\"/>");
        myFile.println("             </if>");
        myFile.println("     FROM  " + tab + "  <include refid=\"whereSql\"></include>");
        myFile.println("     <if test=\"wheres.get('datatableorderby')!=null and wheres.get('datatableorderby')!='' \">");
        myFile.println("         ${wheres.get('datatableorderby')}");
        myFile.println("     </if>");
        myFile.println("     <if test=\"wheres.get('limit')!=null and wheres.get('limit')!='' \">");
        myFile.println("         ${wheres.get('limit')}");
        myFile.println("     </if>");
        myFile.println("  </select>");
        //查询列表(分页)
        myFile.println("  <select id=\"findByPage\" parameterType=\"java.util.HashMap\"  resultMap=\"BaseResultMap\" useCache=\"false\">");
        myFile.println("     select ");
        myFile.println("             <if test=\"wheres.get('columns')!=null and wheres.get('columns')!='' \">");
        myFile.println("                 ${wheres.get('columns')}");
        myFile.println("             </if>");
        myFile.println("             <if test=\"wheres.get('columns')==null or wheres.get('columns')==''\">");
        myFile.println("                 <include refid=\"Base_Column_List\"/>");
        myFile.println("             </if>");
        myFile.println("     FROM  " + tab + "  <include refid=\"whereSql\"></include>");
        myFile.println("     <if test=\"wheres.get('datatableorderby')!=null and wheres.get('datatableorderby')!='' \">");
        myFile.println("         ${wheres.get('datatableorderby')}");
        myFile.println("     </if>");
        myFile.println("  </select>");
        myFile.println("  <sql id=\"whereSql\">");
        myFile.println("        <if test=\"wheres != null and wheres.size() > 0\">");
        myFile.println("            where 1 = 1");
        myFile.println("            <foreach collection=\"wheres.entrySet()\" item=\"value\" index=\"key\">");
        myFile.println("                <bind name=\"valid\" value=\"1\"/>");
        myFile.println("                <if test=\"key != null and key != '' and key.trim() != '' and ((key.endsWith('_isn') or key.endsWith('_isnn')) or (!key.endsWith('_isn') and !key.endsWith('_isnn') and value != null and value != ''))\">");
        myFile.println("                    <choose>");
        for (int i = 0; i < columns.size(); i++) {
            String column = columns.get(i);
            myFile.println("                        <when test=\"key == '" + fields.get(i) + "' or key.startsWith('" + fields.get(i) + "_')\">and " + column + "</when>");
        }
        myFile.println("                        <otherwise>");
        myFile.println("                            <bind name=\"valid\" value=\"0\"/>");
        myFile.println("                        </otherwise>");
        myFile.println("                    </choose>");
        myFile.println("                    <if test=\"valid == 1\">");
        myFile.println("                        <choose>");
        myFile.println("                            <when test=\"key.endsWith('_eq')\">= #{value}</when>");
        myFile.println("                            <when test=\"key.endsWith('_ne')\">&lt;&gt; #{value}</when>");
        myFile.println("                            <when test=\"key.endsWith('_lt')\">&lt; #{value}</when>");
        myFile.println("                            <when test=\"key.endsWith('_gt')\">&gt; #{value}</when>");
        myFile.println("                            <when test=\"key.endsWith('_let')\">&lt;= #{value}</when>");
        myFile.println("                            <when test=\"key.endsWith('_get')\">&gt;= #{value}</when>");
        myFile.println("                            <when test=\"key.endsWith('_reg')\">regexp #{value}</when>");
        myFile.println("                            <when test=\"key.endsWith('_in')\">in (${value})</when>");
        myFile.println("                            <when test=\"key.endsWith('_nin')\">not in (${value})</when>");
        myFile.println("                            <when test=\"key.endsWith('_like')\">like '%${value}%'</when>");
        myFile.println("                            <when test=\"key.endsWith('_nlike')\">not like '%${value}%'</when>");
        myFile.println("                            <when test=\"key.endsWith('_isn')\">is null</when>");
        myFile.println("                            <when test=\"key.endsWith('_isnn')\">is not null</when>");
        myFile.println("                            <otherwise>= #{value}</otherwise>");
        myFile.println("                        </choose>");
        myFile.println("                    </if>");
        myFile.println("                </if>");
        myFile.println("            </foreach>");
        myFile.println("        </if>");
        myFile.println("  </sql>");
    }

    //根据数据类型返回在java中的类型
    private String Jtype(String type) {
        if (type.contains(type_char) || type.contains(type_text)) {
            return "String";
        } else if (type.contains(type_bigint)) {
            return "Long";
        } else if (type.contains(type_int)) {
            return "Integer";
        } else if (type.contains(type_decimal)) {
            int scale = Integer.parseInt(type.substring(type.indexOf(",") + 1, type.indexOf(")")));
            if (scale > 0) {
                return "Double";
            } else {
                return "Long";
            }
        } else if (type.contains(type_bit)) {
            return "Boolean";
        } else if (type.contains(type_date)) {
            return "Date";
        } else {
            type = type.substring(0, type.contains("(") ? type.indexOf("(") : type.length());
            return type;
        }
    }

    //根据数据类型返回在xml文件中的类型
    private String Xtype(String type) {
        if (type.contains(type_char)) {
            return "VARCHAR";
        } else if (type.contains(type_text)) {
            return "LONGVARCHAR";
        } else if (type.contains(type_bigint)) {
            return "BIGINT";
        } else if (type.contains(type_int)) {
            return "INTEGER";
        } else if (type.contains(type_decimal)) {
            return "DECIMAL";
        } else if (type.contains(type_bit)) {
            return "BIT";
        } else if (type.contains(type_date)) {
            return "DATE";
        } else {
            type = type.substring(0, type.contains("(") ? type.indexOf("(") : type.length());
            return type.toUpperCase();
        }
    }

    //数据库连接
    public DruidPooledConnection getConnect() {
        DruidPooledConnection connection = null;

        DruidDataSource dataSource = new DruidDataSource();
        //设置数据库连接地址
        dataSource.setUrl(JDBC_URL);
        //设置用户名
        dataSource.setUsername(DATABASE_USERNAME);
        //设置密码
        dataSource.setPassword(DATABASE_PASSWORD);
        //设置初始化大小
        dataSource.setInitialSize(1);
        //设置在数据库连接词中的最小连接数
        dataSource.setMinIdle(1);
        //设置最大连接数
        dataSource.setMaxActive(20);
        //设置获取连接的最大等待时间
        dataSource.setMaxWait(60000);
        try {
            connection = dataSource.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static class TableInfo {
        private String beanName;
        private String tableName;
        private String moduleName;
        private String requestPath;

        public TableInfo(String beanName, String tableName, String moduleName, String requestPath) {
            this.beanName = beanName;
            this.tableName = tableName;
            this.moduleName = moduleName;
            this.requestPath = requestPath;
        }

        public String getBeanName() {
            return beanName;
        }

        public void setBeanName(String beanName) {
            this.beanName = beanName;
        }

        public String getTableName() {
            return tableName;
        }

        public void setTableName(String tableName) {
            this.tableName = tableName;
        }

        public String getModuleName() {
            return moduleName;
        }

        public void setModuleName(String moduleName) {
            this.moduleName = moduleName;
        }

        public String getRequestPath() {
            return requestPath;
        }

        public void setRequestPath(String requestPath) {
            this.requestPath = requestPath;
        }
    }

}
