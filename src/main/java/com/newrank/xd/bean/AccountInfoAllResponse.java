package com.newrank.xd.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/11 21:59
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class AccountInfoAllResponse extends BaseResponse{
    private DataBean data;
    @NoArgsConstructor
    @Data
    public static class DataBean {
        /**
         * avatar : https://p9-dy.byteimg.com/img/tos-cn-i-0813/eec28dd18c394ce2ac0607b4c2aa1823~c5_1080x1080.webp?from=2956013662
         * uid : 4195355415549012
         * nickname : 罗永浩
         * signature : +公众号「交个朋友福利社」点击菜单栏 - 进直播群，扫码添加官方小助理就能加入我的“粉丝”群。
         * mcn_name : 交个朋友
         * mcn_desc : 交个朋友
         * custom_verify : 交个朋友科技首席推荐官
         * authority_status : 0
         * type : 搞笑
         * age : null
         * constellation_name : 未知
         * city : 北京
         * province : 北京
         * total_favorited : 2411.80w
         * mplatform_followers_count : 1531.34w
         * follower_count : 1360.20w
         * live_stream_follower_count : 0
         * new_article_follower_count : 171.10w
         * aweme_count : 133
         * mcn_id : a3e2ceb91babfc689dd427ed27bcabd6
         * aweme_with_promotion_count : 0
         * rank_position : 115
         * newrank_index : 839.0
         * is_live : 1
         * with_dou_entry : null
         * verification_type_cn : null
         * verify_label : 个人认证
         * total_forward_count : null
         * total_comment_count : null
         * gender : 男
         * most_brand : [{"key":"Hisense/海信","count":1},{"key":"炎亭渔夫(YantingFisherman)","count":1},{"key":"太力","count":8},{"key":"谷源道(Gu Yuan Dao)","count":1},{"key":"维达(VINDA)","count":2},{"key":"莫小仙","count":3},{"key":"向物","count":2},{"key":"GREYBOX","count":2},{"key":"梅見","count":2},{"key":"Nivea/妮维雅","count":3},{"key":"爱慕","count":1},{"key":"炫迈(Stride)","count":5},{"key":"奥利奥","count":4},{"key":"腾讯（Tencent）","count":1},{"key":"Benks","count":2},{"key":"松下（Panasonic）","count":3},{"key":"邦克仕（Benks）","count":2},{"key":"老街口","count":1},{"key":"Nike","count":3},{"key":"素士","count":2},{"key":"大希地","count":3},{"key":"IRIS/爱丽思","count":2},{"key":"海狸先生","count":3},{"key":"CASIO","count":2},{"key":"贝医生","count":4},{"key":"柚家","count":4},{"key":"SWITCH","count":1},{"key":"ROAMAN/罗曼","count":1},{"key":"全格(quange)","count":10},{"key":"AKASHI","count":4},{"key":"信良记","count":5},{"key":"AXA","count":2},{"key":"HRL/哈肉联","count":1},{"key":"海尔(haier)","count":1},{"key":"参半","count":1},{"key":"良品铺子(BESTORE)","count":4},{"key":"闪亮","count":2},{"key":"石头","count":3},{"key":"麦肯","count":3},{"key":"海飞丝","count":5},{"key":"京东京造","count":19},{"key":"阿迪达斯（Adidas）","count":3},{"key":"Jack Wolfskin","count":2},{"key":"李宁（LI-NING）","count":1},{"key":"梅见","count":2},{"key":"大宝","count":1},{"key":"卡帕（Kappa）","count":1},{"key":"Kindle","count":1},{"key":"活力28","count":5},{"key":"88","count":1},{"key":"飞利浦","count":1},{"key":"AIRMETER","count":1},{"key":"kaadas/凯迪仕","count":1},{"key":"钟薛高","count":6},{"key":"CHERRY","count":1},{"key":"Asics/亚瑟士","count":3},{"key":"DESSMANN","count":1},{"key":"易来","count":1},{"key":"马爹利","count":1},{"key":"猿辅导","count":5},{"key":"CIRCLE JOY/圆乐","count":1},{"key":"萨啦咪(salami)","count":1},{"key":"idmix","count":1},{"key":"i－baby","count":1},{"key":"五粮液(WULIANGYE)","count":1},{"key":"酿神","count":1},{"key":"海福盛","count":1},{"key":"TOKIT","count":1},{"key":"惠普（HP）","count":1},{"key":"网易严选","count":11},{"key":"inphic/英菲克","count":2},{"key":"天海藏","count":3},{"key":"半亩花田","count":1},{"key":"波司登畅销全球72国","count":2},{"key":"野小兽（YESOUL）","count":2},{"key":"理然","count":6},{"key":"洪峰","count":2},{"key":"盐趣","count":5},{"key":"心相印","count":1},{"key":"iPhone","count":4},{"key":"佩妮6+1","count":1},{"key":"速浪","count":1},{"key":"优点智能","count":1},{"key":"柏瑞美","count":1},{"key":"I'MINT","count":2},{"key":"膳魔师（THERMOS）","count":1},{"key":"Mentholatum/曼秀雷敦","count":1},{"key":"猫哆哩","count":2},{"key":"妮维雅（NIVEA）","count":1},{"key":"东北大板(DONGBEIDABAN)","count":1},{"key":"奥妙","count":2},{"key":"YUZHI LAB/羽制","count":2},{"key":"正大","count":2},{"key":"知食","count":2},{"key":"麦维他（McVitie's）","count":1},{"key":"zeiss","count":2},{"key":"MINISO","count":3},{"key":"Pwu","count":1},{"key":"斯凯奇","count":1},{"key":"三只松鼠","count":2},{"key":"ZMI","count":5},{"key":"可口可乐(COCA-COLA)","count":14},{"key":"味BACK","count":1},{"key":"子初","count":1},{"key":"黑人","count":1},{"key":"凯乐石","count":1},{"key":"FILA","count":3},{"key":"小猿","count":1},{"key":"华为（HUAWEI）","count":3},{"key":"其他","count":4},{"key":"Listerine/李施德林","count":2},{"key":"枫蔓","count":1},{"key":"戴森","count":5},{"key":"蔻斯汀(KUSTIE)","count":1},{"key":"阿迪达斯","count":1},{"key":"善食源","count":1},{"key":"德尔玛","count":1},{"key":"双枪","count":2},{"key":"USMILE","count":2},{"key":"FFIT","count":6},{"key":"TCL","count":2},{"key":"Philips/飞利浦","count":2},{"key":"康师傅","count":5},{"key":"文和友","count":1},{"key":"XBYGIMI/极米科技","count":2},{"key":"奥兰","count":1},{"key":"欧莱雅（LOREAL）","count":1},{"key":"五芳斋","count":1},{"key":"朴西","count":1},{"key":"铁功基","count":3},{"key":"百家好世","count":1},{"key":"大白","count":2},{"key":"SAKYKIDS/舒客宝贝","count":1},{"key":"iQOO","count":1},{"key":"洪湖农家","count":1},{"key":"zoy","count":1},{"key":"8H","count":3},{"key":"diiib","count":1},{"key":"Bananain/蕉内","count":4},{"key":"Benks/邦克仕","count":1},{"key":"美的（Midea）","count":7},{"key":"超级嗨","count":1},{"key":"沐春初夏","count":1},{"key":"vans","count":2},{"key":"益达","count":1},{"key":"小野","count":4},{"key":"REVOMAX","count":1},{"key":"五粮梦","count":1},{"key":"拉菲罗斯柴尔德珍藏","count":1},{"key":"Stojo","count":1},{"key":"Camel/骆驼","count":2},{"key":"BUTTONS","count":1},{"key":"瀚思心理","count":1},{"key":"360","count":3},{"key":"倍思(BASEUS)","count":2},{"key":"一答","count":2},{"key":"沙宣（VS）","count":2},{"key":"L'OREAL /欧莱雅","count":5},{"key":"Avec Moi","count":2},{"key":"Suncha/双枪","count":1},{"key":"摩摩哒(momoda)","count":1},{"key":"SUNMAI","count":2},{"key":"上品印画","count":2},{"key":"永和豆浆","count":1},{"key":"周黑鸭(ZHOU HEI YA)","count":2},{"key":"衡水","count":1},{"key":"欧乐B（Oral-B）","count":3},{"key":"戴尔（DELL）","count":1},{"key":"PUPUPULA","count":4},{"key":"ZEK","count":1},{"key":"黑鲨","count":1},{"key":"皇家礼炮","count":1},{"key":"ONEBOT","count":2},{"key":"石头（roborock）","count":2},{"key":"Donlim/东菱","count":2},{"key":"沁园（TRULIVA）","count":1},{"key":"波司登","count":4},{"key":"坚果（JmGO）","count":2},{"key":"马丁(Martin)","count":1},{"key":"MiiOW/猫人","count":1},{"key":"豪士","count":1},{"key":"老福黄金(Laofuhuangjin)","count":1},{"key":"沙驰","count":1},{"key":"虎邦辣酱","count":1},{"key":"五粮液","count":7},{"key":"amazfit","count":1},{"key":"谷小酒","count":3},{"key":"秋林格瓦斯","count":1},{"key":"一叶子","count":1},{"key":"DAEWOO/大宇","count":2},{"key":"Harbin Beer/哈尔滨啤酒","count":1},{"key":"寨吗","count":2},{"key":"Shiseido","count":1},{"key":"VANS","count":2},{"key":"花木子","count":1},{"key":"康師傅","count":9},{"key":"安踏","count":2},{"key":"悦味","count":1},{"key":"黄飞红","count":1},{"key":"FreeTie","count":1},{"key":"道台府","count":2},{"key":"盘子女人坊","count":1},{"key":"认养一头牛","count":5},{"key":"豆本豆","count":2},{"key":"超能","count":1},{"key":"造作新家","count":2},{"key":"芬腾","count":2},{"key":"拉面说","count":4},{"key":"APPLE","count":9},{"key":"舒肤佳","count":3},{"key":"Northeast Peasant Madame/东北农嫂","count":1},{"key":"KINGWUU","count":1},{"key":"洒哇地咔(SWDK)","count":1},{"key":"爱神菲","count":1},{"key":"SUPOR/苏泊尔","count":3},{"key":"劲面堂","count":2},{"key":"植观","count":1},{"key":"米典（家电）","count":1},{"key":"凯瑞玛","count":1},{"key":"Lenovo/联想","count":1},{"key":"宝利架","count":4},{"key":"三元（SAN YUAN）","count":1},{"key":"戈尔宫(GORGONES)","count":2},{"key":"ClearGrass/青萍","count":1},{"key":"IEM/爱怡美","count":1},{"key":"花点时间","count":1},{"key":"小达","count":1},{"key":"阿宽","count":2},{"key":"妙潔","count":1},{"key":"碧浪","count":4},{"key":"LION/狮王","count":1},{"key":"飞利浦（PHILIPS）","count":7},{"key":"耐克（NIKE）","count":1},{"key":"地平线8号（LEVEL8）","count":3},{"key":"洁柔只在乎您","count":3},{"key":"泸州老窖","count":1},{"key":"罗莱","count":2},{"key":"adidas","count":4},{"key":"陶华碧老干妈","count":2},{"key":"米家","count":2},{"key":"法老传说","count":1},{"key":"全棉时代(Purcotton)","count":1},{"key":"满婷","count":2},{"key":"ANKER","count":4},{"key":"vvild（服饰）","count":1},{"key":"彪马（PUMA）","count":1},{"key":"佳洁士（CREST）","count":2},{"key":"Kans/韩束","count":3},{"key":"时萃","count":1},{"key":"Berry/百利","count":1},{"key":"科罗娜","count":1},{"key":"YUNMAI","count":2},{"key":"罗蒙","count":1},{"key":"凌天","count":1},{"key":"不太土","count":1},{"key":"八马","count":6},{"key":"瓜瓜龙英语","count":4},{"key":"ELMEX","count":1},{"key":"万达电影(WANDA CINEMAS)","count":1},{"key":"卫宝","count":1},{"key":"妮维雅","count":3},{"key":"野格","count":1},{"key":"大力智能","count":1},{"key":"小熊（Bear）","count":2},{"key":"Sogou/搜狗","count":1},{"key":"Peak/匹克","count":1},{"key":"Wastemaid/唯斯特姆","count":1},{"key":"RE:CIPE/莱斯壁","count":1},{"key":"王小卤","count":1},{"key":"冰泉（洗护）","count":1},{"key":"全棉时代（PurCotton）","count":2},{"key":"霸蛮","count":4},{"key":"幸福西饼","count":2},{"key":"蔡林记","count":1},{"key":"yijan/易简","count":1},{"key":"全格（Quange）","count":1},{"key":"KOLON SPORT/可隆","count":2},{"key":"Midea/美的","count":2},{"key":"斑马AI课","count":1},{"key":"香奈","count":1},{"key":"联想（Lenovo）","count":2},{"key":"固特超声","count":1},{"key":"万和（Vanward）","count":1},{"key":"好丽友","count":4},{"key":"Columbia/哥伦比亚","count":1},{"key":"乐天(Lotte)","count":1},{"key":"教育培训","count":4},{"key":"华为","count":2},{"key":"清扬（CLEAR）","count":1},{"key":"星巴克","count":1},{"key":"AKOKO","count":1},{"key":"ThinkPad","count":3},{"key":"东来也","count":1},{"key":"吕","count":1},{"key":"碧然德","count":1},{"key":"一加","count":8},{"key":"AFU","count":1},{"key":"AutoFull/傲风","count":1},{"key":"TOWNEW/拓牛","count":1},{"key":"绝世(jueshi)","count":4},{"key":"Doritos/多力多滋","count":1},{"key":"品胜","count":1},{"key":"zippo","count":1},{"key":"cado","count":1},{"key":"美伦多(MELUNDO)","count":1},{"key":"俏蜻蜓","count":3},{"key":"有你一面","count":2},{"key":"每日黑巧","count":3},{"key":"长城","count":2},{"key":"nayuki/奈雪","count":1},{"key":"天猫精灵","count":2},{"key":"ISSEY MIYAKE","count":1},{"key":"威猛先生（Mr Muscle）","count":1},{"key":"香其","count":1},{"key":"ffit8","count":2},{"key":"奈雪の茶","count":1},{"key":"维达（Vinda）","count":2},{"key":"傻老大","count":1},{"key":"峰米","count":2},{"key":"古方","count":1},{"key":"四季沐歌（MICOE）","count":1},{"key":"轩妈","count":2},{"key":"洽洽","count":1},{"key":"三维猫(sanvcat)","count":1},{"key":"IMINT","count":1},{"key":"冰泉","count":1},{"key":"WalkingPad","count":2},{"key":"宏碁（acer）","count":1},{"key":"Sulwhasoo","count":1},{"key":"Apple/苹果","count":2},{"key":"三只松鼠(Three Squirrels)","count":3},{"key":"宝宝馋了","count":3},{"key":"昊伟农庄(HAOWEIFARM)","count":1},{"key":"showsee/小适","count":1},{"key":"AULDEY","count":1},{"key":"咪咕","count":2},{"key":"dooot/道特","count":1},{"key":"小野（vvild）","count":4},{"key":"GUO LIAN","count":1},{"key":"九阳（Joyoung）","count":2},{"key":"草原汇香","count":2},{"key":"几素","count":1},{"key":"EZVALO/几光","count":1},{"key":"可比克","count":2},{"key":"曼秀雷敦","count":2},{"key":"小光仙","count":1},{"key":"吉列（Gillette）","count":2},{"key":"真我（realme）","count":1},{"key":"网易","count":1},{"key":"睡眠博士（AiSleep）","count":2},{"key":"dickies","count":1},{"key":"MIIIW","count":1},{"key":"PROYA/珀莱雅","count":2},{"key":"iQunix","count":1},{"key":"小牛凯西","count":2},{"key":"晓蛮","count":1},{"key":"阿道夫","count":2},{"key":"Meilen","count":1},{"key":"草原．汇香","count":1},{"key":"阿尔法蛋","count":2},{"key":"韩星可莱美","count":1},{"key":"飞天牌(FLYING FAIRY)","count":2},{"key":"啪啪通","count":1},{"key":"李施德林","count":2},{"key":"古井贡","count":3},{"key":"春光(CHUNGUANG)","count":2},{"key":"戈尔宫","count":1},{"key":"HIPEE","count":1},{"key":"好想你","count":1},{"key":"星巴克（Starbucks）","count":1},{"key":"ANTA/安踏","count":1},{"key":"yaloo/雅鹿","count":1},{"key":"Ronshen","count":1},{"key":"御御泥坊(unifon)","count":1},{"key":"Revlon/露华浓","count":2},{"key":"SMATE/须眉","count":1},{"key":"3M","count":1},{"key":"彪马","count":2},{"key":"追觅","count":1},{"key":"阿福熊","count":1},{"key":"考拉会员","count":1},{"key":"codoon","count":1},{"key":"缤善(BE-KIND)","count":1},{"key":"UNDER ARMOUR","count":1},{"key":"润本(RUNBEN)","count":2},{"key":"龙米家","count":1},{"key":"百丈泉(baizhangquan)","count":1},{"key":"Brloote/巴鲁特","count":1},{"key":"gf/高夫","count":2},{"key":"MKS","count":2},{"key":"雷达（Raid）","count":1},{"key":"每日黑巧(ChocDay)","count":1},{"key":"食巫坊","count":2},{"key":"Under Armour/安德玛","count":1},{"key":"JOY","count":2},{"key":"金宫(Gong's)","count":2},{"key":"Yon Ho/永和豆浆","count":1},{"key":"beats","count":1},{"key":"苏泊尔（SUPOR）","count":2},{"key":"全兴","count":1},{"key":"coclean","count":1},{"key":"comper","count":1},{"key":"飯爺(FUNYE)","count":1},{"key":"哈肉联","count":1},{"key":"榴芒一刻","count":1},{"key":"AMAZFIT","count":1},{"key":"巴鲁特","count":1},{"key":"元気森林","count":2},{"key":"棉森","count":2},{"key":"阅农部落","count":2},{"key":"AKOKO(AKOKO)","count":1},{"key":"贝夫食品(Better for you)","count":1},{"key":"酒鬼","count":1},{"key":"岁岁念","count":2},{"key":"橘园土","count":1},{"key":"五谷磨房","count":1},{"key":"煌上煌(Huangshanghuang)","count":1},{"key":"三利","count":1},{"key":"唱吧","count":1},{"key":"贝蒂斯","count":1},{"key":"焕醒","count":1},{"key":"机器岛","count":2},{"key":"睿米","count":1},{"key":"飘柔（Rejoice）","count":1},{"key":"甘源","count":2},{"key":"柒叻","count":1},{"key":"金字","count":1},{"key":"小梅屋","count":1},{"key":"OPPO","count":3},{"key":"德州扒鸡","count":1},{"key":"好巴食","count":1},{"key":"凤祥食品","count":1},{"key":"溜溜梅(LIUM)","count":3},{"key":"洁丽雅（Grace）","count":1},{"key":"美厨（MAXCOOK）","count":1},{"key":"Zek","count":1},{"key":"老管家","count":1},{"key":"凯瑞玛(KAIRUIMA)","count":1},{"key":"小米（MI）","count":2},{"key":"酷客(kook)","count":1},{"key":"PETER RABBIT/比得兔","count":1},{"key":"舒洁","count":1},{"key":"舒洁（Kleenex）","count":1},{"key":"火火兔","count":1},{"key":"江小白","count":1},{"key":"唐饼家","count":1},{"key":"roborock/石头","count":1},{"key":"康宁","count":1},{"key":"MONTES","count":1},{"key":"蜀道香","count":1},{"key":"卡尔顿","count":1},{"key":"铜师傅","count":2},{"key":"UNO/吾诺","count":1},{"key":"pepsi","count":1},{"key":"达利园","count":2},{"key":"转转","count":2},{"key":"桂格","count":1},{"key":"冰峰","count":1},{"key":"飞乐思","count":2},{"key":"顺造","count":1},{"key":"春江","count":1},{"key":"红谷林(HONGGULIN)","count":2},{"key":"黄老五(Hanglaowu)","count":2},{"key":"哈肉联(HRLSince1913)","count":1},{"key":"枣粮先生","count":1},{"key":"瑞琪奥兰","count":1},{"key":"GTSONIC/固特超声","count":1},{"key":"MissBerry","count":1},{"key":"冰希黎（Boitown）","count":1},{"key":"有道（数码）","count":1},{"key":"BRUNO","count":1},{"key":"nubia/努比亚","count":1},{"key":"兰蔻（LANCOME）","count":1},{"key":"陈吉旺福","count":2},{"key":"苹果","count":1},{"key":"东北大板","count":1},{"key":"云澳达","count":1},{"key":"楼兰蜜语","count":1},{"key":"LOHO眼镜生活","count":1},{"key":"小白","count":1},{"key":"崂山","count":1},{"key":"禧天龙（Citylong）","count":1},{"key":"利仁（Liven）","count":1},{"key":"立丰(SINCE 1938 Lifefun)","count":1},{"key":"优形","count":1},{"key":"蓓慈","count":1},{"key":"向物（SOTHING）","count":1},{"key":"JOSETRONCO/畅呼吸","count":1},{"key":"Sicao/新朝","count":1},{"key":"龙威贡牌","count":1},{"key":"Pisen/品胜","count":1},{"key":"EUCERIN/优色林","count":1},{"key":"gf","count":1},{"key":"舒肤佳(safeguard)","count":2},{"key":"蓝月亮","count":2},{"key":"每实(MES)","count":1},{"key":"兰芝","count":1},{"key":"小鹿蓝蓝","count":2},{"key":"炊大皇（COOKER KING）","count":1},{"key":"眠趣","count":1},{"key":"云麦","count":3},{"key":"蒙亮(MENGLIANG)","count":1},{"key":"花印","count":1},{"key":"蘭芳圜(LAN FONG YUEN)","count":1},{"key":"亲亲(qinqin)","count":1},{"key":"饭小宝","count":1},{"key":"紅魔鬼(Hong Mo Gui)","count":1},{"key":"金锣","count":1},{"key":"YSL/圣罗兰","count":1},{"key":"Hauswirt/海氏","count":1},{"key":"LINONGFU","count":1},{"key":"高露洁(COLGATE)","count":2},{"key":"关东粉王(GUANDONG VERMICELLI)","count":1},{"key":"Puwubeauty/朴物大美","count":1},{"key":"VNK","count":1},{"key":"Little Dream Garden/半亩花田","count":1},{"key":"MORPHY RICHARDS/摩飞电器","count":1},{"key":"傣乡园","count":1},{"key":"疆小喵","count":1},{"key":"蕉下（bananaunder）","count":1},{"key":"BXMAN","count":1},{"key":"亿力","count":1},{"key":"游鱼优米","count":1},{"key":"富光(FUGUANG)","count":1},{"key":"梦洁","count":1},{"key":"GUESS","count":1},{"key":"红牛(Redbull)","count":1},{"key":"Issey Miyake/三宅一生","count":1},{"key":"奥佳华(OGAWA)","count":2},{"key":"Kiehl＇s/科颜氏","count":1},{"key":"MES/每实","count":1},{"key":"陈长有","count":1},{"key":"Yeelight","count":1},{"key":"诺梵","count":1},{"key":"Peach's Secret/半桃","count":2},{"key":"博洋（BEYOND）","count":1},{"key":"多亲（QIN）","count":1},{"key":"日产","count":1},{"key":"养元","count":1},{"key":"林家铺子","count":1},{"key":"BASEUS/倍思","count":1},{"key":"立白","count":2},{"key":"小米","count":4},{"key":"欧派（OPPEIN）","count":1},{"key":"黑色一发","count":1},{"key":"anello","count":1},{"key":"HomeFacialPro","count":1},{"key":"洋河","count":1},{"key":"FLEXWARM/飞乐思","count":1},{"key":"叮小菜","count":1},{"key":"三宅一生（ISSEY MIYAKE）","count":1},{"key":"方太(FOTILE)","count":1},{"key":"完美日记","count":1},{"key":"犇福","count":1},{"key":"PARKER/派克","count":1},{"key":"畅洁宜","count":1},{"key":"TAILI/太力","count":1},{"key":"SWDK/洒哇地咔","count":1},{"key":"妙洁（MIAOJIE）","count":1},{"key":"SHUA/舒华","count":1},{"key":"donlim","count":1},{"key":"Spes/诗裴丝","count":1},{"key":"Dobby","count":1},{"key":"金沙河","count":1},{"key":"荣泰（RONGTAI）","count":1},{"key":"ThinkPlus","count":1},{"key":"联想","count":1},{"key":"SECRECOFFEE/时萃","count":1},{"key":"小牛电动","count":1},{"key":"小适（showsee）","count":1},{"key":"太平","count":1},{"key":"贝德玛","count":1},{"key":"I Do","count":1},{"key":"乐扣乐扣（LOCK&LOCK）","count":2},{"key":"海尔","count":1},{"key":"松下(Panasonic)","count":1},{"key":"奥克斯（AUX）","count":1},{"key":"蟹太太(xietaitai)","count":1},{"key":"西部数据（WD）","count":1},{"key":"果麦","count":1},{"key":"roseonly","count":1},{"key":"秋林·格瓦斯","count":1},{"key":"煮时光","count":2},{"key":"NEW BALANCE","count":1},{"key":"绿巨能","count":2},{"key":"足力健","count":1},{"key":"kamakurashirts","count":1},{"key":"桃李","count":1},{"key":"ulike","count":1},{"key":"菲诺","count":1},{"key":"Onitsuka Tiger","count":1},{"key":"伊利","count":1},{"key":"thinkplus","count":1},{"key":"Sony/索尼","count":1},{"key":"英得尔","count":2},{"key":"美菱(MELNG)","count":1},{"key":"烧范儿","count":1},{"key":"Bose","count":1},{"key":"双枪（Suncha）","count":1},{"key":"厚德牛小强","count":1},{"key":"PEACEBIRD/太平鸟","count":1},{"key":"AHT","count":1},{"key":"暇步士","count":1},{"key":"菲拉格慕（Ferragamo）","count":1},{"key":"SOTHING/向物","count":2},{"key":"藤野一村","count":1},{"key":"小度","count":1},{"key":"金霸王","count":1},{"key":"Ocean Spray/优鲜沛","count":1},{"key":"小熊","count":1},{"key":"cleanfly","count":1},{"key":"AirPods","count":1},{"key":"味库","count":1},{"key":"Apple","count":1},{"key":"拍拍","count":1},{"key":"仟禧嘉美","count":1},{"key":"亿色","count":1},{"key":"HONOR","count":1},{"key":"JasBaby/茉莉宝贝","count":1},{"key":"映趣","count":1},{"key":"多样屋(TAYOHYA)","count":1},{"key":"酷滋","count":1},{"key":"海尔（Haier）","count":1},{"key":"无穷","count":1},{"key":"沱牌","count":1},{"key":"联合利华(Unilever)","count":1},{"key":"洁碧","count":1},{"key":"斑马精酿","count":1},{"key":"双汇","count":1},{"key":"顺造(ShunZao)","count":1},{"key":"EsteeLauder","count":1},{"key":"febreze","count":1},{"key":"巴鲁特（Brloote）","count":2},{"key":"奢姿（数码）","count":1},{"key":"金龙鱼","count":1},{"key":"ChaCheer/洽洽","count":1},{"key":"Nintendo Switch","count":1},{"key":"荣泰","count":1},{"key":"自嗨锅","count":1},{"key":"日尝食食","count":1},{"key":"三顿半","count":1},{"key":"悦诗风吟","count":1},{"key":"北冰洋","count":1},{"key":"Bref/妙力爆炸红","count":1},{"key":"CHOYA/蝶矢","count":1},{"key":"洁柔","count":2},{"key":"三星（SAMSUNG）","count":1},{"key":"Vanward/万和","count":1},{"key":"dr. arrivo","count":1},{"key":"Eraclean","count":1},{"key":"CoolGeek","count":1},{"key":"CIGADesign","count":1},{"key":"一包生活","count":1},{"key":"COGI/高姿","count":1},{"key":"Deerma/德尔玛","count":1},{"key":"金大州","count":1},{"key":"a1","count":2},{"key":"Gillette/吉列","count":1},{"key":"大龙燚(Da Long Yi)","count":1},{"key":"YESOUL/野小兽","count":1},{"key":"辣媳妇","count":1},{"key":"统一","count":4},{"key":"熊爸森林","count":1},{"key":"子约","count":1},{"key":"娃哈哈","count":1},{"key":"吉香居(JIXIANGJU)","count":1},{"key":"沃隆","count":1},{"key":"御泥坊男士","count":1},{"key":"精臣","count":1},{"key":"旺旺","count":1},{"key":"火鸡(HUOJI)（HuoJi）","count":1},{"key":"LUCKYSAC","count":1},{"key":"纽西之谜（geoskincare）","count":1},{"key":"哈肉联(HRL SINCE;1913)","count":1},{"key":"Kustie/蔻斯汀","count":1},{"key":"JBL","count":1},{"key":"德尔玛（Deerma）","count":1},{"key":"红地球","count":1},{"key":"AUX/奥克斯","count":1},{"key":"旺旺仙贝","count":1},{"key":"零度果坊","count":1},{"key":"VIOMI/云米","count":1},{"key":"徐福记","count":2},{"key":"原森太","count":1},{"key":"喜马拉雅","count":1},{"key":"范思哲（VERSACE）","count":1},{"key":"安黛尔","count":1},{"key":"COMBO","count":1},{"key":"瀘州老窖","count":1},{"key":"乌苏啤酒","count":1},{"key":"Avene/雅漾","count":1},{"key":"国窖1573","count":1}]
         * most_promotion_type : [{"key":"居家","count":551},{"key":"美妆护肤","count":337},{"key":"服装鞋帽","count":336},{"key":"3C数码","count":274},{"key":"食品饮料","count":934},{"key":"家电","count":156},{"key":"书籍","count":44},{"key":"箱包皮具","count":36},{"key":"钟表配饰","count":89},{"key":"其他","count":25},{"key":"运动户外","count":73},{"key":"游戏","count":4},{"key":"母婴","count":30},{"key":"医药保健","count":11},{"key":"汽车","count":20},{"key":"萌宠生活","count":3},{"key":"办公文具","count":15},{"key":"玩具乐器","count":11}]
         * most_visitor : [{"key":"周黑鸭鸭脖180g*2锁骨190g鸭掌140g武汉特产 共四盒","count":4274260},{"key":"奥克斯静音破壁机家用加热全自动小型豆浆机榨汁多功能料理机新款","count":3925517},{"key":"【大希地】整切西冷牛排10片套餐1300g","count":3327596}]
         * promotion_count : 3157
         * collection_status : null
         * account : luoyonghao
         * content_tags : ["直播","湖北","加油","挑战"]
         * collection_time : 2020-03-25 17:33:50
         * school_name : null
         * favorited_follower_rate : 1.7731
         * gender_rate : 2:1
         * short_id : dy2f90h95x8o
         * unique_id : luoyonghao
         * is_long_video : 1
         * with_fushion_shop : null
         * enterprise_verify_reason : null
         * user_ana_time : 2020-12-11 21:46:10
         * with_fusion_shop_entry : 1
         * live_commerce : 1
         * into_rank_time : 2020-03-25 17:33:07
         * crawl_time : 2020-12-11 21:40:06
         * seed_aweme_rate : 0.00%
         * aweme_promotion_rate : 0.00%
         * rank_date : 2020-11-30 00:00:00
         * have_live_histroy : 1
         * club_info : {"active_fans_count":"31545","name":"罗永浩","total_fans_count":"720718"}
         * xd_tags : ["技术流"]
         * content_words_graph : [{"keyword":"挑战","weight":"1"},{"keyword":"发生","weight":"0.9635768396701238"},{"keyword":"等待","weight":"0.7056739671291822"},{"keyword":"期待","weight":"0.7033253051087393"},{"keyword":"好事","weight":"0.7007801239261808"},{"keyword":"浙里","weight":"0.6759139483904322"},{"keyword":"好物","weight":"0.6757290905196441"},{"keyword":"放心","weight":"0.6757290905196441"},{"keyword":"乡约","weight":"0.6729088696385858"},{"keyword":"大会","weight":"0.6710185175529781"},{"keyword":"压箱底","weight":"0.6710185175529781"},{"keyword":"丰收","weight":"0.6695631251633424"},{"keyword":"湖北","weight":"0.6632344777671515"},{"keyword":"加油","weight":"0.6566975547168392"},{"keyword":"画画","weight":"0.3704620162511415"},{"keyword":"直播","weight":"0.2896094278874839"}]
         * following_follower_list_toast : 1
         * secret : 0
         * errorAccountDesc : null
         * sec_uid : MS4wLjABAAAAlwXCzzm7SmBfdZAsqQ_wVVUbpTvUSX1WC_x8HAjMa3gLb88-MwKL7s4OqlYntX4r
         * account_label : ["音乐"]
         * is_claim : null
         * claim_success : null
         * is_weixin_friend : null
         * webast_status : 2
         */

        private String avatar;
        private String uid;
        private String nickname;
        private String signature;
        private String mcn_name;
        private String mcn_desc;
        private String custom_verify;
        private String authority_status;
        private String type;
        private Integer age;
        private String constellation_name;
        private String city;
        private String province;
        private String total_favorited;
        private String mplatform_followers_count;
        private String follower_count;
        private String live_stream_follower_count;
        private String new_article_follower_count;
        private String aweme_count;
        private String mcn_id;
        private String aweme_with_promotion_count;
        private String rank_position;
        private String newrank_index;
        private Integer is_live;
        private Object with_dou_entry;
        private Object verification_type_cn;
        private String verify_label;
        private Object total_forward_count;
        private Object total_comment_count;
        private String gender;
        private String promotion_count;
        private Object collection_status;
        private String account;
        private String collection_time;
        private Object school_name;
        private String favorited_follower_rate;
        private String gender_rate;
        private String short_id;
        private String unique_id;
        private String is_long_video;
        private Object with_fushion_shop;
        private Object enterprise_verify_reason;
        private String user_ana_time;
        private int with_fusion_shop_entry;
        private String live_commerce;
        private String into_rank_time;
        private String crawl_time;
        private String seed_aweme_rate;
        private String aweme_promotion_rate;
        private String rank_date;
        private String have_live_histroy;
        private ClubInfoBean club_info;
        private String following_follower_list_toast;
        private String secret;
        private Object errorAccountDesc;
        private String sec_uid;
        private Object is_claim;
        private Object claim_success;
        private Object is_weixin_friend;
        private int webast_status;
        private List<MostBrandBean> most_brand;
        private List<MostBrandBean> most_promotion_type;
        private List<MostBrandBean> most_visitor;
        private List<String> content_tags;
        private List<String> xd_tags;
        private List<ContentWordsGraphBean> content_words_graph;
        private List<String> account_label;

        @NoArgsConstructor
        @Data
        public static class ClubInfoBean {
            /**
             * active_fans_count : 31545
             * name : 罗永浩
             * total_fans_count : 720718
             */

            private String active_fans_count;
            private String name;
            private String total_fans_count;
        }

        @NoArgsConstructor
        @Data
        public static class MostBrandBean {
            /**
             * key : Hisense/海信
             * count : 1
             */

            private String key;
            private int count;
        }

        @NoArgsConstructor
        @Data
        public static class ContentWordsGraphBean {
            /**
             * keyword : 挑战
             * weight : 1
             */

            private String keyword;
            private String weight;
        }
    }
}
