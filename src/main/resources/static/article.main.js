!function(e) {
    var t = {};
    function n(i) {
        if (t[i])
            return t[i].exports;
        var o = t[i] = {
            i: i,
            l: !1,
            exports: {}
        };
        return e[i].call(o.exports, o, o.exports, n),
            o.l = !0,
            o.exports
    }
    n.m = e,
        n.c = t,
        n.d = function(e, t, i) {
            n.o(e, t) || Object.defineProperty(e, t, {
                enumerable: !0,
                get: i
            })
        }
        ,
        n.r = function(e) {
            "undefined" != typeof Symbol && Symbol.toStringTag && Object.defineProperty(e, Symbol.toStringTag, {
                value: "Module"
            }),
                Object.defineProperty(e, "__esModule", {
                    value: !0
                })
        }
        ,
        n.t = function(e, t) {
            if (1 & t && (e = n(e)),
            8 & t)
                return e;
            if (4 & t && "object" == typeof e && e && e.__esModule)
                return e;
            var i = Object.create(null);
            if (n.r(i),
                Object.defineProperty(i, "default", {
                    enumerable: !0,
                    value: e
                }),
            2 & t && "string" != typeof e)
                for (var o in e)
                    n.d(i, o, function(t) {
                        return e[t]
                    }
                        .bind(null, o));
            return i
        }
        ,
        n.n = function(e) {
            var t = e && e.__esModule ? function() {
                    return e.default
                }
                : function() {
                    return e
                }
            ;
            return n.d(t, "a", t),
                t
        }
        ,
        n.o = function(e, t) {
            return Object.prototype.hasOwnProperty.call(e, t)
        }
        ,
        n.p = "https://images.uc.cn/s/uae/g/1y/wmmobile/",
        n(n.s = 366)
}([function(e, t, n) {
    "use strict";
    Object.defineProperty(t, "__esModule", {
        value: !0
    }),
        t.ddSdk = void 0;
    var i = n(12)
        , o = n(348)
        , a = n(12);
    Object.defineProperty(t, "ENV_ENUM", {
        enumerable: !0,
        get: function() {
            return a.ENV_ENUM
        }
    }),
        Object.defineProperty(t, "ENV_ENUM_SUB", {
            enumerable: !0,
            get: function() {
                return a.ENV_ENUM_SUB
            }
        });
    var r = n(11);
    n(347),
        t.ddSdk = new r.Sdk(i.getENV(),o.log)
}
    , function(e, t, n) {
        "use strict";
        var i = "function" == typeof Symbol && "symbol" == typeof Symbol.iterator ? function(e) {
                return typeof e
            }
            : function(e) {
                return e && "function" == typeof Symbol && e.constructor === Symbol && e !== Symbol.prototype ? "symbol" : typeof e
            }
            , o = r(n(28))
            , a = r(n(151));
        function r(e) {
            return e && e.__esModule ? e : {
                default: e
            }
        }
        /*!
 * util.js
 * Copyright(c) 2016
 * AUTHOR: shafeng
 * TAB SIZE: 4
 */
        var s = n(10)
            , c = n(22)
            , d = n(3);
        window.uciflowh5_lib_share = o.default;
        var l = n(43)
            , u = function(e) {
            var t = e && e.split("?")[1] || ""
                , n = {};
            return t && t.split("&").forEach(function(e) {
                var t = e.split("=");
                n[t[0]] = decodeURIComponent(t.slice(1, t.length).join("="))
            }),
                n
        }
            , f = u(window.location.search);
        t.urlQuery = f,
            t.parseUriQuery = u,
            t.getSafeurl = function(e) {
                return e
            }
        ;
        var p = function() {
            var e = window.navigator.userAgent
                , t = "android";
            t = globalConfig.PLATFORM ? globalConfig.PLATFORM : /Android/i.test(e) ? "android" : /iPhone/i.test(e) ? "iphone" : "pc";
            var n = "";
            return globalConfig.PR && (n = -1 !== globalConfig.PR.toLowerCase().indexOf("ucnewsapp") ? "ucnews" : -1 !== globalConfig.PR.toLowerCase().indexOf("ssight") ? "ssight" : -1 !== globalConfig.PR.toLowerCase().indexOf("uclite") ? "uclite" : "ucbrowser"),
            (e = window.navigator) && e.userAgent && e.userAgent.indexOf("UCMini") > -1 && (n = "ucmini"),
                {
                    isAndroid: "android" === t,
                    isiPhone: "iphone" === t,
                    os: t,
                    pr: n,
                    isUCNews: "ucnews" === n,
                    isUCBrowser: "ucbrowser" === n || "uclite" === n,
                    isSSight: "ssight" === n,
                    isUCLite: "uclite" === n,
                    isUCMini: "ucmini" === n,
                    isUCGold: "ucgold" === n,
                    isQuark: "ucpro" === globalConfig.PR,
                    isDingTalk: "uc_webview_pro" === globalConfig.PR && e && e.userAgent && e.userAgent.indexOf("DingTalk") > -1
                }
        }();
        t.platform = p;
        var m = function() {
            return -1 !== location.protocol.indexOf("https") || -1 !== location.href.indexOf("usehttps") || !1
        };
        t.is_https_mode = m(),
            t.is_prod_mode = "PROD" === globalConfig.ENV_MODE;
        t.is_preview_mode = /\/(preview|preview_video|preview_ytvideo).html/.test(window.location.pathname);
        var h = function() {
            var e = navigator.userAgent || "";
            return !(!e.length && p.pr) && (!p.isQuark && !/(UCBrowser|UCNewsApp|SSight|UCMobile|UCLite|UCMini)/.test(e))
        };
        t.is_share_mode = h();
        var v = function() {
            return "ucweb" === f.client || h() && !f.client
        };
        t.is_share_from_uc_browser = v;
        t.is_share_from_uc_news = function() {
            return "ucnews" === f.client
        }
        ;
        var g = function() {
            return "ssight" === f.client
        };
        t.is_share_from_ssight = g;
        t.is_weixin_browser = /micromessenger/i.test(window.navigator.userAgent);
        t._is_dingTalk_browser = /dingtalk/i.test(window.navigator.userAgent);
        var _ = function() {
            return /Weibo/i.test(window.navigator.userAgent)
        };
        t.is_weibo_browser = _();
        var w = function() {
            return /Android/i.test(window.navigator.userAgent)
        };
        t.is_android_os = w();
        var b = function(e) {
            e && e.apiName ? window.ucapi && ucapi.base.checkAPI({
                apiList: [e.apiName],
                success: function(t) {
                    t && t.checkResult && "ok" === (t.checkResult[e.apiName] || "").toLowerCase() ? e.success && e.success() : e.fail && e.fail()
                },
                fail: function() {
                    e.fail && e.fail()
                }
            }) : e && e.fail && e.fail()
        };
        function y(e, t, n, i) {
            var o = E(f.client, n, i);
            n || (o = window.location.href);
            var a = e.desc || "";
            return a = "article" === t ? $(".article-content").text().split("").slice(0, 45).join("") : a,
                a = (a = "video" === t ? e.sub_title || "" : a).trim() || (v() ? "6亿人共享的优质资讯" : "最懂你的资讯新闻阅读平台"),
                a = "【" + e.wm_name + "】" + a,
                {
                    title: e.title,
                    content: a,
                    sourceUrl: o,
                    iconUrl: e.cover_url
                }
        }
        t.checkucapi = b,
            t.getShareInfo = y,
            t.init_client_share = function(e, t, n, i, a) {
                var r = y(e, t, n, i);
                o.default.setShareInfo(Object.assign({}, r, {
                    imageUrl: r.iconUrl
                })),
                    o.default.listenWechatShareEvent(function() {
                        window.SharePageSDK && window.SharePageSDK.wechatShareCb && window.SharePageSDK.wechatShareCb()
                    })
            }
        ;
        var k = function() {
            return !!(p.isUCBrowser && p.isiPhone && s.match(globalConfig.VERSION, "~11.0") && -1 !== window.location.href.indexOf("entrance=")) || (!!(p.isUCNews && p.isiPhone && s.match(globalConfig.VERSION, "1.1.0.780~")) || (!!(p.isUCNews && p.isAndroid && s.match(globalConfig.VERSION, "1.1.0.780~") && -1 !== window.location.href.indexOf("ignore_video")) || (!!(p.isUCNews && p.isAndroid && s.match(globalConfig.VERSION, "2.6.8.000~")) || !!p.isUCMini)))
        };
        t.is_client_iflow_video_support = k();
        t.is_client_wemedia_homepage_support = !(!p.isUCBrowser || !s.match(globalConfig.VERSION, "10.9.15~")) || !(!p.isUCNews || !s.match(globalConfig.VERSION, "1.2.0.790~"));
        t.is_client_support_video_play = !!(p.isUCBrowser && (p.isAndroid && s.match(globalConfig.VERSION, "11.0~") || p.isiPhone && s.match(globalConfig.VERSION, "11.0~")) || p.isUCNews && p.isiPhone && s.match(globalConfig.VERSION, "1.8.0.904~") || p.isUCMini || k());
        t.is_hide_titlebar = !(p.isUCLite && s.match(globalConfig.VERSION, "~11.6.4.6") || (p.isUCBrowser || p.isUCLite) && globalConfig.KT && 1 == globalConfig.KT || !(p.isUCBrowser && s.match(globalConfig.VERSION, "11.0~") && s.match(globalConfig.VERSION, "~11.8.3.960") || p.isUCLite && s.match(globalConfig.VERSION, "11.6.5~"))),
            t.is_u4_hotfix_titelbar = function(e) {
                p.isAndroid && p.isUCBrowser && -1 !== window.navigator.userAgent.indexOf("Chrome") && s.match(globalConfig.VERSION, "11.0.0.818") && window.ucapi && ucapi.base && ucapi.base.getVersion({
                    success: function(t) {
                        var n = !1;
                        -1 !== ["uclab78", "uclab79", "uclab80"].indexOf(t.subver) && (n = !0),
                            globalConfig.is_u4_hotfix_titlebar = n,
                        e && e(n)
                    },
                    fail: function() {
                        e && e(!1)
                    }
                })
            }
        ;
        var x = function(e) {
            var t = f.uc_param_str;
            if (!t)
                return "";
            var n = t.split("")
                , i = {};
            n.forEach(function(e, t) {
                t % 2 == 0 && (i[n.slice(t, t + 2).join("")] = 1)
            });
            var o = {}
                , a = e || i
                , r = null;
            for (var s in a)
                a.hasOwnProperty(s) && (r = f[s]) && (o[s] = r);
            return f.ut && (o.ut = f.ut),
            f.pc && (o.pc = f.pc),
                o
        };
        t.getUCParams = x,
            t.compressImage = function(e, t, n, i, o) {
                if (!globalConfig.isCompressImage)
                    return e;
                if (globalConfig.sampleFactor && Math.ceil(20 * Math.random()) > globalConfig.sampleFactor)
                    return e;
                if (!e || -1 === e.indexOf("//image.uc.cn/s/"))
                    return e;
                if (-1 !== e.indexOf("?"))
                    return e;
                if (-1 !== e.indexOf(";"))
                    return e;
                var a = "3";
                globalConfig.NETWORK_TYPE && -1 !== "wifi,4g".indexOf(globalConfig.NETWORK_TYPE.toLowerCase()) && (a = "4");
                var r = "jpegx";
                "gif" === t && (r = "gif"),
                p.isUCBrowser && p.isAndroid && ("jpeg" === t || "jpg" === t) && (r = "webp"),
                p.isUCBrowser && p.isAndroid && "gif" !== t && 0 === i && void 0 !== i && (r = f.lentp ? "lentpw" : "webp");
                try {
                    var s = ";," + a + "," + r + ";3," + (n = n || 700) + "x";
                    return o && (s += ",;6,C-C," + o),
                        s += ".jpg",
                    window.location.protocol + "//image.uc.cn/o/" + e.split("//image.uc.cn/s/")[1] + s
                } catch (e) {}
                return e
            }
            ,
            t.optimizeGifImage = function(e, t) {
                if (!globalConfig.isCompressGifImage)
                    return e;
                if (globalConfig.sampleFactor && Math.ceil(20 * Math.random()) > globalConfig.sampleFactor)
                    return e;
                if (!e || -1 === e.indexOf("//image.uc.cn/s/"))
                    return e;
                if (-1 !== e.indexOf("?"))
                    return e;
                if (-1 !== e.indexOf(";"))
                    return e;
                var n = "60";
                globalConfig.NETWORK_TYPE && -1 !== "wifi,4g".indexOf(globalConfig.NETWORK_TYPE.toLowerCase()) && (n = "80");
                try {
                    t = t || 600;
                    var i = "//image.uc.cn/o/" + e.split("//image.uc.cn/s/")[1] + ";," + n + ",;12,0," + t + "x";
                    return i += ".gif"
                } catch (e) {}
                return e
            }
        ;
        var E = function(e, t, n, i) {
            var o = "PROD" === globalConfig.ENV_MODE && -1 !== location.host.indexOf(".mp.uc.cn") ? "a.mp.uc.cn" : "mparticle.uc.cn";
            -1 === ["article_new", "article_org"].indexOf(window.waPage) && (o = location.host);
            var a = {
                uc_param_str: f.uc_param_str,
                client: P() || "",
                wm_id: n || globalConfig.wm_id,
                title_type: f.title_type || "1",
                pagetype: "share",
                app: f.app,
                btifl: 100
            }
                , r = globalConfig.isFromFashFish ? "wm_cid" : "wm_aid";
            a[r] = t || globalConfig.wm_aid;
            var s = location.protocol + "//" + o + (i || location.pathname) + "?";
            return -1 !== location.pathname.indexOf("video") && (a.btifl = 10016),
            f.from && f.from.indexOf("bigsubs") > -1 && (a.btifl = 10307),
            globalConfig.origin_id && (a.wm_aid = globalConfig.origin_id),
            "" + s + Object.keys(a).map(function(e) {
                return e + "=" + encodeURIComponent(a[e])
            }).join("&")
        };
        t.flowbackUrl = E,
            t.shareUrl = E,
            t.flowbackUrlVideo = E,
            t.shareUrlVideo = E;
        t.awardPageUrl = function() {
            return globalConfig.AWARD_PAGE_DOMAIN + "/award.html?mid=" + globalConfig.wm_id + "&aid=" + globalConfig.wm_aid + "&uc_param_str=" + f.uc_param_str + "&uc_biz_str=S:custom%7CC:default%7CK:true"
        }
        ;
        var P = function() {
            var e = f.client;
            return e || (p.isUCNews ? "ucnews" : p.isUCBrowser || p.isUCLite ? "ucweb" : p.isSSight ? "ssight" : "ucweb")
        };
        t.clientStr = P;
        t.uc_app_str = function() {
            return p.isUCNews ? "ucnews" : "ucweb"
        }
        ;
        var S = function() {
            if (globalConfig.KT && 1 == globalConfig.KT)
                return !0;
            var e = window.navigator.userAgent;
            return !(!p.isAndroid || !p.isUCNews || -1 !== e.indexOf("U3/") || -1 !== e.indexOf("U4/"))
        };
        t.is_android_system_core = S(),
            t.directlyFollow = function(e) {
                e.is_followed || e.wm_id === globalConfig.wm_id && globalConfig.is_followed ? N(e) : b({
                    apiName: "wemedia.followWemedia",
                    success: function() {
                        window.ucapi && ucapi.wemedia.followWemedia({
                            action: e.action || "follow",
                            wm_id: e.wm_id || globalConfig.wm_id,
                            wm_aid: e.wm_aid || globalConfig.wm_aid,
                            xss_aid: e.xss_aid || globalConfig.sm_article_id,
                            from: e.from || -1,
                            success: function(t) {
                                e.success && e.success(t)
                            },
                            fail: function() {
                                e.fail && e.fail(),
                                    N(e)
                            }
                        })
                    },
                    fail: function() {
                        e.fail && e.fail(),
                            N(e)
                    }
                })
            }
        ;
        var N = function(e) {
            var n = void 0 !== (e = e || {}).is_followed ? e.is_followed : globalConfig.is_followed;
            if (globalConfig.VERSION && (p.isUCBrowser && s.match(globalConfig.VERSION, "10.9.15~") || p.isUCNews && s.match(globalConfig.VERSION, "1.2.0.790~")) || p.isSSight)
                window.ucapi && ucapi.wemedia && ucapi.wemedia.openHomePage({
                    id: e.wm_id || globalConfig.wm_id || "",
                    name: e.wm_name || globalConfig.wm_name || "",
                    avatar_url: e.avatar_url || globalConfig.avatar_url || "",
                    followed: n ? 1 : 0,
                    target: e.target || (n ? "index" : "info"),
                    from: e.from || 2,
                    target_col_id: e.target_col_id || "",
                    wm_aid: e.wm_aid || globalConfig.wm_aid || "",
                    xss_aid: e.xss_aid || globalConfig.sm_article_id,
                    wm_id_src: e.wm_id_src || globalConfig.wm_id || "",
                    wm_name_src: e.wm_name_src || globalConfig.wm_name || "",
                    success: function() {},
                    fail: function(e) {}
                });
            else {
                var i = "";
                -1 === location.host.indexOf("mp.uc.cn") && -1 === location.host.indexOf("mparticle.uc.cn") || (i = "http://a.mp.uc.cn");
                var o = i + "/media.html?mid=" + (e.wm_id || globalConfig.wm_id) + "&uc_biz_str=S:custom%7CC:iflow_ncmt&uc_param_str=" + f.uc_param_str + "&from=" + (globalConfig.CP || "");
                if (g())
                    return void j(f.client, o);
                window.location.href = t.getSafeUrl(o)
            }
        };
        t.gotoHomePage = N;
        t.request = function(e, t) {
            var n = {}
                , i = e.data || {};
            for (var o in i)
                i.hasOwnProperty(o) && (n[o] = i[o]);
            e.data && e.data.uc_param_str || (n.uc_param_str = f.uc_param_str);
            var a = e.url;
            e.napi && (a = globalConfig.NAPI_DOMAIN + e.url + (-1 !== e.url.indexOf("?") ? "&" : "?") + "_app_id=" + globalConfig.NAPI_APPID + "&_fetch=1&_fetch_incrs=1",
            f.max_age && (a += "&_max_age=1"),
                e.headers = e.headers || {},
                e.headers["Content-Type"] = "text/plain; charset=UTF-8");
            var r, s = null, l = 0;
            if (e.loading && (l = setTimeout(function() {
                s = A()
            }, 1e3)),
                S()) {
                var u = x();
                for (var o in u)
                    n[o] = u[o]
            }
            if (globalConfig.useRequestCache && e.requestCache && (!e.method || "get" === e.method.toLowerCase()) && (r = c.getItem(a))) {
                clearTimeout(l),
                e.loading && s && s.hide();
                var p = JSON.parse(r);
                return void (t && t(p.error ? p.error : null, p))
            }
            $.ajax({
                url: a,
                type: e.method || "GET",
                dataType: e.dataType || "json",
                headers: e.headers || "",
                crossDomain: !0,
                data: n,
                timeout: e.timeout || 2e4,
                cache: e.cache || !1,
                success: function(n) {
                    n || d.event({
                        action: "request_resp_empty",
                        url: a
                    }),
                        n = n || {},
                        clearTimeout(l),
                    e.loading && s && s.hide(),
                    !globalConfig.useRequestCache || !e.requestCache || e.method && "get" !== e.method.toLowerCase() || c.setItem(a, JSON.stringify(n), e.cacheExpires || globalConfig.requestCacheExpires || 3600),
                    t && t(n.error ? n.error : null, n)
                },
                error: function(n, i, o) {
                    d.event({
                        action: "http_error",
                        url: a,
                        error: o || "",
                        error_type: i || "",
                        status: n && n.status,
                        pageurl: window.location.href
                    }),
                    window.send_discovery_log && window.send_discovery_log({
                        page: window.waPage,
                        action: "http_error",
                        url: a,
                        error: o || "",
                        error_type: i || "",
                        status: n && n.status,
                        pageurl: window.location.href
                    }, 1e3),
                    window.tracker && window.tracker.log({
                        code: 13,
                        msg: a,
                        sampleRate: .05,
                        c1: globalConfig.NETWORK_TYPE,
                        c2: n && n.status,
                        c3: i || ""
                    }),
                        clearTimeout(l),
                    e.loading && s && s.hide(),
                    t && t(o || "error", {})
                }
            })
        }
            ,
            t.login = function(e) {
                var t = function() {
                    var t = "UCAPI_LOGIN_CALLBACK_" + +new Date;
                    window[t] = function() {
                        setTimeout(function() {
                            e && e(null)
                        }, 1e3)
                    }
                        ,
                        p.isiPhone || p.isAndroid && s.match(globalConfig.VERSION, "11.0.5.841~") ? window.ucapi && ucapi.account && ucapi.account.openLoginWindow && ucapi.account.openLoginWindow({
                            loginCallback: t + "()",
                            success: function(e) {},
                            type: 0,
                            uiType: "window",
                            fail: function(t) {
                                e && e(t)
                            }
                        }) : (window.callLoginStateChange = function(e) {
                            window[t]()
                        }
                            ,
                            window.ucweb && window.ucweb.startRequest ? window.ucweb.startRequest("shell.account.openLoginPanel", [-1]) : e && e("error"))
                };
                if (window.ucapi && ucapi.account && ucapi.account.getUserInfo) {
                    var n = +new Date;
                    ucapi.account.getUserInfo({
                        vCode: n,
                        success: function(i) {
                            i.sign_wg && i.kps_wg || i.sign && i.kps ? (i.vcode = n,
                            e && e(null, i)) : t()
                        },
                        fail: function(e) {
                            t()
                        }
                    })
                } else
                    e && e("err")
            }
            ,
            t.userInfo = function(e, t) {
                var n = +new Date
                    , o = !1
                    , a = function(t, n) {
                    o = !0,
                    e && e(t, n)
                };
                if (setTimeout(function() {
                    o || a(null, {})
                }, 2e3),
                window.ucapi && ucapi.account && ucapi.account.getUserInfo)
                    try {
                        ucapi.account.getUserInfo({
                            vCode: n,
                            success: function(e) {
                                if ("string" == typeof e)
                                    try {
                                        e = JSON.parse(e)
                                    } catch (e) {}
                                if (e && "object" === (void 0 === e ? "undefined" : i(e)) && (e.vcode = n),
                                t || e.avatar_url)
                                    a && a(null, e);
                                else if (p.isiPhone) {
                                    var o = [""];
                                    window.notifyLoginState = function(t) {
                                        var n = JSON.parse(t);
                                        e.avatar_url = n.data && n.data.avatarUrl,
                                        a && a(null, e)
                                    }
                                        ,
                                        o.push(notifyLoginState),
                                        window.ucbrowser && window.ucbrowser.accountGetLoginInfo ? window.ucbrowser.accountGetLoginInfo.apply(window.ucbrowser.accountGetLoginInfo, o) : document.addEventListener("UCBrowserReady", function e() {
                                            document.removeEventListener("UCBrowserReady", e, !1),
                                            window.ucbrowser && window.ucbrowser.accountGetLoginInfo && window.ucbrowser.accountGetLoginInfo.apply(window.ucbrowser.accountGetLoginInfo, o)
                                        }, !1)
                                } else {
                                    o = ["notifyLoginState"];
                                    window.notifyLoginState = function(t) {
                                        var n = JSON.parse(t);
                                        e.avatar_url = n.data && n.data.avatarUrl,
                                        a && a(null, e)
                                    }
                                        ,
                                    window.ucweb && window.ucweb.startRequest && window.ucweb.startRequest("shell.account.getLoginInfo", o)
                                }
                            },
                            fail: function(e) {
                                a && a(e)
                            }
                        })
                    } catch (e) {
                        a && a(e)
                    }
                else
                    a && a("error happen")
            }
        ;
        var I = function(e, t) {
            var n = "alert_" + Date.now()
                , i = ['<div class="alert wemedia" id="' + n + '">', t ? '<div class="alert-icon"><img width="34" height="34" src="' + t + '"></div>' : "", '<div class="alert-content">' + e + "</div>", "</div>"];
            $(document.body).append(i.join("")),
                $("#" + n).css({
                    top: ((window.innerHeight || document.documentElement.clientHeight) - $("#" + n).height()) / 2,
                    left: (window.innerWidth - $("#" + n).width()) / 2
                }),
                this.alert_id = n
        };
        I.prototype = {
            hide: function() {
                $("#" + this.alert_id).remove()
            }
        };
        var C = function(e, t, n) {
            var i = new I(e,t);
            setTimeout(function() {
                i.hide()
            }, n && n.timeout || 1e3)
        }
            , A = function(e) {
            e = e || "载入中";
            var t = "//image.uc.cn/s/uae/g/0m/loading.svg";
            return "https:" === window.location.protocol && (t = "https://image-uc-cn.alikunlun.com/s/uae/g/0m/loading.svg"),
                new I(e,t)
        };
        t.toast = C,
            t.error = function(e) {
                var t = "//image.uc.cn/s/uae/g/0m/error.png";
                "https:" === window.location.protocol && (t = "https://image-uc-cn.alikunlun.com/s/uae/g/0m/error.png"),
                    C(e, t)
            }
            ,
            t.loading = A;
        var M = !!f.wm_debug;
        t.debug = function(e) {
            M && console && console.log && console.log("object" === (void 0 === e ? "undefined" : i(e)) ? JSON.stringify(e) : e)
        }
        ;
        var U = O(function(e, n) {
            t.userInfo(function(i, o) {
                if (t.is_share_mode)
                    return n(null, {});
                o = o || {},
                t.is_client_wemedia_homepage_support || (o.sign = o.kps = ""),
                    t.request({
                        url: globalConfig.WM_SERVER_DOMAIN + "/api/v1/users/subscribers/wemedias/" + e + "/check",
                        dataType: "jsonp",
                        timeout: 8e3,
                        data: {
                            s: o.sign || "",
                            k: o.kps || "",
                            v: o.vcode || "",
                            s_wg: o.sign_wg || "",
                            k_wg: o.kps_wg || "",
                            app: t.uc_app_str(),
                            from: "article",
                            fetch_unread: 1
                        }
                    }, n)
            })
        });
        function O(e) {
            var t = !1
                , n = []
                , i = {};
            return function() {
                var o = [].slice.call(arguments)
                    , a = o.slice(0, o.length - 1)
                    , r = JSON.stringify(a)
                    , s = i[r]
                    , c = o[o.length - 1];
                return s ? c.apply(null, s) : t ? n.push(c) : (t = !0,
                    void e.apply(null, a.concat([function() {
                        t = !1;
                        var e = [].slice.call(arguments)
                            , o = i[r] = e;
                        [c].concat(n).forEach(function(e) {
                            e.apply(null, o)
                        })
                    }
                    ])))
            }
        }
        t.getIsFollowed = U,
            t.cached = O,
            t.randomToken = function(e, t) {
                var n = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXTZabcdefghiklmnopqrstuvwxyz".split("");
                e = e || 10;
                for (var i = "", o = 0; o < e; o++)
                    i += n[Math.floor(Math.random() * n.length)];
                return i + (t ? Date.now().toString(32) : "")
            }
        ;
        var j = function(e, n) {
            {
                if ("pc" != p.os)
                    return console.log("share sdk not init yet!"),
                        void (0,
                            a.default)(n);
                window.location.href = t.getSafeUrl(n)
            }
        };
        t.openUrl = j;
        t.openChannel = function(e, t) {
            var n = "ucnews" === e;
            w() ? location.href = "http://a.app.qq.com/o/simple.jsp?pkgname=" + (n ? "com.uc.infoflow" : "com.UCMobile") + "&android_scheme=" + encodeURIComponent("ucweb://ext:info_flow_open_channel:ch_id=" + t + "&type=multiple&from=26") : location.href = "http://iflow.uczzd.cn/" + (n ? "newsapp" : "ucbrowser") + "/openapp.html?channelid=" + t
        }
        ;
        var T = function() {
            var e = (window.navigator.userAgent || "").match(/weibo_+([\d\.]+)/i);
            return e && e.length > 1 ? e[1] : ""
        };
        function V(e, t, n) {
            t = t || "50%";
            var i = !1;
            function o() {
                if (!i) {
                    var a = $(e).offset().top
                        , r = $(e).height()
                        , s = document.documentElement ? document.documentElement.scrollTop : 0
                        , c = document.body ? document.body.scrollTop : 0
                        , d = (s > c ? s : c) + window.innerHeight;
                    if (0 !== r) {
                        if (t.match(/%$/))
                            var l = a + r * parseFloat(t) / 100;
                        else
                            l = a + parseInt(t);
                        (d >= l || d >= $(document.body).height()) && (document.removeEventListener("scroll", o),
                            i = !0,
                        n && n())
                    }
                }
            }
            document.addEventListener("scroll", o),
                o()
        }
        function L(e, t) {
            if ("function" != typeof t) {
                var n = t;
                t = function(e) {
                    return e === n
                }
            }
            for (var i = 0; i < e.length; i++)
                if (t(e[i]))
                    return i;
            return -1
        }
        function D(e, t) {
            var n = [];
            for (var i in e)
                n.push(t(i, e[i]));
            return n
        }
        function R() {
            var e = f.push_article_style;
            if (!e)
                try {
                    var t = window.location.hash
                        , n = /push_article_style=(\d)/gi.exec(t);
                    n && n[1] && (e = n[1])
                } catch (t) {
                    e = 0
                }
            var i = parseInt(e, 10);
            return isNaN(i) || (e = i),
                e
        }
        t.weibo_version = T(),
            t.onImpress = V,
            t.statWhenExposure = function(e, t, n, i) {
                V(e, n, function() {
                    d.event({
                        action: "exposure",
                        id: t,
                        exposure_element: t,
                        trigger_height: n
                    }, 200)
                })
            }
            ,
            t.deepSet = function(e, t, n) {
                var o = t.split(".");
                !function t() {
                    var a = o.shift();
                    a && (0 === o.length ? e[a] = n : ("object" !== i(e[a]) && (e[a] = {}),
                        e = e[a],
                        t()))
                }()
            }
            ,
            t.deepGet = function(e, t) {
                var n = t.split(".");
                return function t() {
                    var o = n.shift();
                    if (o) {
                        if (0 === n.length)
                            return e[o];
                        if ("object" !== i(e[o]))
                            return;
                        return e = e[o],
                            t()
                    }
                }()
            }
            ,
            t.gz2ArticleDomain = function(e, t) {
                if (t.format_type && 1002 == t.format_type || t.article_category && 1 == t.article_category)
                    return e;
                var n = e;
                return !m() && "PROD" === globalConfig.ENV_MODE && p.isUCBrowser && (p.isiPhone && s.match(globalConfig.VERSION, "11.5.0~") || p.isAndroid && s.match(globalConfig.VERSION, "11.3.5~")) && (n = "http://ag.mp.uc.cn"),
                    n
            }
            ,
            t.isNightMode = function() {
                return $(".UCUNNIC").length > 0
            }
            ,
            t.isTransparentMode = function() {
                return $(".UCTransparentMode").length > 0
            }
            ,
            t.transFashFishToWeMedia = function(e) {
                var t = arguments.length > 1 && void 0 !== arguments[1] ? arguments[1] : {}
                    , n = "2" === f.title_type
                    , i = e && e._extra || {};
                if (e.title = (n ? i.second_title : e.title) || e.title,
                    e._id = e.content_id,
                    e.wm_aid = e.origin_id,
                    e.wm_id = e._author && e._author.author_id || e.author_id || "",
                    e.wm_name = e._author && e._author.author_name || "",
                    e.avatar_url = e._author && e._author.avatar_url || "",
                    e.author = e._extra && e._extra.origin_author || e.wm_name,
                    e.thumbnail_url = e._extra && e._extra.thumbnail_url || "",
                    e.wm_weixin_id = e._author && e._author.extra_map && e._author.extra_map.wm_weixin_id || "",
                    e.status = 1 == e.status ? 6 : 0,
                    e.xss_item_id = (n ? i.second_xss_item_id : i.xss_item_id) || i.xss_item_id || "",
                    e.show_id = e._extra && e._extra.biz_custom && e._extra.biz_custom.show_id || void 0,
                e.show_id || (e.show_id = e._extra && e._extra.show_id || void 0),
                    e.sm_article_id = e.xss_item_id,
                "1001" == e.format_type)
                    e.content = e.body && e.body.text;
                else if ("1002" == e.format_type) {
                    var o = e.body.videos && e.body.videos[0] || {};
                    e.content = '\n      <span class="video-box">\n        <video src="" controls controlslist="nodownload" preload="none" poster="' + (o.thumbnail || "") + '" playsinline webkit-playsinline="true" x-webkit-airplay="allow" preload="none" oncontextmenu="return false;"></video>\n      </span>\n      ',
                        e.other_info = {
                            video_id: o.ums_id || "",
                            video_playurl: "http://v.ums.uc.cn/video/v_" + o.ums_id + ".html",
                            video_duration: 1e3 * (o.duration || 0),
                            video_filename: o.file_name || "",
                            video_status: 1
                        }
                } else
                    "1005" == e.format_type && (e.other_info = {
                        description_type: e._extra && e._extra.description_type || "1",
                        imgs: e.body.imgs || []
                    });
                return e.is_original = e._extra && e._extra.is_original ? 1 : 0,
                    e.publish_at = e.published_at || "",
                    e.publish_at = e.publish_at.substring(0, 19).replace("T", " "),
                    e.publish_at > "2017-12-18" ? (e.read_times = 0,
                        e._incrs = e._incrs && {
                            liketimes: e._incrs.like || 0,
                            readtimes: e._incrs.click1 || 0,
                            readtimes_even: e._incrs.click2 || 0,
                            play: e._incrs.play
                        } || {}) : (e._incrs = e._incrs || {},
                        e.read_times = e._incrs.click3 || e._incrs.click_total || 0,
                        e._incrs = e._incrs && {
                            liketimes: e._incrs.like || 0,
                            readtimes: e._incrs.click1 || 0,
                            readtimes_even: e._incrs.click2 || 0,
                            play: e._incrs.play
                        } || {}),
                    e.editorMode = "simple",
                e._product_info && (e.is_show_ad = e._product_info.ad && e._product_info.ad.is_show_ad || !1,
                    e.open_award = e._product_info.award && e._product_info.award.open_award || !1,
                e._product_info.settings && (e.editorMode = e._product_info.settings.editor_mode || "simple",
                    e.weixin_promote = e._product_info.settings.weixin_promote || !1),
                e._product_info.reproduce && e._product_info.reproduce.from && (e.reproduce_from = {
                    wm_id: e._product_info.reproduce.from.wm_id,
                    wm_name: e._product_info.reproduce.from.wm_name,
                    article_id: e._product_info.reproduce.from.article_id
                })),
                f && f.sm_article_id && !t.noUseQueryXssId && (e.sm_article_id = e.xss_item_id = f.sm_article_id,
                e._extra && (e._extra.xss_item_id = f.sm_article_id)),
                    e
            }
            ,
            t.findIndex = L,
            t.find = function(e, t) {
                return e[L(e, t)]
            }
            ,
            t.mapObj = D,
            t.genUrl = function(e, t) {
                var n = e;
                return t && (t = D(t, function(e, t) {
                    return void 0 === t ? void 0 : encodeURIComponent(e) + "=" + encodeURIComponent(t)
                })).length > 0 && (n += "?" + t.filter(function(e) {
                    return void 0 !== e
                }).join("&")),
                    n
            }
            ,
            t.processHtml = function(e, t) {
                var n = document.createElement("div");
                return n.innerHTML = e,
                    t(n),
                    n.innerHTML
            }
            ,
            t.getClientHeight = function() {
                if (void 0 != window.innerHeight)
                    return window.innerHeight;
                var e = document.body
                    , t = document.documentElement;
                return Math.min(t.clientHeight, e.clientHeight)
            }
            ,
            t.xissLog = function(e, t) {
                e = e || {},
                    t = t || {};
                var n = globalConfig.IFLOWDOMAIN + "/log/api/v1/client/info?uc_param_str=dnnivebichfrmintnwcpgieiwidsudpfsv&"
                    , i = e.xss_item_id || globalConfig.sm_article_id || ""
                    , o = {
                    et: "iflow-article",
                    page: "article",
                    page_form: "wemedia",
                    title: e.title || document.title || "",
                    item_id: i,
                    content_id: e.content_id,
                    wm_id: e.wm_id,
                    app: f.app || "",
                    reco_id: f.reco_id || "",
                    zzd_from: f.zzd_from || "",
                    ch_id: f.cid || "",
                    item_type: e.item_type || 0,
                    uc: p.isUCBrowser ? 1 : 0,
                    fr: p.isAndroid ? "android" : "ios",
                    _: Date.now(),
                    content: JSON.stringify([{
                        aid: i
                    }]),
                    host: location.host
                };
                o.region = t.region || "",
                    o.action = t.action || "";
                var a = n + Object.keys(o).map(function(e) {
                    return e + "=" + (encodeURIComponent(o[e]) || "")
                }).join("&");
                d.send(a)
            }
            ,
            t.formatImageUrl = function(e) {
                return e && e.replace ? e.replace(/(http:\/\/)/g, "//") : e
            }
            ,
            t.getPushStyle = R,
            t.getIsReflowStyle = function() {
                return h() ? 0 : 2 === R() ? 1 : "opout-iflow" === f.app ? 2 : 0
            }
            ,
            t.getArticleProduceInfo = function(e) {
                var t = {
                    name: e.author || "",
                    isReproduce: !1
                };
                return e.reproduce_from && e.reproduce_from.wm_name && (t.name = e.reproduce_from.wm_name,
                    t.isReproduce = !1),
                    t
            }
            ,
            t.getReadId = function() {
                if (window.wmReadId)
                    return window.wmReadId;
                var e = globalConfig.sm_article_id || ""
                    , t = "";
                try {
                    t = localStorage.getItem("user_sn")
                } catch (e) {}
                var n = l(t + e + Date.now());
                return window.wmReadId = n,
                    n
            }
            ,
            t.isHuaweiPre = function() {
                return "uclite15m-iflow" === f.app || !(!window.ucParams || "36744" !== window.ucParams.bi)
            }
            ,
            t.isTaojinIflow = !(!f || "taojin-iflow" !== f.app),
            t.getVipInfo = function(e) {
                var t = e._author || {}
                    , n = t && t.extra_map || {};
                return f.UC_TEST_VIP ? {
                    level: f.UC_TEST_VIP,
                    authDesc: "测试认证测试认证测试认证测试认证测试认证"
                } : 1 !== n.vip_status || !n.vip_level || ["1", "2", "3"].indexOf(n.vip_level) > -1 ? {
                    level: 0,
                    authDesc: ""
                } : {
                    level: n.vip_level,
                    authDesc: n.auth_desc || ""
                }
            }
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.genBizStoreParamsDealFn = t.genBoolResultDealFn = t.forceChangeParamsDealFn = t.genDefaultParamsDealFn = t.addDefaultCorpIdParamsDeal = t.addWatchParamsDeal = void 0,
            t.addWatchParamsDeal = function(e) {
                var t = Object.assign({}, e);
                return t.watch = !0,
                    t
            }
            ,
            t.addDefaultCorpIdParamsDeal = function(e) {
                var t = Object.assign({}, e);
                return t.corpId = "corpId",
                    t
            }
            ,
            t.genDefaultParamsDealFn = function(e) {
                var t = Object.assign({}, e);
                return function(e) {
                    return Object.assign({}, t, e)
                }
            }
            ,
            t.forceChangeParamsDealFn = function(e) {
                var t = Object.assign({}, e);
                return function(e) {
                    return Object.assign(e, t)
                }
            }
            ,
            t.genBoolResultDealFn = function(e) {
                return function(t) {
                    var n = Object.assign({}, t);
                    return e.forEach(function(e) {
                        void 0 !== n[e] && (n[e] = !!n[e])
                    }),
                        n
                }
            }
            ,
            t.genBizStoreParamsDealFn = function(e) {
                var t = Object.assign({}, e);
                return "string" != typeof t.params ? (t.params = JSON.stringify(t),
                    t) : t
            }
    }
    , function(e, t, n) {
        "use strict";
        /*!
 * stat.js
 * Copyright(c) 2015
 * AUTHOR: shafeng
 * TAB SIZE: 4
 */
        if (window._stat_module)
            e.exports = window._stat_module;
        else {
            var i = function() {
                for (var e = [].slice.call(arguments), t = e[0] || {}, n = 1; n < e.length; n++) {
                    var i = e[n];
                    for (var o in i)
                        i.hasOwnProperty(o) && (t[o] = i[o])
                }
                return t
            }
                , o = function(e) {
                if (!e)
                    return "";
                var t = [];
                for (var n in e)
                    e.hasOwnProperty(n) && t.push(n + "=" + encodeURIComponent(e[n]));
                return t.join("&")
            }
                , a = function(e) {
                return e = void 0 !== e ? e : 1e3,
                parseInt(1e3 * Math.random(), 10) <= e
            }
                , r = globalConfig && globalConfig.waJSLogId || "070b5f1f4053"
                , s = -1 !== window.location.protocol.indexOf("https") ? globalConfig.waHttpsDomain : globalConfig.waHttpDomain
                , c = {
                appid: r,
                grayid: globalConfig.grayId
            }
                , d = {};
            d.init = function(e) {
                var t = function(e) {
                    var t;
                    if (e) {
                        var n = location.href.indexOf("?");
                        if (-1 == n)
                            return [];
                        t = location.href.substr(n + 1)
                    } else
                        t = location.search.substr(1);
                    var i = {};
                    return t && t.split("&").forEach(function(e) {
                        if (e) {
                            var t = (e = e.split("+").join(" ")).indexOf("=")
                                , n = t > -1 ? e.substr(0, t) : e
                                , o = t > -1 ? decodeURIComponent(e.substr(t + 1)) : ""
                                , a = n.indexOf("[");
                            if (-1 == a)
                                i[decodeURIComponent(n)] = o;
                            else {
                                var r = n.indexOf("]")
                                    , s = decodeURIComponent(n.substring(a + 1, r));
                                n = decodeURIComponent(n.substring(0, a)),
                                i[n] || (i[n] = []),
                                    s ? i[n][s] = o : i[n].push(o)
                            }
                        }
                    }),
                        i
                }();
                i(c, e, {
                    uc_param_str: t.uc_param_str
                })
            }
                ,
                d.pageview = function(e, t, n, r) {
                    if (a(t)) {
                        var d = i({}, {
                            lt: "event",
                            type: "pageview",
                            e_c: "customEvent",
                            e_a: "c"
                        }, c, e || {})
                            , l = (n || s) + "collect?" + o(d) + "&_t=" + +new Date;
                        (r || globalConfig.useSendBecon) && navigator.sendBeacon && -1 !== navigator.userAgent.indexOf("Android") && /(UCBrowser|UCLite|UCMobile)/.test(navigator.userAgent) ? navigator.sendBeacon(l, "") : (window["WA_LOG_PAGEVIEW_IMG" + +new Date] = new Image).src = l
                    }
                }
                ,
                d.event = function(e, t, n, r) {
                    if (a(t)) {
                        var d = i({}, {
                            lt: window.lt || "event",
                            type: "event",
                            e_c: "customEvent",
                            e_a: "c"
                        }, c, e || {})
                            , l = (n || s) + "collect?" + o(d) + "&_t=" + +new Date;
                        (r || globalConfig.useSendBecon) && navigator.sendBeacon && -1 !== navigator.userAgent.indexOf("Android") && /(UCBrowser|UCLite|UCMobile)/.test(navigator.userAgent) ? navigator.sendBeacon(l, "") : (window["WA_LOG_EVENT_IMG" + +new Date] = new Image).src = l
                    }
                }
                ,
                d.send = function(e, t, n) {
                    a(t) && ((n || globalConfig.useSendBecon) && navigator.sendBeacon && -1 !== navigator.userAgent.indexOf("Android") && /(UCBrowser|UCLite|UCMobile)/.test(navigator.userAgent) ? navigator.sendBeacon(e, "") : (window["WA_LOG_EVENT_IMG" + +new Date] = new Image).src = e)
                }
                ,
                window._stat_module = d,
                e.exports = d
        }
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        });
        var i = function(e) {
            return e && e.__esModule ? e : {
                default: e
            }
        }(n(41));
        t.default = {
            utLogger: i.default,
            init: function() {
                var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {}
                    , t = e.pageType
                    , n = e.urlQuery
                    , o = void 0 === n ? {} : n
                    , a = e.xissJsonData
                    , r = void 0 === a ? {} : a
                    , s = e.wmAuthorInfo
                    , c = void 0 === s ? {} : s
                    , d = e.pageName
                    , l = void 0 === d ? "page_iflow_article" : d
                    , u = e.logKey
                    , f = void 0 === u ? "/uc_iflow.article" : u
                    , p = e.deeplink
                    , m = e.articleData
                    , h = void 0 === m ? {} : m
                    , v = r && r.category || []
                    , g = void 0 !== c.wm_level ? c.wm_level : -1
                    , _ = "uc-iflow" === o.zzd_from ? "iflow" : o.zzd_from
                    , w = -1;
                try {
                    w = ucweb.window.performance.fromCache
                } catch (e) {}
                var b = {
                    ev_ct: _ || "other",
                    guide_type: 2,
                    uc_param_str: "frvesv",
                    reco_id: o.recoid || -1,
                    ch_id: o.cid || -1,
                    page_type: t || -1,
                    app: o.app || -1,
                    category_fst: v[0] || -1,
                    category_sec: v[1] || -1,
                    item_type: void 0 !== r.item_type ? r.item_type : -1,
                    item_id: r.id || -1,
                    title: r.title || -1,
                    wm_id: c.wm_id || -1,
                    wm_level: g,
                    is_follow: globalConfig.is_followed ? 1 : 0,
                    enter_op: -1,
                    enter_tm: -1,
                    tab_from: -1,
                    fr: -1,
                    ve: -1,
                    sv: -1,
                    from_cache: w,
                    protocol: location.protocol,
                    wm_content_id: h.content_id || "",
                    loadtm: Date.now().toString().slice(0, -3)
                };
                void 0 !== p && (b.deeplink = p);
                var y = {
                    category_fst: v[0] || -1,
                    category_sec: v[1] || -1,
                    wm_level: g,
                    is_follow: globalConfig.is_followed ? 1 : 0
                };
                i.default.init({
                    exparams: b,
                    frontPlugins: window.globalConfig.aplusPlugins || "",
                    pageName: l,
                    checkSum: "H1510124664",
                    logKey: f,
                    paramsToClient: y
                }),
                    $(document).on("media:followWithId", function(e, t) {
                        t && t.wm_id && i.default.setExParams({
                            is_follow: t.is_followed ? 1 : 0
                        })
                    })
            }
        }
    }
    , function(e, t, n) {
        "use strict";
        var i = n(1)
            , o = i.urlQuery || {}
            , a = {}
            , r = (n(43),
            n(14))
            , s = {};
        try {
            s = r.getTestMap()
        } catch (e) {
            s = {}
        }
        var c = globalConfig.IFLOWDOMAIN + "/log/api/v1/client/info?uc_param_str=dnnivebichfrmintnwcpgieiwidsudpfsv&"
            , d = a.xss_item_id || globalConfig.sm_article_id || ""
            , l = -1;
        try {
            l = ucweb.window.performance.fromCache
        } catch (e) {}
        var u = {
            et: "iflow-article",
            page: "article",
            page_form: "wemedia",
            title: a.title || document.title || "",
            item_id: d,
            content_id: a.content_id,
            wm_id: a.wm_id,
            app: o.app || "",
            reco_id: o.reco_id || "",
            zzd_from: o.zzd_from || "",
            ch_id: o.cid || "",
            item_type: a.item_type || 0,
            uc: i.platform.isUCBrowser ? 1 : 0,
            fr: i.platform.isAndroid ? "android" : "ios",
            _: Date.now(),
            content: JSON.stringify([{
                aid: d
            }]),
            host: location.host,
            from_cache: l,
            from: o.from || ""
        };
        function f(e, t) {
            var n = e + Object.keys(t).map(function(e) {
                return e + "=" + (encodeURIComponent(t[e]) || "")
            }).join("&");
            (window["WA_LOG_EVENT_IMG" + +new Date] = new Image).src = n
        }
        t.init = function(e) {
            a = e,
                (u = Object.assign({}, u, s)).title = a.title || "",
                u.wm_id = a.wm_id || "",
                u.content_id = a.content_id || "",
                u.item_type = a.item_type || 0;
            var t = a.xss_item_id || globalConfig.sm_article_id || "";
            u.item_id = t,
                u.content = JSON.stringify([{
                    aid: t
                }])
        }
            ,
            t.log = function(e) {
                u.region = e && e.region || "",
                    u.action = e && e.action || "",
                    u.label = e && e.label || "",
                    f(c, u)
            }
            ,
            t.elementPage = function(e) {
                var t = navigator.userAgent.indexOf("DEBUG/1") > 0;
                o.recoid && setTimeout(function() {
                    var n = a.xss_item_id || globalConfig.sm_article_id || ""
                        , r = "";
                    try {
                        r = localStorage.getItem("user_sn")
                    } catch (e) {}
                    var s = i.getReadId()
                        , c = globalConfig.IFLOWDOMAIN + "/log/api/v1/element/page?"
                        , d = {
                        uc_param_str: "dnnivebichfrmintnwcpgieiwidsudpf",
                        app: o.app || "uc-iflow",
                        sn: r || "",
                        page: e.page || "index",
                        _: Date.now(),
                        rd_id: s || "",
                        rc_id: o.recoid || "",
                        zzd_from: o.zzd_from || "",
                        content: "",
                        xss_nrd: "",
                        imei: o.imei || "",
                        aid: n || "",
                        cid: o.cid || ""
                    };
                    t && (d.logdebug = !0),
                        f(c, d)
                }, 3e3)
            }
    }
    , function(e, t, n) {
        var i = {}
            , o = function(e) {
            var t;
            return function() {
                return void 0 === t && (t = e.apply(this, arguments)),
                    t
            }
        }(function() {
            return window && document && document.all && !window.atob
        })
            , a = function(e) {
            var t = {};
            return function(e) {
                if ("function" == typeof e)
                    return e();
                if (void 0 === t[e]) {
                    var n = function(e) {
                        return document.querySelector(e)
                    }
                        .call(this, e);
                    if (window.HTMLIFrameElement && n instanceof window.HTMLIFrameElement)
                        try {
                            n = n.contentDocument.head
                        } catch (e) {
                            n = null
                        }
                    t[e] = n
                }
                return t[e]
            }
        }()
            , r = null
            , s = 0
            , c = []
            , d = n(108);
        function l(e, t) {
            for (var n = 0; n < e.length; n++) {
                var o = e[n]
                    , a = i[o.id];
                if (a) {
                    a.refs++;
                    for (var r = 0; r < a.parts.length; r++)
                        a.parts[r](o.parts[r]);
                    for (; r < o.parts.length; r++)
                        a.parts.push(v(o.parts[r], t))
                } else {
                    var s = [];
                    for (r = 0; r < o.parts.length; r++)
                        s.push(v(o.parts[r], t));
                    i[o.id] = {
                        id: o.id,
                        refs: 1,
                        parts: s
                    }
                }
            }
        }
        function u(e, t) {
            for (var n = [], i = {}, o = 0; o < e.length; o++) {
                var a = e[o]
                    , r = t.base ? a[0] + t.base : a[0]
                    , s = {
                    css: a[1],
                    media: a[2],
                    sourceMap: a[3]
                };
                i[r] ? i[r].parts.push(s) : n.push(i[r] = {
                    id: r,
                    parts: [s]
                })
            }
            return n
        }
        function f(e, t) {
            var n = a(e.insertInto);
            if (!n)
                throw new Error("Couldn't find a style target. This probably means that the value for the 'insertInto' parameter is invalid.");
            var i = c[c.length - 1];
            if ("top" === e.insertAt)
                i ? i.nextSibling ? n.insertBefore(t, i.nextSibling) : n.appendChild(t) : n.insertBefore(t, n.firstChild),
                    c.push(t);
            else if ("bottom" === e.insertAt)
                n.appendChild(t);
            else {
                if ("object" != typeof e.insertAt || !e.insertAt.before)
                    throw new Error("[Style Loader]\n\n Invalid value for parameter 'insertAt' ('options.insertAt') found.\n Must be 'top', 'bottom', or Object.\n (https://github.com/webpack-contrib/style-loader#insertat)\n");
                var o = a(e.insertInto + " " + e.insertAt.before);
                n.insertBefore(t, o)
            }
        }
        function p(e) {
            if (null === e.parentNode)
                return !1;
            e.parentNode.removeChild(e);
            var t = c.indexOf(e);
            t >= 0 && c.splice(t, 1)
        }
        function m(e) {
            var t = document.createElement("style");
            return e.attrs.type = "text/css",
                h(t, e.attrs),
                f(e, t),
                t
        }
        function h(e, t) {
            Object.keys(t).forEach(function(n) {
                e.setAttribute(n, t[n])
            })
        }
        function v(e, t) {
            var n, i, o, a;
            if (t.transform && e.css) {
                if (!(a = t.transform(e.css)))
                    return function() {}
                        ;
                e.css = a
            }
            if (t.singleton) {
                var c = s++;
                n = r || (r = m(t)),
                    i = _.bind(null, n, c, !1),
                    o = _.bind(null, n, c, !0)
            } else
                e.sourceMap && "function" == typeof URL && "function" == typeof URL.createObjectURL && "function" == typeof URL.revokeObjectURL && "function" == typeof Blob && "function" == typeof btoa ? (n = function(e) {
                        var t = document.createElement("link");
                        return e.attrs.type = "text/css",
                            e.attrs.rel = "stylesheet",
                            h(t, e.attrs),
                            f(e, t),
                            t
                    }(t),
                        i = function(e, t, n) {
                            var i = n.css
                                , o = n.sourceMap
                                , a = void 0 === t.convertToAbsoluteUrls && o;
                            (t.convertToAbsoluteUrls || a) && (i = d(i));
                            o && (i += "\n/*# sourceMappingURL=data:application/json;base64," + btoa(unescape(encodeURIComponent(JSON.stringify(o)))) + " */");
                            var r = new Blob([i],{
                                type: "text/css"
                            })
                                , s = e.href;
                            e.href = URL.createObjectURL(r),
                            s && URL.revokeObjectURL(s)
                        }
                            .bind(null, n, t),
                        o = function() {
                            p(n),
                            n.href && URL.revokeObjectURL(n.href)
                        }
                ) : (n = m(t),
                        i = function(e, t) {
                            var n = t.css
                                , i = t.media;
                            i && e.setAttribute("media", i);
                            if (e.styleSheet)
                                e.styleSheet.cssText = n;
                            else {
                                for (; e.firstChild; )
                                    e.removeChild(e.firstChild);
                                e.appendChild(document.createTextNode(n))
                            }
                        }
                            .bind(null, n),
                        o = function() {
                            p(n)
                        }
                );
            return i(e),
                function(t) {
                    if (t) {
                        if (t.css === e.css && t.media === e.media && t.sourceMap === e.sourceMap)
                            return;
                        i(e = t)
                    } else
                        o()
                }
        }
        e.exports = function(e, t) {
            if ("undefined" != typeof DEBUG && DEBUG && "object" != typeof document)
                throw new Error("The style-loader cannot be used in a non-browser environment");
            (t = t || {}).attrs = "object" == typeof t.attrs ? t.attrs : {},
            t.singleton || "boolean" == typeof t.singleton || (t.singleton = o()),
            t.insertInto || (t.insertInto = "head"),
            t.insertAt || (t.insertAt = "bottom");
            var n = u(e, t);
            return l(n, t),
                function(e) {
                    for (var o = [], a = 0; a < n.length; a++) {
                        var r = n[a];
                        (s = i[r.id]).refs--,
                            o.push(s)
                    }
                    e && l(u(e, t), t);
                    for (a = 0; a < o.length; a++) {
                        var s;
                        if (0 === (s = o[a]).refs) {
                            for (var c = 0; c < s.parts.length; c++)
                                s.parts[c]();
                            delete i[s.id]
                        }
                    }
                }
        }
        ;
        var g = function() {
            var e = [];
            return function(t, n) {
                return e[t] = n,
                    e.filter(Boolean).join("\n")
            }
        }();
        function _(e, t, n, i) {
            var o = n ? "" : i.css;
            if (e.styleSheet)
                e.styleSheet.cssText = g(t, o);
            else {
                var a = document.createTextNode(o)
                    , r = e.childNodes;
                r[t] && e.removeChild(r[t]),
                    r.length ? e.insertBefore(a, r[t]) : e.appendChild(a)
            }
        }
    }
    , function(e, t) {
        e.exports = function(e) {
            var t = [];
            return t.toString = function() {
                return this.map(function(t) {
                    var n = function(e, t) {
                        var n = e[1] || ""
                            , i = e[3];
                        if (!i)
                            return n;
                        if (t && "function" == typeof btoa) {
                            var o = function(e) {
                                return "/*# sourceMappingURL=data:application/json;charset=utf-8;base64," + btoa(unescape(encodeURIComponent(JSON.stringify(e)))) + " */"
                            }(i)
                                , a = i.sources.map(function(e) {
                                return "/*# sourceURL=" + i.sourceRoot + e + " */"
                            });
                            return [n].concat(a).concat([o]).join("\n")
                        }
                        return [n].join("\n")
                    }(t, e);
                    return t[2] ? "@media " + t[2] + "{" + n + "}" : n
                }).join("")
            }
                ,
                t.i = function(e, n) {
                    "string" == typeof e && (e = [[null, e, ""]]);
                    for (var i = {}, o = 0; o < this.length; o++) {
                        var a = this[o][0];
                        "number" == typeof a && (i[a] = !0)
                    }
                    for (o = 0; o < e.length; o++) {
                        var r = e[o];
                        "number" == typeof r[0] && i[r[0]] || (n && !r[2] ? r[2] = n : n && (r[2] = "(" + r[2] + ") and (" + n + ")"),
                            t.push(r))
                    }
                }
                ,
                t
        }
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        });
        var i = arguments;
        t.default = {
            warn: function(e) {
                console.warn ? console.warn(e) : console.log(e)
            },
            elesToCheck: [],
            _hasListen: !1,
            initListener: function() {
                var e = this
                    , t = function(e, t) {
                    var n = Date.now();
                    return function() {
                        var o = i;
                        Date.now() - n < t || (e.apply(void 0, o),
                            n = Date.now())
                    }
                }(function(t) {
                    e.scrollHandler(t)
                }, 50);
                window.addEventListener("scroll", function(e) {
                    return t(e)
                }),
                    window.addEventListener("touchmove", function(e) {
                        return t(e)
                    }),
                    window.addEventListener("touchend", function(e) {
                        return t(e)
                    })
            },
            scrollHandler: function() {
                if (this.elesToCheck && this.elesToCheck.length)
                    for (var e = this.elesToCheck.length - 1; e > -1; e--) {
                        var t = this.elesToCheck[e];
                        this.checkElVisble(t.el, t.exposeHeight, t.offsetY) && (this.elesToCheck.splice(e, 1),
                            t.callback())
                    }
            },
            getWindowSize: function() {
                return {
                    height: window.innerHeight || document.documentElement.clientHeight,
                    width: window.innerWidth || document.documentElement.clientWidth
                }
            },
            checkElVisble: function(e, t, n) {
                if (!e.getBoundingClientRect)
                    return !1;
                var i = e.getBoundingClientRect() || {}
                    , o = i.top
                    , a = i.bottom
                    , r = i.left
                    , s = i.right
                    , c = i.width
                    , d = i.height
                    , l = c || s - r || e.offsetWidth
                    , u = d || a - o || e.offsetHeight
                    , f = [];
                if ([o, a, r, s, l, u].forEach(function(e) {
                    e && !isNaN(e) && f.push(e)
                }),
                    !f.length)
                    return !1;
                var p = this.getWindowSize()
                    , m = p.height - (o + n)
                    , h = m > 0 ? Math.min(m, u) : -1
                    , v = a + n
                    , g = v > 0 && v < p.height ? Math.min(a, u) : -1
                    , _ = -1 !== h ? h : g;
                if (-1 === _)
                    return !1;
                if ("number" == typeof t) {
                    if (!isNaN(t) && _ < t)
                        return !1
                } else if ("string" == typeof t && t.indexOf("%")) {
                    var w = parseFloat(t);
                    if (!isNaN(w))
                        if (_ < u * (w / 100))
                            return !1
                }
                return !0
            },
            listen: function(e) {
                var t = this
                    , n = arguments.length > 1 && void 0 !== arguments[1] ? arguments[1] : {}
                    , i = n.exposeHeight
                    , o = void 0 === i ? 0 : i
                    , a = n.offsetY
                    , r = void 0 === a ? 0 : a;
                return new Promise(function(n) {
                        if (e) {
                            t._hasListen || (t._hasListen = !0,
                                t.initListener());
                            t.elesToCheck.push({
                                el: e,
                                callback: function() {
                                    n()
                                },
                                exposeHeight: o,
                                offsetY: r
                            }),
                                setTimeout(function() {
                                    return t.scrollHandler()
                                }, 0)
                        } else
                            console.warn("common util warn: el to be listened should not be null")
                    }
                )
            }
        }
    }
    , function(e, t) {
        e.exports = function(e) {
            return "string" != typeof e ? e : (/^['"].*['"]$/.test(e) && (e = e.slice(1, -1)),
                /["'() \t\n]/.test(e) ? '"' + e.replace(/"/g, '\\"').replace(/\n/g, "\\n") + '"' : e)
        }
    }
    , function(e, t, n) {
        "use strict";
        var i = {
            range: /^\s*([\d\.]+)~([\d\.]+)\s*$/,
            min: /^\s*([\d\.]+)~\s*$/,
            max: /^\s*~([\d\.]+)\s*$/
        };
        function o(e, t) {
            if (!/\./.test(e) || !e.split)
                return e;
            var n = e.split && e.split(".") || []
                , i = Math.pow(t, 3)
                , o = 0;
            return n.forEach(function(e, n) {
                o += e * i * Math.pow(t, 0 - n)
            }),
                o
        }
        function a(e) {
            var t = 1;
            return "string" == typeof e && (e = [e]),
                e.forEach(function(e) {
                    /\./.test(e) && e.split && e.split(".").forEach(function(e) {
                        e.length > t && (t = e.length)
                    })
                }),
                Math.pow(10, t)
        }
        t.match = function(e, t) {
            var n;
            if (n = t.match(i.range)) {
                var r, s, c, d = o(e, c = a([e, r = n[1], s = n[2]])), l = o(r, c), u = o(s, c);
                return d >= l && d < u
            }
            return (n = t.match(i.min)) ? (d = o(e, c = a([e, r = n[1]]))) >= (l = o(r, c)) : (n = t.match(i.max)) ? (d = o(e, c = a([e, s = n[1]]))) < (u = o(s, c)) : e === t
        }
    }
    , function(e, t, n) {
        "use strict";
        function i(e, t) {
            var n = e && e.vs;
            return "object" == typeof n && (n = n[t.platformSub]),
                n
        }
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.Sdk = t.LogLevel = t.APP_TYPE = t.isFunction = t.compareVersion = t.ENV_ENUM_SUB = t.ENV_ENUM = void 0;
        var o = n(352);
        Object.defineProperty(t, "APP_TYPE", {
            enumerable: !0,
            get: function() {
                return o.APP_TYPE
            }
        }),
            Object.defineProperty(t, "LogLevel", {
                enumerable: !0,
                get: function() {
                    return o.LogLevel
                }
            }),
            Object.defineProperty(t, "isFunction", {
                enumerable: !0,
                get: function() {
                    return o.isFunction
                }
            }),
            Object.defineProperty(t, "compareVersion", {
                enumerable: !0,
                get: function() {
                    return o.compareVersion
                }
            }),
            Object.defineProperty(t, "ENV_ENUM", {
                enumerable: !0,
                get: function() {
                    return o.ENV_ENUM
                }
            }),
            Object.defineProperty(t, "ENV_ENUM_SUB", {
                enumerable: !0,
                get: function() {
                    return o.ENV_ENUM_SUB
                }
            });
        var a = function() {
            return function(e, t) {
                var n = this;
                this.configJsApiList = [],
                    this.hadConfig = !1,
                    this.p = {},
                    this.config$ = new Promise(function(e, t) {
                            n.p.reject = t,
                                n.p.resolve = e
                        }
                    ),
                    this.logQueue = [],
                    this.devConfig = {
                        debug: !1
                    },
                    this.platformConfigMap = {},
                    this.invokeAPIConfigMapByMethod = {},
                    this.isBridgeDrity = !0,
                    this.getExportSdk = function() {
                        return n.exportSdk
                    }
                    ,
                    this.setAPI = function(e, t) {
                        n.invokeAPIConfigMapByMethod[e] = t
                    }
                    ,
                    this.setPlatform = function(e) {
                        n.isBridgeDrity = !0,
                            n.platformConfigMap[e.platform] = e,
                        e.platform === n.env.platform && e.bridgeInit().catch(function(e) {
                            n.customLog(o.LogLevel.WARNING, ["auto bridgeInit error", e || ""])
                        })
                    }
                    ,
                    this.getPlatformConfigMap = function() {
                        return n.platformConfigMap
                    }
                    ,
                    this.deleteApiConfig = function(e, t) {
                        var i = n.invokeAPIConfigMapByMethod[e];
                        i && delete i[t]
                    }
                    ,
                    this.invokeAPI = function(e, t, a) {
                        void 0 === t && (t = {}),
                        void 0 === a && (a = !0),
                            n.customLog(o.LogLevel.INFO, ['==> "' + e + '" params: ', t]);
                        var r = +new Date
                            , s = r + "_" + Math.floor(1e3 * Math.random());
                        if (n.devConfig.onBeforeInvokeAPI)
                            try {
                                n.devConfig.onBeforeInvokeAPI({
                                    invokeId: s,
                                    method: e,
                                    params: t,
                                    startTime: r
                                })
                            } catch (e) {
                                n.customLog(o.LogLevel.ERROR, ["call Hook:onBeforeInvokeAPI failed, reason:", e])
                            }
                        return !1 === n.devConfig.isAuthApi && (a = !1),
                            n.bridgeInitFn().then(function(c) {
                                var d = n.invokeAPIConfigMapByMethod[e]
                                    , l = !(n.devConfig.forceEnableDealApiFnMap && n.devConfig.forceEnableDealApiFnMap[e] && !0 === n.devConfig.forceEnableDealApiFnMap[e](t)) && (!0 === n.devConfig.isDisableDeal || n.devConfig.disbaleDealApiWhiteList && -1 !== n.devConfig.disbaleDealApiWhiteList.indexOf(e));
                                if (d || !a) {
                                    var u;
                                    if (d && (u = d[n.env.platform]),
                                    u || !a) {
                                        var f = {};
                                        f = !l && u && u.paramsDeal && o.isFunction(u.paramsDeal) ? u.paramsDeal(t) : Object.assign({}, t);
                                        var p = function(e) {
                                            return !l && u && u.resultDeal && o.isFunction(u.resultDeal) ? u.resultDeal(e) : e
                                        };
                                        if (o.isFunction(f.onSuccess)) {
                                            var m = f.onSuccess;
                                            f.onSuccess = function(e) {
                                                m(p(e))
                                            }
                                        }
                                        return c(e, f).then(p, function(t) {
                                            var r = n.hadConfig && void 0 === n.isReady && -1 !== n.configJsApiList.indexOf(e)
                                                , s = "object" == typeof t && "string" == typeof t.errorCode && t.errorCode === o.ERROR_CODE.no_permission
                                                , d = "object" == typeof t && "string" == typeof t.errorCode && t.errorCode === o.ERROR_CODE.cancel
                                                , l = i(u, n.env)
                                                , m = l && n.env.version && o.compareVersion(n.env.version, l)
                                                , h = (n.env.platform === o.ENV_ENUM.ios || n.env.platform === o.ENV_ENUM.android) && r && s
                                                , v = n.env.platform === o.ENV_ENUM.pc && r && (m && !d && a || s);
                                            return h || v ? n.config$.then(function() {
                                                return c(e, f).then(p)
                                            }) : Promise.reject(t)
                                        }).then(function(i) {
                                            if (n.devConfig.onAfterInvokeAPI)
                                                try {
                                                    n.devConfig.onAfterInvokeAPI({
                                                        invokeId: s,
                                                        method: e,
                                                        params: t,
                                                        payload: i,
                                                        isSuccess: !0,
                                                        startTime: r,
                                                        duration: +new Date - r
                                                    })
                                                } catch (e) {
                                                    n.customLog(o.LogLevel.ERROR, ["call Hook:onAfterInvokeAPI failed, reason:", e])
                                                }
                                            return n.customLog(o.LogLevel.INFO, ['<== "' + e + '" success result: ', i]),
                                                i
                                        }, function(i) {
                                            if (n.devConfig.onAfterInvokeAPI)
                                                try {
                                                    n.devConfig.onAfterInvokeAPI({
                                                        invokeId: s,
                                                        method: e,
                                                        params: t,
                                                        payload: i,
                                                        startTime: r,
                                                        duration: +new Date - r,
                                                        isSuccess: !1
                                                    })
                                                } catch (i) {
                                                    n.customLog(o.LogLevel.ERROR, ["call Hook:onAfterInvokeAPI failed, reason:", i])
                                                }
                                            return n.customLog(o.LogLevel.WARNING, ['<== "' + e + '" fail result: ', i]),
                                                Promise.reject(i)
                                        })
                                    }
                                    var h = '"' + e + '" do not support the current platform (' + n.env.platform + ")";
                                    return n.customLog(o.LogLevel.ERROR, [h]),
                                        Promise.reject({
                                            errorCode: o.ERROR_CODE.jsapi_internal_error,
                                            errorMessage: h
                                        })
                                }
                                return h = "This API method is not configured for the platform (" + n.env.platform + ")",
                                    n.customLog(o.LogLevel.ERROR, [h]),
                                    Promise.reject({
                                        errorCode: o.ERROR_CODE.jsapi_internal_error,
                                        errorMessage: h
                                    })
                            })
                    }
                    ,
                    this.customLog = function(e, t) {
                        var i = {
                            level: e,
                            text: t,
                            time: new Date
                        };
                        !0 === n.devConfig.debug ? n.customLogInstance(i) : (n.logQueue.push(i),
                        n.logQueue.length > 10 && (n.logQueue = n.logQueue.slice(n.logQueue.length - 10)))
                    }
                    ,
                    this.clearLogQueue = function() {
                        n.logQueue.forEach(function(e) {
                            n.customLogInstance(e)
                        }),
                            n.logQueue = []
                    }
                    ,
                    this.customLogInstance = t,
                    this.env = e,
                    this.bridgeInitFn = function() {
                        if (n.bridgeInitFnPromise && !n.isBridgeDrity)
                            return n.bridgeInitFnPromise;
                        n.isBridgeDrity = !1;
                        var t = n.platformConfigMap[e.platform];
                        if (t)
                            n.bridgeInitFnPromise = t.bridgeInit().catch(function(e) {
                                return n.customLog(o.LogLevel.ERROR, ["\b\b\b\b\bJsBridge initialization fails, jsapi will not work"]),
                                    Promise.reject(e)
                            });
                        else {
                            var i = "Do not support the current environment：" + e.platform;
                            n.customLog(o.LogLevel.WARNING, [i]),
                                n.bridgeInitFnPromise = Promise.reject(new Error(i))
                        }
                        return n.bridgeInitFnPromise
                    }
                ;
                var a = function(e) {
                    void 0 === e && (e = {}),
                        n.devConfig = Object.assign(n.devConfig, e),
                    !0 === e.debug && n.clearLogQueue(),
                    e.extraPlatform && n.setPlatform(e.extraPlatform)
                };
                this.exportSdk = {
                    config: function(t) {
                        void 0 === t && (t = {});
                        var i = !0;
                        Object.keys(t).forEach(function(e) {
                            -1 === ["debug", "usePromise"].indexOf(e) && (i = !1)
                        }),
                            i ? (n.customLog(o.LogLevel.WARNING, ["This is a deprecated feature, recommend use dd.devConfig"]),
                                a(t)) : n.hadConfig ? n.customLog(o.LogLevel.WARNING, ["Config has been executed"]) : (t.jsApiList && (n.configJsApiList = t.jsApiList),
                                n.hadConfig = !0,
                                n.bridgeInitFn().then(function(i) {
                                    var o = n.platformConfigMap[e.platform]
                                        , a = t;
                                    o.authParamsDeal && (a = o.authParamsDeal(a)),
                                        i(o.authMethod, a).then(function(e) {
                                            n.isReady = !0,
                                                n.p.resolve(e)
                                        }).catch(function(e) {
                                            n.isReady = !1,
                                                n.p.reject(e)
                                        })
                                }, function(e) {
                                    n.customLog(o.LogLevel.ERROR, ['\b\b\b\b\bJsBridge initialization failed and "dd.config" failed to call']),
                                        n.p.reject(e)
                                }))
                    },
                    devConfig: a,
                    ready: function(e) {
                        !1 === n.hadConfig ? (n.customLog(o.LogLevel.WARNING, ["You don 't use a dd.config, so you don't need to wrap dd.ready, recommend remove dd.ready"]),
                            n.bridgeInitFn().then(function() {
                                e()
                            })) : n.config$.then(function(t) {
                            e()
                        })
                    },
                    error: function(e) {
                        n.config$.catch(function(t) {
                            e(t)
                        })
                    },
                    on: function(t, i) {
                        n.bridgeInitFn().then(function() {
                            n.platformConfigMap[e.platform].event.on(t, i)
                        })
                    },
                    off: function(t, i) {
                        n.bridgeInitFn().then(function() {
                            n.platformConfigMap[e.platform].event.off(t, i)
                        })
                    },
                    env: e,
                    checkJsApi: function(t) {
                        void 0 === t && (t = {});
                        var a = {};
                        return t.jsApiList && t.jsApiList.forEach(function(t) {
                            var r = n.invokeAPIConfigMapByMethod[t];
                            if (r) {
                                var s = i(r[e.platform], e);
                                s && e.version && o.compareVersion(e.version, s) && (a[t] = !0)
                            }
                            a[t] || (a[t] = !1)
                        }),
                            Promise.resolve(a)
                    },
                    _invoke: function(e, t) {
                        return void 0 === t && (t = {}),
                            n.invokeAPI(e, t, !1)
                    }
                }
            }
        }();
        t.Sdk = a
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.getENV = t.getUA = void 0;
        var i = n(11)
            , o = n(11);
        Object.defineProperty(t, "ENV_ENUM", {
            enumerable: !0,
            get: function() {
                return o.ENV_ENUM
            }
        }),
            Object.defineProperty(t, "APP_TYPE", {
                enumerable: !0,
                get: function() {
                    return o.APP_TYPE
                }
            }),
            Object.defineProperty(t, "ENV_ENUM_SUB", {
                enumerable: !0,
                get: function() {
                    return o.ENV_ENUM_SUB
                }
            });
        var a, r = n(351);
        !function(e) {
            e.singlePage = "singlePage",
                e.miniApp = "miniApp",
                e.miniWidget = "miniWidget"
        }(a || (a = {})),
            t.getUA = function() {
                var e = "";
                try {
                    "undefined" != typeof navigator && (e = navigator && (navigator.userAgent || navigator.swuserAgent) || "")
                } catch (t) {
                    e = ""
                }
                return e
            }
            ,
            t.getENV = function() {
                var e = t.getUA()
                    , n = /iPhone|iPad|iPod|iOS/i.test(e)
                    , o = /Android/i.test(e)
                    , s = /Nebula/i.test(e)
                    , c = /DingTalk/i.test(e)
                    , d = /dd-web/i.test(e)
                    , l = "object" == typeof nuva
                    , u = "object" == typeof dd && "function" == typeof dd.dtBridge
                    , f = u && n || l && n
                    , p = c || r.default.isDingTalk
                    , m = n && p || r.default.isWeexiOS || f
                    , h = o && p || r.default.isWeexAndroid
                    , v = s && p || u
                    , g = d
                    , _ = i.APP_TYPE.WEB;
                if (g)
                    _ = i.APP_TYPE.WEBVIEW_IN_MINIAPP;
                else if (v)
                    _ = i.APP_TYPE.MINI_APP;
                else if (r.default.isWeexiOS || r.default.isWeexAndroid)
                    try {
                        _ = weex.config.ddWeexEnv === a.miniWidget ? i.APP_TYPE.WEEX_WIDGET : i.APP_TYPE.WEEX
                    } catch (e) {
                        _ = i.APP_TYPE.WEEX
                    }
                var w, b, y = "*", k = e.match(/AliApp\(\w+\/([a-zA-Z0-9.-]+)\)/);
                null === k && (k = e.match(/DingTalk\/([a-zA-Z0-9.-]+)/)),
                k && k[1] && (b = k[1]);
                var x = "";
                if ("undefined" != typeof name && (x = name),
                    x)
                    try {
                        var E = JSON.parse(x);
                        E.hostVersion && (b = E.hostVersion),
                            y = E.language || navigator.language || "*",
                            w = E.containerId
                    } catch (e) {}
                var P = !!w;
                P && !b && (k = e.match(/DingTalk\(([a-zA-Z0-9\.-]+)\)/)) && k[1] && (b = k[1]);
                var S, N = i.ENV_ENUM_SUB.noSub;
                if (m)
                    S = i.ENV_ENUM.ios;
                else if (h)
                    S = i.ENV_ENUM.android;
                else if (P) {
                    N = e.indexOf("Macintosh; Intel Mac OS") > -1 ? i.ENV_ENUM_SUB.mac : i.ENV_ENUM_SUB.win,
                        S = i.ENV_ENUM.pc
                } else
                    S = i.ENV_ENUM.notInDingTalk;
                return {
                    platform: S,
                    platformSub: N,
                    version: b,
                    appType: _,
                    language: y
                }
            }
    }
    , function(e, t, n) {
        "use strict";
        /*!
 * filters.js
 * Copyright(c) 2016
 * AUTHOR: shafeng
 * TAB SIZE: 4
 */
        var i = n(21);
        Vue.filter("dateFormatWithoutSecond", function(e) {
            if (!e)
                return e;
            var t = function(e) {
                return e > 9 ? e : "0" + e
            };
            /^\d+$/.test(e) || (-1 === e.indexOf(":") && (e += " 00:00:00"),
            -1 === e.indexOf("T") && (e = e.replace(/\s+/g, "T")),
            -1 !== e.indexOf("T") && (e = e.substring(0, 19).concat(".000+08:00")));
            var n = new Date(e)
                , i = (n.getFullYear(),
            n.getMonth() + 1)
                , o = n.getDate()
                , a = n.getHours()
                , r = n.getMinutes();
            return [t(i), t(o)].join("-") + " " + [t(a), t(r)].join(":")
        }),
            Vue.filter("cutStr", function(e, t) {
                var n = parseInt(t) || 30;
                return e.split("").length > n ? e.split("").slice(0, n).join("") + "..." : e
            }),
            Vue.filter("compressImage", function(e, t, n, o) {
                return i.compress({
                    src: e,
                    widthLimit: t,
                    heightLimit: n,
                    cutSize: o
                })
            }),
            Vue.filter("durationFormat", function(e) {
                if (!e)
                    return e;
                var t = (e = Math.floor(parseInt(e, 10) / 1e3)) % 60;
                function n(e) {
                    return e < 10 ? "0" + e : e
                }
                return n(Math.floor(e / 60)) + ":" + n(t)
            }),
            Vue.filter("imageDomainSwitch", function(e) {
                return e && e.indexOf("image.uc.cn") >= 0 && globalConfig.imageDomain ? e.replace("image.uc.cn", globalConfig.imageDomain) : e
            }),
            Vue.filter("dateFormatRelative", function(e) {
                if (!e)
                    return e;
                var t = function(e) {
                    return e > 9 ? e : "0" + e
                };
                /^\d+$/.test(e) || (-1 === e.indexOf(":") && (e += " 00:00:00"),
                -1 === e.indexOf("T") && (e = e.replace(/\s+/g, "T")),
                -1 !== e.indexOf("T") && (e = e.substring(0, 19).concat(".000+08:00")));
                var n = new Date(e)
                    , i = Date.now() - n.getTime();
                return i < 6e4 ? "刚刚" : i < 36e5 ? Math.floor(i / 6e4) + "分钟前" : i < 864e5 ? Math.floor(i / 36e5) + "小时前" : [[t(n.getMonth() + 1), t(n.getDate())].join("-"), [t(n.getHours()), t(n.getMinutes())].join(":")].join(" ")
            }),
            Vue.filter("formatImageSchema", function(e) {
                if (!e || !e.replace)
                    return e;
                return e.replace(/(http:\/\/)/g, "//")
            }),
            e.exports = function() {}
    }
    , function(e, t, n) {
        "use strict";
        n(1);
        t.getTestMap = function() {
            var e = window.location.href || ""
                , t = window.location.hash || ""
                , n = e;
            -1 === e.indexOf("#") && (n = n + "#" + t);
            var i = /ab_tag_(page_)?biz=([^&#]*)/.exec(n);
            if (!i || !i[2])
                return null;
            var o = decodeURIComponent(i[2])
                , a = o.split && o.split(",");
            if (!a.length)
                return null;
            var r = /(\d*)_([A|B|C|D|E|F])/
                , s = {};
            return a.forEach(function(e) {
                var t = r.exec(e);
                if (!t || !t.length)
                    return null;
                var n = t[1]
                    , i = t[2];
                n && i && (s[n] = i)
            }),
                s
        }
            ,
            t.getTest = function() {
                var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : "";
                if (!e)
                    return null;
                var n = t.getTestMap()
                    , i = n && n[e];
                return i ? {
                    id: e,
                    tag: i
                } : null
            }
    }
    , function(e, t, n) {
        "use strict";
        var i = o();
        function o() {
            return a() ? window.top : window
        }
        function a() {
            return self !== top && "" === location.hostname
        }
        var r = Object.assign || function(e) {
                for (var t = 1, n = arguments.length; t < n; t += 1) {
                    var i = arguments[t];
                    for (var o in i)
                        Object.prototype.hasOwnProperty.call(i, o) && (e[o] = i[o])
                }
                return e
            }
        ;
        e.exports = {
            isUC: function() {
                var e = window.ucapi && "function" == typeof window.ucapi.invoke;
                return !e && a() ? window.top.ucapi && "function" == typeof window.top.ucapi.invoke : e
            },
            isWeChat: function() {
                var e = i.navigator.userAgent.toLowerCase();
                return /micromessenger/i.test(e)
            },
            isQQ: function() {
                var e = i.navigator.userAgent.toLowerCase();
                return /QQ\/([\d.]+)/i.test(e) || /MQQBrowser\/([\d.]+)/i.test(e)
            },
            getWindow: o,
            _extends: r,
            isInEmptyIframe: a
        }
    }
    , function(e, t) {
        e.exports = {
            getUCVersion: function() {
                var e = window.navigator.userAgent.match(/UCBrowser\/([\d\.]+)/i);
                return e && e.length > 1 && e[1] || ""
            },
            compareVer: function(e, t) {
                var n = 0;
                if ("string" == typeof e && "string" == typeof t) {
                    for (var i = e.split("."), o = t.split("."), a = Math.min(i.length, o.length), r = 0; r < a; r++) {
                        var s = parseInt(i[r], 10)
                            , c = parseInt(o[r], 10);
                        if (s > c)
                            return n = 1;
                        if (s < c)
                            return n = -1
                    }
                    i.length > o.length ? n = 1 : i.length < o.length && (n = -1)
                } else
                    n = -2;
                return n
            },
            getOS: function() {
                var e = window.navigator.userAgent;
                return /Android/i.test(e) ? "android" : /iPhone|iPad|iPod/i.test(e) ? "iphone" : "unknown"
            }
        }
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.default = function(e) {
                return new Promise(function(t, n) {
                        var o = e.napiv2 ? function() {
                            var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {};
                            if (!e.pkgName)
                                return void console.error("SDKLoader options require pkgName");
                            var t = e.pkgName
                                , n = e.staticHost
                                , o = void 0 === n ? i : n
                                , a = e.env
                                , r = void 0 === a ? c : a
                                , d = e.subPkgName
                                , l = (void 0 === d ? "index" : d) + "." + r
                                , u = "//napi.uc.cn/3/classes/" + t + "/lists/" + l
                                , f = {
                                _app_id: "8c7ac8cb18b54a138b832adc5e626a0c",
                                _fetch: 1,
                                _size: 2,
                                _max_age: r === s.master ? 60 : 10
                            }
                                , p = Object.keys(f).map(function(e) {
                                return e + "=" + encodeURIComponent(f[e])
                            }).join("&");
                            return {
                                mapPath: u + "?" + p,
                                cacheSuffix: t + "__" + l,
                                staticHost: o
                            }
                        }(e) : function() {
                            var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {};
                            if (!e.pkgName)
                                return void console.error("SDKLoader options require pkgName");
                            var t = e.pkgName
                                , n = e.staticHost
                                , o = void 0 === n ? i : n
                                , a = e.env
                                , r = void 0 === a ? c : a
                                , d = t + "." + r
                                , l = "//napi.uc.cn/3/classes/sdk_loader_maps/lists/" + d
                                , u = r === s.master
                                , f = {
                                _app_id: "zdl",
                                _fetch: 1,
                                _size: u ? 1 : 2,
                                _max_age: u ? 60 : 10
                            }
                                , p = Object.keys(f).map(function(e) {
                                return e + "=" + encodeURIComponent(f[e])
                            }).join("&");
                            return {
                                mapPath: l + "?" + p,
                                cacheSuffix: d + "__",
                                staticHost: o
                            }
                        }(e);
                        d().then(function() {
                            l.onload({
                                pkgName: e.pkgName
                            }),
                            window.sdkLoader && window.sdkLoader(o, t, function() {
                                var t = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {};
                                l.onerror({
                                    pkgName: e.pkgName,
                                    src: t.src,
                                    type: t.type
                                }),
                                    n()
                            })
                        })
                    }
                )
            }
        ;
        var i = "https://images.uc.cn/s/uae/g/1y/"
            , o = window.location
            , a = o.host
            , r = o.href
            , s = {
            release: "release",
            master: "master"
        }
            , c = a.indexOf(":") > -1 || a.indexOf(".fe.uczzd.cn") > -1 || a.indexOf("uae.uc.cn") > -1 ? s.release : r.indexOf("ufe_sdk_release=1") > -1 ? s.release : s.master;
        var d = function() {
            var e = null;
            return function() {
                if (e)
                    return e;
                if (window.__SDKLIB__ && window.sdkLoader)
                    e = Promise.resolve();
                else {
                    var t = {
                        "sdklibs.shim.1.0.8.js": !!window.__SDKLIB__,
                        "loader.ls.1.0.2.js": !!window.sdkLoader
                    }
                        , n = Object.keys(t).filter(function(e) {
                        return !t[e]
                    });
                    e = n.length ? new Promise(function(e) {
                            !function(e, t) {
                                var n = void 0
                                    , i = document.getElementsByTagName("script")[0]
                                    , o = document.createElement("script");
                                o.type = "text/javascript",
                                    o.charset = "utf-8",
                                    o.timeout = 6e4,
                                    o.crossOrigin = "anonymous",
                                    o.src = e,
                                    o.onload = t,
                                    n = setTimeout(function() {
                                        clearTimeout(n),
                                        t && (o.onload = t),
                                            o.onerror = null
                                    }, 6e4),
                                    i.parentNode.insertBefore(o, i)
                            }("" + (window.location.protocol + "//images.uc.cn/e/uaeext/m;1y/libs/;") + n.join(";"), e)
                        }
                    ) : Promise.resolve()
                }
                return e
            }
        }()
            , l = {
            onload: function(e) {
                var t = e.pkgName
                    , n = void 0 === t ? "" : t;
                window.send_log && window.send_log({
                    page: window.waPage,
                    type: "event",
                    action: "loader",
                    label: "doload",
                    pkgName: n,
                    page_url: window.location.href,
                    host: window.location.host,
                    app: window.urlQuery.app
                }),
                    window.scriptLoaded(n)
            },
            onerror: function(e) {
                var t = e.pkgName
                    , n = void 0 === t ? "" : t
                    , i = e.src
                    , o = void 0 === i ? "" : i
                    , a = e.type
                    , r = void 0 === a ? "" : a;
                tracker && tracker.log({
                    code: 11,
                    msg: n,
                    sampleRate: .05,
                    c1: o
                }),
                window.send_log && window.send_log({
                    page: window.waPage,
                    type: "event",
                    action: "loader",
                    label: "doload",
                    pkgName: n,
                    src: o,
                    error_type: r,
                    page_url: window.location.href,
                    host: window.location.host,
                    app: window.urlQuery.app
                }),
                window.ucsdkloaderLog && window.ucsdkloaderLog({
                    sdkname: n,
                    sdkurl: o
                })
            }
        }
    }
    , function(e, t, n) {
        e.exports = function(e) {
            function t(i) {
                if (n[i])
                    return n[i].exports;
                var o = n[i] = {
                    i: i,
                    l: !1,
                    exports: {}
                };
                return e[i].call(o.exports, o, o.exports, t),
                    o.l = !0,
                    o.exports
            }
            var n = {};
            return t.m = e,
                t.c = n,
                t.i = function(e) {
                    return e
                }
                ,
                t.d = function(e, n, i) {
                    t.o(e, n) || Object.defineProperty(e, n, {
                        configurable: !1,
                        enumerable: !0,
                        get: i
                    })
                }
                ,
                t.n = function(e) {
                    var n = e && e.__esModule ? function() {
                            return e.default
                        }
                        : function() {
                            return e
                        }
                    ;
                    return t.d(n, "a", n),
                        n
                }
                ,
                t.o = function(e, t) {
                    return Object.prototype.hasOwnProperty.call(e, t)
                }
                ,
                t.p = "",
                t(t.s = 721)
        }({
            199: function(e, t, n) {
                "use strict";
                var i = n(201);
                e.exports = i
            },
            201: function(e, t, n) {
                "use strict";
                var i = n(203)
                    , o = n(204)
                    , a = n(202)
                    , r = n(205)
                    , s = new a
                    , c = !1
                    , d = ""
                    , l = null
                    , u = {};
                try {
                    var f = window.name.match(/{.*}/);
                    if (f && f[0])
                        var u = JSON.parse(f[0])
                } catch (e) {
                    u = {}
                }
                u.hostOrigin && ".dingtalk.com" === u.hostOrigin.split(":")[1].slice(0 - ".dingtalk.com".length) && u.containerId && (c = !0,
                    d = u.hostOrigin,
                    l = u.containerId);
                var p = {}
                    , m = new Promise(function(e, t) {
                        p._resolve = e,
                            p._reject = t
                    }
                )
                    , h = {}
                    , v = null;
                window.top !== window ? (v = window.top,
                    p._resolve()) : "object" == typeof dingtalk && "object" == typeof dingtalk.platform && "function" == typeof dingtalk.platform.invokeAPI && (v = window,
                    p._resolve()),
                    h[r.SYS_INIT] = function(e) {
                        v = e.frameWindow,
                            p._resolve(),
                            e.respond({})
                    }
                    ,
                    window.addEventListener("message", function(e) {
                        var t = e.data
                            , n = e.origin;
                        if (n === d)
                            if ("response" === t.type && t.msgId) {
                                var i = t.msgId
                                    , a = s.getMsyById(i);
                                a && a.methodName !== r.SYS_EVENT && a.receiveResponse(t.body, !t.success)
                            } else if ("event" === t.type && t.msgId) {
                                var i = t.msgId
                                    , a = s.getMsyById(i);
                                a && a.receiveEvent(t.eventName, t.body)
                            } else if ("request" === t.type && t.msgId) {
                                var a = new o(e.source,n,t);
                                h[a.methodName] && h[a.methodName](a)
                            }
                    }),
                    t.invokeAPI = function(e, t) {
                        var n = new i(l,e,t);
                        return c && m.then(function() {
                            v && v.postMessage(n.getPayload(), d),
                                s.addPending(n)
                        }),
                            n
                    }
                ;
                var g = null;
                t.addEventListener = function(e, n) {
                    g || (g = t.invokeAPI(r.SYS_EVENT, {})),
                        g.addEventListener(e, n)
                }
                    ,
                    t.removeEventListener = function(e, t) {
                        g && g.removeEventListener(e, t)
                    }
            },
            202: function(e, t, n) {
                "use strict";
                var i = function() {
                    this.pendingMsgs = {}
                };
                i.prototype.addPending = function(e) {
                    this.pendingMsgs[e.id] = e;
                    var t = function() {
                        delete this.pendingMsgs[e.id],
                            e.removeEventListener("_finish", t)
                    }
                        .bind(this);
                    e.addEventListener("_finish", t)
                }
                    ,
                    i.prototype.getMsyById = function(e) {
                        return this.pendingMsgs[e]
                    }
                    ,
                    e.exports = i
            },
            203: function(e, t, n) {
                "use strict";
                var i = n(716)
                    , o = n(715)
                    , a = 0
                    , r = Math.floor(1e3 * Math.random())
                    , s = {
                    code: 408,
                    reason: "timeout"
                }
                    , c = {
                    TIMEOUT: "_timeout",
                    FINISH: "_finish"
                }
                    , d = {
                    timeout: -1
                }
                    , l = function(e, t, n, i) {
                    this.id = 1e3 * (1e3 * r + Math.floor(1e3 * Math.random())) + ++a % 1e3,
                        this.methodName = t,
                        this.containerId = e,
                        this.option = o({}, d, i);
                    var n = n || {};
                    this._p = {},
                        this.result = new Promise(function(e, t) {
                            this._p._resolve = e,
                                this._p._reject = t
                        }
                            .bind(this)),
                        this.callbacks = {},
                        this.plainMsg = this._handleMsg(n),
                        this._eventsHandle = {},
                        this._timeoutTimer = null,
                        this._initTimeout(),
                        this.isFinish = !1
                };
                l.prototype._initTimeout = function() {
                    this._clearTimeout(),
                    this.option.timeout > 0 && (this._timeoutTimer = setTimeout(function() {
                        this.receiveEvent(c.TIMEOUT),
                            this.receiveResponse(s, !0)
                    }
                        .bind(this), this.option.timeout))
                }
                    ,
                    l.prototype._clearTimeout = function() {
                        clearTimeout(this._timeoutTimer)
                    }
                    ,
                    l.prototype._handleMsg = function(e) {
                        var t = {};
                        return Object.keys(e).forEach(function(n) {
                            var o = e[n];
                            "function" == typeof o && "on" === n.slice(0, 2) ? this.callbacks[n] = o : t[n] = i(o)
                        }
                            .bind(this)),
                            t
                    }
                    ,
                    l.prototype.getPayload = function() {
                        return {
                            msgId: this.id,
                            containerId: this.containerId,
                            methodName: this.methodName,
                            body: this.plainMsg,
                            type: "request"
                        }
                    }
                    ,
                    l.prototype.receiveEvent = function(e, t) {
                        if (this.isFinish && e !== c.FINISH)
                            return !1;
                        e !== c.FINISH && e !== c.TIMEOUT && this._initTimeout(),
                        Array.isArray(this._eventsHandle[e]) && this._eventsHandle[e].forEach(function(e) {
                            try {
                                e(t)
                            } catch (e) {
                                console.error(t)
                            }
                        });
                        var n = "on" + e.charAt(0).toUpperCase() + e.slice(1);
                        return this.callbacks[n] && this.callbacks[n](t),
                            !0
                    }
                    ,
                    l.prototype.addEventListener = function(e, t) {
                        if (!e || "function" != typeof t)
                            throw "eventName is null or handle is not a function, addEventListener fail";
                        Array.isArray(this._eventsHandle[e]) || (this._eventsHandle[e] = []),
                            this._eventsHandle[e].push(t)
                    }
                    ,
                    l.prototype.removeEventListener = function(e, t) {
                        if (!e || !t)
                            throw "eventName is null or handle is null, invoke removeEventListener fail";
                        if (Array.isArray(this._eventsHandle[e])) {
                            var n = this._eventsHandle[e].indexOf(t);
                            -1 !== n && this._eventsHandle[e].splice(n, 1)
                        }
                    }
                    ,
                    l.prototype.receiveResponse = function(e, t) {
                        if (!0 === this.isFinish)
                            return !1;
                        this._clearTimeout();
                        var t = !!t;
                        return t ? this._p._reject(e) : this._p._resolve(e),
                            setTimeout(function() {
                                this.receiveEvent(c.FINISH)
                            }
                                .bind(this), 0),
                            this.isFinish = !0,
                            !0
                    }
                    ,
                    e.exports = l
            },
            204: function(e, t, n) {
                "use strict";
                var i = function(e, t, n) {
                    if (this._msgId = n.msgId,
                        this.frameWindow = e,
                        this.methodName = n.methodName,
                        this.clientOrigin = t,
                        this.containerId = n.containerId,
                        this.params = n.body,
                        !this._msgId)
                        throw "msgId not exist";
                    if (!this.frameWindow)
                        throw "frameWindow not exist";
                    if (!this.methodName)
                        throw "methodName not exits";
                    if (!this.clientOrigin)
                        throw "clientOrigin not exist";
                    this.hasResponded = !1
                };
                i.prototype.respond = function(e, t) {
                    var t = !!t;
                    if (!0 !== this.hasResponded) {
                        var n = {
                            type: "response",
                            success: !t,
                            body: e,
                            msgId: this._msgId
                        };
                        this.frameWindow.postMessage(n, this.clientOrigin),
                            this.hasResponded = !0
                    }
                }
                    ,
                    i.prototype.emit = function(e, t) {
                        var n = {
                            type: "event",
                            eventName: e,
                            body: t,
                            msgId: this._msgId
                        };
                        this.frameWindow.postMessage(n, this.clientOrigin)
                    }
                    ,
                    e.exports = i
            },
            205: function(e, t, n) {
                "use strict";
                e.exports = {
                    SYS_EVENT: "SYS_openAPIContainerInitEvent",
                    SYS_INIT: "SYS_openAPIContainerInit"
                }
            },
            4: function(e, t) {
                var n;
                n = function() {
                    return this
                }();
                try {
                    n = n || Function("return this")() || (0,
                        eval)("this")
                } catch (e) {
                    "object" == typeof window && (n = window)
                }
                e.exports = n
            },
            714: function(e, t, n) {
                (function(e, n) {
                        function i(e, t) {
                            return e.set(t[0], t[1]),
                                e
                        }
                        function o(e, t) {
                            return e.add(t),
                                e
                        }
                        function a(e, t, n, i) {
                            var o = -1
                                , a = e.length;
                            for (i && a && (n = e[++o]); ++o < a; )
                                n = t(n, e[o], o, e);
                            return n
                        }
                        function r(e) {
                            return e && e.Object === Object ? e : null
                        }
                        function s(e) {
                            var t = !1;
                            if (null != e && "function" != typeof e.toString)
                                try {
                                    t = !!(e + "")
                                } catch (e) {}
                            return t
                        }
                        function c(e) {
                            var t = -1
                                , n = Array(e.size);
                            return e.forEach(function(e, i) {
                                n[++t] = [i, e]
                            }),
                                n
                        }
                        function d(e) {
                            var t = -1
                                , n = Array(e.size);
                            return e.forEach(function(e) {
                                n[++t] = e
                            }),
                                n
                        }
                        function l(e) {
                            var t = -1
                                , n = e ? e.length : 0;
                            for (this.clear(); ++t < n; ) {
                                var i = e[t];
                                this.set(i[0], i[1])
                            }
                        }
                        function u(e) {
                            var t = -1
                                , n = e ? e.length : 0;
                            for (this.clear(); ++t < n; ) {
                                var i = e[t];
                                this.set(i[0], i[1])
                            }
                        }
                        function f(e) {
                            var t = -1
                                , n = e ? e.length : 0;
                            for (this.clear(); ++t < n; ) {
                                var i = e[t];
                                this.set(i[0], i[1])
                            }
                        }
                        function p(e) {
                            this.__data__ = new u(e)
                        }
                        function m(e, t, n) {
                            var i = e[t];
                            Ie.call(e, t) && O(i, n) && (void 0 !== n || t in e) || (e[t] = n)
                        }
                        function h(e, t) {
                            for (var n = e.length; n--; )
                                if (O(e[n][0], t))
                                    return n;
                            return -1
                        }
                        function v(e, t) {
                            return Ie.call(e, t) || "object" == typeof e && t in e && null === E(e)
                        }
                        function g(e) {
                            var t = new e.constructor(e.byteLength);
                            return new Oe(t).set(new Oe(e)),
                                t
                        }
                        function _(e, t, n) {
                            return a(t ? n(c(e), !0) : c(e), i, new e.constructor)
                        }
                        function w(e, t, n) {
                            return a(t ? n(d(e), !0) : d(e), o, new e.constructor)
                        }
                        function b(e, t, n, i) {
                            n || (n = {});
                            for (var o = -1, a = t.length; ++o < a; ) {
                                var r = t[o];
                                m(n, r, i ? i(n[r], e[r], r, n, e) : e[r])
                            }
                            return n
                        }
                        function y(e) {
                            return function(e, t, n) {
                                var i = t(e);
                                return et(e) ? i : function(e, t) {
                                    for (var n = -1, i = t.length, o = e.length; ++n < i; )
                                        e[o + n] = t[n];
                                    return e
                                }(i, n(e))
                            }(e, $, P)
                        }
                        function k(e, t) {
                            var n = e.__data__;
                            return function(e) {
                                var t = typeof e;
                                return "string" == t || "number" == t || "symbol" == t || "boolean" == t ? "__proto__" !== e : null === e
                            }(t) ? n["string" == typeof t ? "string" : "hash"] : n.map
                        }
                        function x(e, t) {
                            var n = e[t];
                            return function(e) {
                                return !!L(e) && (T(e) || s(e) ? Ae : pe).test(U(e))
                            }(n) ? n : void 0
                        }
                        function E(e) {
                            return De(Object(e))
                        }
                        function P(e) {
                            return je(Object(e))
                        }
                        function S(e) {
                            return Ce.call(e)
                        }
                        function N(e) {
                            return "function" != typeof e.constructor || M(e) ? {} : function(e) {
                                return L(e) ? Te(e) : {}
                            }(E(e))
                        }
                        function I(e, t, n, i) {
                            var o = e.constructor;
                            switch (t) {
                                case te:
                                    return g(e);
                                case W:
                                case H:
                                    return new o(+e);
                                case ne:
                                    return function(e, t) {
                                        var n = t ? g(e.buffer) : e.buffer;
                                        return new e.constructor(n,e.byteOffset,e.byteLength)
                                    }(e, i);
                                case ie:
                                case oe:
                                case ae:
                                case re:
                                case se:
                                case ce:
                                case de:
                                case le:
                                case ue:
                                    return function(e, t) {
                                        var n = t ? g(e.buffer) : e.buffer;
                                        return new e.constructor(n,e.byteOffset,e.length)
                                    }(e, i);
                                case G:
                                    return _(e, i, n);
                                case K:
                                case Z:
                                    return new o(e);
                                case J:
                                    return function(e) {
                                        var t = new e.constructor(e.source,fe.exec(e));
                                        return t.lastIndex = e.lastIndex,
                                            t
                                    }(e);
                                case X:
                                    return w(e, i, n);
                                case ee:
                                    return function(e) {
                                        return Xe ? Object(Xe.call(e)) : {}
                                    }(e)
                            }
                        }
                        function C(e) {
                            var t = e ? e.length : void 0;
                            return V(t) && (et(e) || function(e) {
                                return "string" == typeof e || !et(e) && D(e) && Ce.call(e) == Z
                            }(e) || function(e) {
                                return function(e) {
                                    return D(e) && j(e)
                                }(e) && Ie.call(e, "callee") && (!Ve.call(e, "callee") || Ce.call(e) == B)
                            }(e)) ? function(e, t) {
                                for (var n = -1, i = Array(e); ++n < e; )
                                    i[n] = t(n);
                                return i
                            }(t, String) : null
                        }
                        function A(e, t) {
                            return !!(t = null == t ? z : t) && ("number" == typeof e || me.test(e)) && e > -1 && e % 1 == 0 && e < t
                        }
                        function M(e) {
                            var t = e && e.constructor;
                            return e === ("function" == typeof t && t.prototype || Se)
                        }
                        function U(e) {
                            if (null != e) {
                                try {
                                    return Ne.call(e)
                                } catch (e) {}
                                try {
                                    return e + ""
                                } catch (e) {}
                            }
                            return ""
                        }
                        function O(e, t) {
                            return e === t || e != e && t != t
                        }
                        function j(e) {
                            return null != e && V(Ze(e)) && !T(e)
                        }
                        function T(e) {
                            var t = L(e) ? Ce.call(e) : "";
                            return t == q || t == Q
                        }
                        function V(e) {
                            return "number" == typeof e && e > -1 && e % 1 == 0 && e <= z
                        }
                        function L(e) {
                            var t = typeof e;
                            return !!e && ("object" == t || "function" == t)
                        }
                        function D(e) {
                            return !!e && "object" == typeof e
                        }
                        function $(e) {
                            var t = M(e);
                            if (!t && !j(e))
                                return function(e) {
                                    return $e(Object(e))
                                }(e);
                            var n = C(e)
                                , i = !!n
                                , o = n || []
                                , a = o.length;
                            for (var r in e)
                                !v(e, r) || i && ("length" == r || A(r, a)) || t && "constructor" == r || o.push(r);
                            return o
                        }
                        var R = 200
                            , F = "__lodash_hash_undefined__"
                            , z = 9007199254740991
                            , B = "[object Arguments]"
                            , W = "[object Boolean]"
                            , H = "[object Date]"
                            , q = "[object Function]"
                            , Q = "[object GeneratorFunction]"
                            , G = "[object Map]"
                            , K = "[object Number]"
                            , Y = "[object Object]"
                            , J = "[object RegExp]"
                            , X = "[object Set]"
                            , Z = "[object String]"
                            , ee = "[object Symbol]"
                            , te = "[object ArrayBuffer]"
                            , ne = "[object DataView]"
                            , ie = "[object Float32Array]"
                            , oe = "[object Float64Array]"
                            , ae = "[object Int8Array]"
                            , re = "[object Int16Array]"
                            , se = "[object Int32Array]"
                            , ce = "[object Uint8Array]"
                            , de = "[object Uint8ClampedArray]"
                            , le = "[object Uint16Array]"
                            , ue = "[object Uint32Array]"
                            , fe = /\w*$/
                            , pe = /^\[object .+?Constructor\]$/
                            , me = /^(?:0|[1-9]\d*)$/
                            , he = {};
                        he[B] = he["[object Array]"] = he[te] = he[ne] = he[W] = he[H] = he[ie] = he[oe] = he[ae] = he[re] = he[se] = he[G] = he[K] = he[Y] = he[J] = he[X] = he[Z] = he[ee] = he[ce] = he[de] = he[le] = he[ue] = !0,
                            he["[object Error]"] = he[q] = he["[object WeakMap]"] = !1;
                        var ve = {
                            function: !0,
                            object: !0
                        }
                            , ge = ve[typeof t] && t && !t.nodeType ? t : void 0
                            , _e = ve[typeof e] && e && !e.nodeType ? e : void 0
                            , we = _e && _e.exports === ge ? ge : void 0
                            , be = r(ge && _e && "object" == typeof n && n)
                            , ye = r(ve[typeof self] && self)
                            , ke = r(ve[typeof window] && window)
                            , xe = r(ve[typeof this] && this)
                            , Ee = be || ke !== (xe && xe.window) && ke || ye || xe || Function("return this")()
                            , Pe = Array.prototype
                            , Se = Object.prototype
                            , Ne = Function.prototype.toString
                            , Ie = Se.hasOwnProperty
                            , Ce = Se.toString
                            , Ae = RegExp("^" + Ne.call(Ie).replace(/[\\^$.*+?()[\]{}|]/g, "\\$&").replace(/hasOwnProperty|(function).*?(?=\\\()| for .+?(?=\\\])/g, "$1.*?") + "$")
                            , Me = we ? Ee.Buffer : void 0
                            , Ue = Ee.Symbol
                            , Oe = Ee.Uint8Array
                            , je = Object.getOwnPropertySymbols
                            , Te = Object.create
                            , Ve = Se.propertyIsEnumerable
                            , Le = Pe.splice
                            , De = Object.getPrototypeOf
                            , $e = Object.keys
                            , Re = x(Ee, "DataView")
                            , Fe = x(Ee, "Map")
                            , ze = x(Ee, "Promise")
                            , Be = x(Ee, "Set")
                            , We = x(Ee, "WeakMap")
                            , He = x(Object, "create")
                            , qe = U(Re)
                            , Qe = U(Fe)
                            , Ge = U(ze)
                            , Ke = U(Be)
                            , Ye = U(We)
                            , Je = Ue ? Ue.prototype : void 0
                            , Xe = Je ? Je.valueOf : void 0;
                        l.prototype.clear = function() {
                            this.__data__ = He ? He(null) : {}
                        }
                            ,
                            l.prototype.delete = function(e) {
                                return this.has(e) && delete this.__data__[e]
                            }
                            ,
                            l.prototype.get = function(e) {
                                var t = this.__data__;
                                if (He) {
                                    var n = t[e];
                                    return n === F ? void 0 : n
                                }
                                return Ie.call(t, e) ? t[e] : void 0
                            }
                            ,
                            l.prototype.has = function(e) {
                                var t = this.__data__;
                                return He ? void 0 !== t[e] : Ie.call(t, e)
                            }
                            ,
                            l.prototype.set = function(e, t) {
                                return this.__data__[e] = He && void 0 === t ? F : t,
                                    this
                            }
                            ,
                            u.prototype.clear = function() {
                                this.__data__ = []
                            }
                            ,
                            u.prototype.delete = function(e) {
                                var t = this.__data__
                                    , n = h(t, e);
                                return !(n < 0 || (n == t.length - 1 ? t.pop() : Le.call(t, n, 1),
                                    0))
                            }
                            ,
                            u.prototype.get = function(e) {
                                var t = this.__data__
                                    , n = h(t, e);
                                return n < 0 ? void 0 : t[n][1]
                            }
                            ,
                            u.prototype.has = function(e) {
                                return h(this.__data__, e) > -1
                            }
                            ,
                            u.prototype.set = function(e, t) {
                                var n = this.__data__
                                    , i = h(n, e);
                                return i < 0 ? n.push([e, t]) : n[i][1] = t,
                                    this
                            }
                            ,
                            f.prototype.clear = function() {
                                this.__data__ = {
                                    hash: new l,
                                    map: new (Fe || u),
                                    string: new l
                                }
                            }
                            ,
                            f.prototype.delete = function(e) {
                                return k(this, e).delete(e)
                            }
                            ,
                            f.prototype.get = function(e) {
                                return k(this, e).get(e)
                            }
                            ,
                            f.prototype.has = function(e) {
                                return k(this, e).has(e)
                            }
                            ,
                            f.prototype.set = function(e, t) {
                                return k(this, e).set(e, t),
                                    this
                            }
                            ,
                            p.prototype.clear = function() {
                                this.__data__ = new u
                            }
                            ,
                            p.prototype.delete = function(e) {
                                return this.__data__.delete(e)
                            }
                            ,
                            p.prototype.get = function(e) {
                                return this.__data__.get(e)
                            }
                            ,
                            p.prototype.has = function(e) {
                                return this.__data__.has(e)
                            }
                            ,
                            p.prototype.set = function(e, t) {
                                var n = this.__data__;
                                return n instanceof u && n.__data__.length == R && (n = this.__data__ = new f(n.__data__)),
                                    n.set(e, t),
                                    this
                            }
                        ;
                        var Ze = function(e) {
                            return null == e ? void 0 : e.length
                        };
                        je || (P = function() {
                                return []
                            }
                        ),
                        (Re && S(new Re(new ArrayBuffer(1))) != ne || Fe && S(new Fe) != G || ze && "[object Promise]" != S(ze.resolve()) || Be && S(new Be) != X || We && "[object WeakMap]" != S(new We)) && (S = function(e) {
                                var t = Ce.call(e)
                                    , n = t == Y ? e.constructor : void 0
                                    , i = n ? U(n) : void 0;
                                if (i)
                                    switch (i) {
                                        case qe:
                                            return ne;
                                        case Qe:
                                            return G;
                                        case Ge:
                                            return "[object Promise]";
                                        case Ke:
                                            return X;
                                        case Ye:
                                            return "[object WeakMap]"
                                    }
                                return t
                            }
                        );
                        var et = Array.isArray
                            , tt = Me ? function(e) {
                                return e instanceof Me
                            }
                            : function() {
                                return !1
                            }
                        ;
                        e.exports = function e(t, n, i, o, a, r, c) {
                            var d;
                            if (o && (d = r ? o(t, a, r, c) : o(t)),
                            void 0 !== d)
                                return d;
                            if (!L(t))
                                return t;
                            var l = et(t);
                            if (l) {
                                if (d = function(e) {
                                    var t = e.length
                                        , n = e.constructor(t);
                                    return t && "string" == typeof e[0] && Ie.call(e, "index") && (n.index = e.index,
                                        n.input = e.input),
                                        n
                                }(t),
                                    !n)
                                    return function(e, t) {
                                        var n = -1
                                            , i = e.length;
                                        for (t || (t = Array(i)); ++n < i; )
                                            t[n] = e[n];
                                        return t
                                    }(t, d)
                            } else {
                                var u = S(t)
                                    , f = u == q || u == Q;
                                if (tt(t))
                                    return function(e, t) {
                                        if (t)
                                            return e.slice();
                                        var n = new e.constructor(e.length);
                                        return e.copy(n),
                                            n
                                    }(t, n);
                                if (u == Y || u == B || f && !r) {
                                    if (s(t))
                                        return r ? t : {};
                                    if (d = N(f ? {} : t),
                                        !n)
                                        return function(e, t) {
                                            return b(e, P(e), t)
                                        }(t, function(e, t) {
                                            return e && b(t, $(t), e)
                                        }(d, t))
                                } else {
                                    if (!he[u])
                                        return r ? t : {};
                                    d = I(t, u, e, n)
                                }
                            }
                            c || (c = new p);
                            var h = c.get(t);
                            if (h)
                                return h;
                            if (c.set(t, d),
                                !l)
                                var v = i ? y(t) : $(t);
                            return function(e, t) {
                                for (var n = -1, i = e.length; ++n < i && !1 !== t(e[n], n, e); )
                                    ;
                            }(v || t, function(a, r) {
                                v && (a = t[r = a]),
                                    m(d, r, e(a, n, i, o, r, t, c))
                            }),
                                d
                        }
                    }
                ).call(t, n(719)(e), n(4))
            },
            715: function(e, t, n) {
                function i(e, t, n) {
                    var i = e[t];
                    h.call(e, t) && a(i, n) && (void 0 !== n || t in e) || (e[t] = n)
                }
                function o(e, t, n) {
                    if (!s(n))
                        return !1;
                    var i = typeof t;
                    return !!("number" == i ? r(n) && function(e, t) {
                        return !!(t = null == t ? l : t) && ("number" == typeof e || p.test(e)) && e > -1 && e % 1 == 0 && e < t
                    }(t, n.length) : "string" == i && t in n) && a(n[t], e)
                }
                function a(e, t) {
                    return e === t || e != e && t != t
                }
                function r(e) {
                    return null != e && function(e) {
                        return "number" == typeof e && e > -1 && e % 1 == 0 && e <= l
                    }(w(e)) && !function(e) {
                        var t = s(e) ? v.call(e) : "";
                        return t == u || t == f
                    }(e)
                }
                function s(e) {
                    var t = typeof e;
                    return !!e && ("object" == t || "function" == t)
                }
                var c = n(717)
                    , d = n(718)
                    , l = 9007199254740991
                    , u = "[object Function]"
                    , f = "[object GeneratorFunction]"
                    , p = /^(?:0|[1-9]\d*)$/
                    , m = Object.prototype
                    , h = m.hasOwnProperty
                    , v = m.toString
                    , g = m.propertyIsEnumerable
                    , _ = !g.call({
                    valueOf: 1
                }, "valueOf")
                    , w = function(e) {
                    return null == e ? void 0 : e.length
                }
                    , b = function(e) {
                    return d(function(t, n) {
                        var i = -1
                            , a = n.length
                            , r = a > 1 ? n[a - 1] : void 0
                            , s = a > 2 ? n[2] : void 0;
                        for (r = e.length > 3 && "function" == typeof r ? (a--,
                            r) : void 0,
                             s && o(n[0], n[1], s) && (r = a < 3 ? void 0 : r,
                                 a = 1),
                                 t = Object(t); ++i < a; ) {
                            var c = n[i];
                            c && e(t, c)
                        }
                        return t
                    })
                }(function(e, t) {
                    if (_ || function(e) {
                        var t = e && e.constructor;
                        return e === ("function" == typeof t && t.prototype || m)
                    }(t) || r(t))
                        !function(e, t, n, o) {
                            n || (n = {});
                            for (var a = -1, r = t.length; ++a < r; ) {
                                var s = t[a];
                                i(n, s, o ? o(n[s], e[s], s, n, e) : e[s])
                            }
                        }(t, c(t), e);
                    else
                        for (var n in t)
                            h.call(t, n) && i(e, n, t[n])
                });
                e.exports = b
            },
            716: function(e, t, n) {
                var i = n(714);
                e.exports = function(e) {
                    return i(e, !0, !0)
                }
            },
            717: function(e, t) {
                function n(e, t) {
                    var n = v(e) || function(e) {
                        return function(e) {
                            return function(e) {
                                return !!e && "object" == typeof e
                            }(e) && r(e)
                        }(e) && f.call(e, "callee") && (!m.call(e, "callee") || p.call(e) == s)
                    }(e) ? function(e, t) {
                        for (var n = -1, i = Array(e); ++n < e; )
                            i[n] = t(n);
                        return i
                    }(e.length, String) : []
                        , i = n.length
                        , a = !!i;
                    for (var r in e)
                        !t && !f.call(e, r) || a && ("length" == r || o(r, i)) || n.push(r);
                    return n
                }
                function i(e) {
                    if (!function(e) {
                        var t = e && e.constructor;
                        return e === ("function" == typeof t && t.prototype || u)
                    }(e))
                        return h(e);
                    var t = [];
                    for (var n in Object(e))
                        f.call(e, n) && "constructor" != n && t.push(n);
                    return t
                }
                function o(e, t) {
                    return !!(t = null == t ? r : t) && ("number" == typeof e || l.test(e)) && e > -1 && e % 1 == 0 && e < t
                }
                function a(e) {
                    return null != e && function(e) {
                        return "number" == typeof e && e > -1 && e % 1 == 0 && e <= r
                    }(e.length) && !function(e) {
                        var t = function(e) {
                            var t = typeof e;
                            return !!e && ("object" == t || "function" == t)
                        }(e) ? p.call(e) : "";
                        return t == c || t == d
                    }(e)
                }
                var r = 9007199254740991
                    , s = "[object Arguments]"
                    , c = "[object Function]"
                    , d = "[object GeneratorFunction]"
                    , l = /^(?:0|[1-9]\d*)$/
                    , u = Object.prototype
                    , f = u.hasOwnProperty
                    , p = u.toString
                    , m = u.propertyIsEnumerable
                    , h = function(e, t) {
                    return function(n) {
                        return e(t(n))
                    }
                }(Object.keys, Object)
                    , v = Array.isArray;
                e.exports = function(e) {
                    return a(e) ? n(e) : i(e)
                }
            },
            718: function(e, t) {
                function n(e) {
                    var t = typeof e;
                    return !!e && ("object" == t || "function" == t)
                }
                function i(e) {
                    return e ? (e = a(e)) === s || e === -s ? (e < 0 ? -1 : 1) * c : e == e ? e : 0 : 0 === e ? e : 0
                }
                function o(e) {
                    var t = i(e)
                        , n = t % 1;
                    return t == t ? n ? t - n : t : 0
                }
                function a(e) {
                    if ("number" == typeof e)
                        return e;
                    if (function(e) {
                        return "symbol" == typeof e || function(e) {
                            return !!e && "object" == typeof e
                        }(e) && g.call(e) == l
                    }(e))
                        return d;
                    if (n(e)) {
                        var t = "function" == typeof e.valueOf ? e.valueOf() : e;
                        e = n(t) ? t + "" : t
                    }
                    if ("string" != typeof e)
                        return 0 === e ? e : +e;
                    e = e.replace(u, "");
                    var i = p.test(e);
                    return i || m.test(e) ? h(e.slice(2), i ? 2 : 8) : f.test(e) ? d : +e
                }
                var r = "Expected a function"
                    , s = 1 / 0
                    , c = 1.7976931348623157e308
                    , d = NaN
                    , l = "[object Symbol]"
                    , u = /^\s+|\s+$/g
                    , f = /^[-+]0x[0-9a-f]+$/i
                    , p = /^0b[01]+$/i
                    , m = /^0o[0-7]+$/i
                    , h = parseInt
                    , v = Object.prototype
                    , g = v.toString
                    , _ = Math.max;
                e.exports = function(e, t) {
                    if ("function" != typeof e)
                        throw new TypeError(r);
                    return t = void 0 === t ? t : o(t),
                        function(e, t) {
                            return t = _(void 0 === t ? e.length - 1 : t, 0),
                                function() {
                                    for (var n = arguments, i = -1, o = _(n.length - t, 0), a = Array(o); ++i < o; )
                                        a[i] = n[t + i];
                                    i = -1;
                                    for (var r = Array(t + 1); ++i < t; )
                                        r[i] = n[i];
                                    return r[t] = a,
                                        function(e, t, n) {
                                            switch (n.length) {
                                                case 0:
                                                    return e.call(t);
                                                case 1:
                                                    return e.call(t, n[0]);
                                                case 2:
                                                    return e.call(t, n[0], n[1]);
                                                case 3:
                                                    return e.call(t, n[0], n[1], n[2])
                                            }
                                            return e.apply(t, n)
                                        }(e, this, r)
                                }
                        }(e, t)
                }
            },
            719: function(e, t) {
                e.exports = function(e) {
                    return e.webpackPolyfill || (e.deprecate = function() {}
                        ,
                        e.paths = [],
                    e.children || (e.children = []),
                        Object.defineProperty(e, "loaded", {
                            enumerable: !0,
                            get: function() {
                                return e.l
                            }
                        }),
                        Object.defineProperty(e, "id", {
                            enumerable: !0,
                            get: function() {
                                return e.i
                            }
                        }),
                        e.webpackPolyfill = 1),
                        e
                }
            },
            721: function(e, t, n) {
                e.exports = n(199)
            }
        })
    }
    , function(e, t, n) {
        "use strict";
        var i, o, a = "function" == typeof Symbol && "symbol" == typeof Symbol.iterator ? function(e) {
                return typeof e
            }
            : function(e) {
                return e && "function" == typeof Symbol && e.constructor === Symbol && e !== Symbol.prototype ? "symbol" : typeof e
            }
        ;
        /*!
 * Copyright(c) Alibaba Group Holding Limited.
 * AUTHOR: shafeng
 * TAB SIZE: 4
 */
        !function(r, s) {
            "object" === a(t) && void 0 !== e ? e.exports = s() : void 0 === (o = "function" == typeof (i = s) ? i.call(t, n, t, e) : i) || (e.exports = o)
        }(0, function() {
            var e = "H1510124664"
                , t = {}
                , n = document.querySelector('meta[name="spm-id"]') || document.querySelector('meta[name="data-spm"]')
                , i = n && n.getAttribute("content") || ""
                , o = document.body.getAttribute("data-spm") || "";
            function a() {
                for (var e = [].slice.call(arguments), t = e[0] || {}, n = 1; n < e.length; n++) {
                    var i = e[n];
                    if (i)
                        for (var o in i)
                            i.hasOwnProperty(o) && (t[o] = i[o])
                }
                return t
            }
            function r(e) {
                var t = [];
                for (var n in e = e || {})
                    e.hasOwnProperty(n) && t.push(n + "=" + encodeURIComponent(e[n]));
                return t.length ? t.join("&") : ""
            }
            function s(t, n, i) {
                t ? window.goldlog ? window.goldlog.record(t, n, i, e) : (window["LOG" + Date.now()] = new Image).src = "//gm.mmstat.com" + t + "?" + i + "&t=" + Date.now() : console.error("logkey is empty, please check...")
            }
            var c = function(e) {
                a(t, e || {})
            }
                , d = function(e, n) {
                n.spm && (n.spm = [i, o, n.spm].join(".")),
                    s(e, "CLK", r(a({}, t, n)))
            }
                , l = function(e, n) {
                n.spm && (n.spm = [i, o, n.spm].join(".")),
                    s(e, "SLD", r(a({}, t, n)))
            }
                , u = function(e, n) {
                n.spm && (n.spm = [i, o, n.spm].join(".")),
                    s(e, "EXP", r(a({}, t, n)))
            }
                , f = function(e, n) {
                n.spm && (n.spm = [i, o, n.spm].join(".")),
                    s(e, "OTHER", r(a({}, t, n)))
            };
            return function() {
                return {
                    init: c,
                    click: d,
                    scroll: l,
                    exp: u,
                    other: f
                }
            }
        }())
    }
    , function(e, t, n) {
        "use strict";
        var i = n(1)
            , o = n(3);
        e.exports = {
            bind: function(e) {
                var t = this
                    , n = 0
                    , a = setInterval(function() {
                    if (n > 5)
                        return window.clearInterval(a);
                    var e = t.val.cid;
                    if (n += 1,
                    e && globalConfig.utps) {
                        window.clearInterval(a);
                        var i = globalConfig.utps[e];
                        i && i.adid && $(t.el).data("adid", i.adid)
                    }
                }, 500);
                $(this.el).on("click", function(e) {
                    e.preventDefault();
                    var n = t.val;
                    if (window.SMDS_noShare)
                        return !1;
                    function a() {
                        var e = n.cid
                            , t = "default" == n.landPage && i.flowbackUrl() || n.landPage
                            , a = "";
                        if (void 0 === n.client || JSON.parse(n.client) || i.is_share_mode)
                            if ("pc" != i.platform.os) {
                                if (n.stat)
                                    try {
                                        a = JSON.parse(n.stat)
                                    } catch (e) {
                                        a = {
                                            action: n.stat
                                        }
                                    }
                                a && o.event($.extend({}, a));
                                var r = globalConfig.utps && globalConfig.utps[e || ""] || void 0;
                                e && r ? r && $(document).trigger("utp:click", [r, t]) : i.openUrl(i.urlQuery.client, t)
                            } else
                                window.location.href = t
                    }
                    n.before ? n.before(a) : a()
                })
            },
            update: function(e) {
                this.val = e
            }
        }
    }
    , function(e, t, n) {
        "use strict";
        var i = n(1)
            , o = i.urlQuery
            , a = i.platform
            , r = (window.location.protocol,
            {
                src: "",
                format: "jpeg",
                extension: "jpg",
                widthLimit: 700,
                heightLimit: "",
                cutSize: "",
                quality: 3
            })
            , s = [{
            path: "image.uc.cn/s/"
        }, {
            path: "dayu-img.uc.cn"
        }, {
            path: "bq-img.peco.uodoo.com",
            supportHttps: !1,
            httpsDomain: "dayu-img.uc.cn"
        }]
            , c = {
            src: "",
            extension: "jpeg",
            widthLimit: 700,
            heightLimit: "",
            cutSize: "",
            useLentp: !1
        };
        t.compress = function() {
            var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {}
                , t = Object.assign({}, c, e);
            if (!e.extension) {
                var n = /.*\.(bmp|png)/g.exec(e.src || "");
                n && n[1] && (t.extension = n[1])
            }
            var d = t.src
                , l = t.widthLimit
                , u = t.heightLimit
                , f = t.cutSize
                , p = t.useLentp
                , m = t.extension
                , h = !1
                , v = d || "";
            if (!v)
                return v;
            if (!globalConfig.isCompressImage)
                return v;
            if (globalConfig.sampleFactor && Math.ceil(20 * Math.random()) > globalConfig.sampleFactor)
                return v;
            for (var g = !1, _ = "", w = 0; w < s.length; w++) {
                var b = s[w];
                if (v.indexOf(b.path) > -1) {
                    _ = b,
                        g = !0;
                    break
                }
            }
            if (i.is_https_mode && _ && !1 === _.supportHttps && _.httpsDomain && (v = v.replace(_.path, _.httpsDomain)),
                !g)
                return v;
            if (-1 !== v.indexOf("?"))
                return v;
            if (-1 !== v.indexOf(";"))
                return v;
            var y = (globalConfig.NETWORK_TYPE || "").toLowerCase()
                , k = "wifi,4g".indexOf(y) > -1 ? 4 : 3
                , x = "jpeg" === m || "jpg" === m
                , E = x ? "jpegx" : m
                , P = a.isUCBrowser && a.isAndroid;
            return P && x && (E = "webp"),
            P && x && p && o.lentp && (E = "lentpw"),
            i.is_share_mode && a.isiPhone && "webp" === m && (E = "jpeg",
                m = "jpeg",
                h = !0),
                function() {
                    var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {}
                        , t = Object.assign({}, r, e)
                        , n = t.src
                        , i = t.format
                        , o = t.widthLimit
                        , a = void 0 === o ? r.widthLimit : o
                        , s = t.heightLimit
                        , c = void 0 === s ? r.heightLimit : s
                        , d = t.quality
                        , l = t.cutSize
                        , u = t.extension
                        , f = void 0 === u ? "jpg" : u
                        , p = t.isForceScale
                        , m = void 0 !== p && p;
                    if (!n)
                        return n;
                    try {
                        return n + ";," + d + "," + i + (a || c ? ";3," + (a || "") + "x" + (c || "") : "") + (l ? ",;6,C-C," + l : "") + "." + ("jpeg" === f || "jpg" === f ? "jpg" : f) + (m ? ",1" : "")
                    } catch (e) {}
                    return n
                }({
                    src: v = v.replace("image.uc.cn/s/", "image.uc.cn/o/"),
                    format: E,
                    widthLimit: l,
                    heightLimit: u,
                    cutSize: f,
                    quality: k,
                    extension: m,
                    isForceScale: h
                })
        }
    }
    , function(e, t, n) {
        "use strict";
        /*!
 * storage.js
 * Copyright(c) 2016
 * AUTHOR: shafeng
 * TAB SIZE: 4
 */
        var i = window.wmStorageKeys || {}
            , o = /^localstorage\_\_\_(.*)+\_\_\_\d*$/
            , a = "localstorage"
            , r = "___"
            , s = {
            getItem: function() {},
            setItem: function() {},
            removeItem: function() {}
        };
        try {
            s = window.localStorage
        } catch (e) {}
        function c(e) {
            var t = e.split(r)
                , n = {};
            return n.realkey = t[1],
                n.expires = t[2] || "",
                n
        }
        function d(e, t) {
            var n = +new Date;
            return !!t && n > parseInt(t, 10)
        }
        !function() {
            if (!window.wmStorageKeys) {
                var e;
                for (var t in s)
                    if (o.test(t)) {
                        if (d((e = c(t)).realkey, e.expires)) {
                            s.removeItem(t);
                            continue
                        }
                        i[e.realkey] = {
                            key: t,
                            expires: e.expires
                        }
                    }
                window.wmStorageKeys = i
            }
        }();
        var l = {
            getItem: function(e) {
                var t = i[e];
                return t ? d(0, t.expires) ? "" : s.getItem(t.key) : ""
            },
            setItem: function(e, t, n) {
                if (!e)
                    return this;
                n = n || 0,
                    this._key = e;
                var o = +new Date
                    , c = a + r + e + r + (n ? 1e3 * n + o : "");
                try {
                    i[e] = {
                        key: c,
                        expires: n ? 1e3 * n + o : ""
                    },
                        s.setItem(c, t)
                } catch (e) {}
                return this
            },
            removeItem: function(e) {
                var t = i[e];
                return t && s.removeItem(t.key),
                    this
            },
            clear: function() {
                for (var e in s)
                    o.test(e) && s.removeItem(e);
                return this
            },
            expires: function(e) {
                if (!e)
                    return this;
                var t = this._key
                    , n = i[t] || {}
                    , o = s.getItem(n.key);
                return new Date,
                    t ? (this.removeItem(t),
                        this.setItem(t, o, e),
                        this) : this
            }
        };
        e.exports = l
    }
    , function(e, t, n) {
        "use strict";
        var i = n(24)
            , o = {
            getVersion: "base.getVersion",
            needShowUcnewsBanner: "biz.needShowUcnewsBanner",
            downSilent: "download.downSilent",
            queryApp: "biz.queryApp",
            getUtpAppStatus: "biz.getUtpAppStatus",
            quickDown: "biz.quickDownload",
            callUCNews: {
                ios: "biz.pageDiversion"
            },
            openDeepLink: {
                android: "biz.openDeepLink"
            },
            getPageInfo: "promotion.getPageInfo",
            sendBeacon: "base.sendBeacon"
        };
        function a() {
            var e = window.navigator.userAgent;
            return /Android/i.test(e) ? "android" : /iPhone|iPad|iPod/i.test(e) ? "ios" : "unknown"
        }
        var r = a()
            , s = {};
        Object.keys(o).forEach(function(e) {
            var t, n = o[e];
            (t = "string" == typeof n ? n : o[e][r]) && (s[e] = function(e) {
                var t = a();
                return function(n) {
                    return n = n || {},
                        new i(function(i, o) {
                                var a = window.ucapi || window.top.ucapi;
                                "unknown" !== t && a ? (n.success = function() {
                                    clearTimeout(r);
                                    var e = [].slice.call(arguments);
                                    i.apply(null, e)
                                }
                                    ,
                                    n.fail = s,
                                    n.timeout = +n.timeout || 1e3,
                                    a.invoke(e, n)) : o(new Error("Unknown platform"));
                                var r = setTimeout(s.bind(null, new Error("Timeout expired in " + n.timeout + "ms")), n.timeout);
                                function s() {
                                    clearTimeout(r);
                                    var e = [].slice.call(arguments);
                                    o.apply(null, e)
                                }
                            }
                        )
                }
            }(t))
        }),
            e.exports = s
    }
    , function(e, t, n) {
        var i = n(147);
        function o(e) {
            i.call(this);
            var t = this
                , n = function() {
                var e = [].slice.call(arguments, 0);
                t.off("reject"),
                    e.unshift("resolve"),
                    t.emit.apply(t, e)
            }
                , o = function() {
                var e = [].slice.call(arguments, 0);
                t.off("resolve"),
                    e.unshift("reject"),
                    t.emit.apply(t, e)
            };
            e && setTimeout(function() {
                var t = e(n, o);
                t && t.then(n, o)
            }, 0)
        }
        n(146)(i, o),
            o.prototype.then = function(e, t) {
                var n = new o;
                if (e) {
                    this.once("resolve", function() {
                        var t = [].slice.call(arguments, 0)
                            , i = e.apply(null, t);
                        i instanceof o ? i.then(function() {
                            var e = [].slice.call(arguments, 0);
                            e.unshift("resolve"),
                                n.emit.apply(n, e)
                        }, function() {
                            var e = [].slice.call(arguments, 0);
                            e.unshift("reject"),
                                n.emit.apply(n, e)
                        }) : n.emit("resolve", i)
                    })
                }
                if (t) {
                    this.once("reject", function(e) {
                        var i = [].slice.call(arguments, 0)
                            , o = t.apply(null, i);
                        n.emit("reject", o)
                    })
                } else
                    this.once("reject", function(e) {
                        n.emit("reject", e)
                    });
                return n
            }
            ,
            o.prototype.catch = function(e) {
                this.once("reject", e)
            }
            ,
            o.all = function(e) {
                var t, n, i = e.length, a = 0, r = [], s = [];
                function c() {
                    var e = [].slice.call(arguments, 0);
                    1 === e.length && (e = e[0]),
                        r.push(e),
                        d()
                }
                function d() {
                    a === i && t ? t.call(null, s) : r.length > 0 && n && n.apply(null, r)
                }
                return e.forEach(function(e, t) {
                    e.then(function(e) {
                        return function() {
                            var t = [].slice.call(arguments, 0);
                            1 === t.length && (t = t[0]),
                                s.splice(e, 0, t),
                                a++,
                                d()
                        }
                    }(t)).catch(c)
                }),
                    new o(function(e, i) {
                            t = e,
                                n = i,
                                d()
                        }
                    )
            }
            ,
            window.Promise ? e.exports = window.Promise : e.exports = o
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.androidWeexBridge = t.iosWeexBridge = t.requireModule = void 0;
        t.requireModule = function(e) {
            return "undefined" != typeof __weex_require__ ? __weex_require__("@weex-module/" + e) : "undefined" != typeof weex ? weex.requireModule(e) : void 0
        }
            ,
            t.iosWeexBridge = function() {
                return Promise.resolve(function(e, n) {
                    return new Promise(function(i, o) {
                            var a = t.requireModule("nuvajs-exec")
                                , r = e.split(".")
                                , s = r.pop()
                                , c = r.join(".");
                            a.exec({
                                plugin: c,
                                action: s,
                                args: n
                            }, function(e) {
                                e && "0" === e.errorCode ? ("function" == typeof n.onSuccess && n.onSuccess(e.result),
                                    i(e.result)) : ("function" == typeof n.onFail && n.onFail(e.result),
                                    o(e.result))
                            })
                        }
                    )
                })
            }
            ,
            t.androidWeexBridge = function() {
                return Promise.resolve(function(e, n) {
                    return new Promise(function(i, o) {
                            var a = t.requireModule("nuvajs-exec")
                                , r = e.split(".")
                                , s = r.pop()
                                , c = r.join(".");
                            a.exec({
                                plugin: c,
                                action: s,
                                args: n
                            }, function(e) {
                                var t = {};
                                try {
                                    if (e && e.__message__)
                                        if ("object" == typeof e.__message__)
                                            t = e.__message__;
                                        else
                                            try {
                                                t = JSON.parse(e.__message__)
                                            } catch (n) {
                                                "string" == typeof e.__message__ && (t = e.__message__)
                                            }
                                } catch (e) {}
                                e && 1 === parseInt(e.__status__ + "", 10) ? ("function" == typeof n.onSuccess && n.onSuccess(t),
                                    i(t)) : ("function" == typeof n.onFail && n.onFail(t),
                                    o(t))
                            })
                        }
                    )
                })
            }
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        });
        t.default = function(e, t) {
            return new Promise(function(n, i) {
                    dd.dtBridge({
                        m: e,
                        args: t,
                        onSuccess: function(e) {
                            "function" == typeof t.onSuccess && t.onSuccess(e),
                                n(e)
                        },
                        onFail: function(e) {
                            "function" == typeof t.onFail && t.onFail(e),
                                i(e)
                        }
                    })
                }
            )
        }
    }
    , function(e, t) {
        var n;
        n = function() {
            return this
        }();
        try {
            n = n || Function("return this")() || (0,
                eval)("this")
        } catch (e) {
            "object" == typeof window && (n = window)
        }
        e.exports = n
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        });
        var i = function(e) {
            return e && e.__esModule ? e : {
                default: e
            }
        }(n(355))
            , o = function(e) {
            if (e && e.__esModule)
                return e;
            var t = {};
            if (null != e)
                for (var n in e)
                    Object.prototype.hasOwnProperty.call(e, n) && (t[n] = e[n]);
            return t.default = e,
                t
        }(n(51));
        var a = {
            init: function() {
                var e = this
                    , t = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {};
                this.getWechatTicket().then(function(n) {
                    e.configWechat(n, t).catch(function(e) {
                        return console.log(e)
                    })
                }).catch(function(e) {
                    console.log(e)
                })
            },
            getWechatTicket: function() {
                return new Promise(function(e, t) {
                        var n = window.fetch;
                        if (!n)
                            return t("fetch required");
                        var o = {
                            url: window.location.href
                        };
                        n("/weixin_ticket?" + i.default.generateQueryStringFromObject(o), {}).then(function(t) {
                            return e(t.json())
                        }).catch(t)
                    }
                )
            },
            _callbacks: [],
            listenShare: function() {
                var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : function() {}
                ;
                this._callbacks.push(e)
            },
            triggerShareCallbacks: function(e) {
                this._callbacks.forEach(function(t) {
                    t && t(e)
                })
            },
            configWechat: function(e, t) {
                var n = this;
                return new Promise(function(i, o) {
                        if (!(e.appId && e.signature && e.nonceStr && e.timestamp))
                            return o("config param error");
                        if (!window.wx)
                            return o("wx jssdk required");
                        var a = ["onMenuShareTimeline", "onMenuShareAppMessage", "onMenuShareQQ", "onMenuShareQZone"]
                            , r = {
                            debug: !1,
                            appId: e.appId,
                            timestamp: e.timestamp,
                            nonceStr: e.nonceStr,
                            signature: e.signature,
                            jsApiList: a.slice()
                        };
                        t.success = function(e) {
                            return n.triggerShareCallbacks(e)
                        }
                            ,
                            window.wx.config(r),
                            window.wx.ready(function() {
                                a.forEach(function(e) {
                                    return window.wx[e](t)
                                }),
                                    i()
                            })
                    }
                )
            }
        };
        t.default = {
            _shareInfo: {
                title: document.title || window.location.href,
                content: document.title || "",
                sourceUrl: window.location.href,
                imageUrl: ""
            },
            getShouldEnableShareSDK: function() {},
            getShareDepth: function() {
                var e = i.default.getQueryParam("uc_share_depth")
                    , t = parseInt(e, 10);
                return Number.isNaN(t) && (t = 0),
                    t
            },
            addShareDepth: function() {
                var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : "";
                return i.default.addQueryParam("uc_share_depth", this.getShareDepth() + 1, e)
            },
            getShareInfo: function() {
                return Object.assign({}, this._shareInfo)
            },
            setShareInfo: function() {
                var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {};
                this._shareInfo = Object.assign({}, this._shareInfo, e),
                    this._shareInfo.sourceUrl = this.addShareDepth(this._shareInfo.sourceUrl),
                    this.setClientShareInfo(),
                this.checkIsWechat() && this.setWechatShareInfo(),
                this.checkIsDingTalk() && this.setDingTalkShareInfo()
            },
            setClientShareInfo: function() {
                var e = this;
                window.ucapi && window.ucapi.biz && window.ucapi.biz.onShare && window.ucapi.biz.onShare({
                    title: this._shareInfo.title,
                    content: this._shareInfo.content,
                    iconUrl: this._shareInfo.imageUrl,
                    pageUrl: this._shareInfo.sourceUrl,
                    sourceUrl: this._shareInfo.sourceUrl,
                    target: "",
                    type: this._shareInfo.type || "",
                    source: "",
                    trigger: function(t) {
                        e.triggerShareEvent(t)
                    }
                })
            },
            triggerShareEvent: function(e) {
                this._listenShareEventCallbacks.forEach(function(t) {
                    setTimeout(t && t(e), 10)
                })
            },
            _listenShareEventCallbacks: [],
            listenUCShareEvent: function() {
                var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : function() {}
                ;
                this._listenShareEventCallbacks.push(e)
            },
            triggerUCShare: function(e) {
                window.ucapi && window.ucapi.biz && window.ucapi.biz.shareEx && window.ucapi.biz.shareEx(Object.assign({}, this._shareInfo, e))
            },
            listenWechatShareEvent: function() {
                var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : function() {}
                ;
                a.listenShare(e)
            },
            checkIsWechat: function() {
                return /micromessenger/i.test(window.navigator.userAgent)
            },
            setWechatShareInfo: function() {
                var e = this.getShareInfo();
                a.init({
                    title: e.title,
                    desc: e.content,
                    link: e.sourceUrl,
                    imgUrl: e.imageUrl,
                    type: e.type || ""
                })
            },
            checkIsDingTalk: function() {
                return /dingtalk/i.test(window.navigator.userAgent)
            },
            setDingTalkShareInfo: function() {
                var e = this.getShareInfo();
                try {
                    o.ready(function() {
                        o.biz.navigation.setRight({
                            show: !0,
                            control: !0,
                            text: "更多",
                            onSuccess: function() {
                                o.biz.util.share({
                                    type: 0,
                                    url: e.sourceUrl,
                                    title: e.title,
                                    content: e.content,
                                    image: e.imageUrl,
                                    onSuccess: function() {},
                                    onFail: function() {}
                                })
                            },
                            onFail: function() {}
                        })
                    })
                } catch (e) {}
            }
        }
    }
    , function(e, t, n) {
        "use strict";
        e.exports = new Vue({
            data: {
                wm: null,
                followed: !1
            }
        })
    }
    , function(e, t, n) {
        "use strict";
        var i = n(1);
        e.exports = {
            update: function(e) {
                "string" == typeof e && (e = {
                    id: e
                }),
                    i.statWhenExposure(this.el, e.id, e.triggerHeight, e.callback)
            }
        }
    }
    , function(e, t, n) {
        e.exports = n.p + "components/pages/article/media/imgs/go2_fda6d.png"
    }
    , function(e, t, n) {
        e.exports = n.p + "components/pages/article/media/imgs/go_77c45.png"
    }
    , function(e, t, n) {
        e.exports = n.p + "components/pages/article/media/imgs/plus_6aae8.png"
    }
    , function(e, t, n) {
        e.exports = n.p + "components/pages/article/media/imgs/vip-head-1_d6778.png"
    }
    , function(e, t, n) {
        "use strict";
        var i, o = [], a = !1, r = {}, s = "1" === f("uc_iflow_sdkconfig_debug"), c = "1" === f("uc_iflow_sdkconfig_dev") ? "test" : "prod";
        function d(e) {
            s && console.log(e)
        }
        var l = {
            article: function(e) {
                return i && i[e]
            },
            url: f
        }
            , u = {
            stringEquals: function(e, t) {
                return e === t
            },
            stringNoEquals: function(e, t) {
                return e !== t
            },
            stringNoHasOneOf: function(e, t) {
                if (void 0 != e && void 0 != t) {
                    var n = !0;
                    return e instanceof Array && e.forEach ? (e.forEach(function(e) {
                        t.indexOf(e) > -1 && (n = !1)
                    }),
                        n) : e.indexOf && e.indexOf(",") > -1 && e.split ? (e.split(",").forEach(function(e) {
                        t.indexOf(e) > -1 && (n = !1)
                    }),
                        n) : t.indexOf && -1 === t.indexOf(e)
                }
            },
            stringHasOneOf: function(e, t) {
                if (void 0 != e && void 0 != t) {
                    var n = !1;
                    if (e instanceof Array && e.forEach)
                        return e.forEach(function(e) {
                            t.indexOf && t.indexOf(e) > -1 && (n = !0)
                        }),
                            n;
                    if (e.indexOf && e.indexOf(",") > -1) {
                        var i = e.split(",");
                        return i && i.forEach && i.forEach(function(e) {
                            t.indexOf && t.indexOf(e) > -1 && (n = !0)
                        }),
                            n
                    }
                    return t.indexOf && t.indexOf(e) > -1
                }
            },
            stringIsOneOf: function(e, t) {
                return e.indexOf && e.indexOf(t) > -1
            },
            numberEquals: function(e, t) {
                return parseInt(e) === parseInt(t)
            },
            numberNoEquals: function(e, t) {
                return parseInt(e) !== parseInt(t)
            }
        };
        function f(e) {
            var t = new RegExp("(\\?|^|&|#|!)" + e + "=([^&|^#|^!]*)(&|$|#|!)","i")
                , n = window.location.href.match(t)
                , i = n && n[2];
            return decodeURIComponent(void 0 !== i ? i : "")
        }
        t.init = function(e) {
            i = Object.assign({}, e && e.article || {}),
                new Promise(function(e) {
                        window.getXissData || e(null),
                            window.getXissData.then(e).catch(function() {
                                e(null)
                            }),
                            setTimeout(function() {
                                e(null)
                            }, 5e3)
                    }
                ).then(function(t) {
                    try {
                        if (t && t.category) {
                            var n = t.category || []
                                , s = i.category || "";
                            if (n instanceof Array && "string" == typeof s) {
                                var f = n.slice();
                                f.push(s),
                                    i.category = f.join(",")
                            }
                        }
                        t && t.view_extension_obj && ("0" === t.view_extension_obj.adenable || 0 === t.view_extension_obj.adenable) && (i.category = i.category ? i.category + ",时政" : "时政")
                    } catch (e) {}
                    !function(e, t) {
                        var n = e.channel || "uc"
                            , i = e.page || "article"
                            , o = e.type || "xiss"
                            , a = Math.floor(Date.now() / 6e5);
                        $.ajax({
                            type: "GET",
                            dataType: "json",
                            url: "https://images.uc.cn/s/uae/g/1y/sdk-mod-config/" + c + "/" + n + "-" + o + "-" + i + ".json?t=" + a,
                            timeout: 3e3,
                            success: function(e) {
                                t && t(null, e)
                            },
                            fail: function(e) {
                                t && t(e, null)
                            }
                        })
                    }(e, function(e, t) {
                        try {
                            t.rules.push({
                                filter: "conditions",
                                hideModules: ["relate-sdk", "tool-bar-sdk-feedback", "ad-card-huichuan", "wemedia-card"],
                                prop: "title",
                                rule: "stringHasOneOf",
                                ruleContent: ["习近平"],
                                source: "article"
                            })
                        } catch (e) {}
                        if (t) {
                            d(t);
                            try {
                                !function(e) {
                                    e && e.length && (e.forEach(function(e) {
                                        if (e && ("all" === e.filter || e.source && e.rule)) {
                                            var t = !1;
                                            if ("all" === e.filter)
                                                t = !0;
                                            else {
                                                var n = l[e.source]
                                                    , i = n && n(e.prop);
                                                if (void 0 === i || null === i)
                                                    return;
                                                var o = u[e.rule];
                                                t = o && o(e.ruleContent, i)
                                            }
                                            d("======"),
                                                d(i),
                                                d(e),
                                                d(t),
                                            t && e.hideModules.forEach(function(e) {
                                                r[e] = !0
                                            })
                                        }
                                    }),
                                        d("hideModuleMap"),
                                        d(r))
                                }(t.rules)
                            } catch (e) {}
                        }
                        a = !0,
                        o && o.length && o.forEach(function(e) {
                            try {
                                e && e()
                            } catch (e) {}
                        }),
                            d(r)
                    })
                })
        }
            ,
            t.shouldLoad = function(e, t) {
                if (e instanceof Array) {
                    if (a) {
                        var n = e.map(function(e) {
                            return d(e + " " + !r[e]),
                                !r[e]
                        });
                        return void (t && t(n))
                    }
                    o.push(function() {
                        var n = e.map(function(e) {
                            return d(e + " " + !r[e]),
                                !r[e]
                        });
                        t && t(n)
                    })
                } else {
                    if (a)
                        return d(e + " " + !r[e]),
                            void (t && t(!r[e]));
                    o.push(function() {
                        d(e + " " + !r[e]),
                        t && t(!r[e])
                    })
                }
            }
    }
    , function(e, t, n) {
        "use strict";
        /*!
 * clientinfo.js
 * Copyright(c) 2016
 * AUTHOR: shafeng
 * TAB SIZE: 4
 */
        var i = n(1)
            , o = n(35);
        t.pushMessageToClient = function(e) {
            var t = e && e.body && e.body.videos && e.body.videos[0] || {}
                , n = {
                reco_id: i.urlQuery.recoid || "",
                page_type: e.page_type || 6,
                id: globalConfig.sm_article_id,
                sm_article_id: globalConfig.sm_article_id,
                is_wemedia: !0,
                ch_id: i.urlQuery.cid || -1,
                daoliu_type: globalConfig.DAOLIU_TYPE || 2,
                item_type: e.item_type || 0,
                url: e.pageUrl || window.location.href,
                ori_url: e.pageUrl || window.location.href,
                title: e.title,
                site_title: e.wm_name,
                source_name: e.wm_name,
                cmt_enabled: !!globalConfig.sm_article_id,
                emotion_enable: 0,
                content_type: e.content_type || 0,
                cmt_url: "https://m.uczzd.cn/webapp/webview/xissAllComments?aid=" + globalConfig.sm_article_id + "&cid=-1&zzd_from=uc-iflow&uc_param_str=dnnivebichfrmintcpgieiwidsud&uc_biz_str=S:custom%7CC:comment%7CN:true&wm_aid=" + e.wm_aid + "&is_wemedia=1",
                wm_aid: e.wm_aid,
                wm_cid: e.content_id,
                wm_id: globalConfig.wm_id,
                site_logo_url: e.avatar_url,
                video_duration: e.video_duration || "",
                video_url: e.video_url || "",
                video_id: e.video_id || "",
                ums_id: t.ums_id || "",
                wm_author: {
                    author_icon: {
                        url: e.avatar_url
                    },
                    home_url: globalConfig.DOMAIN + "/media.html?mid=" + globalConfig.wm_id + "&uc_biz_str=S:custom%7CC:iflow_ncmt&uc_param_str=" + globalConfig.uc_param_str + "&from=",
                    name: e.wm_name,
                    wemedia_vip: globalConfig.wemedia_vip || void 0,
                    wm_id: globalConfig.wm_id
                }
            };
            function a(e) {
                window.ucapi && window.ucapi.infoflow && window.ucapi.infoflow.notifyFlushWebItemInfo && window.ucapi.infoflow.notifyFlushWebItemInfo({
                    data: e,
                    success: function(e) {},
                    fail: function(e) {}
                })
            }
            (e.cover_url || e.thumbnail_url) && (n.thumbnails = [{
                url: e.cover_url || e.thumbnail_url
            }]),
            void 0 !== e.flv_switch && (n.flv_switch = e.flv_switch),
                a(n),
            window.ucapi && window.ucapi.account && window.ucapi.account.onAccountStateChange && window.ucapi.account.onAccountStateChange({
                trigger: function(e) {
                    e && e.ucid && (globalConfig.UCID = e.ucid)
                }
            }),
                o.shouldLoad("tool-bar-sdk-feedback", function(e) {
                    n.emotion_enable = e ? 1 : 0,
                    window.getXissData && window.getXissData.then(function(e) {
                        n.cmt_enabled = e.cmt_enabled,
                            n.tracepkg = e.tracepkg || "",
                            a(n)
                    }).catch(function(e) {
                        n.cmt_enabled = !0,
                            n.emotion_enable = 1,
                            a(n)
                    })
                }),
            window.ucapi && window.ucapi.infoflow && window.ucapi.infoflow.actionShouldOpenUrl({
                trigger: function(t) {
                    var n = {
                        url: ""
                    };
                    try {
                        if ("left_scroll" == t.type) {
                            var o = globalConfig.IFLOWDOMAIN + "/webapp/webview/xissAllComments?aid=" + globalConfig.sm_article_id + "&cid=" + (i.urlQuery.cid || "") + "&zzd_from=uc-iflow&cmt_page_type=2&uc_param_str=dnnivebichfrmintcpgieiwidsud&uc_biz_str=S:custom%7CC:comment%7CN:true&wm_aid=" + (e.wm_aid || "") + "&is_wemedia=1";
                            n.url = o
                        }
                    } catch (e) {}
                    return n
                }
            })
        }
    }
    , function(e, t, n) {
        e.exports = n.p + "views/imgs/vip/vip_copper_e1877.png"
    }
    , function(e, t, n) {
        e.exports = n.p + "views/imgs/vip/vip_silver_7506a.png"
    }
    , function(e, t, n) {
        e.exports = n.p + "views/imgs/vip/vip_gold_eab64.png"
    }
    , function(e, t, n) {
        "use strict";
        var i = n(114)
            , o = n(1)
            , a = n(3)
            , r = n(5)
            , s = n(10);
        n(113),
            e.exports = Vue.extend({
                template: i,
                props: {
                    active: {
                        type: Boolean,
                        default: !1
                    },
                    category: {
                        type: String,
                        default: ""
                    },
                    pos: {
                        type: String,
                        default: ""
                    }
                },
                watch: {
                    active: function(e) {
                        o.platform.isiPhone && s.match(globalConfig.VERSION, "12.2.4.0~") && s.match(globalConfig.VERSION, "~12.2.5.0") || (e ? this.getRecommendData() : this.showList = !1)
                    },
                    showList: function(e) {
                        e && !this.hasLoged && (this.hasLoged = !0,
                            r.log({
                                region: this.region,
                                action: "show"
                            }))
                    }
                },
                computed: {
                    region: function() {
                        return "header" === this.pos ? "top_wmrelate" : "bottom_wmrelate"
                    }
                },
                data: function() {
                    return {
                        wms: [],
                        showList: !1,
                        hasLoged: !1
                    }
                },
                ready: function() {
                    var e = this;
                    $(document).on("media:followWithId", function(t, n) {
                        n && n.wm_id && e.wms && e.wms.length && e.wms.forEach && e.wms.forEach(function(e) {
                            e && e.wm_id === n.wm_id && (e.$$followed = !!n.is_followed)
                        })
                    })
                },
                methods: {
                    onFollow: function(e) {
                        var t = this;
                        e.$$followed ? this.onGotoOtherHomepage(e) : (r.log({
                            region: this.region,
                            action: "click_sub"
                        }),
                            o.directlyFollow({
                                action: "follow",
                                wm_id: e.wm_id,
                                from: 59,
                                success: function() {
                                    e && (e.$$followed = !0)
                                },
                                fail: function() {
                                    t.onGotoOtherHomepage(e)
                                }
                            }))
                    },
                    onGotoOtherHomepage: function(e) {
                        a.event({
                            action: "homepage_media",
                            follow: 0
                        }),
                            r.log({
                                region: this.region,
                                action: "click_homepage"
                            }),
                            o.gotoHomePage({
                                is_followed: 0,
                                from: 59,
                                wm_id: e.wm_id,
                                wm_name: e.wm_name,
                                avatar_url: e.avatar_url
                            })
                    },
                    onGotoMore: function() {
                        var e = this.category || "";
                        location.href = globalConfig.articlePageDomain + "/addmedia/list.html?uc_param_str=" + o.urlQuery.uc_param_str + "&type=category&category_name=" + encodeURIComponent(e) + "&uc_biz_str=S:custom|C:titlebar_fix|T:" + encodeURIComponent(e) + "|N:true"
                    },
                    getRecommendData: function() {
                        var e = this;
                        if (this.wms.length && this.wms.length > 2)
                            return this.showList = !0,
                                void this.$emit("show");
                        o.userInfo(function(t, n) {
                            n = n || {},
                                o.request({
                                    url: globalConfig.WM_SERVER_DOMAIN + "/api/v1/users/subscribers/more?",
                                    dataType: "jsonp",
                                    data: {
                                        size: 10,
                                        page: 1,
                                        category_name: e.category || "",
                                        app: o.uc_app_str(),
                                        s: n.sign || "",
                                        k: n.kps || "",
                                        v: n.vcode || "",
                                        s_wg: n.sign_wg || "",
                                        k_wg: n.kps_wg || ""
                                    }
                                }, function(t, n) {
                                    if (n && n.data && n.data.wemedias && (e.wms = n.data.wemedias.map(function(e) {
                                        return e.$$followed = !1,
                                            e
                                    }).slice(0, 5),
                                        !(e.wms.length < 3))) {
                                        var i = e.wms.filter(function(e) {
                                            return e && e._id
                                        }).map(function(t) {
                                            return e.getWmAuthorInfo(t._id)
                                        });
                                        Promise.all(i).then(function(t) {
                                            t && (e.wms = e.wms.map(function(e) {
                                                return t.forEach(function(t) {
                                                    if (t) {
                                                        var n = t.author_id;
                                                        if (e && e.wm_id === n) {
                                                            var i = (e = Object.assign({}, t, e)) && e.extra_map || {};
                                                            1 === i.vip_status && i.vip_level && (e.$$vipLevel = i.vip_level)
                                                        }
                                                    }
                                                }),
                                                    e
                                            }))
                                        }),
                                            e.showList = !0,
                                            e.$emit("show")
                                    }
                                })
                        })
                    },
                    getWmAuthorInfo: function(e) {
                        return new Promise(function(t) {
                                o.request({
                                    url: globalConfig.FASTFISH_DOMAIN + "/author/1002/" + e + "?biz_id=1002"
                                }, function(e, n) {
                                    !e && n && n.data ? t(n.data) : t(null)
                                })
                            }
                        )
                    }
                }
            })
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        });
        var i = "function" == typeof Symbol && "symbol" == typeof Symbol.iterator ? function(e) {
                return typeof e
            }
            : function(e) {
                return e && "function" == typeof Symbol && e.constructor === Symbol && e !== Symbol.prototype ? "symbol" : typeof e
            }
            , o = function() {
            return function(e, t) {
                if (Array.isArray(e))
                    return e;
                if (Symbol.iterator in Object(e))
                    return function(e, t) {
                        var n = []
                            , i = !0
                            , o = !1
                            , a = void 0;
                        try {
                            for (var r, s = e[Symbol.iterator](); !(i = (r = s.next()).done) && (n.push(r.value),
                            !t || n.length !== t); i = !0)
                                ;
                        } catch (e) {
                            o = !0,
                                a = e
                        } finally {
                            try {
                                !i && s.return && s.return()
                            } finally {
                                if (o)
                                    throw a
                            }
                        }
                        return n
                    }(e, t);
                throw new TypeError("Invalid attempt to destructure non-iterable instance")
            }
        }()
            , a = "CLK"
            , r = "EXP"
            , s = "SLD"
            , c = "OTHER"
            , d = {
            parseToQueryString: function() {
                var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {};
                return Object.keys(e).map(function(t) {
                    return t + "=" + encodeURIComponent(e[t])
                }).join("&")
            },
            getUCVersion: function() {
                var e = window.navigator && window.navigator.userAgent || ""
                    , t = /UCBrowser\/([\d|.]*)/gi.exec(e);
                return t && t[1] || "" || ""
            },
            getShouldListenVisiblityChange: function() {
                try {
                    var e = this.getUCVersion();
                    if (!e || !e.replace)
                        return !1;
                    var t = e.replace(/\./g, "")
                        , n = "12141097";
                    if (t.length < n.length) {
                        "0".repeat && (t += "0".repeat(n.length - t.length))
                    } else
                        t.length > n.length && (t = t.slice(0, n.length));
                    return Number(t) >= parseInt(n, 10)
                } catch (e) {
                    return !1
                }
            },
            getPlatformFromUA: function() {
                var e = window.navigator && window.navigator.userAgent || "";
                return /(Android|Adr)/i.test(e) ? "android" : /(iPhone|iPad|iPod|iOS)/i.test(e) ? "iphone" : ""
            }
        };
        t.default = {
            _loadAplusPromiseInstance: null,
            _checkSum: "",
            _defaultGoKey: {
                _g_encode: "utf"
            },
            _debug: !1,
            _defaultLogKey: "",
            init: function(e) {
                var t = this
                    , n = e.exparams
                    , i = void 0 === n ? {} : n
                    , a = e.frontPlugins
                    , r = e.checkSum
                    , s = void 0 === r ? "" : r
                    , c = e.pageName
                    , l = void 0 === c ? "" : c
                    , u = e.debug
                    , f = void 0 !== u && u
                    , p = e.logKey
                    , m = void 0 === p ? "" : p
                    , h = e.paramsToClient
                    , v = void 0 === h ? {} : h;
                return this._checkSum = s,
                    this._defaultLogKey = m,
                    this._debug = f,
                    this._defaultGoKey = Object.assign({
                        page_h5: l
                    }, this._defaultGoKey, i),
                this._loadAplusPromiseInstance || (this._loadAplusPromiseInstance = new Promise(function(e) {
                        var n = {
                            enter_op: 0,
                            enter_tm: 0
                        }
                            , i = t.getPageSpmInfo()
                            , r = o(i, 2)
                            , s = r[0]
                            , c = void 0 === s ? "" : s
                            , u = r[1]
                            , f = void 0 === u ? "" : u;
                        t.getUtParams({
                            pageName: l,
                            pageType: t._defaultGoKey.page_type,
                            spma: c,
                            spmb: f,
                            paramsToClient: v
                        }).then(function(e) {
                            return p(e)
                        }).catch(function() {
                            return p({})
                        });
                        var p = function() {
                            var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {}
                                , i = Object.assign({}, n, e);
                            t._defaultGoKey = Object.assign({}, t._defaultGoKey, i),
                                t._defaultGoKey.uc_param_str ? t.getUCCommonParams(t._defaultGoKey.uc_param_str).then(function(e) {
                                    t._defaultGoKey = Object.assign({}, t._defaultGoKey, e || {}),
                                        m()
                                }) : m()
                        }
                            , m = function() {
                            var n = document.createElement("script");
                            n.setAttribute("exparams", d.parseToQueryString(t._defaultGoKey)),
                            a && n.setAttribute("frontPlugins", a),
                                n.id = "tb-beacon-aplus",
                                n.src = "https://g.alicdn.com/alilog/mlog/aplus_wap.js",
                                n.onload = function() {
                                    e(),
                                    d.getShouldListenVisiblityChange() && t.listenVisibilitychange(function(e) {
                                        e || t.logPvManually()
                                    })
                                }
                                ,
                                t.setNextPageSpmUrl().catch(function() {}),
                                document.body.insertBefore(n, document.body.firstChild)
                        }
                    }
                )),
                    this._loadAplusPromiseInstance
            },
            setExParams: function() {
                var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {};
                this._defaultGoKey = Object.assign({}, this._defaultGoKey, e)
            },
            getPageSpmInfo: function() {
                var e = document.querySelector('meta[name="spm-id"]') || document.querySelector('meta[name="data-spm"]');
                return [e && e.getAttribute("content") || "", document.body.getAttribute("data-spm") || ""].filter(function(e) {
                    return !!e
                })
            },
            click: function(e, t) {
                this.sendLog(e, a, t)
            },
            slide: function(e, t) {
                this.sendLog(e, s, t)
            },
            expose: function(e, t) {
                this.sendLog(e, r, t)
            },
            other: function(e, t) {
                this.sendLog(e, c, t)
            },
            sendLog: function(e) {
                var t = this
                    , n = arguments.length > 1 && void 0 !== arguments[1] ? arguments[1] : a
                    , i = arguments.length > 2 && void 0 !== arguments[2] ? arguments[2] : {}
                    , o = function() {
                    var o = t._checkSum
                        , a = Object.assign({
                        arg1_h5: e
                    }, t._defaultGoKey, i)
                        , r = t.getPageSpmInfo();
                    a.spm && (a.spm = r.join(".") + "." + a.spm);
                    var s = d.parseToQueryString(a);
                    window.goldlog && window.goldlog.record(t._defaultLogKey + "." + e, n, s, o)
                };
                !function e() {
                    window.goldlog ? o() : t._loadAplusPromiseInstance ? t._loadAplusPromiseInstance.then(function() {
                        o()
                    }) : setTimeout(function() {
                        e()
                    }, 300)
                }()
            },
            checkGoKey: function() {
                var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {};
                this._debug && Object.keys(e).forEach(function(t) {
                    var n = e[t];
                    if ("object" === (void 0 === n ? "undefined" : i(n)) && console.warn("gokey value 不接受 object 对象"),
                    "string" == typeof n) {
                        var o = null;
                        try {
                            o = JSON.parse(e)
                        } catch (e) {
                            console.log(e)
                        }
                        o && "object" === (void 0 === n ? "undefined" : i(n)) && console.warn("gokey value 不接受 stringify 对象")
                    }
                })
            },
            getUtParams: function(e) {
                var t = e.pageName
                    , n = e.pageType
                    , i = e.spma
                    , o = e.spmb
                    , a = e.paramsToClient
                    , r = void 0 === a ? {} : a;
                return new Promise(function(e, a) {
                        var s = window.ucapi;
                        s && s.infoflow && s.infoflow.exchangeUtStatInfos ? s.infoflow.exchangeUtStatInfos({
                            data: {
                                page: {
                                    page_name: t,
                                    spma: i,
                                    spmb: o
                                },
                                custom: Object.assign({
                                    page_type: n
                                }, r)
                            },
                            success: function(t) {
                                e(Object.assign({}, t.data))
                            },
                            fail: function() {
                                a(new Error("ucapi.infoflow.exchangeUtStatInfos invoke error"))
                            }
                        }) : a(new Error("no ucapi.infoflow.exchangeUtStatInfos"))
                    }
                )
            },
            getUCCommonParams: function(e) {
                return new Promise(function(t) {
                        if (e) {
                            var n = {
                                fr: d.getPlatformFromUA()
                            };
                            [].slice.call(e).forEach(function(t, i) {
                                if (i % 2 == 1) {
                                    var o = "" + e[i - 1] + e[i];
                                    o && (n[o] = n[o] || -1)
                                }
                            });
                            var i = window.ucapi;
                            i && i.biz && i.biz.ucparams ? i.biz.ucparams({
                                params: e,
                                success: function(e) {
                                    t(Object.assign({}, n, e))
                                },
                                fail: function() {
                                    t(n)
                                }
                            }) : t(n)
                        } else
                            t({})
                    }
                )
            },
            listenVisibilitychange: function(e) {
                var t = {
                    webkit: {
                        eventName: "webkitvisibilitychange",
                        getIsHidden: function() {
                            return document.webkitHidden
                        }
                    },
                    other: {
                        eventName: "visibilitychange",
                        getIsHidden: function() {
                            return document.hidden
                        }
                    }
                }
                    , n = t.other;
                void 0 !== t.webkit.getIsHidden() && (n = t.webkit),
                    document.addEventListener(n.eventName, function() {
                        e && e(n.getIsHidden())
                    })
            },
            logPvManually: function() {
                var e = Object.assign({
                    _skippage: "0"
                }, this._defaultGoKey);
                (window.goldlog_queue || (window.goldlog_queue = [])).push({
                    action: "goldlog.sendPV",
                    arguments: [{
                        is_auto: !1
                    }, e]
                })
            },
            setNextPageSpmUrl: function() {
                var e = this;
                return new Promise(function(t, n) {
                        var i = window.ucapi;
                        if (i && i.ut && i.ut.addNextPageProperties) {
                            var a = e.getPageSpmInfo()
                                , r = o(a, 2)
                                , s = r[0]
                                , c = void 0 === s ? "" : s
                                , d = r[1]
                                , l = void 0 === d ? "" : d;
                            i.ut.addNextPageProperties({
                                "spm-url": c + "." + l + ".0.0",
                                success: function(e) {
                                    t(e)
                                },
                                fail: function(e) {
                                    n(e)
                                }
                            })
                        } else
                            n(new Error("no ucapi.ut.addNextPageProperties"))
                    }
                )
            }
        }
    }
    , function(e, t) {
        var n = {
            utf8: {
                stringToBytes: function(e) {
                    return n.bin.stringToBytes(unescape(encodeURIComponent(e)))
                },
                bytesToString: function(e) {
                    return decodeURIComponent(escape(n.bin.bytesToString(e)))
                }
            },
            bin: {
                stringToBytes: function(e) {
                    for (var t = [], n = 0; n < e.length; n++)
                        t.push(255 & e.charCodeAt(n));
                    return t
                },
                bytesToString: function(e) {
                    for (var t = [], n = 0; n < e.length; n++)
                        t.push(String.fromCharCode(e[n]));
                    return t.join("")
                }
            }
        };
        e.exports = n
    }
    , function(e, t, n) {
        !function() {
            var t = n(136)
                , i = n(42).utf8
                , o = n(135)
                , a = n(42).bin
                , r = function(e, n) {
                e.constructor == String ? e = n && "binary" === n.encoding ? a.stringToBytes(e) : i.stringToBytes(e) : o(e) ? e = Array.prototype.slice.call(e, 0) : Array.isArray(e) || (e = e.toString());
                for (var s = t.bytesToWords(e), c = 8 * e.length, d = 1732584193, l = -271733879, u = -1732584194, f = 271733878, p = 0; p < s.length; p++)
                    s[p] = 16711935 & (s[p] << 8 | s[p] >>> 24) | 4278255360 & (s[p] << 24 | s[p] >>> 8);
                s[c >>> 5] |= 128 << c % 32,
                    s[14 + (c + 64 >>> 9 << 4)] = c;
                var m = r._ff
                    , h = r._gg
                    , v = r._hh
                    , g = r._ii;
                for (p = 0; p < s.length; p += 16) {
                    var _ = d
                        , w = l
                        , b = u
                        , y = f;
                    l = g(l = g(l = g(l = g(l = v(l = v(l = v(l = v(l = h(l = h(l = h(l = h(l = m(l = m(l = m(l = m(l, u = m(u, f = m(f, d = m(d, l, u, f, s[p + 0], 7, -680876936), l, u, s[p + 1], 12, -389564586), d, l, s[p + 2], 17, 606105819), f, d, s[p + 3], 22, -1044525330), u = m(u, f = m(f, d = m(d, l, u, f, s[p + 4], 7, -176418897), l, u, s[p + 5], 12, 1200080426), d, l, s[p + 6], 17, -1473231341), f, d, s[p + 7], 22, -45705983), u = m(u, f = m(f, d = m(d, l, u, f, s[p + 8], 7, 1770035416), l, u, s[p + 9], 12, -1958414417), d, l, s[p + 10], 17, -42063), f, d, s[p + 11], 22, -1990404162), u = m(u, f = m(f, d = m(d, l, u, f, s[p + 12], 7, 1804603682), l, u, s[p + 13], 12, -40341101), d, l, s[p + 14], 17, -1502002290), f, d, s[p + 15], 22, 1236535329), u = h(u, f = h(f, d = h(d, l, u, f, s[p + 1], 5, -165796510), l, u, s[p + 6], 9, -1069501632), d, l, s[p + 11], 14, 643717713), f, d, s[p + 0], 20, -373897302), u = h(u, f = h(f, d = h(d, l, u, f, s[p + 5], 5, -701558691), l, u, s[p + 10], 9, 38016083), d, l, s[p + 15], 14, -660478335), f, d, s[p + 4], 20, -405537848), u = h(u, f = h(f, d = h(d, l, u, f, s[p + 9], 5, 568446438), l, u, s[p + 14], 9, -1019803690), d, l, s[p + 3], 14, -187363961), f, d, s[p + 8], 20, 1163531501), u = h(u, f = h(f, d = h(d, l, u, f, s[p + 13], 5, -1444681467), l, u, s[p + 2], 9, -51403784), d, l, s[p + 7], 14, 1735328473), f, d, s[p + 12], 20, -1926607734), u = v(u, f = v(f, d = v(d, l, u, f, s[p + 5], 4, -378558), l, u, s[p + 8], 11, -2022574463), d, l, s[p + 11], 16, 1839030562), f, d, s[p + 14], 23, -35309556), u = v(u, f = v(f, d = v(d, l, u, f, s[p + 1], 4, -1530992060), l, u, s[p + 4], 11, 1272893353), d, l, s[p + 7], 16, -155497632), f, d, s[p + 10], 23, -1094730640), u = v(u, f = v(f, d = v(d, l, u, f, s[p + 13], 4, 681279174), l, u, s[p + 0], 11, -358537222), d, l, s[p + 3], 16, -722521979), f, d, s[p + 6], 23, 76029189), u = v(u, f = v(f, d = v(d, l, u, f, s[p + 9], 4, -640364487), l, u, s[p + 12], 11, -421815835), d, l, s[p + 15], 16, 530742520), f, d, s[p + 2], 23, -995338651), u = g(u, f = g(f, d = g(d, l, u, f, s[p + 0], 6, -198630844), l, u, s[p + 7], 10, 1126891415), d, l, s[p + 14], 15, -1416354905), f, d, s[p + 5], 21, -57434055), u = g(u, f = g(f, d = g(d, l, u, f, s[p + 12], 6, 1700485571), l, u, s[p + 3], 10, -1894986606), d, l, s[p + 10], 15, -1051523), f, d, s[p + 1], 21, -2054922799), u = g(u, f = g(f, d = g(d, l, u, f, s[p + 8], 6, 1873313359), l, u, s[p + 15], 10, -30611744), d, l, s[p + 6], 15, -1560198380), f, d, s[p + 13], 21, 1309151649), u = g(u, f = g(f, d = g(d, l, u, f, s[p + 4], 6, -145523070), l, u, s[p + 11], 10, -1120210379), d, l, s[p + 2], 15, 718787259), f, d, s[p + 9], 21, -343485551),
                        d = d + _ >>> 0,
                        l = l + w >>> 0,
                        u = u + b >>> 0,
                        f = f + y >>> 0
                }
                return t.endian([d, l, u, f])
            };
            r._ff = function(e, t, n, i, o, a, r) {
                var s = e + (t & n | ~t & i) + (o >>> 0) + r;
                return (s << a | s >>> 32 - a) + t
            }
                ,
                r._gg = function(e, t, n, i, o, a, r) {
                    var s = e + (t & i | n & ~i) + (o >>> 0) + r;
                    return (s << a | s >>> 32 - a) + t
                }
                ,
                r._hh = function(e, t, n, i, o, a, r) {
                    var s = e + (t ^ n ^ i) + (o >>> 0) + r;
                    return (s << a | s >>> 32 - a) + t
                }
                ,
                r._ii = function(e, t, n, i, o, a, r) {
                    var s = e + (n ^ (t | ~i)) + (o >>> 0) + r;
                    return (s << a | s >>> 32 - a) + t
                }
                ,
                r._blocksize = 16,
                r._digestsize = 16,
                e.exports = function(e, n) {
                    if (void 0 !== e) {
                        var i = t.wordsToBytes(r(e, n));
                        return n && n.asBytes ? i : n && n.asString ? a.bytesToString(i) : t.bytesToHex(i)
                    }
                }
        }()
    }
    , function(e, t) {
        function n(e) {
            var t, n = !1;
            !function(e) {
                e.method = e.method || "GET",
                "POST" === e.method && (e.headers = e.headers || {},
                    e.headers["Content-Type"] = e.headers["Content-Type"] || e.headers["Content-type"] || "application/x-www-form-urlencoded");
                e.timeout = e.timeout || 5e3
            }(e);
            var o = new XMLHttpRequest;
            if (o.onreadystatechange = function() {
                n || 4 !== o.readyState || (t && clearTimeout(t),
                    o.status >= 200 && o.status < 300 || 304 === o.status ? e.success && e.success(function(e) {
                        var t = e;
                        try {
                            t = JSON.parse(e)
                        } catch (e) {
                            console.error(e)
                        }
                        return t
                    }(o.responseText), o) : e.error && e.error(new Error("请求失败:" + o.status), o))
            }
                ,
                o.open(e.method, e.url, !0),
                e.headers)
                for (var a in e.headers)
                    o.setRequestHeader(a, e.headers[a]);
            o.send(i(e.data)),
                t = setTimeout(function() {
                    return n = !0,
                        o.abort(),
                    "function" == typeof e.error && e.error(new Error("请求超时!"), o),
                        !1
                }, e.timeout)
        }
        function i(e) {
            var t = [];
            if ("string" == typeof e)
                return e;
            for (var n in e)
                e.hasOwnProperty(n) && t.push(encodeURIComponent(n) + "=" + encodeURIComponent(e[n]));
            return t.join("&")
        }
        e.exports = {
            get: function(e, t, i, o) {
                "function" == typeof t && (i = t,
                    t = {}),
                    n({
                        url: e,
                        data: t,
                        success: i,
                        error: o,
                        method: "GET"
                    })
            },
            post: function(e, t, i, o) {
                "function" == typeof t && (i = t,
                    t = {}),
                    n({
                        url: e,
                        data: t,
                        success: i,
                        error: o,
                        method: "POST"
                    })
            },
            ajax: n,
            toQueryString: i
        }
    }
    , function(e, t, n) {
        "use strict";
        var i = n(148);
        window.UTPJSSDK = i,
            e.exports = window.UTPJSSDK
    }
    , function(e, t, n) {
        e.exports = n(150)
    }
    , function(e, t, n) {
        "use strict";
        var i = this;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.off = t.on = void 0;
        var o = n(25);
        t.on = function(e, t) {
            o.requireModule("globalEvent").addEventListener(e, function(e) {
                var n = {
                    preventDefault: function() {
                        throw new Error("does not support preventDefault")
                    },
                    detail: e
                };
                t.call(i, n)
            })
        }
            ,
            t.off = function(e, t) {
                o.requireModule("globalEvent").removeEventListener(e, t)
            }
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.off = t.on = void 0;
        var i = ["resume", "pause", "online", "offline", "backbutton", "goBack", "pullToRefresh", "message", "recycle", "restore", "drawer", "tab", "navHelpIcon", "navRightButton", "navMenu", "navTitle", "appLinkResponse", "internalPageLinkResponse", "networkEvent", "hostTaskEvent", "deviceOrientationChanged", "autoCheckIn", "deviceFound", "hostCheckIn", "screenshot", "becomeActive", "keepAlive", "navTitleClick", "sharePage", "wxNotify", "editNoteCommand", "updateStyle", "qrscanCommonNotify", "__message__", "dtChannelEvent", "livePlayerEventPlay", "livePlayerEventPause", "livePlayerEventEnded", "livePlayerEventError", "navActions", "attendEvents"]
            , o = "undefined" == typeof WeakMap ? void 0 : new WeakMap;
        t.on = function(e, t) {
            if (-1 !== i.indexOf(e))
                document.addEventListener(e, t);
            else {
                var n = function(e, t) {
                    if (o) {
                        var n = o.get(t);
                        return void 0 === n ? ((n = function(e) {
                                var i = e.detail;
                                if (i.namespace && i.eventName) {
                                    var o = i.namespace + "." + i.eventName;
                                    n && -1 !== n.__eventTypeList__.indexOf(o) && t(i.data)
                                }
                            }
                        ).__eventTypeList__ = [e],
                            o.set(t, n)) : -1 === n.__eventTypeList__.indexOf(e) && n.__eventTypeList__.push(e),
                            n
                    }
                }(e, t);
                n ? document.addEventListener("dtBizBridgeEvent", n) : console.log("bind event : " + e + " need WeakMap support , current environment doesnot")
            }
        }
            ,
            t.off = function(e, t) {
                if (-1 !== i.indexOf(e))
                    document.removeEventListener(e, t);
                else {
                    var n = function(e, t) {
                        if (o) {
                            var n = o.get(t);
                            return n && -1 !== n.__eventTypeList__.indexOf(e) && n.__eventTypeList__.splice(n.__eventTypeList__.indexOf(e), 1),
                                n && n.__eventTypeList__.length <= 1 ? n : void 0
                        }
                    }(e, t);
                    n && document.removeEventListener("dtBizBridgeEvent", n)
                }
            }
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        });
        var i = function() {};
        t.default = function(e, t) {
            return new Promise(function(n, o) {
                    var a = t.onSuccess || i
                        , r = t.onFail || i;
                    if (delete t.onSuccess,
                        delete t.onFail,
                        AlipayJSBridge) {
                        var s = e.split(".")
                            , c = s.pop() || ""
                            , d = s.join(".");
                        AlipayJSBridge.call.apply(null, ["webDdExec", {
                            serviceName: d,
                            actionName: c,
                            args: t
                        }, function(e) {
                            var t = {}
                                , i = e.content;
                            if (i)
                                try {
                                    t = JSON.parse(i)
                                } catch (e) {
                                    console.error("parse dt api result error", i, e)
                                }
                            e.success ? (a.apply(null, [t]),
                                n(t)) : (r.apply(null, [t]),
                                o(t))
                        }
                        ])
                    } else {
                        var l = new Error("Fatal error, cannot find bridge ,current env is WebView in MiniApp");
                        r(l),
                            o(l)
                    }
                }
            )
        }
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.FRAMEWORK = t.PLATFORM = t.RUNTIME = void 0,
            t.RUNTIME = {
                WEB: "Web",
                WEEX: "Weex",
                UNKNOWN: "Unknown"
            },
            t.PLATFORM = {
                MAC: "Mac",
                WINDOWS: "Windows",
                IOS: "iOS",
                ANDROID: "Android",
                IPAD: "iPad",
                BROWSER: "Browser",
                UNKNOWN: "Unknown"
            },
            t.FRAMEWORK = {
                VUE: "Vue",
                RAX: "Rax",
                UNKNOWN: "Unknown"
            }
    }
    , function(e, t, n) {
        "use strict";
        var i = n(354)
            , o = n(330)
            , a = Object.assign(i, o.apiObj);
        e.exports = a
    }
    , function(e, t, n) {
        "use strict";
        e.exports = function() {
            try {
                ucapi.biz.ucparams({
                    params: "sv",
                    success: function(e) {
                        var t = e && e.sv
                            , n = (window.globalConfig || {}).cacheSubVersions || [];
                        t && n.indexOf(t) > -1 && (document.cookie = "sv=" + t)
                    }
                })
            } catch (e) {}
        }
    }
    , function(e, t, n) {
        "use strict";
        var i = n(5)
            , o = n(1);
        e.exports = function() {
            try {
                var e = function(e) {
                    var n = e.albums
                        , o = function(e) {
                        var o = new Image
                            , a = n[e].emoji_compose_image + "?force-show=1"
                            , r = 0;
                        a = t(a),
                            o.src = a,
                            o.onload = function() {}
                            ,
                            o.onerror = function() {
                                console.log("preload Emoji " + e + " fail!!!!!"),
                                    i.log({
                                        label: e,
                                        page_url: window.location.href,
                                        region: "preload_emoji",
                                        action: "load_fail"
                                    }),
                                r < 3 && (r += 1,
                                    o.src = a)
                            }
                    };
                    for (var a in n)
                        o(a)
                }
                    , t = function(e) {
                    return e ? e.replace(/http[s]?\:\/\//i, "//") : ""
                }
                    , n = window
                    , a = n.localStorage.getItem("commentEmojiData");
                if (a && function(e) {
                    var t, n = new RegExp("(^| )" + e + "=([^;]*)(;|$)");
                    return (t = document.cookie.match(n)) ? unescape(t[2]) : null
                }("hasLoadCommentEmojiData"))
                    a && (console.log("preload cache data emoji pic"),
                        e(JSON.parse(a)));
                else {
                    console.log("preload new emoji pic data");
                    var r = (new Date).getTime()
                        , s = window.__SDKLIB__.md5 && window.__SDKLIB__.md5("appcode=uc-iflow-cmt-h5-2&timestamp=" + r + "363a01501e7141b9b424429d1fe8b2a1");
                    o.request({
                        url: "//emoji.uc.cn/api/v2/web/datas?appcode=uc-iflow-cmt-h5-2&sign=" + s + "&timestamp=" + r,
                        dataType: "jsonp"
                    }, function(t, i) {
                        200 == i.rescode && (!function(e, t) {
                            var n = arguments.length > 2 && void 0 !== arguments[2] ? arguments[2] : 30
                                , i = new Date;
                            i.setTime(i.getTime() + 24 * n * 60 * 60 * 1e3),
                                document.cookie = e + "=" + escape(t) + ";expires=" + i.toGMTString()
                        }("hasLoadCommentEmojiData", 1, .5),
                            n.localStorage.setItem("commentEmojiData", JSON.stringify(i)),
                            e(i))
                    })
                }
                window.__hasloademoji__ = !0
            } catch (e) {
                i.log({
                    label: e.message || "",
                    page_url: window.location.href,
                    region: "page_js_error",
                    action: "preload_emoji"
                })
            }
        }
    }
    , function(e, t, n) {
        "use strict";
        var i = n(5)
            , o = n(1)
            , a = 2 === o.getIsReflowStyle() ? "channel_bottom_close" : "push_bottom_close";
        e.exports = {
            initFooter: function() {
                var e = this;
                $(document).on("relate:init", function() {
                    e.init()
                }),
                    o.onImpress(".push-footer", "100%", function() {
                        i.log({
                            region: a,
                            action: "show"
                        })
                    })
            },
            init: function() {
                $(".push-footer").show();
                var e = 0
                    , t = 0
                    , n = 0
                    , o = 0
                    , r = !1;
                function s() {
                    r || (r = !0,
                        i.log({
                            region: a,
                            action: "close"
                        }),
                        setTimeout(function() {
                            window.location.href = "ext:back"
                        }, 200))
                }
                $("body").on("touchstart", function(e) {
                    n = 0,
                        o = 0
                }),
                    document.body.addEventListener("touchmove", function(i) {
                        if ($(window).height() + $(window).scrollTop() !== $("body").height() || e || (e = i && i.touches && i.touches[0] && i.touches[0].clientY),
                            e) {
                            var a = i && i.touches && i.touches[0] && i.touches[0].clientY;
                            n = a - e;
                            var r = a - t;
                            if (t = a,
                            r > 0 || n > 0)
                                return;
                            (o = -50 * function(e) {
                                return e * (2 - e)
                            }(Math.abs(n) / 500)) < -20 && s(),
                            o <= -50 && (o = -50),
                                $("body").css({
                                    transition: "none",
                                    transform: "translateY(" + o + "px)"
                                })
                        }
                    }),
                    $("body").on("touchend", function(t) {
                        e = 0,
                            $("body").css({
                                transition: ".3s",
                                transform: "none"
                            }),
                        o < -20 && s(),
                            n = 0,
                            o = 0
                    })
            }
        }
    }
    , function(e, t, n) {
        e.exports = n.p + "components/pages/article/wiki/cover_0d21f.jpg"
    }
    , function(e, t, n) {
        e.exports = n.p + "components/pages/article/wiki/quote_75231.png"
    }
    , function(e, t, n) {
        var i = n(9);
        (e.exports = n(7)(!1)).push([e.i, ".container{margin:15px}.title{font-weight:700;font-size:17px;color:#333;letter-spacing:1px;margin-bottom:10px}.card{position:relative;display:flex;flex-direction:row;align-content:center;background:#fff;box-shadow:0 8px 40px 0 rgba(0,0,0,.1);padding:10px}.card,.img{border-radius:4px}.img{width:60px;height:60px;margin-right:17px}.info{padding:5px 0;flex:1;overflow:hidden}.info p{margin:0}.info .name{line-height:30px;height:30px;font-size:18px;color:#333;letter-spacing:1px;font-weight:700;margin-right:21px}.info .desc,.info .name{overflow:hidden;text-overflow:ellipsis;white-space:nowrap}.info .desc{line-height:20px;height:20px;font-size:12px;color:#bbb;letter-spacing:.67px}.quote{position:absolute;width:24px;height:24px;right:10px;top:10px;background-image:url(" + i(n(56)) + ");background-size:cover;background-position:50%;background-repeat:no-repeat}", ""])
    }
    , function(e, t, n) {
        var i = n(57);
        "string" == typeof i && (i = [[e.i, i, ""]]);
        var o = {
            hmr: !0,
            transform: void 0,
            insertInto: void 0
        };
        n(6)(i, o);
        i.locals && (e.exports = i.locals)
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            n(58);
        var i = n(55);
        t.default = {
            init: function() {
                var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {}
                    , t = e.data
                    , n = void 0 === t ? {} : t
                    , o = e.container
                    , a = n && n.view_extension_obj || {};
                o && a && a.wikiname && (a.wikiicon = a.wikiicon || i,
                    a.wikiurl = a.wikiurl || "https://so.m.sm.cn/s?q=" + encodeURIComponent(a.wikiname) + "&uc_param_str=dnntnwvepffrgibijbprsvdsei&from=wh30040&uc_biz_str=S:custom|C:iflow_ad",
                    this.container = o,
                    o.innerHTML = this.render(a),
                    this.bindEvents(a))
            },
            render: function(e) {
                return '\n      <div class="container">\n        <p class="title">延伸阅读</p>\n        <div class="card">\n          <i class="quote"></i>\n          <img uc-image-reader_state="disabled" class="img" src="' + e.wikiicon + '" />\n          <div class="info">\n            <p class="name">' + e.wikiname + '</p>\n            <p class="desc">' + e.wikidesc + "</p>\n          </div>\n        </div>\n      </div>\n    "
            },
            bindEvents: function(e) {
                var t = this.container.querySelector(".card");
                t && (t.addEventListener("click", function() {
                    var t = window.uc_logger && window.uc_logger.utLogger;
                    t && t.click("wiki_click", {
                        spm: "wiki.wiki",
                        wikiname: e.wikiname
                    }),
                        setTimeout(function() {
                            window.location.href = e.wikiurl
                        }, 200)
                }),
                window.exposeChecker && window.exposeChecker.listen(t).then(function() {
                    var t = window.uc_logger && window.uc_logger.utLogger;
                    t && t.expose("wiki_show", {
                        spm: "wiki.wiki",
                        wikiname: e.wikiname
                    })
                }))
            }
        }
    }
    , function(e, t, n) {
        e.exports = n.p + "components/pages/article/eventTimelineEntry/history_d7272.png"
    }
    , function(e, t, n) {
        var i = n(9);
        (e.exports = n(7)(!1)).push([e.i, ".et-container{position:fixed;right:0;bottom:30px;width:108px;height:32px;line-height:32px;display:flex;align-items:center;color:#fff;border-top-left-radius:16px;border-bottom-left-radius:16px;background-image:linear-gradient(270deg,#26b4ff 0,#2696ff);box-shadow:0 2px 14px 0 rgba(0,0,0,.3);z-index:9999}.et-icon{width:18px;height:16px;background-image:url(" + i(n(60)) + ");background-repeat:no-repeat;background-position:50%;background-size:cover;margin-left:10px;margin-right:6px}.et-text{font-weight:700;font-size:15px}", ""])
    }
    , function(e, t, n) {
        var i = n(61);
        "string" == typeof i && (i = [[e.i, i, ""]]);
        var o = {
            hmr: !0,
            transform: void 0,
            insertInto: void 0
        };
        n(6)(i, o);
        i.locals && (e.exports = i.locals)
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        });
        var i = a(n(41))
            , o = a(n(8));
        function a(e) {
            return e && e.__esModule ? e : {
                default: e
            }
        }
        n(62),
            t.default = {
                init: function() {
                    var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {}
                        , t = e.id
                        , n = void 0 === t ? "" : t
                        , i = e.title
                        , o = void 0 === i ? "" : i
                        , a = e.fromArticle
                        , r = void 0 === a ? {} : a
                        , s = e.urlQuery
                        , c = void 0 === s ? {} : s;
                    if (n) {
                        var d = document.createElement("div");
                        document.body.appendChild(d),
                            this.container = d,
                            this.data = {
                                id: n,
                                title: o
                            },
                            this.fromArticle = r,
                            this.urlQuery = c,
                            d.innerHTML = this.render(),
                            this.bindEvent()
                    }
                },
                render: function() {
                    var e = this.data.title;
                    return '\n      <div class="et-container">\n        <i class="et-icon"></i>\n        <span class="et-text">' + (void 0 === e ? "" : e).slice(0, 4) + "</span>\n      </div>\n    "
                },
                bindEvent: function() {
                    var e = this
                        , t = this.container.querySelector(".et-container");
                    if (t) {
                        var n = this.data
                            , a = n.id
                            , r = n.title
                            , s = this.urlQuery
                            , c = this.fromArticle;
                        o.default.listen(t).then(function() {
                            i.default.expose("entrance", {
                                spm: "timeline.entrance",
                                axis_id: a,
                                axis_title: r
                            })
                        }),
                            t.addEventListener("click", function() {
                                var t = {
                                    aid: a,
                                    app: "uc-iflow",
                                    uc_biz_str: "S:custom|C:full_screen",
                                    recoid: s.recoid || "",
                                    cid: s.cid || "100",
                                    from_id: c.id,
                                    axis_title: r
                                };
                                i.default.click("entrance", {
                                    spm: "timeline.entrance",
                                    axis_id: a,
                                    axis_title: r
                                });
                                var n = window.location
                                    , o = Object.keys(t).map(function(e) {
                                    return e + "=" + encodeURIComponent(t[e])
                                }).join("&")
                                    , d = globalConfig.IFLOWDOMAIN + "/webview/event-timeline" + "?" + o;
                                e.openPopWindow(d, r).catch(function() {
                                    n.href = d
                                })
                            })
                    }
                },
                openPopWindow: function(e, t) {
                    return new Promise(function(n, i) {
                            window.ucapi && window.ucapi.infoflow && window.ucapi.infoflow.openPopWindow ? window.ucapi.infoflow.openPopWindow({
                                data: {
                                    title: t,
                                    url: e,
                                    windowType: 0
                                },
                                success: n,
                                fail: function() {
                                    i()
                                }
                            }) : i(new Error("ucapi fail"))
                        }
                    )
                }
            }
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.default = function() {
                if (window.navigator && window.navigator.serviceWorker)
                    try {
                        navigator.serviceWorker.getRegistration && navigator.serviceWorker.getRegistration(window.location.href).then(function(e) {
                            e && e.unregister && e.unregister()
                        })
                    } catch (e) {}
            }
    }
    , function(e, t, n) {
        "use strict";
        var i = function(e) {
            return e && e.__esModule ? e : {
                default: e
            }
        }(n(17));
        var o = n(1)
            , a = "tool-bar-sdk"
            , r = {
            default: "wm",
            new: "wm.v3",
            video: "wm.video"
        };
        e.exports = function() {
            var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {};
            if (!o.is_share_mode && !(o.platform.isQuark || o.platform.isUCNews || o.platform.isDingTalk)) {
                var t = r.default;
                (o.platform.isUCBrowser || e.isPreview) && (t = "video" === e.page ? r.video : r.new);
                var n = {
                    pkgName: a + "." + t
                };
                (0,
                    i.default)(n).then(function() {
                    window.__ToolBarSdk__ && new (0,
                        window.__ToolBarSdk__)(e).init()
                }).catch(function(e) {
                    console.log(e)
                })
            }
        }
    }
    , function(e, t, n) {
        "use strict";
        var i = function(e) {
            return e && e.__esModule ? e : {
                default: e
            }
        }(n(17));
        var o = n(1);
        e.exports = function() {
            var e = (window.__SDKLIB__ || {}).envi
                , t = o.getPushStyle()
                , n = o.getIsReflowStyle();
            if (n && (t = 4),
            e.browser.uc && t) {
                var a = {
                    1: "v1",
                    3: "v3",
                    4: "v4"
                }[t];
                a && (0,
                    i.default)({
                    pkgName: "article-push-sdk",
                    subPkgName: a,
                    napiv2: !0
                }).then(function() {
                    window.getXissData && window.getXissData.then(function(e) {
                        var t = {
                            category: e.category,
                            el: "#article-push-sdk-p1"
                        };
                        n && (t.container = ".relatebox",
                                t.callback = function() {
                                    $(".relatebox").css({
                                        borderTop: "3px solid #eee"
                                    }),
                                        $(document).trigger("relate:init")
                                }
                        );
                        var i = window.UC_PUSH_SDK;
                        i && new i(t)
                    })
                }).catch(function() {})
            }
        }
    }
    , function(e, t, n) {
        "use strict";
        var i = "function" == typeof Symbol && "symbol" == typeof Symbol.iterator ? function(e) {
                return typeof e
            }
            : function(e) {
                return e && "function" == typeof Symbol && e.constructor === Symbol && e !== Symbol.prototype ? "symbol" : typeof e
            }
            , o = {
            init: function(e) {
                try {
                    (void 0 == e.openTest || e.openTest) && window.ucweb && window.ucweb.window && window.ucweb.window.addEventListener("BacktracePaintReady", function() {
                        var t = window.ucweb.window.performance
                            , n = {
                            lt: e.lt || "page-performance",
                            appid: e.appid || "27106a4ec356",
                            testpage: e.testpage || "xiss",
                            protocol: window.location.protocol,
                            request: t.t0,
                            main_doc: t.t1,
                            first_screen: t.t2,
                            loading_completed: t.t3,
                            uc_param_str: "dnnivebichfrmintnwcpgieiwidsudpf"
                        }
                            , i = "//track.uc.cn/collect?" + o.getParmas(n, null, !1).replace("&", "");
                        navigator.sendBeacon(i, "")
                    }, !1)
                } catch (e) {}
            },
            getParmas: function(e, t, n) {
                if (null == e)
                    return "";
                var a = ""
                    , r = void 0 === e ? "undefined" : i(e);
                if ("string" == r || "number" == r || "boolean" == r)
                    a += "&" + t + "=" + (null == n || n ? encodeURIComponent(e) : e);
                else
                    for (var s in e) {
                        var c = null == t ? s : t + (e instanceof Array ? "[" + s + "]" : "." + s);
                        a += o.getParmas(e[s], c, n)
                    }
                return a
            }
        };
        e.exports = o
    }
    , function(e, t, n) {
        "use strict";
        var i = {
            init: function(e, t) {
                this.$aritcle = $(e),
                    this.articleHeight = this.$aritcle.height(),
                    this.id = t,
                    this.statTime = Date.now(),
                    this.timeLastUp = 0,
                    this.sectionFirePointArray = [],
                    this.touchSectionArray = [],
                    this.sumTime = 0,
                    this.firePoint = window.innerHeight,
                    this.screenHeight = window.innerHeight,
                    this.isEnd = !1,
                    this.scrollEvent(),
                    this.scrollToEnd()
            },
            scrollEvent: function() {
                for (var e, t, n = this, i = 0, o = 0, a = 0, r = 0, s = 0, c = 300, d = 2e4, l = Math.floor((n.articleHeight - n.screenHeight) / c), u = 0; u < l; u++)
                    n.sectionFirePointArray.push(n.screenHeight + c * (u + 1));
                function f(e) {
                    var t = e.targetTouches && e.targetTouches[0] ? e : null
                        , n = e.originalEvent || t
                        , o = n && n.targetTouches && n.targetTouches[0];
                    i = o ? o.pageY : 0,
                        r = Date.now(),
                        s = Date.now()
                }
                function p(m) {
                    var h = m.changedTouches && m.changedTouches[0] ? m : null;
                    e = m.originalEvent || h,
                        t = e && e.changedTouches && e.changedTouches[0],
                        o = t ? t.pageY : 0,
                        i = Math.ceil(i),
                        o = Math.ceil(o);
                    var v, g, _ = Math.abs(i - o);
                    if (_ >= 5 && _ <= 50) {
                        if (a = Date.now(),
                            (v = {
                                articleHeight: n.articleHeight,
                                articleInterval: c,
                                readStopTime: s - (0 === n.timeLastUp ? n.statTime : n.timeLastUp),
                                readScrollTime: a - r,
                                readPosition: Math.ceil((document.documentElement.scrollTop || document.body.scrollTop) + n.screenHeight),
                                readScrollPosition: _
                            }).readPosition = v.readPosition >= n.articleHeight ? n.articleHeight : v.readPosition,
                            g = n.isFireSection(v.readPosition),
                            v.readStopTime = v.readStopTime > d ? d : v.readStopTime,
                            n.touchSectionArray.push(v),
                            g) {
                            var w = n.touchSectionArray.length
                                , b = n.touchSectionArray[w - 1].readPosition;
                            for (u = 0; u < w; u++) {
                                var y = n.touchSectionArray[u];
                                n.sumTime += y.readStopTime + y.readScrollTime
                            }
                            n.sendReadLog({
                                id: n.id,
                                articleHeight: n.articleHeight,
                                position: b,
                                duration: n.sumTime
                            }),
                                n.touchSectionArray = []
                        }
                        if (n.timeLastUp = s,
                        v.readPosition >= n.sectionFirePointArray[l - 1])
                            return console.log("article end"),
                                n.$aritcle.off("touchstart", f),
                                n.$aritcle.off("touchend", p),
                                void n.$aritcle.off("touchcancel", p)
                    }
                }
                (n.articleHeight > n.sectionFirePointArray[l - 1] || 0 === n.sectionFirePointArray.length) && (n.sectionFirePointArray.push(n.articleHeight),
                    l = n.sectionFirePointArray.length),
                    n.$aritcle.on("touchstart", f),
                    n.$aritcle.on("touchend", p),
                    n.$aritcle.on("touchcancel", p)
            },
            sendReadLog: function(e) {
                window.ucapi && window.ucapi.infoflow && window.ucapi.infoflow.statEvent && window.ucapi.infoflow.statEvent({
                    type: "readingInfo",
                    data: {
                        id: e.id,
                        readingInfo: {
                            articleHeight: e.articleHeight,
                            position: e.position,
                            duration: e.duration
                        }
                    },
                    success: function() {},
                    fail: function() {}
                })
            },
            getQueryString: function(e) {
                var t = new RegExp("(\\?|^|&|#)" + e + "=([^&|^#]*)(&|$|#)","i")
                    , n = window.location.href.match(t);
                return null != n ? decodeURIComponent(n[2]) : ""
            },
            isFireSection: function(e) {
                for (var t = !1, n = this.sectionFirePointArray.length, i = 0; i < n; i++)
                    if (i > 0 && this.sectionFirePointArray[i] >= e) {
                        var o = this.sectionFirePointArray[i - 1] ? this.sectionFirePointArray[i - 1] : this.firePoint;
                        o = e === this.sectionFirePointArray[i] ? this.sectionFirePointArray[i] : o,
                        this.firePoint != o && (t = !0,
                            this.firePoint = o);
                        break
                    }
                return t
            },
            scrollToEnd: function() {
                var e = this
                    , t = this.screenHeight;
                window.addEventListener("scroll", function() {
                    !e.isEnd && (document.documentElement.scrollTop || document.body.scrollTop) + t >= e.articleHeight && (e.sendReadLog({
                        id: e.id,
                        articleHeight: e.articleHeight,
                        position: e.articleHeight,
                        duration: e.sumTime
                    }),
                        e.isEnd = !0)
                })
            }
        };
        e.exports = i
    }
    , function(e, t) {
        e.exports = '<div class="pages-article-opinion">文章内容不代表{{platformName}}平台观点</div>\n'
    }
    , function(e, t, n) {
        (e.exports = n(7)(!1)).push([e.i, ".pages-article-opinion{margin:20px 0;text-align:center;color:#bbb;-webkit-text-size-adjust:none;user-select:none;font-size:13px}", ""])
    }
    , function(e, t, n) {
        var i = n(70);
        "string" == typeof i && (i = [[e.i, i, ""]]);
        var o = {
            hmr: !0,
            transform: void 0,
            insertInto: void 0
        };
        n(6)(i, o);
        i.locals && (e.exports = i.locals)
    }
    , function(e, t, n) {
        "use strict";
        n(71);
        var i = n(1);
        e.exports = function(e) {
            var t = parseInt(e.read_times, 10) || 0;
            e._incrs.readtimes && (t += parseInt(e._incrs.readtimes, 10)),
            e._incrs.readtimes_even && (t += parseInt(e._incrs.readtimes_even, 10)),
                t && t > 1e8 ? t = "9999万+" : t && t > 9999 && (t = (t /= 1e4).toFixed(1) + "万"),
                new Vue({
                    el: ".opinion-box",
                    template: n(69),
                    data: {
                        readtimes: t,
                        platformName: "taojin-iflow" === i.urlQuery.app ? "精彩头条" : "UC"
                    }
                })
        }
    }
    , function(e, t, n) {
        "use strict";
        e.exports = function(e) {
            if (e && !!(e._extra || {}).is_exclusive) {
                var t = e._author || {}
                    , n = t && t.author_name
                    , i = e.created_at || ""
                    , o = i.replace && i.replace("T", " ").split(".") || ""
                    , a = o && o[0] || "";
                if (n && a) {
                    var r = $(".author-box");
                    if (r && r.length) {
                        var s = document.createElement("p");
                        s.className = "author-info",
                            s.innerText = n + " " + a;
                        var c = document.createElement("p");
                        c.className = "exclusive",
                            c.innerText = "大鱼号独家签约稿件，信息网络传播权独家归属大鱼号平台运营者。未经许可，不得使用。",
                            r.append(s),
                            r.append(c)
                    }
                }
            }
        }
    }
    , function(e, t, n) {
        (e.exports = n(7)(!1)).push([e.i, ".hairlines .adbox_above_bar,.hairlines .adbox_below_bar{border-width:.5px}.adbox_below .av{max-height:0;padding:0 20px;overflow:hidden}.adbox_below .av.av_show{margin-top:35px;max-height:none;overflow:visible;-webkit-text-size-adjust:none!important}.adbox_below .av_container{margin:0;width:100%;border-top-width:1px}.adbox_below .av_container-inner{overflow:hidden}.adbox_below .av_bar{border-top:1px solid #f1f1f1;text-align:center;height:0}.adbox_below .av_bar.UCUNNIC{border-color:#646464!important}.adbox_below .av_bar-bottom{margin-top:-5px}.adbox_below .av_text{position:relative;top:-8px;padding:0 10px;display:inline-block;height:15px;line-height:15px;color:#bbb;background:#fff;font-size:13px}.adbox_above .av{max-height:0;padding:0 20px;overflow:hidden;display:none;margin:20px 0}.adbox_above .av.av_show{display:block;max-height:none;overflow:visible}.adbox_above .av_container{margin:0;width:100%}.adbox_above .av_container-inner{overflow:hidden}.adbox_above .av_bar{border-top:1px solid #f1f1f1;text-align:center;height:0}.adbox_above .av_bar.UCUNNIC{border-color:#646464!important}.adbox_above .av_bar-bottom{margin-top:-5px}.adbox_above .av_text{position:relative;top:-8px;padding:0 10px;display:inline-block;height:15px;line-height:15px;color:#bbb;background:#fff;font-size:13px}", ""])
    }
    , function(e, t, n) {
        var i = n(74);
        "string" == typeof i && (i = [[e.i, i, ""]]);
        var o = {
            hmr: !0,
            transform: void 0,
            insertInto: void 0
        };
        n(6)(i, o);
        i.locals && (e.exports = i.locals)
    }
    , function(e, t) {
        e.exports = '<div\n  class="av"\n  :class="{\n    \'av_show\': showAd,\n  }"\n>\n  \x3c!-- <div class="av_bar">\n    <div class="av_text">广告</div>\n  </div> --\x3e\n  <div\n    class="av_container"\n    :class="{\n      \'av_show\': showAd && !isVip,\n    }"\n  >\n    <div\n      v-el:container\n      class="av_container-inner"\n    ></div>\n  </div>\n  \x3c!-- <div class="av_bar av_bar-bottom"></div> --\x3e\n</div>\n'
    }
    , function(e, t, n) {
        "use strict";
        var i = n(3)
            , o = null;
        t.init = function(e) {
            o = e
        }
            ,
            t.event = function(e, t) {
                var n = o || {};
                for (var a in n)
                    e[a] = n[a];
                i.event(e, t)
            }
    }
    , function(e, t, n) {
        "use strict";
        var i = r(n(14))
            , o = r(n(4))
            , a = r(n(8));
        function r(e) {
            return e && e.__esModule ? e : {
                default: e
            }
        }
        var s = n(77)
            , c = n(5)
            , d = n(1)
            , l = n(76)
            , u = o.default.utLogger;
        n(75);
        var f = function(e, t, n, i, o) {
            var r = i && i.merge_tags || []
                , d = "";
            r && r instanceof Array && (d = r.map(function(e) {
                return encodeURIComponent(e)
            }).join(";"));
            var l = i && i.category || []
                , f = encodeURIComponent(l && l[0] || "")
                , p = document.createElement("script");
            p.crossOrigin = "anonymous",
                document.head.appendChild(p),
                p.onload = function() {
                    window.scriptLoaded("huichuan-uaScript"),
                        $(e).css({
                            margin: "-5px -5px",
                            width: "calc(100% + 10px)"
                        });
                    var i = null;
                    if (window.UCJSADService && window.UCJSADService.createAdNode)
                        i = window.UCJSADService.createAdNode("", "article" === n ? 999999 : 888888, null, t._id, void 0, {
                            show_tags: d || "",
                            categorys: f || ""
                        }),
                            $(i).css("display", "none"),
                        i && e.appendChild(i);
                    else {
                        var r = document.createElement("script");
                        r.crossOrigin = "anonymous",
                            document.head.appendChild(r),
                            r.onload = function() {
                                window.scriptLoaded("huichuan-uaWmScript"),
                                window.UCJSADServiceWM && (i = window.UCJSADServiceWM.createAdNode("", "article" === n ? 999999 : 888888, null, t._id),
                                    $(i).css("display", "none"),
                                i && e.appendChild(i))
                            }
                            ,
                            r.setAttribute("src", "https://images.uc.cn/s/uae/g/0s/fh/dist/fhpullor.js?ts=1506326579999")
                    }
                    window.addEventListener("ucad-load", function() {
                        window.scriptLoaded("huichuan-adload"),
                            function() {
                                var e = document.querySelector(".adbox_above");
                                e && a.default.listen(e).then(function() {
                                    s.event({
                                        action: "ad_display"
                                    }),
                                        c.log({
                                            region: "ad_card",
                                            action: "show"
                                        }),
                                        u.expose("ad_card_show", {
                                            spm: "ad.ad_card",
                                            adcard_type: 0
                                        })
                                })
                            }(),
                            u.other("ad_card_request", {
                                spm: "ad.ad_card",
                                adcard_type: 0,
                                data: 1
                            }),
                        i && $(i).css("display", "block !important"),
                        o && o()
                    }),
                        window.addEventListener("ucad-none", function() {
                            u.other("ad_card_request", {
                                spm: "ad.ad_card",
                                adcard_type: 0,
                                data: 0
                            }),
                                s.event({
                                    action: "ad_load_none"
                                })
                        }),
                        window.addEventListener("fhad-click", function() {
                            c.log({
                                region: "ad_card",
                                action: "click"
                            }),
                                u.click("ad_card_click", {
                                    spm: "ad.ad_card",
                                    adcard_type: 0,
                                    click_op: 0
                                })
                        })
                }
            ;
            var m = window.globalConfig.huichuanUaSrc;
            m && -1 === m.indexOf("?") && (m = m + "?ts=" + function() {
                var e = new Date
                    , t = e.getFullYear()
                    , n = e.getMonth() + 1
                    , i = e.getDate()
                    , o = e.getHours() + 5;
                return "" + t + n + i + o
            }()),
                p.setAttribute("src", m),
                c.log({
                    region: "ad_card",
                    action: "query"
                })
        };
        t.init = function(e, t) {
            if (t && window.globalConfig.showAd && e.is_show_ad && t.has_opened_ad && 1 === t.active && !d.platform.isUCNews && !globalConfig.isVip && !window.isOrgArticle && "1" !== d.urlQuery.iflow_disable_ad) {
                var n = ".adbox_above"
                    , o = "above"
                    , a = i.default.getTest("1129") || {}
                    , r = a.tag && "f" === a.tag.toLowerCase();
                "video" === window.waPage && -1 !== window.location.href.indexOf("entrance=comment") && (n = ".adbox_below",
                    o = "below"),
                r && (n = ".adbox_below",
                    o = "below");
                var u = $(n)[0];
                if (s.init({
                    page: window.waPage,
                    platform: "huichuan",
                    article_id: e._id,
                    wm_id: e.wm_id,
                    category: e.category,
                    pos: o
                }),
                    s.event({
                        action: "ad_pv"
                    }),
                    u) {
                    var p = function(n) {
                        var i = d.platform.isiPhone && "ucpush" === d.urlQuery.zzd_from ? 300 : 0;
                        setTimeout(function() {
                            return function(e, t, n, i) {
                                new Vue({
                                    template: l,
                                    el: e,
                                    replace: !1,
                                    data: {
                                        showAd: !1,
                                        isVip: !1
                                    },
                                    ready: function() {
                                        var e = this
                                            , o = e.$els.container;
                                        $(document).on("vipinfo:inited", function(t, n) {
                                            e.$data.isVip = !!n.iv
                                        }),
                                            f(o, t, n, i, function() {
                                                e.$data.showAd = !0,
                                                    s.event({
                                                        action: "ad_load"
                                                    }),
                                                    c.log({
                                                        region: "ad_card",
                                                        action: "query_success"
                                                    }),
                                                    $(".av_container-inner").click(function(e) {
                                                        e.preventDefault()
                                                    })
                                            })
                                    }
                                })
                            }(u, t, e.article_category && 1 == e.article_category || e.format_type && 1002 == e.format_type ? "video" : "article", n)
                        }, i)
                    };
                    window.getXissData && window.getXissData.then(function(e) {
                        p(e)
                    }).catch(function() {
                        p()
                    })
                }
            }
        }
    }
    , function(e, t, n) {
        "use strict";
        !function(e) {
            function t(i) {
                if (n[i])
                    return n[i].exports;
                var o = n[i] = {
                    i: i,
                    l: !1,
                    exports: {}
                };
                return e[i].call(o.exports, o, o.exports, t),
                    o.l = !0,
                    o.exports
            }
            var n = {};
            t.m = e,
                t.c = n,
                t.d = function(e, n, i) {
                    t.o(e, n) || Object.defineProperty(e, n, {
                        configurable: !1,
                        enumerable: !0,
                        get: i
                    })
                }
                ,
                t.n = function(e) {
                    var n = e && e.__esModule ? function() {
                            return e.default
                        }
                        : function() {
                            return e
                        }
                    ;
                    return t.d(n, "a", n),
                        n
                }
                ,
                t.o = function(e, t) {
                    return Object.prototype.hasOwnProperty.call(e, t)
                }
                ,
                t.p = "",
                t(t.s = 3)
        }([function(e, t, n) {
            var i = Object.assign || function(e) {
                for (var t = 1; t < arguments.length; t++) {
                    var n = arguments[t];
                    for (var i in n)
                        Object.prototype.hasOwnProperty.call(n, i) && (e[i] = n[i])
                }
                return e
            }
                , o = function() {
                function e(e, t) {
                    for (var n = 0; n < t.length; n++) {
                        var i = t[n];
                        i.enumerable = i.enumerable || !1,
                            i.configurable = !0,
                        "value"in i && (i.writable = !0),
                            Object.defineProperty(e, i.key, i)
                    }
                }
                return function(t, n, i) {
                    return n && e(t.prototype, n),
                    i && e(t, i),
                        t
                }
            }();
            !function(e, t) {
                function n() {}
                function a(t, n, i) {
                    var o = (new Date).getTime()
                        , a = i ? o + 1e3 * i : ""
                        , r = {
                        data: n
                    };
                    a && (r.expireTime = a),
                        e.localStorage.setItem(t, JSON.stringify(r))
                }
                function r(e) {
                    return "[object Array]" === f.call(e)
                }
                function s(e) {
                    return "[object Object]" === f.call(e)
                }
                function c(e) {
                    var t = [];
                    for (var n in e)
                        p.call(e, n) && t.push(e[n]);
                    return t
                }
                var d, l, u = Object.prototype, f = u.toString, p = u.hasOwnProperty, m = (d = function() {
                    function t(n) {
                        (function(e, t) {
                                if (!(e instanceof t))
                                    throw new TypeError("Cannot call a class as a function")
                            }
                        )(this, t),
                            l.call(this),
                            this.loaderPath = n.cacheSuffix + "__LOADER_PATH__",
                            this.loaderStatus = !!e[n.cacheSuffix + "__STATUS__"],
                            this.options = {
                                mapPath: "",
                                staticHost: "",
                                accuracy: 1,
                                retryTimes: 2,
                                async: !1,
                                canReload: !0
                            },
                            i(this.options, n)
                    }
                    return o(t, [{
                        key: "getFilePaths",
                        value: function() {
                            return function(t) {
                                var n = null
                                    , i = e.localStorage.getItem(t);
                                return i && (n = JSON.parse(i)),
                                    n
                            }(this.loaderPath)
                        }
                    }, {
                        key: "saveFilePaths",
                        value: function(e) {
                            a(this.loaderPath, e, this.dateStep())
                        }
                    }, {
                        key: "removeFilePaths",
                        value: function() {
                            localStorage.removeItem(this.loaderPath)
                        }
                    }, {
                        key: "updateLoaderStatus",
                        value: function() {
                            var t = !(arguments.length > 0 && void 0 !== arguments[0]) || arguments[0];
                            e[this.options.cacheSuffix + "__STATUS__"] = t,
                                this.loaderStatus = t
                        }
                    }]),
                        t
                }(),
                    l = function() {
                        var e = this;
                        this.removeLoadedScript = function(e) {
                            var n = t.getElementById(e);
                            n && n.remove && n.remove()
                        }
                            ,
                            this.ajax = function(t) {
                                var n = t || {};
                                n.dataType = n.dataType || "json";
                                var i = e.formatParams(n.data)
                                    , o = new XMLHttpRequest;
                                o.onreadystatechange = function() {
                                    if (4 === o.readyState) {
                                        var e = o.status;
                                        e >= 200 && e < 300 && n.success ? n.success(o.responseText, o.responseXML) : n.fail && n.fail(e)
                                    }
                                }
                                ;
                                var a = -1 !== n.url.indexOf("?") ? "&" : "?";
                                o.open("GET", "" + n.url + a + i, !0),
                                    o.send(null)
                            }
                            ,
                            this.formatParams = function(t) {
                                var n = [];
                                for (var i in t)
                                    p.call(t, i) && n.push(encodeURIComponent(i) + "=" + encodeURIComponent(t[i]));
                                var o = e.randomString();
                                return n.push("vsr=" + o),
                                    n.join("&")
                            }
                            ,
                            this.dateStep = function() {
                                var t = void 0;
                                switch (e.options.accuracy) {
                                    case 1:
                                        t = 60;
                                        break;
                                    case 2:
                                        t = 3600;
                                        break;
                                    case 3:
                                        t = 86400;
                                        break;
                                    case 4:
                                        t = 604800;
                                        break;
                                    default:
                                        t = 10
                                }
                                return t
                            }
                            ,
                            this.randomString = function() {
                                var t = parseFloat("0." + 9999 * Math.floor((new Date).getTime() / 1e3 / e.dateStep()));
                                return (t + .2).toString(36).substr(2).split("").reverse().join("") + (t + .9).toString(36).substr(2).split("").reverse().join("")
                            }
                            ,
                            this.insertAfter = function(e, t) {
                                var n = t.parentNode;
                                n.lastChild === t ? n.appendChild(e) : n.insertBefore(e, t.nextSibling)
                            }
                            ,
                            this.loadScripts = function(n, i) {
                                var o = e
                                    , a = o.options
                                    , r = 0;
                                !function e() {
                                    var s = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : n[r];
                                    o.removeLoadedScript(s);
                                    var c = t.head
                                        , d = t.createElement("script")
                                        , l = -1 === s.indexOf("//") && a.staticHost ? a.staticHost + s : s;
                                    d.id = s.split("/").pop(),
                                        d.async = !1,
                                        d.type = "text/javascript",
                                        d.charset = "utf-8",
                                        d.src = l,
                                        o.insertAfter(d, c.lastChild),
                                        d.addEventListener("error", function(e) {
                                            o.removeFilePaths(),
                                                a.retryTimes > 0 ? (o.updateLoaderStatus(!1),
                                                    o.run(),
                                                    a.retryTimes += -1) : a.error && a.error(e.target.src + " no found!")
                                        }),
                                        d.addEventListener("load", function() {
                                            var t = n[r += 1];
                                            t ? e(t) : i && i()
                                        }, !1)
                                }()
                            }
                            ,
                            this.updateFilePath = function(t) {
                                var n = e
                                    , i = n.options
                                    , o = i.mapPath
                                    , a = i.staticHost
                                    , d = -1 === o.indexOf("//") && a ? a + o : o;
                                n.ajax({
                                    url: d,
                                    success: function(e) {
                                        if (e) {
                                            var i = []
                                                , o = JSON.parse(e);
                                            if (o.data ? r(o = r(o.data) ? o.data[0].file : o.data.file) ? i = o : s(o) && (i = c(o)) : s(o) && (i = c(o)),
                                                !i.length)
                                                throw new Error("No javascript files needed to load?");
                                            n.saveFilePaths(i),
                                            t && t(i)
                                        }
                                    }
                                })
                            }
                            ,
                            this.run = function(t) {
                                var n = e
                                    , i = n.options;
                                if (!e.loaderStatus || i.canReload) {
                                    n.updateLoaderStatus();
                                    var o = (new Date).getTime()
                                        , a = n.getFilePaths();
                                    a && a.data && !i.async ? n.loadScripts(a.data, function() {
                                        a.expireTime < o ? n.updateFilePath(function() {
                                            i.callback()
                                        }) : i.callback()
                                    }) : n.updateFilePath(function(e) {
                                        n.loadScripts(e, function() {
                                            i.callback()
                                        })
                                    })
                                } else
                                    i.callback()
                            }
                    }
                    ,
                    d);
                e.sdkLoaderBackup = function() {
                    var t = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {}
                        , i = arguments.length > 1 && void 0 !== arguments[1] ? arguments[1] : n
                        , o = arguments.length > 2 && void 0 !== arguments[2] ? arguments[2] : n;
                    if (!t.mapPath)
                        throw new Error('Failed to setting "mapPath"...');
                    t.cacheSuffix ? t.cacheSuffix = e.location.hostname + "_" + t.cacheSuffix : t.cacheSuffix = e.location.hostname + "_" + t.mapPath.split("?").shift().split("/").pop(),
                        t.callback = i,
                        t.error = o,
                        new m(t).run()
                }
            }(window, document)
        }
            , , , function(e, t, n) {
                var i = Object.assign || function(e) {
                        for (var t = 1; t < arguments.length; t++) {
                            var n = arguments[t];
                            for (var i in n)
                                Object.prototype.hasOwnProperty.call(n, i) && (e[i] = n[i])
                        }
                        return e
                    }
                ;
                n(0),
                    window.setCommentEnv = function(e) {
                        var t = i({
                            https: !1,
                            staticHost: "images.uc.cn"
                        }, e)
                            , n = t.https ? "https:" : ""
                            , o = t.pkgname + "." + t.env
                            , a = n + "//napi.uc.cn/3/classes/sdk_loader_maps/lists/" + o
                            , r = window.STATIC_HOST_PREFIX ? "" + n + window.STATIC_HOST_PREFIX : n + "//" + t.staticHost + "/s/uae/g/1y/";
                        return window.location.host.indexOf("local.uczzd.cn") > -1 && (r = n + "//" + t.staticHost + "/s/uae/g/1y/"),
                            {
                                mapPath: a + "?" + ["_app_id=zdl", "_fetch=1", "_size=1", "_max_age=60"].join("&"),
                                cacheSuffix: o,
                                staticHost: r
                            }
                    }
            }
        ])
    }
    , function(e, t, n) {
        (e.exports = n(7)(!1)).push([e.i, '#pages-article-comment_title-bar.UCUNNIC{border-color:#646464!important}#pages-article-comment_count .iconfont.UCUNNIC:before,#pages-article-comment_like .iconfont.UCUNNIC:before{filter:none!important;color:#dddcdc!important}.hairlines .pages-article-comment_comment-info,.hairlines .pages-article-comment_title-bar{border-width:.5px!important}.pages-article-comment_vip-user .comment-user-name{color:#f7534f}.pages-article-comment_vip-user .UCUNNIC .comment-user-name{color:#a12d2d}.pages-article-comment_vip-user .UCTransparentMode .comment-user-name{color:#ff918e}.pages-article-comment_comment-info{border-bottom:1px solid #f1f1f1!important;border-image:none!important}.pages-article-comment_comment-info.UCUNNIC{border-color:#646464!important}.pages-article-comment_title{margin-bottom:15px;text-align:center;font-size:0}.pages-article-comment_title-bar,.pages-article-comment_title-content{display:inline-block;vertical-align:middle}.pages-article-comment_title-content{margin:0 15px;color:#333;text-align:justify}.pages-article-comment_title-bar{width:30px;height:0;border-bottom:1px solid #bbb}.pages-article-comment_title-cn,.pages-article-comment_title-en{text-align:justify}.pages-article-comment_title-cn:after,.pages-article-comment_title-en:after{display:inline-block;content:"";width:100%}.pages-article-comment_title-cn{height:24px;margin-bottom:4px;font-size:18px;font-weight:900}.pages-article-comment_title-en{height:11px;font-size:10px}.pages-article-comment_author-comment-header{font-size:0!important}.pages-article-comment_author-comment-header img,.pages-article-comment_author-comment-header span{vertical-align:middle}.pages-article-comment_author-comment-header img{width:18px;height:18px;margin-right:8px;border-radius:50%}.pages-article-comment_author-comment-header span{color:#333;font-size:16px;font-weight:900}.pages-article-comment_author-comment-content{word-wrap:break-word;color:#333!important;font-size:16px!important}.pages-article-comment_count .iconfont,.pages-article-comment_like .iconfont{margin-left:3px;color:#999;font-size:14px}.pages-article-comment_count.comment-liked,.pages-article-comment_count.comment-liked .iconfont,.pages-article-comment_like.comment-liked,.pages-article-comment_like.comment-liked .iconfont{color:#f1635e}', ""])
    }
    , function(e, t, n) {
        var i = n(80);
        "string" == typeof i && (i = [[e.i, i, ""]]);
        var o = {
            hmr: !0,
            transform: void 0,
            insertInto: void 0
        };
        n(6)(i, o);
        i.locals && (e.exports = i.locals)
    }
    , function(e, t) {
        e.exports = '<div class="pages-article-comment">\n    <div class="mycomment-lists" v-if="hasMyComments">\n        <div class="pages-article-comment_title">\n              <div class="pages-article-comment_title-bar" id="pages-article-comment_title-bar"></div>\n              <div class="pages-article-comment_title-content">\n                  <div class="pages-article-comment_title-cn">我 的 评 论</div>\n                  <div class="pages-article-comment_title-en">m y c o m m e n t s</div>\n              </div>\n              <div class="pages-article-comment_title-bar" id="pages-article-comment_title-bar"></div>\n        </div>\n        <div class="comment-body">\n            <ul>\n                <li \n                    class="pages-article-comment_item" \n                    :class="{\'pages-article-comment_vip-user\': comment.is_member}" \n                    v-for="comment in mycomments | lessMyCommentsFilter" v-on:click="gotoCommentDetail($event, comment.id)" \n                    track-by="$index"\n                >\n                    <div class="comment-user-photo"><img uc-image-reader_state="disabled" :src="comment.user.faceimg | formatImageSchema" width="25" height="25" /></div>\n                    <div class="pages-article-comment_comment-info comment-info">\n                        <div class="comment-user-name">\n                            {{{comment.user.nickname | cutName}}}\n                            <span class="icon-vip" v-if="comment.is_member"></span>\n                        </div>\n                        <div class="comment-date">{{comment.time | dateFormatWithoutSecond}}</div>\n                        <div class="comment-content">{{comment.content}}</div>\n                        <div class="comment-author" v-for="subcomment in comment.authorComments">\n                            <div class="pages-article-comment_author-comment-header comment-author-title">\n                              <img :src="authorAvatar | formatImageSchema">\n                              <span>作者回复：</span>\n                            </div>\n                            <div class="pages-article-comment_author-comment-content comment-author-content">\n                                {{subcomment.content}}\n                            </div>\n                        </div>\n                    </div>\n                    <div class="comment-toolbar">\n                        <span id="pages-article-comment_like" class="pages-article-comment_like comment-likebtn" v-bind:class="{ \'comment-liked\' : comment.liked }" v-on:click="likeComment($event, comment.id)">{{comment.up_cnt}}<span class="iconfont wm-icon-pinglunmokuai-dianzan"></span></span>\n                        <span id="pages-article-comment_count" class="pages-article-comment_count comment-count">{{comment.reply_cnt}}<span class="iconfont wm-icon-pinglunmokuai-pinglun"></span></span>\n                    </div>\n                </li>\n            </ul>\n            <div class="more-mycomments" v-if="hasMoreMyComments">\n                <span v-on:click="toggleMoreMyComments($event,\'more\')" v-if="showMoreMyCommentsBtn">显示更多</span>\n                <span v-on:click="toggleMoreMyComments($event,\'less\')" v-else>收起</span>\n            </div>\n        </div>\n    </div>\n\n    <div class="comment-lists" v-stat-when-exposure="{ id: \'comment\', triggerHeight: \'100px\' }">\n        <div class="pages-article-comment_title">\n              <div class="pages-article-comment_title-bar" id="pages-article-comment_title-bar"></div>\n              <div class="pages-article-comment_title-content">\n                  <div class="pages-article-comment_title-cn">文 章 评 论</div>\n                  <div class="pages-article-comment_title-en">c o m m e n t s</div>\n              </div>\n              <div class="pages-article-comment_title-bar" id="pages-article-comment_title-bar"></div>\n        </div>\n\n        <div class="comment-body" v-if="hasComments">\n            <ul>\n                <li class="pages-article-comment_item" :class="{\'pages-article-comment_vip-user\': comment.is_member}" v-for="comment in comments"  v-on:click="gotoCommentDetail($event, comment.id)">\n                    <div class="comment-user-photo"><img uc-image-reader_state="disabled" :src="comment.user.faceimg | formatImageSchema" width="25" height="25" /></div>\n                    <div class="pages-article-comment_comment-info comment-info">\n                        <div class="comment-user-name">\n                            {{{comment.user.nickname | cutName}}}\n                            <span class="icon-vip" v-if="comment.is_member"></span>\n                        </div>\n                        <div class="comment-date">{{comment.time | dateFormatWithoutSecond}}</div>\n                        <div class="comment-content">{{comment.content}}</div>\n                        <div class="comment-author" v-for="subcomment in comment.authorComments">\n                            <div class="pages-article-comment_author-comment-header comment-author-title">\n                              <img :src="authorAvatar | formatImageSchema">\n                              <span>作者回复：</span>\n                            </div>\n                            <div class="pages-article-comment_author-comment-content comment-author-content">\n                                {{subcomment.content}}\n                            </div>\n                        </div>\n                    </div>\n                    <div class="comment-toolbar">\n                        <span id="pages-article-comment_like" class="pages-article-comment_like comment-likebtn" v-bind:class="{ \'comment-liked\' : comment.liked }" v-on:click="likeComment($event, comment.id)">{{comment.up_cnt}}<span class="iconfont wm-icon-pinglunmokuai-dianzan"></span></span>\n                        <span id="pages-article-comment_count" class="pages-article-comment_count comment-count">{{comment.reply_cnt}}<span class="iconfont wm-icon-pinglunmokuai-pinglun"></span></span>\n                    </div>\n                </li>\n                <li class="more-comments" v-if="!is_share_mode">{{moreCommentsText}}</li>\n            </ul>\n        </div>\n        <div class="comment-empty" v-on:click="openCommentWebview($event)" v-else></div>\n        <div class="comment-feedbackBtn" v-if="showBtn">\n            <span v-if="isShareFromSSight">打开兜有小视频 查看更多精彩评论</span>\n            <span v-else>打开{{isShareFromUCNews ? \'UC头条\' : \'UC\'}} {{(isVideoPage && residueCommentsCnt) ? \'查看剩余\' + residueCommentsCnt + \'条热评\' : \'查看更多热门评论\'}}</span>\n        </div>\n    </div>\n</div>'
    }
    , function(e, t, n) {
        "use strict";
        /*!
 * comment.js
 * Copyright(c) 2016
 * AUTHOR: shafeng
 * TAB SIZE: 4
 */
        var i = n(1)
            , o = (n(13),
            n(22))
            , a = n(3)
            , r = n(82)
            , s = n(29)
            , c = n(20)
            , d = n(30);
        n(81),
            e.exports = function(e, t) {
                new Vue({
                    el: ".commentbox",
                    replace: !1,
                    template: r,
                    data: {
                        mycomments: [],
                        hasMyComments: 0,
                        comments: [],
                        hasComments: !1,
                        residueCommentsCnt: 0,
                        isByHot: !0,
                        isByTime: !1,
                        latestCommentTime: null,
                        hasMoreComment: !1,
                        hasMoreMyComments: !1,
                        showMoreMyCommentsBtn: !1,
                        moreCommentsText: "上拉加载更多评论",
                        isCommentsLoading: !1,
                        sendCommentCountToNative: !1,
                        is_share_mode: i.is_share_mode,
                        isShareFromUCNews: i.is_share_from_uc_news(),
                        isShareFromSSight: i.is_share_from_ssight(),
                        isVideoPage: "video" === t,
                        showBtn: !1
                    },
                    directives: {
                        statWhenExposure: d,
                        reflow: c
                    },
                    computed: {
                        authorAvatar: function() {
                            return i.deepGet(s, "wm.avatar_url")
                        },
                        hasMyComments: function() {
                            return this.$data.mycomments.length
                        }
                    },
                    filters: {
                        lessMyCommentsFilter: function(e) {
                            return this.$data.showMoreMyCommentsBtn ? e.slice(0, 2) : e
                        },
                        cutName: function(e) {
                            var t = e && e.split("") || [];
                            return t.length > 18 ? t.slice(0, 18).join("") + "..." : e
                        }
                    },
                    ready: function() {
                        var e = this;
                        e.$data.is_share_mode && (window.SMDS_noShare ? e.$data.showBtn = !1 : e.$data.showBtn = !0),
                        window.ucapi && window.ucapi.comment && (window.ucapi.comment.onSendComment3rd = function(t) {
                                0 == t.statusCode ? (i.toast("评论成功"),
                                    e.updateMyCommentsList(t)) : 103 == t.statusCode ? i.toast("评论失败，有不适宜发表的内容") : 105 == t.statusCode ? i.toast("评论失败，相似的观点您已发表过啦") : i.toast("评论失败"),
                                    a.event({
                                        action: "native_comment",
                                        statuscode: t.statusCode,
                                        error: t.statusMessage || ""
                                    })
                            }
                        );
                        var t = function(t) {
                            if (t && t.data && !t.data.status)
                                if (e.$data.hasComments = t.data.comments && t.data.comments.length,
                                    e.$data.residueCommentsCnt = e.$data.hasComments ? t.data.comment_cnt - t.data.comments.length : 0,
                                    e.$data.hasComments) {
                                    var n = !1;
                                    $(window).on("scroll", function() {
                                        if (!n) {
                                            var t = $(".commentbox").offset().top + 100;
                                            if ((document.body.scrollTop || document.documentElement.scrollTop) + $(window).height() >= t) {
                                                n = !0;
                                                var o = e.$data.comments[0];
                                                o && a.send(globalConfig.IFLOWDOMAIN + "/log/api/v1/client/info?uc_param_str=dnnivebichfrmintnwcpgieiwidsudpf&app=uc-iflow&sn=" + (i.urlQuery.sn || "") + "&v=hot_comment&et=cmt_show&aid=" + globalConfig.sm_article_id + "&page=wemedia&zzd_from=" + (i.urlQuery.zzd_from || "") + "&content=" + JSON.stringify([{
                                                    cmt_id: o.id
                                                }]))
                                            }
                                        }
                                    })
                                } else
                                    a.send(globalConfig.IFLOWDOMAIN + "/log/api/v1/element/click-log?uc_param_str=dnnivebichfrmintnwcpgieiwidsudpf&app=uc-iflow&region=main_comment&pos=sofa&page=index&rd_id=" + globalConfig.sm_article_id + "&_t=" + Date.now());
                            else
                                $(".comment-tabs span").removeClass("comment-tab-active")
                        };
                        e.loadComments("hot", -1, function(n, o) {
                            if (n && !window.hasRetryCommented) {
                                if (window.hasRetryCommented = !0,
                                o && o.status)
                                    return void a.event({
                                        resptext: o.data && JSON.stringify(o.data) || "",
                                        action: "comment_status_error",
                                        status: o.status
                                    });
                                a.event({
                                    action: "comment_first_error"
                                }),
                                    i.request({
                                        url: "/api/commentinfo",
                                        dataType: "json",
                                        data: {
                                            hotValue: -1,
                                            ucid: globalConfig.UCID || "",
                                            uc_param_str: i.urlQuery.uc_param_str,
                                            count: i.is_share_mode ? 5 : 10,
                                            aid: globalConfig.sm_article_id
                                        }
                                    }, function(n, i) {
                                        n ? (a.event({
                                            action: "comment_first_erroragain"
                                        }),
                                        window.ucapi && ucapi.comment && ucapi.comment.notifyCommentCount && ucapi.comment.notifyCommentCount({
                                            aid: globalConfig.sm_article_id,
                                            count: 0
                                        })) : (i && 0 === i.status && e.handlerCommentResponse(i),
                                            t(i))
                                    })
                            } else
                                t(o)
                        });
                        var n = 0
                            , o = !1;
                        $(window).on("scroll", function() {
                            n && clearTimeout(n),
                                n = setTimeout(function() {
                                    if (!e.$data.hasMoreComment && !o)
                                        return a.send(globalConfig.IFLOWDOMAIN + "/log/api/v1/element/click-log?uc_param_str=dnnivebichfrmintnwcpgieiwidsudpf&app=uc-iflow&region=main_comment&pos=finished&label=" + e.$data.comments.length + "&page=index&rd_id=" + globalConfig.sm_article_id + "&_t=" + Date.now()),
                                            void (o = !0);
                                    (document.body.scrollTop || document.documentElement.scrollTop) >= $(document).height() - $(window).height() - 150 && e.$data.hasMoreComment && (e.$data.moreCommentsText = "正在加载更多评论...",
                                        e.loadComments(e.$data.isByHot ? "hot" : "time", e.$data.latestCommentTime, function() {
                                            a.event({
                                                action: "comment_load_more"
                                            })
                                        }))
                                }, 100)
                        })
                    },
                    methods: {
                        feedback: function(e) {
                            a.event({
                                action: "share_reflow_comment"
                            })
                        },
                        updateMyCommentsList: function(e) {
                            var t = {
                                user: {
                                    faceimg: e.userIcon,
                                    nickname: e.userNickName
                                },
                                time: +new Date,
                                content: e.content,
                                id: e.commentId,
                                user_sign: e.uid,
                                up_cnt: 0,
                                reply_cnt: 0,
                                liked: !1,
                                is_member: e.is_member,
                                member_level: e.member_level
                            };
                            this.$data.hasMyComments = 1,
                                this.$data.mycomments.unshift(t)
                        },
                        openCommentWebview: function(e) {
                            ucapi && ucapi.comment && ucapi.comment.configInput({
                                isVisible: !0,
                                themeType: 1,
                                wordLimit: 500,
                                showInputPanel: !0,
                                placeholder: "写评论",
                                isShowBar: !1,
                                success: function(e) {},
                                fail: function(e) {}
                            }),
                                a.event({
                                    action: "webapp_comment"
                                })
                        },
                        gotoCommentDetail: function(e, t) {
                            if (a.event({
                                action: "comment_item_click"
                            }),
                                !i.is_share_mode) {
                                var n = "webview"
                                    , o = "uc-iflow";
                                i.platform.isUCNews && (n = "ucnews",
                                    o = "ucnews-iflow");
                                var r = globalConfig.detailCommentDomain + "/" + n + "/comment-detail?app=" + o + "&";
                                r += "uc_param_str=dnnivebichfrmintcpgieiwidsudpf&aid=" + globalConfig.sm_article_id + "&commentid=" + t + "&uc_biz_str=S:custom|C:comment|N:true&is_wemedia=1&wm_aid=" + globalConfig.wm_aid,
                                    i.platform.isUCNews ? i.checkucapi({
                                        apiName: "video.openNativeSubCommentPage",
                                        success: function() {
                                            ucapi && ucapi.video.openNativeSubCommentPage({
                                                url: r + "&offlink=1",
                                                success: function() {},
                                                fail: function() {
                                                    window.location.href = r
                                                }
                                            })
                                        },
                                        fail: function() {
                                            window.location.href = r
                                        }
                                    }) : window.location.href = r
                            }
                        },
                        toggleMoreMyComments: function(e, t) {
                            this.$data.showMoreMyCommentsBtn = "more" !== t
                        },
                        updateCommentLike: function(e) {
                            (function(e) {
                                    for (var t = [], n = 0; n < e.length; n++)
                                        -1 === t.indexOf(e[n]) && t.push(e[n]);
                                    return t
                                }
                            )([].concat(this.$data.comments, this.$data.mycomments)).forEach(function(t) {
                                t.id === e && (t.liked = !0,
                                    t.up_cnt++)
                            })
                        },
                        likeComment: function(e, t) {
                            e.stopPropagation && e.stopPropagation();
                            var n = this
                                , r = "like_comment_" + t;
                            if (window[r] || o.getItem(r))
                                i.toast("你已经赞过了");
                            else {
                                if (window[r] = !0,
                                    i.is_share_mode)
                                    return n.updateCommentLike(t),
                                        void o.setItem(r, 1, 86400);
                                i.request({
                                    url: globalConfig.IFLOWDOMAIN + "/iflow/api/v1/cmt/comment/feedbacks",
                                    dataType: "jsonp",
                                    data: {
                                        uc_param_str: i.urlQuery.uc_param_str,
                                        app: "uc-iflow",
                                        aid: globalConfig.sm_article_id,
                                        cmt_id: t
                                    }
                                }, function(e, i) {
                                    0 === i.status && (n.updateCommentLike(t),
                                        o.setItem(r, 1, 86400))
                                }),
                                    a.event({
                                        action: "commentlike",
                                        cmt_id: t
                                    })
                            }
                        },
                        hotComments: function(e) {
                            var t = this;
                            t.$data.isByHot || (t.$data.isByHot = !0,
                                t.$data.isByTime = !1,
                                t.loadComments("hot", -1, function(e, n) {
                                    e || (t.$data.comments = [],
                                        t.$data.mycomments = [],
                                        t.$data.hasComments = n && n.data && n.data.comments && n.data.comments.length,
                                        t.$data.residueCommentsCnt = t.$data.hasComments ? n.data.comment_cnt - n.data.comments.length : 0)
                                }),
                                a.event({
                                    action: "hot_comment"
                                }))
                        },
                        timeComments: function(e) {
                            var t = this;
                            t.$data.isByTime || (t.$data.isByHot = !1,
                                t.$data.isByTime = !0,
                                t.loadComments("time", -1, function(e, n) {
                                    e || (t.$data.comments = [],
                                        t.$data.mycomments = [],
                                        t.$data.hasComments = n && n.data && n.data.comments && n.data.comments.length)
                                }),
                                a.event({
                                    action: "time_comment"
                                }))
                        },
                        processComments: function(e, t, n, i, a) {
                            var r = this;
                            n.forEach(function(n, s) {
                                var c = e[n];
                                if (a && a(c, s),
                                "my_comments" === t && c.my_children.length) {
                                    if (c.my_children.length)
                                        return;
                                    r.$data.hasMyComments++
                                }
                                c.children && c.children.length && (c.authorComments = [],
                                    c.children.forEach(function(t) {
                                        var n = e[t];
                                        3 == n.author_type && c.authorComments.length < 3 && (o.getItem("like_comment_" + n.id) ? n.liked = !0 : n.liked = !1,
                                            c.authorComments.push(n))
                                    })),
                                    o.getItem("like_comment_" + c.id) ? c.liked = !0 : c.liked = !1,
                                    i.push(c)
                            })
                        },
                        handlerCommentResponse: function(e, t) {
                            var n = this;
                            n.$data.hasMoreComment = e.data && e.data.has_more,
                                $(document).trigger("comment:info", [e.data.comment_cnt]),
                                n.$data.moreCommentsText = n.$data.hasMoreComment ? "上拉加载更多评论" : "已加载全部评论",
                            n.$data.sendCommentCountToNative || window.ucapi && ucapi.comment && ucapi.comment.notifyCommentCount && ucapi.comment.notifyCommentCount({
                                aid: globalConfig.sm_article_id,
                                count: e.data.comment_cnt
                            }),
                                n.$data.sendCommentCountToNative = !0,
                            t && t(null, e);
                            var i = e.data.comments_map
                                , o = e.data.comments
                                , r = e.data.my_comments;
                            !e.data.comment_cnt || o && o.length || a.event({
                                action: "comment_cnt_error"
                            }),
                                n.processComments(i, "comments", o, n.$data.comments, function(e, t) {
                                    t === o.length - 1 && (n.$data.latestCommentTime = n.$data.isByHot ? e.hotScore : e.time)
                                }),
                                n.processComments(i, "my_comments", r, n.$data.mycomments),
                            r && r.length > 2 && (n.$data.hasMoreMyComments = !0,
                                n.$data.showMoreMyCommentsBtn = !0)
                        },
                        loadComments: function(e, t, n) {
                            var o = this
                                , r = globalConfig.IFLOWDOMAIN + "/iflow/api/v2/cmt/article/" + globalConfig.sm_article_id + "/comments"
                                , s = {
                                hot: {
                                    api: r + "/byhot",
                                    ts: "hotValue"
                                },
                                time: {
                                    api: r + "/bytime",
                                    ts: "ts"
                                }
                            };
                            if (globalConfig.sm_article_id || a.event({
                                action: "comment_noid"
                            }),
                                !o.$data.isCommentsLoading) {
                                var c = {
                                    app: "uc-iflow",
                                    ucid: globalConfig.UCID || "",
                                    uc_param_str: i.urlQuery.uc_param_str
                                };
                                c[s[e].ts] = t,
                                    c.count = i.is_share_mode ? 5 : 10,
                                i.is_share_mode && (window.comment_share_dn = window.comment_share_dn || Date.now(),
                                    c.dn = window.comment_share_dn),
                                i.urlQuery.viewcomment && (c.count = 10),
                                    o.$data.isCommentsLoading = !0,
                                    o.$data.moreCommentsText = "正在加载更多评论...",
                                    i.request({
                                        url: s[e].api,
                                        dataType: "jsonp",
                                        data: c,
                                        timeout: 8e3
                                    }, function(e, t) {
                                        o.$data.isCommentsLoading = !1,
                                            e ? n && n(e) : (0 === t.status ? o.handlerCommentResponse(t, n) : (o.$data.moreCommentsText = "上拉加载更多评论",
                                            n && n("status error", {
                                                data: t,
                                                status: t && t.status || 99
                                            })),
                                            i.is_share_mode && (t.data && t.data.comments && t.data.comments.length || ($(".comment-body").hide(),
                                                $(".comment-empty").hide(),
                                                $(".commentbox").hide()),
                                                o.$data.hasMoreComment = !1),
                                            i.urlQuery.viewcomment && t.data && t.data.has_more && (o.$data.hasMoreComment = !0))
                                    })
                            }
                        }
                    }
                })
            }
    }
    , function(e, t, n) {
        "use strict";
        var i = function(e) {
            return e && e.__esModule ? e : {
                default: e
            }
        }(n(17));
        var o = n(1);
        /*!
                             * relate.js
                             * Copyright(c) 2016
                             * AUTHOR: shafeng
                             * TAB SIZE: 4
                             */
        e.exports = function(e) {
            if (o.is_share_mode)
                return !1;
            window.__ARTICLE_RELATE__ = {
                aid: e._extra.xss_item_id,
                cid: 100,
                container: ".relatebox",
                count: 3,
                type: "wm",
                wm_contentId: e.content_id,
                logparams: {
                    page: "article",
                    page_form: "wemedia",
                    region: "article_relate"
                },
                callback: function(e) {
                    e && e.selfAddEventListener && e.selfAddEventListener("buildend", function() {
                        $(document).trigger("relate:init")
                    })
                }
            };
            var t = window.__ARTICLE_RELATE__;
            t.BigFish = globalConfig,
                t.BigFish.cid = e.content_id,
                t.BigFish.domain = {
                    1001: globalConfig.articlePageDomain,
                    1002: globalConfig.videoPageDomain,
                    0: globalConfig.articlePageDomain,
                    1: globalConfig.videoPageDomain
                },
                t.BigFish.path = {
                    1001: "/article.html",
                    1002: globalConfig.videoPageDomain + "/video.html",
                    0: "/article.html",
                    1: globalConfig.videoPageDomain + "/video.html"
                };
            !function(e) {
                (0,
                    i.default)(e).then(function() {
                    console.log("relate sdk load")
                }).catch(function() {})
            }({
                pkgName: "article.relate.index.wm"
            })
        }
    }
    , function(e, t) {
        e.exports = '<div class="pages-article-media" v-if="!noRender && show">\n  \x3c!-- <div class="titlebar-follow-tip" :class="{ \'animate-zoomin\': showFollowTip, \'animate-zoomout\': !showFollowTip && hasShowFollowTip }" @click="visitcountClick(39)"></div> --\x3e\n  <div v-stat-when-exposure="\'media_card\'" id="media-card-container" v-on-impress="onImpress">\n    \x3c!-- <media-share v-if="share" :media="media" :article="article" :show-follow-tip.sync="showFollowTip"></media-share> --\x3e\n    <media-uc :media="media" :is_followed.sync="is_followed" :show-follow-tip="showFollowTip"></media-uc>\n  </div>\n</div>'
    }
    , function(e, t, n) {
        "use strict";
        var i = n(1);
        e.exports = {
            update: function() {
                var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {};
                "function" == typeof e && (e = {
                    callback: e
                }),
                    i.onImpress(this.el, e.triggerHeight, e.callback)
            }
        }
    }
    , function(e, t, n) {
        e.exports = n.p + "components/pages/article/media/imgs/up_d02e7.svg"
    }
    , function(e, t, n) {
        e.exports = '<div class="pages-article-media-media-uc" v-if="initIsFollowed === false" @click="onGotoHomepage(is_followed)">\n  <div class="pages-article-media-media-uc_main">\n    <div class="pages-article-media-media-uc_main-content">\n      <div class="pages-article-media-media-uc_main-avatar">\n          <img :src="media.avatar_url | formatImageSchema">\n          <div class="pages-article-media-media-uc_main-avatar-vip pages-article-media-media-uc_main-avatar-vip-gold" v-if="media.vipLevel == 1"></div>\n          <div class="pages-article-media-media-uc_main-avatar-vip pages-article-media-media-uc_main-avatar-vip-silver" v-if="media.vipLevel == 2"></div>\n          <div class="pages-article-media-media-uc_main-avatar-vip pages-article-media-media-uc_main-avatar-vip-copper" v-if="media.vipLevel == 3"></div>\n          <div class="pages-article-media-media-uc_main-header-vip pages-article-media-media-uc_main-header-vip-type-{{wemedia_vip.vip_type}}" v-if="wemedia_vip"></div>\n      </div>\n      <div class="pages-article-media-media-uc_main-info-container">\n        <div v-show="showFollowTip" class="pages-article-media-media-uc_follow-tip" transition="tip" @click.stop="onFollow">\n          <span class="pages-article-media-media-uc_follow-tip-text">关注有更多精彩内容</span>\n          <span class="pages-article-media-media-uc_follow-tip-triangle"></span>\n        </div>\n        <div v-show="!showFollowTip" class="pages-article-media-media-uc_main-info" transition="name">\n          <div class="pages-article-media-media-uc_main-info-name"\n          :class="{\n            \'pages-article-media-media-uc_main-info-scale1\': media.wm_name.length > 6 && media.wm_name.length < 9,\n            \'pages-article-media-media-uc_main-info-scale2\': media.wm_name.length >= 9\n          }">\n              {{ media.wm_name }}\n              \x3c!-- <img src="../imgs/fish-logo-grey.png?fore-show=1"> --\x3e\n              <span class="pages-article-media-media-uc_main-info-logo" >大鱼号</span>\n          </div>\n          <div class="pages-article-media-media-uc_main-info-desc">{{ media.wm_introduction }}</div>\n        </div>\n      </div>\n      <div class="pages-article-media-media-uc_main-button">\n        <button v-if="is_followed" type="button" data-spm="wmcard" class="pages-article-media-media-uc_main-button-homepage" @click.stop="onGotoHomepage(is_followed, true)">已关注</button>\n        <button v-else type="button" data-spm="wmcard" class="pages-article-media-media-uc_main-button-follow" @click.stop="onFollow">+关注</button>\n        <button v-if="is_followed && isWmRecommendShow" class="pages-article-media-media-uc_main-up-button" @click.stop="toggleWmRecommend">\n          <img  class="pages-article-media-media-uc_main-up-button-bg {{hideWmRecommendShowBtn ? \'close\' : \'open\'}}" src="' + n(87) + '" alt="">\n        </button>\n      </div>\n    </div>\n    <wm-recommend :active="is_followed && showList" @show="onShowWmRecommend" :category="media && media.wm_field"></wm-recommend>\n  </div>\n</div>\n'
    }
    , function(e, t, n) {
        e.exports = n.p + "components/pages/article/media/imgs/triangle_f14b9.svg"
    }
    , function(e, t, n) {
        var i = n(9);
        (e.exports = n(7)(!1)).push([e.i, '.hairlines .pages-article-media-media-uc_main,.hairlines .pages-article-media-media-uc_main-tip-bar,.hairlines .pages-article-media-media-uc_wms-item,.hairlines .pages-article-media-media-uc_wms-tip-bar{border-width:.5px}.pages-article-media-media-uc{margin-top:20px;margin-bottom:20px;-webkit-user-select:none}.pages-article-media-media-uc_follow-tip{width:100%;height:100%;position:relative}.pages-article-media-media-uc_follow-tip:after,.pages-article-media-media-uc_follow-tip:before{content:"";display:block;position:absolute;top:-4px;right:-2px;width:0;height:0;border:8px solid transparent;border-left-width:3px;border-right-width:3px;border-top-color:#e9e9e9;transform:rotate(20deg)}.pages-article-media-media-uc_follow-tip:after{top:-1px;right:-3px;border:6px solid transparent;border-top-color:#e9e9e9;border-left-width:2px;border-right-width:2px;transform:rotate(65deg)}.pages-article-media-media-uc_follow-tip-text{display:inline-block;text-align:center;width:100%;background-color:#e9e9e9;font-size:14px;height:30px;line-height:30px;margin-top:6px;overflow:hidden;white-space:nowrap;text-overflow:ellipsis;border-radius:4px;color:#333}.pages-article-media-media-uc_follow-tip-triangle{display:block;position:absolute;bottom:8px;left:-8px;width:8px;height:8px;background-image:url(' + i(n(89)) + ");background-size:8px;background-position:100% 100%}.pages-article-media-media-uc,.pages-article-media-media-uc *{box-sizing:border-box}.pages-article-media-media-uc_main{position:relative;min-width:0;padding:0;-webkit-tap-highlight-color:transparent}.pages-article-media-media-uc_main.UCUNNIC{border-color:#646464!important}.pages-article-media-media-uc_main.UCTransparentMode{border-color:#f1f1f1!important}.pages-article-media-media-uc_main-content{margin:0 15px;padding-left:14px;position:relative;background:#f8f8f8;border-radius:4px;z-index:1;padding-top:12px;padding-bottom:12px;font-size:0;display:-webkit-box;display:-webkit-flex;display:-moz-box;display:-ms-flexbox;display:flex;-webkit-box-align:center;-webkit-align-items:center;-moz-box-align:center;-ms-flex-align:center;align-items:center}.pages-article-media-media-uc_main-avatar{float:left;width:42px;height:42px;position:relative}.pages-article-media-media-uc_main-avatar img{border-radius:50%;width:100%;height:100%}.pages-article-media-media-uc_main-avatar-vip{width:14px;height:14px;position:absolute;bottom:0;right:0;background-size:cover;background-repeat:no-repeat;background-position:50%}.pages-article-media-media-uc_main-avatar-vip-gold{background-image:url(" + i(n(39)) + ")}.pages-article-media-media-uc_main-avatar-vip-silver{background-image:url(" + i(n(38)) + ")}.pages-article-media-media-uc_main-avatar-vip-copper{background-image:url(" + i(n(37)) + ')}.pages-article-media-media-uc_main-info-container{-webkit-box-flex:1;-webkit-flex:1;-moz-box-flex:1;-ms-flex:1;flex:1;margin:0 10px;position:relative;height:42px}.pages-article-media-media-uc_main-info{height:100%;width:100%;overflow:hidden;height:42px}.pages-article-media-media-uc_main-info-name{font-family:PingFangSC-Medium;font-size:18px;line-height:24px;height:24px;overflow:hidden;color:#333;letter-spacing:1.5px;font-weight:700;margin-bottom:2px}.pages-article-media-media-uc_main-info-name span{display:inline-block;height:24px;line-height:24px;vertical-align:top}.pages-article-media-media-uc_main-info-scale1{font-size:15px!important}.pages-article-media-media-uc_main-info-scale1 img{width:45px!important;height:15px!important;margin-bottom:3px!important}.pages-article-media-media-uc_main-info-scale2{font-size:12px!important}.pages-article-media-media-uc_main-info-scale2 img{width:30px!important;height:12px!important;margin-bottom:3px!important}.pages-article-media-media-uc_main-info-desc{margin-top:0;color:#bbb;font-size:12px;overflow:hidden;text-overflow:ellipsis;word-break:break-all;display:-webkit-box;-webkit-line-clamp:1;-webkit-box-orient:vertical;font-family:PingFang-SC-Regular;letter-spacing:.67px;line-height:16px;height:16px}.pages-article-media-media-uc_main-info-logo{padding-left:12px;line-height:24px;font-size:12px;font-weight:400;letter-spacing:0;color:#bbb;position:relative;white-space:nowrap;display:inline-block;height:24px;vertical-align:top;margin-left:-3px}.pages-article-media-media-uc_main-info-logo:before{content:"";display:block;width:2px;height:5px;background-color:#ffc63f;position:absolute;left:5px;top:50%;-webkit-transform:translateY(-50%);transform:translateY(-50%)}.pages-article-media-media-uc_main-header{margin-bottom:-12px;padding:0 15px;white-space:nowrap;text-align:center}.pages-article-media-media-uc_main-header-vip{position:absolute;width:13px;height:13px;right:-2px;bottom:0;background-size:cover;background-repeat:no-repeat}.pages-article-media-media-uc_main-header-vip-type-1{background-image:url(' + i(n(34)) + ")}.pages-article-media-media-uc_main-button{margin-right:15px}.pages-article-media-media-uc_main-button-follow,.pages-article-media-media-uc_main-button-homepage{padding:8px!important;border-radius:6px!important;font-size:14px!important;border:none;font-weight:600;letter-spacing:.67px;line-height:14px!important}.pages-article-media-media-uc_main-button-follow.UCTransparentMode,.pages-article-media-media-uc_main-button-homepage.UCTransparentMode{background:none!important}.pages-article-media-media-uc_main-button-follow{background:#2696ff;color:#fff}.pages-article-media-media-uc_main-button-homepage{border-radius:6px;background:#eee;color:#bbb;border:0}.pages-article-media-media-uc_main-up-button{vertical-align:top;width:30px;height:30px;line-height:30px;border:0;outline:none;background-color:#eee;border-radius:5px;margin-left:5px}.pages-article-media-media-uc_main-up-button-bg{width:15px;height:15px;transition:.3s}.pages-article-media-media-uc_main-up-button-bg.close{transform:rotate(180deg)}.pages-article-media-media-uc_main-tip{position:relative;margin-bottom:16px}.pages-article-media-media-uc_main-tip-bar{border-top:1px solid #ddd;margin:0 auto;width:241px;height:0}.pages-article-media-media-uc_main-tip-text{position:absolute;top:1px;left:50%;transform:translate(-50%,-50%);-webkit-transform:translate(-50%,-50%);padding:0 20px;background:#fff;color:#bbb;line-height:13px;font-size:13px;font-style:italic}.pages-article-media-media-uc_more-tip{border-bottom:1px solid #e6e6e6;line-height:50px;text-align:center;color:#666;font-size:13px}.pages-article-media-media-uc_icon{position:relative;display:inline-block;background-repeat:no-repeat}.pages-article-media-media-uc_icon-plus{width:22px;height:22px;background-image:url(" + i(n(33)) + ");background-size:22px 22px}.pages-article-media-media-uc_icon-go{width:5px;height:9px;background-image:url(" + i(n(32)) + ");background-size:5px 9px}.pages-article-media-media-uc_icon-go2{width:4px;height:7px;background-image:url(" + i(n(31)) + ");background-size:4px 7px}.hairlines .pages-article-media-media-uc_more-tip{border-width:.5px}@media screen and (max-width:375px){.pages-article-media-media-uc_main-info-name{font-size:16px;letter-spacing:.5px}.pages-article-media-media-uc_main-info-name img{width:36px;height:12px}.pages-article-media-media-uc_main-button{top:24px}.pages-article-media-media-uc_main-button-follow{font-size:11px;padding:0 11px;line-height:25px}}@media screen and (max-width:320px){.pages-article-media-media-uc_main-avatar{width:36px;height:36px}.pages-article-media-media-uc_main-info{height:36px}.pages-article-media-media-uc_main-info-name{font-size:14px;line-height:20px;height:20px;letter-spacing:0}.pages-article-media-media-uc_main-info-name img{width:24px;height:6px;margin-bottom:0}.pages-article-media-media-uc_main-info-desc{font-size:12px;line-height:14px}.pages-article-media-media-uc_main-button-follow{font-size:12px}}.tip-transition{opacity:1}.tip-enter{animation:bounce 5s linear;animation-iteration-count:1;animation-direction:alternate}.tip-leave{position:absolute;top:0;-webkit-transition:.4s ease-in;transition:.4s ease-in;opacity:0;-webkit-transform:translateY(-2px);transform:translateY(-2px)}@-webkit-keyframes bounce{0%{-webkit-transform:translateY(0);transform:translateY(0)}16.66%{-webkit-transform:translateY(-2px);transform:translateY(-2px)}33.33%{-webkit-transform:translateY(2px);transform:translateY(2px)}50%{-webkit-transform:translateY(-2px);transform:translateY(-2px)}66.66%{-webkit-transform:translateY(2px);transform:translateY(2px)}83.32%{-webkit-transform:translateY(-2px);transform:translateY(-2px)}to{-webkit-transform:translateY(0);transform:translateY(0)}}@keyframes bounce{0%{-webkit-transform:translateY(0);transform:translateY(0)}16.66%{-webkit-transform:translateY(-2px);transform:translateY(-2px)}33.33%{-webkit-transform:translateY(2px);transform:translateY(2px)}50%{-webkit-transform:translateY(-2px);transform:translateY(-2px)}66.66%{-webkit-transform:translateY(2px);transform:translateY(2px)}83.32%{-webkit-transform:translateY(-2px);transform:translateY(-2px)}to{-webkit-transform:translateY(0);transform:translateY(0)}}.name-transition{-webkit-transform:translateY(0);transform:translateY(0);opacity:1;-webkit-transition:.4s;transition:.4s;-webkit-transition-delay:.4s;transition-delay:.4s}.name-enter{-webkit-transition:all .4s ease;transition:all .4s ease;-webkit-transform:translateY(4px);transform:translateY(4px)}.name-enter,.name-leave{position:absolute;opacity:0}.name-leave{top:0;-webkit-transition:.2s;transition:.2s;-webkit-transition-delay:0;transition-delay:0}", ""])
    }
    , function(e, t, n) {
        var i = n(90);
        "string" == typeof i && (i = [[e.i, i, ""]]);
        var o = {
            hmr: !0,
            transform: void 0,
            insertInto: void 0
        };
        n(6)(i, o);
        i.locals && (e.exports = i.locals)
    }
    , function(e, t, n) {
        "use strict";
        var i = function(e) {
            return e && e.__esModule ? e : {
                default: e
            }
        }(n(4));
        var o = n(1)
            , a = n(3)
            , r = n(5)
            , s = n(19)
            , c = i.default.utLogger
            , d = n(40);
        n(13),
            n(91),
            e.exports = Vue.extend({
                template: n(88),
                props: ["media", "is_followed", "showFollowTip"],
                data: function() {
                    return {
                        showList: !1,
                        initIsFollowed: void 0,
                        wemedia_vip: globalConfig.wemedia_vip || void 0,
                        isWmRecommendShow: !1,
                        hideWmRecommendShowBtn: !1,
                        hasLoggedShow: !1
                    }
                },
                ready: function() {
                    this.initIsFollowed = this.is_followed
                },
                watch: {
                    is_followed: function() {
                        void 0 === this.initIsFollowed && (this.initIsFollowed = this.is_followed),
                        !1 !== this.initIsFollowed || this.hasLoggedShow || (this.hasLoggedShow = !0,
                            r.log({
                                region: "bottom_sub",
                                action: "show"
                            }),
                            r.log({
                                region: "bottom_homepage",
                                action: "show"
                            }))
                    }
                },
                methods: {
                    onFollow: function() {
                        var e = this;
                        a.event({
                            action: "wemedia_focus_btn_click",
                            from: "media-info"
                        }),
                            r.log({
                                region: "bottom_sub",
                                action: "click",
                                label: "follow"
                            }),
                            c.click("follow_click", {
                                spm: "content.follow",
                                location: 1,
                                follow_type: 0,
                                is_followed: 1
                            }),
                            s.click("/dayumobile.article.follow", {
                                wm_id: globalConfig.wm_id,
                                wm_aid: globalConfig.wm_aid,
                                page_item_id: globalConfig.sm_article_id,
                                type: 0,
                                spm: "btn.follow",
                                page_type: 6
                            }),
                            o.directlyFollow({
                                from: 21,
                                wm_id: this.media.wm_id,
                                success: function(t) {
                                    globalConfig.is_followed = 1,
                                        e.is_followed = !0,
                                        $(document).trigger("media:follow", [1]),
                                        $(document).trigger("media:folfollowWithIdlow", [t]),
                                        e.showList = !0
                                }
                            })
                    },
                    onShowWmRecommend: function() {
                        this.isWmRecommendShow = !0
                    },
                    toggleWmRecommend: function() {
                        this.showList = !this.showList,
                            this.hideWmRecommendShowBtn = !this.hideWmRecommendShowBtn
                    },
                    onGotoHomepage: function(e, t) {
                        var n = this;
                        a.event({
                            action: "homepage_media",
                            follow: e
                        }),
                            t ? (r.log({
                                region: "bottom_sub",
                                action: "click",
                                label: "homepage"
                            }),
                                c.click("follow_click", {
                                    spm: "content.follow",
                                    location: 1,
                                    follow_type: 1,
                                    is_followed: 1
                                })) : (r.log({
                                region: "bottom_homepage",
                                action: "click"
                            }),
                                c.click("wm_tag_click", {
                                    spm: "content.wm_tag",
                                    location: 1
                                })),
                            s.click("/dayumobile.article.wmcard", {
                                wm_id: globalConfig.wm_id,
                                wm_aid: globalConfig.wm_aid,
                                page_item_id: globalConfig.sm_article_id,
                                spm: "btn.wmcard",
                                page_type: 6
                            }),
                            setTimeout(function() {
                                o.gotoHomePage({
                                    is_followed: e,
                                    from: 21,
                                    wm_id: n.media._id,
                                    wm_name: n.media.wm_name,
                                    avatar_url: n.media.avatar_url
                                }, 200)
                            })
                    }
                },
                components: {
                    wmRecommend: d
                }
            })
    }
    , function(e, t, n) {
        e.exports = n.p + "components/pages/article/media/imgs/fish-logo-grey_7c9d8.png"
    }
    , function(e, t, n) {
        e.exports = '<div class="pages-article-media-media-share pages-article-media-media-share_inner">\n  <div class="pages-article-media-media-share_main">\n    <div class="pages-article-media-media-share_main-content" @click.stop="homepage($event, mediaInfoFromId)">\n      <div class="pages-article-media-media-share_main-avatar">\n          <img :src="media.avatar_url | formatImageSchema">\n          <div class="pages-article-media-media-share_main-header-vip pages-article-media-media-share_main-header-vip-type-{{wemedia_vip.vip_type}}" v-if="wemedia_vip"></div>\n      </div>\n      <div class="pages-article-media-media-share_main-info">\n        <div class="pages-article-media-media-share_main-info-name">\n            {{ media.wm_name }}\n            <img src="' + n(93) + '">\n        </div>\n        <div class="pages-article-media-media-share_main-info-desc">{{ media.wm_introduction }}</div>\n      </div>\n      <div class="pages-article-media-media-share_main-button">\n        <button type="button" data-spm="wmcard" class="pages-article-media-media-share_main-button-follow" v-reflow="{ cid: 179, landPage: landPage }" @click.stop>+ 关注</button>\n      </div>\n    </div>\n  </div>\n</div>'
    }
    , function(e, t, n) {
        var i = n(9);
        (e.exports = n(7)(!1)).push([e.i, ".hairlines .pages-article-media-media-share_main,.hairlines .pages-article-media-media-share_main-tip-bar,.hairlines .pages-article-media-media-share_wms-item,.hairlines .pages-article-media-media-share_wms-tip-bar{border-width:.5px}.pages-article-media-media-share{margin-top:42px;-webkit-user-select:none}.pages-article-media-media-share,.pages-article-media-media-share *{box-sizing:border-box}.pages-article-media-media-share_main{position:relative;min-width:0;padding:0;border:1px solid #eee;border-radius:6px;-webkit-tap-highlight-color:transparent;padding-left:16px;margin:0 15px}.pages-article-media-media-share_main.UCUNNIC{border-color:#646464!important}.pages-article-media-media-share_main.UCTransparentMode{border-color:#f1f1f1!important}.pages-article-media-media-share_main-content{position:relative;z-index:1;padding-top:17px;padding-bottom:17px;width:100%;font-size:0}.pages-article-media-media-share_main-uc{margin-bottom:15px;text-align:center;font-size:12px}.pages-article-media-media-share_main-uc-sep{color:#2696ff}.pages-article-media-media-share_main-uc-text{margin:0 7px;color:#333;font-style:italic}.pages-article-media-media-share_main-avatar{float:left;width:42px;height:42px;position:relative}.pages-article-media-media-share_main-avatar img{border-radius:50%;width:100%;height:100%}.pages-article-media-media-share_main-info{margin-left:50px;margin-right:100px;overflow:hidden}.pages-article-media-media-share_main-info-name{font-size:18px;color:#333;letter-spacing:1.1px;line-height:1.3}.pages-article-media-media-share_main-info-name img{width:42px;height:14px;margin-bottom:.5px}.pages-article-media-media-share_main-info-desc{margin-top:0;line-height:20px;color:#bbb;font-size:12px;max-height:20px;overflow:hidden;text-overflow:ellipsis;display:-webkit-box;-webkit-line-clamp:1;-webkit-box-orient:vertical}.pages-article-media-media-share_main-header{margin-bottom:-12px;padding:0 15px;white-space:nowrap;text-align:center}.pages-article-media-media-share_main-header-avatar-wrapper{position:relative;display:inline-block;width:24px;height:24px;margin-right:8px}.pages-article-media-media-share_main-header-avatar,.pages-article-media-media-share_main-header-name{vertical-align:middle}.pages-article-media-media-share_main-header-vip{position:absolute;width:13px;height:13px;right:-2px;bottom:0;background-size:cover;background-repeat:no-repeat}.pages-article-media-media-share_main-header-vip-type-1{background-image:url(" + i(n(34)) + ")}.pages-article-media-media-share_main-header-avatar{width:24px;height:24px;border-radius:50%;margin-right:8px}.pages-article-media-media-share_main-header-name{letter-spacing:4px;color:#333;font-size:18px;font-weight:900}.pages-article-media-media-share_main-name{color:#333;font-size:17px}.pages-article-media-media-share_main-intro{white-space:nowrap;overflow:hidden;text-overflow:ellipsis;color:#bbb;font-size:13px}.pages-article-media-media-share_main-button{position:absolute;right:15px;top:26px}.pages-article-media-media-share_main-button-follow,.pages-article-media-media-share_main-button-homepage{line-height:25px;padding:0 13px;border-radius:6px;font-size:13px;border:none;font-weight:600}.pages-article-media-media-share_main-button-follow.UCTransparentMode,.pages-article-media-media-share_main-button-homepage.UCTransparentMode{background:none!important}.pages-article-media-media-share_main-button-follow{background:#2696ff;color:#fff}.pages-article-media-media-share_main-button-homepage{border-radius:6px;background:#fff;color:#333;border:1px solid #333}.pages-article-media-media-share_main-tip{position:relative;margin-bottom:16px}.pages-article-media-media-share_main-tip-bar{border-top:1px solid #ddd;margin:0 auto;width:241px;height:0}.pages-article-media-media-share_main-tip-text{position:absolute;top:1px;left:50%;transform:translate(-50%,-50%);-webkit-transform:translate(-50%,-50%);padding:0 20px;background:#fff;color:#bbb;line-height:13px;font-size:13px;font-style:italic}.pages-article-media-media-share_more-tip{border-bottom:1px solid #e6e6e6;line-height:50px;text-align:center;color:#666;font-size:13px}.pages-article-media-media-share_wms-tip{margin-top:24px;padding:0 15px}.pages-article-media-media-share_wms-tip-container{position:relative;height:1px}.pages-article-media-media-share_wms-tip-bar{position:absolute;top:0;left:0;width:100%;border-top:1px solid #e6e6e6}.pages-article-media-media-share_wms-tip-text{position:absolute;top:1px;left:50%;transform:translate(-50%,-50%);-webkit-transform:translate(-50%,-50%);padding:0 16px;background:#fff;color:#666;line-height:13px;font-size:13px}.pages-article-media-media-share_wms-container{position:relative;width:100%;margin-top:27px;overflow:hidden;font-size:0}.pages-article-media-media-share_wms-items{margin-bottom:20px;overflow-x:scroll;-webkit-overflow-scrolling:touch;white-space:nowrap}.pages-article-media-media-share_wms-items::-webkit-scrollbar{display:none}.pages-article-media-media-share_wms-item{position:relative;display:inline-block;width:136px;border-right:1px solid #e4e4e4;white-space:normal}.pages-article-media-media-share_wms-item-avatar{margin-bottom:8px;text-align:center}.pages-article-media-media-share_wms-item-avatar img{width:30px;height:30px;border-radius:50%}.pages-article-media-media-share_wms-item-name{margin-bottom:5px;color:#333;line-height:12px;text-align:center;font-size:13px}.pages-article-media-media-share_wms-item-intro{display:-webkit-box;-webkit-line-clamp:2;-webkit-box-orient:vertical;height:30px;padding:0 15px;overflow:hidden;text-align:center;color:#bbb;line-height:15px;font-size:12px}.pages-article-media-media-share_wms-item-bottom{margin-top:10px;width:100%;color:#333;line-height:30px;text-align:center;font-size:14px}.pages-article-media-media-share_wms-more{position:relative;display:inline-block;width:136px;white-space:normal}.pages-article-media-media-share_wms-more-plus{text-align:center;margin-bottom:19px}.pages-article-media-media-share_wms-more-text{line-height:18px;text-align:center;color:#333;font-size:12px}.pages-article-media-media-share_icon{position:relative;display:inline-block;background-repeat:no-repeat}.pages-article-media-media-share_icon-plus{width:22px;height:22px;background-image:url(" + i(n(33)) + ");background-size:22px 22px}.pages-article-media-media-share_icon-go{width:5px;height:9px;background-image:url(" + i(n(32)) + ");background-size:5px 9px}.pages-article-media-media-share_icon-go2{width:4px;height:7px;background-image:url(" + i(n(31)) + ");background-size:4px 7px}.hairlines .pages-article-media-media-share_more-tip{border-width:.5px}html.android .pages-article-media-media-share_main-uc-sep{color:#69ace2}html.android .pages-article-media-media-share_main-button-follow{border-color:#69ace2;background:#69ace2}@media screen and (max-width:375px){.pages-article-media-media-share_main-avatar{width:40px;height:40px}.pages-article-media-media-share_main-info{margin-left:48px;margin-right:80px}.pages-article-media-media-share_main-info-name{font-size:17px;line-height:1.2;margin-top:4px;letter-spacing:1.1px}.pages-article-media-media-share_main-info-name img{width:36px;height:12px}.pages-article-media-media-share_main-info-desc{font-size:11px;line-height:1.2;margin-top:5px}.pages-article-media-media-share_main-button{top:24px}.pages-article-media-media-share_main-button-follow{font-size:11px;padding:0 11px;line-height:25px}}@media screen and (max-width:320px){.pages-article-media-media-share_main-avatar{width:36px;height:36px}.pages-article-media-media-share_main-info{margin-left:45px;margin-right:70px}.pages-article-media-media-share_main-info-name{font-size:13px;letter-spacing:0}.pages-article-media-media-share_main-info-name img{width:30px;height:10px;margin-bottom:0}.pages-article-media-media-share_main-info-desc{font-size:10px}.pages-article-media-media-share_main-button-follow{font-size:11px;padding:0 10px;line-height:23px}}", ""])
    }
    , function(e, t, n) {
        var i = n(95);
        "string" == typeof i && (i = [[e.i, i, ""]]);
        var o = {
            hmr: !0,
            transform: void 0,
            insertInto: void 0
        };
        n(6)(i, o);
        i.locals && (e.exports = i.locals)
    }
    , function(e, t, n) {
        "use strict";
        var i = n(1)
            , o = n(3)
            , a = n(19)
            , r = n(20);
        n(13),
            n(96),
            e.exports = Vue.extend({
                template: n(94),
                props: ["article", "media", "showFollowTip"],
                data: function() {
                    return {
                        uc_param_str: globalConfig.uc_param_str || i.urlQuery.uc_param_str,
                        mediaInfoFromId: 21,
                        qrcodeFromId: 22,
                        wemedia_vip: globalConfig.wemedia_vip || void 0,
                        landPage: window.location.href
                    }
                },
                ready: function() {
                    var e = window.location
                        , t = ((e.search && e.search.indexOf("?")) > -1 ? "&" : "?") + "action=follow&action_from=media";
                    this.landPage = e.origin + e.pathname + e.search + t + e.hash
                },
                directives: {
                    reflow: r
                },
                methods: {
                    onFollow: function() {
                        this.homepage()
                    },
                    homepage: function(e, t) {
                        e && e.preventDefault(),
                            this.showFollowTip = !1,
                            o.event({
                                action: "homepage_media",
                                follow: globalConfig.is_followed ? 1 : 0
                            }),
                            a.click("/dayumobile.article.wmcard", {
                                wm_id: globalConfig.wm_id,
                                wm_aid: globalConfig.wm_aid,
                                page_item_id: globalConfig.sm_article_id,
                                spm: "btn.wmcard",
                                page_type: 6
                            }),
                            i.debug("goto homepage media");
                        var n = {
                            from: parseInt(t)
                        };
                        this.article.reproduce_from && ((n = this.article.reproduce_from).from = parseInt(t),
                            n.is_followed = 0),
                            i.gotoHomePage(n)
                    }
                }
            })
    }
    , function(e, t, n) {
        "use strict";
        var i = function(e) {
            return e && e.__esModule ? e : {
                default: e
            }
        }(n(4));
        var o = n(1)
            , a = n(3)
            , r = n(10)
            , s = (n(97),
            n(92))
            , c = n(30)
            , d = n(86)
            , l = n(29)
            , u = n(22)
            , f = n(21)
            , p = n(14)
            , m = i.default.utLogger;
        n(13);
        var h = {
            1: {
                head: "//image.uc.cn/s/uae/g/1v/mobile/head.png",
                feed: "//image.uc.cn/s/uae/g/1v/mobile/feed.png"
            }
        };
        e.exports = function(e, t, i, v) {
            var g = e.wm_id;
            e.reproduce_from && e.reproduce_from.wm_id && (g = e.reproduce_from.wm_id);
            var _ = o.getVipInfo(e);
            (o.isHuaweiPre() || o.platform.isQuark || o.platform.isDingTalk) && (i = !0),
                new Vue({
                    el: ".mediabox",
                    replace: !1,
                    template: n(85),
                    data: {
                        noRender: !!i,
                        show: !1,
                        article: e,
                        media: {},
                        is_followed: void 0,
                        showFollowTip: 0
                    },
                    directives: {
                        statWhenExposure: c,
                        onImpress: d
                    },
                    components: {
                        mediaUc: s
                    },
                    ready: function() {
                        var n = this;
                        o.debug("init mediabox"),
                            $(document).on("media:followWithId", function(e, t) {
                                t.wm_id === globalConfig.wm_id && (n.is_followed = !!t.is_followed)
                            });
                        var i = p.getTest("1137");
                        "video" == e.page_from || o.is_share_mode || i && "C" === i.tag ? n.$data.show = !1 : n.$data.show = !0,
                        v && (n.$data.show = !0);
                        var a = function(e) {
                            l.wm = e,
                                globalConfig.media_open_award = e.open_award,
                                globalConfig.wemedia_vip = e.wemedia_vip || void 0,
                            e.wemedia_vip && (globalConfig.wemedia_vip.vip_icons = h[e.wemedia_vip.vip_type]),
                                n.requestFollowStatus(e || {})
                        };
                        if ($(document).on("media:follow", function(e, t) {
                            n.is_followed = !!t
                        }),
                        e.reproduce_from && e.reproduce_from.wm_id)
                            o.request({
                                url: globalConfig.FASTFISH_DOMAIN + "/author/" + globalConfig.biz_id + "/" + g + "?biz_id=" + globalConfig.biz_id,
                                napi: !1,
                                loading: !0
                            }, function(e, i) {
                                if (i && i.data) {
                                    var o = i.data;
                                    n.$data.media = {
                                        _id: o.author_id,
                                        wm_id: o.author_id,
                                        wm_name: o.author_name,
                                        avatar_url: o.avatar_url,
                                        wm_introduction: o.introduction || "",
                                        wm_special_introduction: o.special_introduction,
                                        open_award: o.open_award && "true" == o.open_award || !1,
                                        wm_field: o.category,
                                        has_opened_ad: o.extra_map && o.extra_map.has_opened_ad || !1,
                                        wemedia_vip: o.extra_map && o.extra_map.wemedia_vip || "",
                                        active: o.active
                                    },
                                        a(n.$data.media),
                                    t && t(n.$data.media || {})
                                }
                            });
                        else {
                            var r = e.weixin_promote && e.wm_weixin_id && "微信公众号: " + e.wm_weixin_id
                                , s = e._author;
                            s || (s = {
                                author_id: e.wm_id || "",
                                author_name: e.wm_name || "",
                                avatar_url: e.avatar_url || "",
                                introduction: r || "",
                                special_introduction: "",
                                open_award: e.open_award || !1,
                                wm_field: [],
                                has_opened_ad: e.is_show_ad,
                                wemedia_vip: !1,
                                active: !0,
                                vipLevel: 0,
                                authDesc: ""
                            }),
                                n.$data.media = {
                                    _id: s.author_id,
                                    wm_id: s.author_id,
                                    wm_name: s.author_name,
                                    avatar_url: s.avatar_url,
                                    wm_introduction: r || s.introduction || "",
                                    wm_special_introduction: s.special_introduction,
                                    open_award: s.open_award && "true" == s.open_award || !1,
                                    wm_field: s.category,
                                    has_opened_ad: s.extra_map && s.extra_map.has_opened_ad || !1,
                                    wemedia_vip: s.extra_map && s.extra_map.wemedia_vip || "",
                                    active: s.active,
                                    vipLevel: _.level,
                                    authDesc: _.authDesc
                                },
                                a(n.$data.media),
                            t && t(n.$data.media || {})
                        }
                        this.updateShowState()
                    },
                    methods: {
                        updateShowState: function() {
                            var e = this;
                            window.fetchUcParams && window.fetchUcParams.then(function() {
                                o.isHuaweiPre() && (e.noRender = !0)
                            }).catch(function() {})
                        },
                        requestFollowStatus: function(t) {
                            var n = this;
                            o.getIsFollowed(e.wm_id, function(i, s) {
                                s && s.data || (s = {
                                    data: {
                                        is_followed: 0
                                    }
                                }),
                                    s && s.data ? (o.debug("request wemedias subscribers info success"),
                                        l.followed = !!s.data.is_followed,
                                        globalConfig.is_followed = s.data.is_followed,
                                        $(document).trigger("media:follow", [s.data.is_followed, !0]),
                                        $(document).trigger("media:followWithId", [{
                                            wm_id: e.wm_id,
                                            is_followed: s.data.is_followed
                                        }]),
                                    globalConfig.is_followed && a.event({
                                        action: "follow_request"
                                    })) : ($(document).trigger("media:follow", [0, !0]),
                                        $(document).trigger("media:followWithId", [{
                                            wm_id: e.wm_id,
                                            is_followed: !1
                                        }]));
                                var c = e._author || {}
                                    , d = c && c.extra_map || {}
                                    , u = _.level ? "https://image.uc.cn/s/uae/g/43/card/" + ["", "gold", "silver", "copper"][_.level] + ".png" : ""
                                    , p = {
                                    media: {
                                        is_followed: !!globalConfig.is_followed,
                                        wm_name: e.wm_name,
                                        wm_id: e.wm_id,
                                        desc: t && t.wm_introduction || "",
                                        avatar_url: f.compress({
                                            src: e.avatar_url,
                                            widthLimit: 200
                                        }),
                                        unread_msg_count: s && s.data && s.data.unread_msg_count || 0,
                                        wemedia_vip: globalConfig.wemedia_vip,
                                        vip_level: d.vip_level,
                                        vip_status: d.vip_status,
                                        auth_desc: _.authDesc,
                                        vip_icon: u || ""
                                    },
                                    success: function() {},
                                    fail: function(e) {}
                                };
                                (o.platform.isUCBrowser && o.platform.isiPhone && r.match(globalConfig.VERSION, "11.6.2.1004~") || o.platform.isUCBrowser && o.platform.isAndroid && r.match(globalConfig.VERSION, "11.6.6.951~")) && (p.article = {
                                    is_original: e.is_original,
                                    publish_at: +new Date(e.publish_at.replace(/-/g, "/")),
                                    author: e.author,
                                    reproduce_from: e.reproduce_from || {}
                                }),
                                    //!_.is_share_mode &&
                                window.ucapi && window.ucapi.infoflow && window.ucapi.infoflow.flushWeMediaInfo && window.ucapi.infoflow.flushWeMediaInfo(p),
                                    setTimeout(function() {
                                        n.followFromUrl()
                                    }, 200)
                            })
                        },
                        followFromUrl: function() {
                            if (!globalConfig.is_followed) {
                                var e = o.urlQuery && o.urlQuery.action;
                                if (e && "follow" === e) {
                                    var t = "auto_follow_" + globalConfig.wm_aid;
                                    if (u.getItem(t))
                                        return;
                                    u.setItem(t, !0),
                                        o.directlyFollow({
                                            from: o.urlQuery && o.urlQuery.action_from || "",
                                            success: function(e) {
                                                $(document).trigger("media:follow", [globalConfig.is_followed]),
                                                    $(document).trigger("media:followWithId", [e])
                                            }
                                        })
                                }
                            }
                        },
                        onImpress: function() {
                            m.expose("wm_tag_show", {
                                spm: "content.wm_tag",
                                location: 1
                            }),
                                m.expose("follow_show", {
                                    spm: "content.follow",
                                    location: 1
                                })
                        }
                    }
                })
        }
    }
    , function(e, t, n) {
        "use strict";
        window.ucsdkloaderLog = window.ucsdkloaderLog || function(e) {
            try {
                var t = window.location.protocol + "//bench.uc.cn/c?uc_param_str=ntnwcpfr"
                    , n = {};
                if (n.app_id = e.appid || 5564,
                    n.d_model = e.logname || "ucsdkloader",
                    n.sdkname = e.sdkname || "",
                    n.sdkurl = e.sdkurl || "",
                    n.path = e.path || window.location.href,
                n.path && n.path.length > 253 && (n.path = n.path.substring(0, 253)),
                    n = JSON.stringify(n),
                !navigator.sendBeacon || !navigator.sendBeacon(t, n)) {
                    var i = new XMLHttpRequest;
                    i.open("post", t, !0),
                        i.setRequestHeader("Content-Type", "application/x-www-form-urlencoded"),
                        i.send(n)
                }
            } catch (e) {}
        }
    }
    , function(e, t, n) {
        "use strict";
        var i = r(n(4))
            , o = r(n(8))
            , a = r(n(28));
        function r(e) {
            return e && e.__esModule ? e : {
                default: e
            }
        }
        window.scriptLoaded("article-lazy"),
            n(99);
        var s = n(98)
            , c = n(84)
            , d = n(36)
            , l = n(83)
            , u = (n(79),
            n(78))
            , f = n(73)
            , p = n(72)
            , m = n(1)
            , h = n(10)
            , v = n(68)
            , g = n(3)
            , _ = n(19)
            , w = n(67)
            , b = n(66)
            , y = n(65)
            , k = n(64).default
            , x = n(35)
            , E = (n(14),
            n(63).default)
            , P = n(59).default
            , S = i.default.utLogger
            , N = n(54)
            , I = n(5)
            , C = n(53)
            , A = n(52)
            , M = function(e) {
            var t = document.createElement("span");
            t.setAttribute("_module_complete", e),
                t.setAttribute("_module_load", "false"),
                document.body.appendChild(t)
        };
        e.exports = {
            init: function(e) {
                A(),
                    m.getReadId(),
                    $(document).on("page:unload", function() {
                        g.event({
                            action: "page_exit"
                        })
                    }),
                    o.default.listen(document.querySelector(".commentsWrap")).then(function() {
                        g.event({
                            action: "comment_show"
                        })
                    });
                var t = m.getIsReflowStyle()
                    , n = globalConfig.wm_aid
                    , i = globalConfig.wm_id;
                setTimeout(function() {
                    window.uc_iflow_anchor_pos && window.scrollTo(0, window.uc_iflow_anchor_pos)
                }, 500),
                    x.init({
                        article: e,
                        page: "article",
                        type: "wemedia",
                        channel: "uc"
                    }),
                    m.init_client_share(e, "article", n, i),
                    a.default.listenUCShareEvent(function() {
                        2 === (arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {}).type && S.click("share_click", {
                            spm: "share_btn.share",
                            shareurl_type: 0
                        })
                    }),
                    m.checkucapi({
                        apiName: "account.getUserVipInfo",
                        success: function() {
                            window.ucapi && window.ucapi.account && window.ucapi.account.getUserVipInfo({
                                success: function(e) {
                                    globalConfig.isVip = e.iv,
                                        $(document).trigger("vipinfo:inited", [e])
                                }
                            })
                        },
                        fail: function() {}
                    }),
                    setTimeout(function() {
                        if (f && f(e),
                        !t && x.shouldLoad("relate-sdk", function(t) {
                            t && c && c(e),
                            t || M("relate")
                        }),
                        !t && p && p(e),
                        !t && x.shouldLoad("tool-bar-sdk-feedback", function(e) {
                            b()
                        }),
                        t && x.shouldLoad("tool-bar-sdk-feedback", function(e) {
                            e && b()
                        }),
                            setTimeout(function() {
                                C()
                            }, 300),
                        !t && x.shouldLoad("comment-sdk", function(t) {
                            if (t) {
                                var n = !1;
                                m.platform.isiPhone && m.platform.isUCBrowser && h.match(globalConfig.VERSION, "11.6.3.1010~") || m.platform.isAndroid && m.platform.isUCBrowser && h.match(globalConfig.VERSION, "11.7.0.953~") ? $(document).on("media:follow", function(t, i) {
                                    if (!n) {
                                        window.__UCCOMMENTDATA__ = {
                                            wmdata: {
                                                article: {
                                                    aid: globalConfig.sm_article_id,
                                                    iswm: 1
                                                },
                                                subscribe: {
                                                    action: i ? "unfollow" : "follow",
                                                    id: globalConfig.wm_id,
                                                    from: 100,
                                                    xss_aid: globalConfig.sm_article_id,
                                                    wm_aid: globalConfig.wm_aid,
                                                    name: e.wm_name,
                                                    avatar_url: e.avatar_url,
                                                    followed: i
                                                }
                                            }
                                        };
                                        var o = m.getShareInfo(e, "article", globalConfig.wm_aid, globalConfig.wm_id);
                                        window.__UCCOMMENT__ = window.__UCCOMMENT__ || {},
                                            window.__UCCOMMENT__.data = window.__UCCOMMENT__.data || {},
                                            window.__UCCOMMENT__.data.shareurl = o.sourceUrl || window.location.href,
                                        window.sdkLoader && window.sdkLoader(window.setCommentEnv({
                                            env: "DEV" == globalConfig.ENV_MODE ? "release" : "prod",
                                            pkgname: "comment-sdk.commentsdk",
                                            https: m.is_https_mode,
                                            staticHost: "images.uc.cn"
                                        }), function() {
                                            window.scriptLoaded("comment-sdk.commentsdk")
                                        }, function(e) {
                                            window.ucsdkloaderLog && window.ucsdkloaderLog({
                                                sdkname: "commentsdk",
                                                sdkurl: e.src
                                            })
                                        }),
                                            n = !0,
                                            setTimeout(function() {
                                                $(".commentsWrap") && $(".commentsWrap").children().length || g.event({
                                                    action: "comment_sdk_error"
                                                })
                                            }, 7e3)
                                    }
                                }) : (M("comment"),
                                    l(e))
                            } else
                                M("comment")
                        }),
                            x.shouldLoad("wemedia-card", function(n) {
                                s && s(e, function(n) {
                                    n.wemedia_vip && d.pushMessageToClient(e),
                                        function(n) {
                                            x.shouldLoad("tool-bar-sdk", function(i) {
                                                if (i) {
                                                    var o = m.getShareInfo(e, "article", globalConfig.wm_aid, globalConfig.wm_id);
                                                    !t && x.shouldLoad(["tool-bar-sdk-award", "tool-bar-sdk-like", "tool-bar-sdk-feedback", "tool-bar-sdk-share"], function(t) {
                                                        var i = m.getArticleProduceInfo(e)
                                                            , a = i.isReproduce ? "转载自: " : "作者: "
                                                            , r = i.name ? "" + a + i.name : "";
                                                        y && y({
                                                            toolBarSdk_isIn: "zmt",
                                                            toolBarSdk_type: "article",
                                                            toolBarSdk_data: e,
                                                            toolBarSdk_stat: g,
                                                            toolBarSdk_media: n,
                                                            toolBarSdk_goldlog: _,
                                                            toolBarSdk_other: {
                                                                isAwardRender: t[0],
                                                                isLikeRender: t[1],
                                                                isReportRender: t[2]
                                                            },
                                                            tyle: "zmt",
                                                            page: "article",
                                                            data: e,
                                                            stat: g,
                                                            media: n,
                                                            goldlog: _,
                                                            authorInfo: r,
                                                            componentConfig: {
                                                                Author: !0,
                                                                Origin: !0,
                                                                Award: t[0],
                                                                Like: t[1],
                                                                Report: t[2],
                                                                ShareWechat: t[3],
                                                                ShareTimeline: t[3]
                                                            },
                                                            shareInfo: {
                                                                title: o.title,
                                                                content: o.content,
                                                                url: o.sourceUrl,
                                                                sourceUrl: o.sourceUrl,
                                                                iconUrl: o.iconUrl
                                                            }
                                                        })
                                                    })
                                                } else
                                                    M("toolbar")
                                            }),
                                                x.shouldLoad("ad-card-huichuan", function(t) {
                                                    t && (e.reproduce_from || u && u.init(e, n))
                                                })
                                        }(n)
                                }, !n || m.platform.isUCMini || t)
                            }),
                        1 == Math.round(100 * Math.random()) && w.init({
                            openTest: !0,
                            testpage: "wm"
                        }),
                        m.platform.isUCBrowser && globalConfig.sm_article_id && v.init(".article-content", globalConfig.sm_article_id),
                            t) {
                            var n = 2 === t ? "channel_unfold" : "push_bottom_unfold";
                            window.UC_SHOW_MORE && window.UC_SHOW_MORE.enable({
                                maxHeight: 2 * window.innerHeight,
                                shouldModalShow: function() {
                                    return !1
                                },
                                onShowMore: function() {
                                    I.log({
                                        region: n,
                                        action: "click"
                                    })
                                }
                            }),
                                m.onImpress(".show-more-container", "100%", function() {
                                    I.log({
                                        region: n,
                                        action: "show"
                                    })
                                }),
                                N.initFooter()
                        }
                        window.getXissData && window.getXissData.then(function(e) {
                            var t = m.platform.isAndroid && h.match(globalConfig.VERSION, "12.2.6~")
                                , n = m.platform.isiPhone && h.match(globalConfig.VERSION, "12.2.8~");
                            m.platform.isUCBrowser && (t || n) && e.axis_id && E.init({
                                id: e.axis_id,
                                title: e.axis_title,
                                fromArticle: e,
                                urlQuery: m.urlQuery
                            }),
                            m.platform.isUCBrowser && P.init({
                                data: e,
                                container: document.querySelector("#article-push-sdk-p1")
                            })
                        }).catch(function() {}),
                        globalConfig && globalConfig.isHttps && k()
                    }, 100)
            }
        }
    }
    , function(e, t, n) {
        "use strict";
        var i = function(e) {
            return e && e.__esModule ? e : {
                default: e
            }
        }(n(17));
        var o = n(1);
        e.exports = function(e, t, n) {
            !function(e) {
                switch (e) {
                    case "article":
                        window.SHARESDK__OPTIONS = {
                            page: "weArticle"
                        };
                        break;
                    case "video":
                        window.SHARESDK__OPTIONS = {
                            page: "weVideo"
                        },
                            window.SLIDERSDK__CONFIG = {
                                page: "video"
                            }
                }
            }(e);
            var a = {
                pkgName: "video" === e ? "article-share-sdk.video-wemedia" : "article-share-sdk.article-wemedia",
                env: o && o.urlQuery && o.urlQuery.uc_sharesdk_release ? "release" : void 0
            };
            (0,
                i.default)(a).then(t).catch(n)
        }
    }
    , function(e, t, n) {
        "use strict";
        var i = function(e) {
            return e && e.__esModule ? e : {
                default: e
            }
        }(n(4)).default.utLogger
            , o = n(5);
        function a(e) {
            if (!e || !e.getBoundingClientRect)
                return !1;
            var t = e.getBoundingClientRect() || {}
                , n = t.top
                , i = void 0 === n ? 0 : n
                , o = t.height
                , a = void 0 === o ? 0 : o;
            return i < window.innerHeight - a && i > 0
        }
        t.init = function(e) {
            !function() {
                var e = document.querySelectorAll("iframe.article-xiami-card")
                    , t = document.querySelectorAll("iframe.article-film-card")
                    , n = function() {
                    if (e && e.length) {
                        var n = [].slice.call(e);
                        n && n.forEach && n.forEach(function(e, t) {
                            !e.__hasShow && a(e) && (e.__hasShow = !0,
                                o.log({
                                    region: "music_card",
                                    action: "show",
                                    label: t
                                }),
                                i.expose("music_card_show", {
                                    spm: "music.music_card"
                                }))
                        })
                    }
                    if (t && t.length) {
                        var r = [].slice.call(t);
                        r && r.forEach && r.forEach(function(e, t) {
                            if (!e.__hasShow && a(e)) {
                                e.__hasShow = !0;
                                var n = e.getAttribute("data-name") || "";
                                i.expose("filmcard_show", {
                                    spm: "film.film",
                                    filmName: n
                                })
                            }
                        })
                    }
                };
                window.addEventListener("scroll", n),
                    n()
            }(),
                window.addEventListener("message", function(t) {
                    var n = t.data || {}
                        , a = n.type || ""
                        , r = n.data || {};
                    if ("xiami-card-click" === a) {
                        var s = r.url;
                        s && (o.log({
                            region: "music_card",
                            action: "click_deta"
                        }),
                            i.click("music_card_click", {
                                spm: "music.music_card"
                            }),
                            setTimeout(function() {
                                window.location.href = s
                            }, 200))
                    }
                    var c = r.filmData
                        , d = void 0 === c ? {} : c
                        , l = function() {
                        i.click("filmcard_click", {
                            spm: "film.film",
                            filmName: d.show_name
                        })
                    }
                        , u = function() {
                        var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {};
                        return Object.keys(e || {}).map(function(t) {
                            return t + "=" + encodeURIComponent(e[t])
                        }).join("&")
                    };
                    if ("film-card-detail-click" !== a)
                        if ("film-card-buy-click" !== a)
                            ;
                        else {
                            l();
                            var f = {
                                activityid: 0,
                                bottomtab: "hide",
                                fcode: "",
                                from: "uc",
                                spm: "dianying.uc.cgm.ucuid%3D" + e.author_id + "%26uccid%3D" + e.content_id,
                                sqm: "dianying.uc.cgm.ucuid%3D" + e.author_id + "%26uccid%3D" + e.content_id,
                                showid: d.id,
                                showname: d.show_name,
                                uc_biz_str: "S:custom|C:iflow_ncmt"
                            };
                            setTimeout(function() {
                                window.location.href = "https://h5.m.taopiaopiao.com/app/moviemain/pages/show-cinema-list/index.html?" + u(f)
                            })
                        }
                    else {
                        l();
                        var p = {
                            from: "uc",
                            spm: "dianying.uc.cgm.ucuid%3D" + e.author_id + "%26uccid%3D" + e.content_id,
                            sqm: "dianying.uc.cgm.ucuid%3D" + e.author_id + "%26uccid%3D" + e.content_id,
                            showid: d.id,
                            uc_biz_str: "S:custom|C:iflow_ncmt"
                        };
                        setTimeout(function() {
                            window.location.href = "https://h5.m.taopiaopiao.com/app/moviemain/pages/show-detail/index.html?" + u(p)
                        }, 200)
                    }
                })
        }
    }
    , function(e, t) {
        e.exports = '<div class="show-more" v-if="enable" @click="onClickShowMore">\n  <div class="show-more-bg"></div>\n  <span class="show-more-text">{{text}}</span>\n</div>\n<div class="modal-wrapper" v-bind:class="{\'visible\': modalVisble }">\n  <div class="modal-box">\n    <div class="modal-header"><h2>{{modalText}}</h2></div>\n    <div class="modal-body"></div>\n    <div class="modal-footer">\n      <div class="modal-btn btn-cancel" v-on:click="onModalCancel">取消</div>\n      <div class="modal-btn btn-confirm" v-on:click="onModalConfirm">确定</div>\n    </div>\n  </div>\n</div>'
    }
    , function(e, t, n) {
        e.exports = n.p + "components/pages/article/showMore/more_9fdef.png"
    }
    , function(e, t, n) {
        var i = n(9);
        (e.exports = n(7)(!1)).push([e.i, '.show-more{overflow:hidden;position:relative;height:80px;background-image:-webkit-linear-gradient(top,hsla(0,0%,100%,.5),#fff);background-image:linear-gradient(180deg,rgba(255,255,225,0),#fff 50%);-webkit-animation:fadeIn .2s;animation:fadeIn .2s;padding:0 15px;margin:-80px auto 20px}.show-more-bg{background-image:linear-gradient(0deg,#fff 22%,hsla(0,0%,100%,0));height:60px;display:none}.show-more-text{display:block;margin:0 auto;font-size:16px;margin-top:40px;letter-spacing:2px;width:100%;text-align:center;background-color:#2696ff;border-radius:5px;color:#fff;height:40px;line-height:40px}.show-more-text:after{content:"";display:none;float:right;width:16px;height:16px;background:url(' + i(n(104)) + ') no-repeat 0 0;background-size:16px 16px;margin-right:5px;margin-top:4px}.modal-wrapper{position:fixed;top:0;left:0;right:0;bottom:0;z-index:999999;background:rgba(0,0,0,.5);opacity:0;visibility:hidden;transition:all .3s ease;-webkit-transition:all .3s ease}.modal-wrapper.visible{visibility:initial;opacity:1}.modal-wrapper.visible .modal-box{-webkit-transform:none;transform:none}.modal-box{position:fixed;left:50%;top:50%;width:290px;margin-left:-145px;margin-top:-120px;text-align:center;border-radius:8px;background:#fff;overflow:hidden;-webkit-transition:-webkit-transform .3s ease;transition:transform .3s ease;-webkit-transform:scale3d(1.2,1.2,1);transform:scale3d(1.2,1.2,1)}.modal-box .modal-header h2{margin:0;font-size:18px;padding-top:15px;color:#333}.modal-box .modal-body{padding:10px;line-height:1.5;position:relative}.modal-box .modal-body:after{content:"";position:absolute;left:15px;right:15px;height:1px;bottom:0;background:#eee;transform:scaleY(.5);-webkit-transform:scaleY(.5)}.modal-box .modal-footer .modal-btn{width:40%;font-size:17px;line-height:1.6;margin:10px 5px;display:inline-block}.modal-btn.btn-confirm{color:#09f}.modal-btn.btn-cancel{color:#999}', ""])
    }
    , function(e, t, n) {
        var i = n(105);
        "string" == typeof i && (i = [[e.i, i, ""]]);
        var o = {
            hmr: !0,
            transform: void 0,
            insertInto: void 0
        };
        n(6)(i, o);
        i.locals && (e.exports = i.locals)
    }
    , function(e, t, n) {
        "use strict";
        var i = "function" == typeof Symbol && "symbol" == typeof Symbol.iterator ? function(e) {
                return typeof e
            }
            : function(e) {
                return e && "function" == typeof Symbol && e.constructor === Symbol && e !== Symbol.prototype ? "symbol" : typeof e
            }
        ;
        n(106);
        var o = n(1)
            , a = {
            onShowMore: function() {},
            shouldModalShow: function() {
                return !0
            },
            onModalCancel: function() {},
            onModalConfirm: function() {
                return !0
            },
            onModalShow: function() {}
        };
        e.exports = {
            init: function() {
                new Vue({
                    el: ".show-more-container",
                    replace: !1,
                    template: n(103),
                    data: {
                        el: ".show-more-container",
                        text: "点击展开全文",
                        maxHeight: 1200,
                        enable: !1,
                        modalVisble: !1,
                        modalText: o.isTaojinIflow ? "前往精彩头条查看原文,体验更佳" : "前往UC查看原文,体验更佳"
                    },
                    created: function() {
                        var e = this;
                        window.UC_SHOW_MORE = {
                            enable: function(t) {
                                t && ("object" === (void 0 === t ? "undefined" : i(t)) && (e.maxHeight = t.maxHeight || e.maxHeight,
                                    e.text = t.text || e.text,
                                    a = Object.assign({}, a, t)),
                                    e.enable = !0)
                            },
                            el: e.el
                        }
                    },
                    watch: {
                        enable: function(e) {
                            var t = this
                                , n = $(".content-cover")
                                , i = this.maxHeight;
                            e ? !((n.height() || 0) + 50 <= i) ? n.css({
                                "max-height": i + "px",
                                overflow: "hidden"
                            }) : this.$nextTick(function() {
                                t.enable = !1
                            }) : n.css({
                                "max-height": "none",
                                overflow: "visible"
                            })
                        },
                        modalVisble: function(e) {
                            e && setTimeout(function() {
                                return a.onModalShow()
                            }, 0)
                        }
                    },
                    methods: {
                        onClickShowMore: function() {
                            if (!a.shouldModalShow())
                                return setTimeout(function() {
                                    return a.onShowMore()
                                }, 0),
                                    void (this.enable = !1);
                            this.modalVisble = !0
                        },
                        onModalCancel: function() {
                            setTimeout(function() {
                                return a.onModalCancel()
                            }, 0),
                                this.modalVisble = !1,
                                this.enable = !1
                        },
                        onModalConfirm: function() {
                            setTimeout(function() {
                                return a.onModalConfirm()
                            }, 0),
                                this.modalVisble = !1,
                                this.enable = !1
                        }
                    }
                })
            }
        }
    }
    , function(e, t) {
        e.exports = function(e) {
            var t = "undefined" != typeof window && window.location;
            if (!t)
                throw new Error("fixUrls requires window.location");
            if (!e || "string" != typeof e)
                return e;
            var n = t.protocol + "//" + t.host
                , i = n + t.pathname.replace(/\/[^\/]*$/, "/");
            return e.replace(/url\s*\(((?:[^)(]|\((?:[^)(]+|\([^)(]*\))*\))*)\)/gi, function(e, t) {
                var o, a = t.trim().replace(/^"(.*)"$/, function(e, t) {
                    return t
                }).replace(/^'(.*)'$/, function(e, t) {
                    return t
                });
                return /^(#|data:|http:\/\/|https:\/\/|file:\/\/\/|\s*$)/i.test(a) ? e : (o = 0 === a.indexOf("//") ? a : 0 === a.indexOf("/") ? n + a : i + a.replace(/^\.\//, ""),
                "url(" + JSON.stringify(o) + ")")
            })
        }
    }
    , function(e, t, n) {
        e.exports = n.p + "components/pages/article/wm-recommend/imgs/go2_fda6d.png"
    }
    , function(e, t, n) {
        e.exports = n.p + "components/pages/article/wm-recommend/imgs/go_77c45.png"
    }
    , function(e, t, n) {
        e.exports = n.p + "components/pages/article/wm-recommend/imgs/plus_6aae8.png"
    }
    , function(e, t, n) {
        var i = n(9);
        (e.exports = n(7)(!1)).push([e.i, '.hairlines .pages-article-wm-recommend_main,.hairlines .pages-article-wm-recommend_main-tip-bar,.hairlines .pages-article-wm-recommend_wms-item,.hairlines .pages-article-wm-recommend_wms-tip-bar{border-width:.5px}.pages-article-wm-recommend_wms{position:relative;margin-bottom:14px;height:216px;font-size:0;text-align:right;will-change:height;transition:height .3s;transform:translateZ(0);overflow:hidden}.pages-article-wm-recommend_wms.close{height:0;margin:0}.pages-article-wm-recommend_wms:before{content:"";display:inline-block;width:0;height:0;margin-right:35px;border:10px solid transparent;border-bottom-color:#f8f8f8}.pages-article-wm-recommend_wms.header:before{margin-right:20px}.pages-article-wm-recommend_wms-inner{padding:15px 0;background-color:#f8f8f8;font-size:14px;text-align:left}.pages-article-wm-recommend_wms-tip{padding:0 15px}.pages-article-wm-recommend_wms-tip-text{letter-spacing:1px;font-weight:700;font-size:14px;line-height:20px;padding-bottom:14px;color:#bbb}.pages-article-wm-recommend_wms-items{overflow-x:scroll;-webkit-overflow-scrolling:touch;white-space:nowrap;padding:0 15px}.pages-article-wm-recommend_wms-items::-webkit-scrollbar{display:none}.pages-article-wm-recommend_wms-item{position:relative;display:inline-block;width:96px;border-right:1px solid #eee;white-space:normal;vertical-align:top}.pages-article-wm-recommend_wms-item-avatar{position:relative}.pages-article-wm-recommend_wms-item-avatar img{display:block;margin:0 auto;width:40px;height:40px;border-radius:50%;overflow:hidden}.pages-article-wm-recommend_wms-item-avatar-vip{display:block;background-repeat:no-repeat;background-position:50%;background-size:cover;width:14px;height:14px;position:absolute;right:28px;bottom:0}.pages-article-wm-recommend_wms-item-avatar-vip-gold{background-image:url(' + i(n(39)) + ")}.pages-article-wm-recommend_wms-item-avatar-vip-silver{background-image:url(" + i(n(38)) + ")}.pages-article-wm-recommend_wms-item-avatar-vip-copper{background-image:url(" + i(n(37)) + ")}.pages-article-wm-recommend_wms-item-name{font-size:12px;line-height:24px;color:#333;text-align:center;font-weight:700;margin-top:2px;white-space:nowrap;overflow:hidden;text-overflow:ellipsis}.pages-article-wm-recommend_wms-item-intro{display:-webkit-box;-webkit-line-clamp:2;-webkit-box-orient:vertical;height:36px;padding:0 6px;overflow:hidden;text-align:center;line-height:18px;font-size:12px;color:#bbb}.pages-article-wm-recommend_wms-item-bottom{margin-top:10px;width:100%;color:#333;line-height:30px;text-align:center;font-size:14px}.pages-article-wm-recommend_wms-item-follow{display:block;margin:6px auto 0;width:60px;height:24px;line-height:24px;border-radius:5px;background-color:#2696ff;border:0;padding:0;outline:none;color:#fff;font-size:12px;text-align:center}.pages-article-wm-recommend_wms-item-follow.followed{background:#eee;color:#bbb}.pages-article-wm-recommend_wms-more{position:relative;display:inline-block;vertical-align:top;width:96px;white-space:normal}.pages-article-wm-recommend_wms-more-plus{display:block;height:40px;line-height:40px;text-align:center;margin-bottom:20px}.pages-article-wm-recommend_wms-more-plus-point{display:inline-block;width:6px;height:6px;border-radius:50%;background-color:#2696ff;margin-right:2px}.pages-article-wm-recommend_wms-more-text{line-height:18px;text-align:center;color:#333;font-size:12px}.pages-article-wm-recommend_icon{position:relative;display:inline-block;background-repeat:no-repeat}.pages-article-wm-recommend_icon-plus{width:22px;height:22px;background-image:url(" + i(n(111)) + ");background-size:22px 22px}.pages-article-wm-recommend_icon-go{width:5px;height:9px;background-image:url(" + i(n(110)) + ");background-size:5px 9px}.pages-article-wm-recommend_icon-go2{width:4px;height:7px;background-image:url(" + i(n(109)) + ");background-size:4px 7px}.hairlines .pages-article-wm-recommend_more-tip{border-width:.5px}@media screen and (max-width:375px){.pages-article-wm-recommend_main-avatar{width:40px;height:40px}.pages-article-wm-recommend_main-info{margin-left:48px;margin-right:80px}.pages-article-wm-recommend_main-info-name{font-size:17px;line-height:1.2;margin-top:4px;letter-spacing:1.1px}.pages-article-wm-recommend_main-info-name img{width:36px;height:12px}.pages-article-wm-recommend_main-info-desc{font-size:11px;line-height:1.2;margin-top:5px}.pages-article-wm-recommend_main-button{top:24px}.pages-article-wm-recommend_main-button-follow{font-size:11px;padding:0 11px;line-height:25px}}@media screen and (max-width:320px){.pages-article-wm-recommend_main-avatar{width:36px;height:36px}.pages-article-wm-recommend_main-info{margin-left:45px;margin-right:70px}.pages-article-wm-recommend_main-info-name{font-size:13px;letter-spacing:0}.pages-article-wm-recommend_main-info-name img{width:30px;height:10px;margin-bottom:0}.pages-article-wm-recommend_main-info-desc{font-size:10px}.pages-article-wm-recommend_main-button-follow{font-size:11px;padding:0 10px;line-height:23px}}", ""])
    }
    , function(e, t, n) {
        var i = n(112);
        "string" == typeof i && (i = [[e.i, i, ""]]);
        var o = {
            hmr: !0,
            transform: void 0,
            insertInto: void 0
        };
        n(6)(i, o);
        i.locals && (e.exports = i.locals)
    }
    , function(e, t) {
        e.exports = '<div class="pages-article-wm-recommend_wms {{showList ? \'open\' : \'close\'}} {{pos === \'header\' ? \'header\' : \'\' }}">\n  <div class="pages-article-wm-recommend_wms-inner">\n    <div class="pages-article-wm-recommend_wms-tip">\n      <div class="pages-article-wm-recommend_wms-tip-text">你可能还想关注</div>\n    </div>\n    <div class="pages-article-wm-recommend_wms-container" v-el:wms-container>\n      <div class="pages-article-wm-recommend_wms-items" v-el:wms-items>\n        <div v-for="wm in wms" class="pages-article-wm-recommend_wms-item">\n          <div class="pages-article-wm-recommend_wms-item-content">\n            <div class="pages-article-wm-recommend_wms-item-avatar" @click.stop="onGotoOtherHomepage(wm)">\n              <img :src="wm.avatar_url | formatImageSchema">\n              <i class="pages-article-wm-recommend_wms-item-avatar-vip pages-article-wm-recommend_wms-item-avatar-vip-gold" v-if="wm.$$vipLevel == 1"></i>\n              <i class="pages-article-wm-recommend_wms-item-avatar-vip pages-article-wm-recommend_wms-item-avatar-vip-silver" v-if="wm.$$vipLevel == 2"></i>\n              <i class="pages-article-wm-recommend_wms-item-avatar-vip pages-article-wm-recommend_wms-item-avatar-vip-copper" v-if="wm.$$vipLevel == 3"></i>\n            </div>\n            <div class="pages-article-wm-recommend_wms-item-name" @click.stop="onGotoOtherHomepage(wm)">{{ wm.wm_name }}</div>\n            <div class="pages-article-wm-recommend_wms-item-intro">{{ wm.wm_introduction }}</div>\n            <button class="pages-article-wm-recommend_wms-item-follow {{wm.$$followed ? \'followed\' : \'\'}}" @click.stop="onFollow(wm)">{{wm.$$followed ? \'已关注\' : \'+关注\'}}</button>\n          </div>\n        </div>\n        <div class="pages-article-wm-recommend_wms-more" @click.stop="onGotoMore()">\n          <div class="pages-article-wm-recommend_wms-more-content">\n            <div class="pages-article-wm-recommend_wms-more-plus">\n              <span class="pages-article-wm-recommend_wms-more-plus-point"></span>\n              <span class="pages-article-wm-recommend_wms-more-plus-point"></span>\n              <span class="pages-article-wm-recommend_wms-more-plus-point"></span>\n            </div>\n            <div class="pages-article-wm-recommend_wms-more-text">\n              查看更多[{{ category }}]<br>\n              领域优质大鱼号\n            </div>\n          </div>\n        </div>\n      </div>\n    </div>\n  </div>\n</div>'
    }
    , function(e, t) {
        (function(t) {
                e.exports = t
            }
        ).call(this, {})
    }
    , function(e, t, n) {
        "use strict";
        var i, o, a = "function" == typeof Symbol && "symbol" == typeof Symbol.iterator ? function(e) {
                return typeof e
            }
            : function(e) {
                return e && "function" == typeof Symbol && e.constructor === Symbol && e !== Symbol.prototype ? "symbol" : typeof e
            }
        ;
        !function(r) {
            var s = !1;
            if (n(115) && (void 0 !== (o = "function" == typeof (i = r) ? i.call(t, n, t, e) : i) && (e.exports = o),
                s = !0),
            "object" == a(t) && (e.exports = r(),
                s = !0),
                !s) {
                var c = window.Cookies
                    , d = window.Cookies = r();
                d.noConflict = function() {
                    return window.Cookies = c,
                        d
                }
            }
        }(function() {
            function e() {
                for (var e = 0, t = {}; e < arguments.length; e++) {
                    var n = arguments[e];
                    for (var i in n)
                        t[i] = n[i]
                }
                return t
            }
            return function t(n) {
                function i(t, o, a) {
                    var r;
                    if ("undefined" != typeof document) {
                        if (arguments.length > 1) {
                            if ("number" == typeof (a = e({
                                path: "/"
                            }, i.defaults, a)).expires) {
                                var s = new Date;
                                s.setMilliseconds(s.getMilliseconds() + 864e5 * a.expires),
                                    a.expires = s
                            }
                            a.expires = a.expires ? a.expires.toUTCString() : "";
                            try {
                                r = JSON.stringify(o),
                                /^[\{\[]/.test(r) && (o = r)
                            } catch (e) {}
                            o = n.write ? n.write(o, t) : encodeURIComponent(String(o)).replace(/%(23|24|26|2B|3A|3C|3E|3D|2F|3F|40|5B|5D|5E|60|7B|7D|7C)/g, decodeURIComponent),
                                t = (t = (t = encodeURIComponent(String(t))).replace(/%(23|24|26|2B|5E|60|7C)/g, decodeURIComponent)).replace(/[\(\)]/g, escape);
                            var c = "";
                            for (var d in a)
                                a[d] && (c += "; " + d,
                                !0 !== a[d] && (c += "=" + a[d]));
                            return document.cookie = t + "=" + o + c
                        }
                        t || (r = {});
                        for (var l = document.cookie ? document.cookie.split("; ") : [], u = /(%[0-9A-Z]{2})+/g, f = 0; f < l.length; f++) {
                            var p = l[f].split("=")
                                , m = p.slice(1).join("=");
                            this.json || '"' !== m.charAt(0) || (m = m.slice(1, -1));
                            try {
                                var h = p[0].replace(u, decodeURIComponent);
                                if (m = n.read ? n.read(m, h) : n(m, h) || m.replace(u, decodeURIComponent),
                                    this.json)
                                    try {
                                        m = JSON.parse(m)
                                    } catch (e) {}
                                if (t === h) {
                                    r = m;
                                    break
                                }
                                t || (r[h] = m)
                            } catch (e) {}
                        }
                        return r
                    }
                }
                return i.set = i,
                    i.get = function(e) {
                        return i.call(i, e)
                    }
                    ,
                    i.getJSON = function() {
                        return i.apply({
                            json: !0
                        }, [].slice.call(arguments))
                    }
                    ,
                    i.defaults = {},
                    i.remove = function(t, n) {
                        i(t, "", e(n, {
                            expires: -1
                        }))
                    }
                    ,
                    i.withConverter = t,
                    i
            }(function() {})
        })
    }
    , function(e, t) {
        e.exports = function(e) {
            return e.webpackPolyfill || (e.deprecate = function() {}
                ,
                e.paths = [],
            e.children || (e.children = []),
                Object.defineProperty(e, "loaded", {
                    enumerable: !0,
                    get: function() {
                        return e.l
                    }
                }),
                Object.defineProperty(e, "id", {
                    enumerable: !0,
                    get: function() {
                        return e.i
                    }
                }),
                e.webpackPolyfill = 1),
                e
        }
    }
    , function(e, t, n) {
        "use strict";
        (function(e) {
                var n, i, o, a = "function" == typeof Symbol && "symbol" == typeof Symbol.iterator ? function(e) {
                        return typeof e
                    }
                    : function(e) {
                        return e && "function" == typeof Symbol && e.constructor === Symbol && e !== Symbol.prototype ? "symbol" : typeof e
                    }
                ;
                !function(r, s) {
                    "object" == a(t) && "object" == a(e) ? e.exports = s() : (i = [],
                    void 0 === (o = "function" == typeof (n = s) ? n.apply(t, i) : n) || (e.exports = o))
                }("undefined" != typeof self && self, function() {
                    return function(e) {
                        function t(i) {
                            if (n[i])
                                return n[i].exports;
                            var o = n[i] = {
                                i: i,
                                l: !1,
                                exports: {}
                            };
                            return e[i].call(o.exports, o, o.exports, t),
                                o.l = !0,
                                o.exports
                        }
                        var n = {};
                        return t.m = e,
                            t.c = n,
                            t.d = function(e, n, i) {
                                t.o(e, n) || Object.defineProperty(e, n, {
                                    configurable: !1,
                                    enumerable: !0,
                                    get: i
                                })
                            }
                            ,
                            t.n = function(e) {
                                var n = e && e.__esModule ? function() {
                                        return e.default
                                    }
                                    : function() {
                                        return e
                                    }
                                ;
                                return t.d(n, "a", n),
                                    n
                            }
                            ,
                            t.o = function(e, t) {
                                return Object.prototype.hasOwnProperty.call(e, t)
                            }
                            ,
                            t.p = "//image.uc.cn/s/uae/g/1y/universal-header-sdk/",
                            t(t.s = 17)
                    }([function(e, t, n) {
                        t.__esModule = !0,
                            t.default = function(e, t) {
                                if (!(e instanceof t))
                                    throw new TypeError("Cannot call a class as a function")
                            }
                    }
                        , function(e, t, n) {
                            t.__esModule = !0;
                            var i = function(e) {
                                return e && e.__esModule ? e : {
                                    default: e
                                }
                            }(n(48));
                            t.default = function() {
                                function e(e, t) {
                                    for (var n = 0; n < t.length; n++) {
                                        var o = t[n];
                                        o.enumerable = o.enumerable || !1,
                                            o.configurable = !0,
                                        "value"in o && (o.writable = !0),
                                            (0,
                                                i.default)(e, o.key, o)
                                    }
                                }
                                return function(t, n, i) {
                                    return n && e(t.prototype, n),
                                    i && e(t, i),
                                        t
                                }
                            }()
                        }
                        , function(e, t) {
                            var n = e.exports = {
                                version: "2.6.11"
                            };
                            "number" == typeof __e && (__e = n)
                        }
                        , function(e, t, n) {
                            e.exports = !n(10)(function() {
                                return 7 != Object.defineProperty({}, "a", {
                                    get: function() {
                                        return 7
                                    }
                                }).a
                            })
                        }
                        , function(e, t, n) {
                            Object.defineProperty(t, "__esModule", {
                                value: !0
                            }),
                                t.default = {
                                    dateTranslate: function(e, t) {
                                        var n = {
                                            "M+": e.getMonth() + 1,
                                            "d+": e.getDate(),
                                            "h+": e.getHours(),
                                            "m+": e.getMinutes(),
                                            "s+": e.getSeconds(),
                                            "q+": Math.floor((e.getMonth() + 3) / 3),
                                            S: e.getMilliseconds()
                                        };
                                        for (var i in /(y+)/.test(t) && (t = t.replace(RegExp.$1, ("" + e.getFullYear()).substr(4 - RegExp.$1.length))),
                                            n)
                                            new RegExp("(" + i + ")").test(t) && (t = t.replace(RegExp.$1, 1 == RegExp.$1.length ? n[i] : ("00" + n[i]).substr(("" + n[i]).length)));
                                        return t
                                    },
                                    goToHomePage: function(e) {
                                        var t = e.wmId
                                            , n = e.name
                                            , i = e.logo
                                            , o = e.isFollowed
                                            , a = e.from;
                                        e.homePageUrl,
                                        t && window.ucapi && window.ucapi.wemedia && window.ucapi.wemedia.openHomePage({
                                            id: t,
                                            name: n,
                                            avatar_url: i,
                                            followed: o,
                                            target: "index",
                                            from: a || 16,
                                            fail: function() {
                                                that.props.homePageUrl && (window.location.href = that.props.homePageUrl)
                                            }
                                        })
                                    },
                                    replaceUrlSchema: function(e) {
                                        if (!e || !e.replace)
                                            return e;
                                        var t = e.replace("http://", "//");
                                        return t && t.replace("image.zzd.sm.cn", "image.uczzd.cn") || ""
                                    },
                                    htmlEscape: function(e) {
                                        return e && e.replace && e.replace(/[<>"&]/g, function(e, t, n) {
                                            switch (e) {
                                                case "<":
                                                    return "&lt;";
                                                case ">":
                                                    return "&gt;";
                                                case "&":
                                                    return "&amp;";
                                                case '"':
                                                    return "&quot;";
                                                default:
                                                    return ""
                                            }
                                        }) || ""
                                    }
                                }
                        }
                        , function(e, t) {
                            function n(e, t) {
                                var n = e[1] || ""
                                    , i = e[3];
                                if (!i)
                                    return n;
                                if (t && "function" == typeof btoa) {
                                    var o = function(e) {
                                        return "/*# sourceMappingURL=data:application/json;charset=utf-8;base64," + btoa(unescape(encodeURIComponent(JSON.stringify(e)))) + " */"
                                    }(i);
                                    return [n].concat(i.sources.map(function(e) {
                                        return "/*# sourceURL=" + i.sourceRoot + e + " */"
                                    })).concat([o]).join("\n")
                                }
                                return [n].join("\n")
                            }
                            e.exports = function(e) {
                                var t = [];
                                return t.toString = function() {
                                    return this.map(function(t) {
                                        var i = n(t, e);
                                        return t[2] ? "@media " + t[2] + "{" + i + "}" : i
                                    }).join("")
                                }
                                    ,
                                    t.i = function(e, n) {
                                        "string" == typeof e && (e = [[null, e, ""]]);
                                        for (var i = {}, o = 0; o < this.length; o++) {
                                            var a = this[o][0];
                                            "number" == typeof a && (i[a] = !0)
                                        }
                                        for (o = 0; o < e.length; o++) {
                                            var r = e[o];
                                            "number" == typeof r[0] && i[r[0]] || (n && !r[2] ? r[2] = n : n && (r[2] = "(" + r[2] + ") and (" + n + ")"),
                                                t.push(r))
                                        }
                                    }
                                    ,
                                    t
                            }
                        }
                        , function(e, t, n) {
                            function i(e, t) {
                                for (var n = 0; n < e.length; n++) {
                                    var i = e[n]
                                        , o = p[i.id];
                                    if (o) {
                                        o.refs++;
                                        for (var a = 0; a < o.parts.length; a++)
                                            o.parts[a](i.parts[a]);
                                        for (; a < i.parts.length; a++)
                                            o.parts.push(u(i.parts[a], t))
                                    } else {
                                        var r = [];
                                        for (a = 0; a < i.parts.length; a++)
                                            r.push(u(i.parts[a], t));
                                        p[i.id] = {
                                            id: i.id,
                                            refs: 1,
                                            parts: r
                                        }
                                    }
                                }
                            }
                            function o(e, t) {
                                for (var n = [], i = {}, o = 0; o < e.length; o++) {
                                    var a = e[o]
                                        , r = t.base ? a[0] + t.base : a[0]
                                        , s = {
                                        css: a[1],
                                        media: a[2],
                                        sourceMap: a[3]
                                    };
                                    i[r] ? i[r].parts.push(s) : n.push(i[r] = {
                                        id: r,
                                        parts: [s]
                                    })
                                }
                                return n
                            }
                            function r(e, t) {
                                var n = h(e.insertInto);
                                if (!n)
                                    throw new Error("Couldn't find a style target. This probably means that the value for the 'insertInto' parameter is invalid.");
                                var i = _[_.length - 1];
                                if ("top" === e.insertAt)
                                    i ? i.nextSibling ? n.insertBefore(t, i.nextSibling) : n.appendChild(t) : n.insertBefore(t, n.firstChild),
                                        _.push(t);
                                else if ("bottom" === e.insertAt)
                                    n.appendChild(t);
                                else {
                                    if ("object" != a(e.insertAt) || !e.insertAt.before)
                                        throw new Error("[Style Loader]\n\n Invalid value for parameter 'insertAt' ('options.insertAt') found.\n Must be 'top', 'bottom', or Object.\n (https://github.com/webpack-contrib/style-loader#insertat)\n");
                                    var o = h(e.insertInto + " " + e.insertAt.before);
                                    n.insertBefore(t, o)
                                }
                            }
                            function s(e) {
                                if (null === e.parentNode)
                                    return !1;
                                e.parentNode.removeChild(e);
                                var t = _.indexOf(e);
                                t >= 0 && _.splice(t, 1)
                            }
                            function c(e) {
                                var t = document.createElement("style");
                                return e.attrs.type = "text/css",
                                    l(t, e.attrs),
                                    r(e, t),
                                    t
                            }
                            function d(e) {
                                var t = document.createElement("link");
                                return e.attrs.type = "text/css",
                                    e.attrs.rel = "stylesheet",
                                    l(t, e.attrs),
                                    r(e, t),
                                    t
                            }
                            function l(e, t) {
                                Object.keys(t).forEach(function(n) {
                                    e.setAttribute(n, t[n])
                                })
                            }
                            function u(e, t) {
                                var n, i, o, a;
                                if (t.transform && e.css) {
                                    if (!(a = t.transform(e.css)))
                                        return function() {}
                                            ;
                                    e.css = a
                                }
                                if (t.singleton) {
                                    var r = g++;
                                    n = v || (v = c(t)),
                                        i = f.bind(null, n, r, !1),
                                        o = f.bind(null, n, r, !0)
                                } else
                                    e.sourceMap && "function" == typeof URL && "function" == typeof URL.createObjectURL && "function" == typeof URL.revokeObjectURL && "function" == typeof Blob && "function" == typeof btoa ? (n = d(t),
                                            i = function(e, t, n) {
                                                var i = n.css
                                                    , o = n.sourceMap
                                                    , a = void 0 === t.convertToAbsoluteUrls && o;
                                                (t.convertToAbsoluteUrls || a) && (i = w(i)),
                                                o && (i += "\n/*# sourceMappingURL=data:application/json;base64," + btoa(unescape(encodeURIComponent(JSON.stringify(o)))) + " */");
                                                var r = new Blob([i],{
                                                    type: "text/css"
                                                })
                                                    , s = e.href;
                                                e.href = URL.createObjectURL(r),
                                                s && URL.revokeObjectURL(s)
                                            }
                                                .bind(null, n, t),
                                            o = function() {
                                                s(n),
                                                n.href && URL.revokeObjectURL(n.href)
                                            }
                                    ) : (n = c(t),
                                            i = function(e, t) {
                                                var n = t.css
                                                    , i = t.media;
                                                if (i && e.setAttribute("media", i),
                                                    e.styleSheet)
                                                    e.styleSheet.cssText = n;
                                                else {
                                                    for (; e.firstChild; )
                                                        e.removeChild(e.firstChild);
                                                    e.appendChild(document.createTextNode(n))
                                                }
                                            }
                                                .bind(null, n),
                                            o = function() {
                                                s(n)
                                            }
                                    );
                                return i(e),
                                    function(t) {
                                        if (t) {
                                            if (t.css === e.css && t.media === e.media && t.sourceMap === e.sourceMap)
                                                return;
                                            i(e = t)
                                        } else
                                            o()
                                    }
                            }
                            function f(e, t, n, i) {
                                var o = n ? "" : i.css;
                                if (e.styleSheet)
                                    e.styleSheet.cssText = b(t, o);
                                else {
                                    var a = document.createTextNode(o)
                                        , r = e.childNodes;
                                    r[t] && e.removeChild(r[t]),
                                        r.length ? e.insertBefore(a, r[t]) : e.appendChild(a)
                                }
                            }
                            var p = {}
                                , m = function(e) {
                                var t;
                                return function() {
                                    return void 0 === t && (t = function() {
                                        return window && document && document.all && !window.atob
                                    }
                                        .apply(this, arguments)),
                                        t
                                }
                            }()
                                , h = function(e) {
                                var t = {};
                                return function(e) {
                                    if (void 0 === t[e]) {
                                        var n = function(e) {
                                            return document.querySelector(e)
                                        }
                                            .call(this, e);
                                        if (n instanceof window.HTMLIFrameElement)
                                            try {
                                                n = n.contentDocument.head
                                            } catch (e) {
                                                n = null
                                            }
                                        t[e] = n
                                    }
                                    return t[e]
                                }
                            }()
                                , v = null
                                , g = 0
                                , _ = []
                                , w = n(54);
                            e.exports = function(e, t) {
                                if ("undefined" != typeof DEBUG && DEBUG && "object" != ("undefined" == typeof document ? "undefined" : a(document)))
                                    throw new Error("The style-loader cannot be used in a non-browser environment");
                                (t = t || {}).attrs = "object" == a(t.attrs) ? t.attrs : {},
                                t.singleton || "boolean" == typeof t.singleton || (t.singleton = m()),
                                t.insertInto || (t.insertInto = "head"),
                                t.insertAt || (t.insertAt = "bottom");
                                var n = o(e, t);
                                return i(n, t),
                                    function(e) {
                                        for (var a = [], r = 0; r < n.length; r++) {
                                            var s = n[r];
                                            (c = p[s.id]).refs--,
                                                a.push(c)
                                        }
                                        e && i(o(e, t), t);
                                        for (r = 0; r < a.length; r++) {
                                            var c;
                                            if (0 === (c = a[r]).refs) {
                                                for (var d = 0; d < c.parts.length; d++)
                                                    c.parts[d]();
                                                delete p[c.id]
                                            }
                                        }
                                    }
                            }
                            ;
                            var b = function() {
                                var e = [];
                                return function(t, n) {
                                    return e[t] = n,
                                        e.filter(Boolean).join("\n")
                                }
                            }()
                        }
                        , function(e, t, n) {
                            var i = n(8)
                                , o = n(2)
                                , a = n(22)
                                , r = n(24)
                                , s = n(12)
                                , c = function e(t, n, c) {
                                var d, l, u, f = t & e.F, p = t & e.G, m = t & e.S, h = t & e.P, v = t & e.B, g = t & e.W, _ = p ? o : o[n] || (o[n] = {}), w = _.prototype, b = p ? i : m ? i[n] : (i[n] || {}).prototype;
                                for (d in p && (c = n),
                                    c)
                                    (l = !f && b && void 0 !== b[d]) && s(_, d) || (u = l ? b[d] : c[d],
                                        _[d] = p && "function" != typeof b[d] ? c[d] : v && l ? a(u, i) : g && b[d] == u ? function(e) {
                                            var t = function(t, n, i) {
                                                if (this instanceof e) {
                                                    switch (arguments.length) {
                                                        case 0:
                                                            return new e;
                                                        case 1:
                                                            return new e(t);
                                                        case 2:
                                                            return new e(t,n)
                                                    }
                                                    return new e(t,n,i)
                                                }
                                                return e.apply(this, arguments)
                                            };
                                            return t.prototype = e.prototype,
                                                t
                                        }(u) : h && "function" == typeof u ? a(Function.call, u) : u,
                                    h && ((_.virtual || (_.virtual = {}))[d] = u,
                                    t & e.R && w && !w[d] && r(w, d, u)))
                            };
                            c.F = 1,
                                c.G = 2,
                                c.S = 4,
                                c.P = 8,
                                c.B = 16,
                                c.W = 32,
                                c.U = 64,
                                c.R = 128,
                                e.exports = c
                        }
                        , function(e, t) {
                            var n = e.exports = "undefined" != typeof window && window.Math == Math ? window : "undefined" != typeof self && self.Math == Math ? self : Function("return this")();
                            "number" == typeof __g && (__g = n)
                        }
                        , function(e, t) {
                            e.exports = function(e) {
                                return "object" == (void 0 === e ? "undefined" : a(e)) ? null !== e : "function" == typeof e
                            }
                        }
                        , function(e, t) {
                            e.exports = function(e) {
                                try {
                                    return !!e()
                                } catch (e) {
                                    return !0
                                }
                            }
                        }
                        , function(e, t, n) {
                            var i = n(25)
                                , o = n(26)
                                , a = n(28)
                                , r = Object.defineProperty;
                            t.f = n(3) ? Object.defineProperty : function(e, t, n) {
                                if (i(e),
                                    t = a(t, !0),
                                    i(n),
                                    o)
                                    try {
                                        return r(e, t, n)
                                    } catch (e) {}
                                if ("get"in n || "set"in n)
                                    throw TypeError("Accessors not supported!");
                                return "value"in n && (e[t] = n.value),
                                    e
                            }
                        }
                        , function(e, t) {
                            var n = {}.hasOwnProperty;
                            e.exports = function(e, t) {
                                return n.call(e, t)
                            }
                        }
                        , function(e, t, n) {
                            var i = n(14)
                                , o = n(15);
                            e.exports = function(e) {
                                return i(o(e))
                            }
                        }
                        , function(e, t, n) {
                            var i = n(36);
                            e.exports = Object("z").propertyIsEnumerable(0) ? Object : function(e) {
                                return "String" == i(e) ? e.split("") : Object(e)
                            }
                        }
                        , function(e, t) {
                            e.exports = function(e) {
                                if (void 0 == e)
                                    throw TypeError("Can't call method on  " + e);
                                return e
                            }
                        }
                        , function(e, t) {
                            var n = Math.ceil
                                , i = Math.floor;
                            e.exports = function(e) {
                                return isNaN(e = +e) ? 0 : (e > 0 ? i : n)(e)
                            }
                        }
                        , function(e, t, n) {
                            var i = function(e) {
                                return e && e.__esModule ? e : {
                                    default: e
                                }
                            }(n(18));
                            t.init = function(e) {
                                return new i.default(e)
                            }
                        }
                        , function(e, t, n) {
                            function i(e) {
                                return e && e.__esModule ? e : {
                                    default: e
                                }
                            }
                            Object.defineProperty(t, "__esModule", {
                                value: !0
                            }),
                                t.default = void 0;
                            var o = i(n(19))
                                , a = i(n(30))
                                , r = i(n(0))
                                , s = i(n(1))
                                , c = i(n(4))
                                , d = i(n(51))
                                , l = i(n(55))
                                , u = i(n(58))
                                , f = i(n(61))
                                , p = i(n(68))
                                , m = i(n(71))
                                , h = function() {
                                function e(t) {
                                    (0,
                                        r.default)(this, e),
                                        this.setProp(t),
                                        this.title = new d.default(this.props),
                                        "site" === this.props.type ? this.props.app && "vivo" === this.props.app ? this.source = new u.default(this.props) : this.source = new l.default(this.props) : "wemedia" === this.props.type ? this.source = new f.default(this.props) : "wemedia-simple" === this.props.type && (this.source = new p.default(this.props)),
                                    this.props.container && (this.props.container.innerHTML = this.render())
                                }
                                return (0,
                                    s.default)(e, [{
                                    key: "setProp",
                                    value: function(e) {
                                        var t = (0,
                                            a.default)({}, e || {});
                                        this.props = t,
                                            this.props.app ? this.props.config = m.default[this.props.app] || {} : this.props.config = {},
                                            this.props.parsedTime = this.getParsedTime()
                                    }
                                }, {
                                    key: "getParsedTime",
                                    value: function() {
                                        var e = this.props || {}
                                            , t = e.time
                                            , n = new Date(t);
                                        if ((0,
                                            o.default)(n.getTime()))
                                            return t;
                                        var i = e.timeFormat || e.config.timeFormat;
                                        if (i)
                                            return c.default.dateTranslate(n, i);
                                        var a = (new Date).getTime() - n.getTime();
                                        return a < 36e5 ? Math.max(parseInt(a / 6e4, 10), 1) + "分钟前" : a < 864e5 ? parseInt(a / 36e5, 10) + "小时前" : c.default.dateTranslate(n, "MM-dd")
                                    }
                                }, {
                                    key: "render",
                                    value: function() {
                                        return "\n      " + (this.title.render() || "") + "\n      " + (this.source.render() || "") + "\n    "
                                    }
                                }, {
                                    key: "notify",
                                    value: function() {
                                        var e = this.props && this.props.container
                                            , t = e && e.offsetHeight || 0;
                                        window.ucapi && window.ucapi && window.ucapi.biz && window.ucapi.biz.notifyElementInfo && window.ucapi.biz.notifyElementInfo({
                                            element: "iflow_header",
                                            info: {
                                                height: t
                                            }
                                        })
                                    }
                                }, {
                                    key: "updateName",
                                    value: function(e) {
                                        this.source && this.source.updateName && this.source.updateName(e)
                                    }
                                }, {
                                    key: "onFollowClick",
                                    value: function(e) {
                                        this.source && this.source.followClickCallbacks && this.source.followClickCallbacks.push && this.source.followClickCallbacks.push(e)
                                    }
                                }, {
                                    key: "updateFollowState",
                                    value: function(e) {
                                        this.source && this.source.updateFollowState && this.source.updateFollowState(e),
                                            this.updateLocalFollowState(e)
                                    }
                                }, {
                                    key: "updateLogo",
                                    value: function(e) {
                                        this.source && this.source.updateLogo && this.source.updateLogo(e)
                                    }
                                }, {
                                    key: "updateWmAuthor",
                                    value: function(e) {
                                        this.source && this.source.updateWmAuthor && this.source.updateWmAuthor(e)
                                    }
                                }, {
                                    key: "updateProp",
                                    value: function(e) {
                                        this.update(e)
                                    }
                                }, {
                                    key: "update",
                                    value: function(e) {
                                        this.setProp(e),
                                        this.source && this.source.update && this.source.update(this.props)
                                    }
                                }, {
                                    key: "bindEvent",
                                    value: function() {
                                        this.source && this.source.bindEvent && this.source.bindEvent()
                                    }
                                }, {
                                    key: "updateLocalFollowState",
                                    value: function(e) {
                                        var t = this.props && this.props.wmId;
                                        if (t)
                                            try {
                                                localStorage.setItem("HEADER_FOLLOW_STATE_" + t, e)
                                            } catch (e) {
                                                console.log(e)
                                            }
                                    }
                                }, {
                                    key: "showUpBtn",
                                    value: function() {
                                        this.source && this.source.showUpBtn && this.source.showUpBtn()
                                    }
                                }, {
                                    key: "hideUpBtn",
                                    value: function() {
                                        this.source && this.source.hideUpBtn && this.source.hideUpBtn()
                                    }
                                }, {
                                    key: "onUpBtnClick",
                                    value: function(e) {
                                        this.source && this.source.onUpBtnClick && this.source.onUpBtnClick(e)
                                    }
                                }, {
                                    key: "setUpBtnOpenState",
                                    value: function(e) {
                                        this.source && this.source.setUpBtnOpenState && this.source.setUpBtnOpenState(e)
                                    }
                                }, {
                                    key: "addOpenHomePageCallback",
                                    value: function(e) {
                                        this.source && this.source.addOpenHomePageCallback && this.source.addOpenHomePageCallback(e)
                                    }
                                }]),
                                    e
                            }();
                            t.default = h
                        }
                        , function(e, t, n) {
                            e.exports = {
                                default: n(20),
                                __esModule: !0
                            }
                        }
                        , function(e, t, n) {
                            n(21),
                                e.exports = n(2).Number.isNaN
                        }
                        , function(e, t, n) {
                            var i = n(7);
                            i(i.S, "Number", {
                                isNaN: function(e) {
                                    return e != e
                                }
                            })
                        }
                        , function(e, t, n) {
                            var i = n(23);
                            e.exports = function(e, t, n) {
                                if (i(e),
                                void 0 === t)
                                    return e;
                                switch (n) {
                                    case 1:
                                        return function(n) {
                                            return e.call(t, n)
                                        }
                                            ;
                                    case 2:
                                        return function(n, i) {
                                            return e.call(t, n, i)
                                        }
                                            ;
                                    case 3:
                                        return function(n, i, o) {
                                            return e.call(t, n, i, o)
                                        }
                                }
                                return function() {
                                    return e.apply(t, arguments)
                                }
                            }
                        }
                        , function(e, t) {
                            e.exports = function(e) {
                                if ("function" != typeof e)
                                    throw TypeError(e + " is not a function!");
                                return e
                            }
                        }
                        , function(e, t, n) {
                            var i = n(11)
                                , o = n(29);
                            e.exports = n(3) ? function(e, t, n) {
                                    return i.f(e, t, o(1, n))
                                }
                                : function(e, t, n) {
                                    return e[t] = n,
                                        e
                                }
                        }
                        , function(e, t, n) {
                            var i = n(9);
                            e.exports = function(e) {
                                if (!i(e))
                                    throw TypeError(e + " is not an object!");
                                return e
                            }
                        }
                        , function(e, t, n) {
                            e.exports = !n(3) && !n(10)(function() {
                                return 7 != Object.defineProperty(n(27)("div"), "a", {
                                    get: function() {
                                        return 7
                                    }
                                }).a
                            })
                        }
                        , function(e, t, n) {
                            var i = n(9)
                                , o = n(8).document
                                , a = i(o) && i(o.createElement);
                            e.exports = function(e) {
                                return a ? o.createElement(e) : {}
                            }
                        }
                        , function(e, t, n) {
                            var i = n(9);
                            e.exports = function(e, t) {
                                if (!i(e))
                                    return e;
                                var n, o;
                                if (t && "function" == typeof (n = e.toString) && !i(o = n.call(e)))
                                    return o;
                                if ("function" == typeof (n = e.valueOf) && !i(o = n.call(e)))
                                    return o;
                                if (!t && "function" == typeof (n = e.toString) && !i(o = n.call(e)))
                                    return o;
                                throw TypeError("Can't convert object to primitive value")
                            }
                        }
                        , function(e, t) {
                            e.exports = function(e, t) {
                                return {
                                    enumerable: !(1 & e),
                                    configurable: !(2 & e),
                                    writable: !(4 & e),
                                    value: t
                                }
                            }
                        }
                        , function(e, t, n) {
                            e.exports = {
                                default: n(31),
                                __esModule: !0
                            }
                        }
                        , function(e, t, n) {
                            n(32),
                                e.exports = n(2).Object.assign
                        }
                        , function(e, t, n) {
                            var i = n(7);
                            i(i.S + i.F, "Object", {
                                assign: n(33)
                            })
                        }
                        , function(e, t, n) {
                            var i = n(3)
                                , o = n(34)
                                , a = n(45)
                                , r = n(46)
                                , s = n(47)
                                , c = n(14)
                                , d = Object.assign;
                            e.exports = !d || n(10)(function() {
                                var e = {}
                                    , t = {}
                                    , n = Symbol()
                                    , i = "abcdefghijklmnopqrst";
                                return e[n] = 7,
                                    i.split("").forEach(function(e) {
                                        t[e] = e
                                    }),
                                7 != d({}, e)[n] || Object.keys(d({}, t)).join("") != i
                            }) ? function(e, t) {
                                    for (var n = s(e), d = arguments.length, l = 1, u = a.f, f = r.f; d > l; )
                                        for (var p, m = c(arguments[l++]), h = u ? o(m).concat(u(m)) : o(m), v = h.length, g = 0; v > g; )
                                            p = h[g++],
                                            i && !f.call(m, p) || (n[p] = m[p]);
                                    return n
                                }
                                : d
                        }
                        , function(e, t, n) {
                            var i = n(35)
                                , o = n(44);
                            e.exports = Object.keys || function(e) {
                                return i(e, o)
                            }
                        }
                        , function(e, t, n) {
                            var i = n(12)
                                , o = n(13)
                                , a = n(37)(!1)
                                , r = n(40)("IE_PROTO");
                            e.exports = function(e, t) {
                                var n, s = o(e), c = 0, d = [];
                                for (n in s)
                                    n != r && i(s, n) && d.push(n);
                                for (; t.length > c; )
                                    i(s, n = t[c++]) && (~a(d, n) || d.push(n));
                                return d
                            }
                        }
                        , function(e, t) {
                            var n = {}.toString;
                            e.exports = function(e) {
                                return n.call(e).slice(8, -1)
                            }
                        }
                        , function(e, t, n) {
                            var i = n(13)
                                , o = n(38)
                                , a = n(39);
                            e.exports = function(e) {
                                return function(t, n, r) {
                                    var s, c = i(t), d = o(c.length), l = a(r, d);
                                    if (e && n != n) {
                                        for (; d > l; )
                                            if ((s = c[l++]) != s)
                                                return !0
                                    } else
                                        for (; d > l; l++)
                                            if ((e || l in c) && c[l] === n)
                                                return e || l || 0;
                                    return !e && -1
                                }
                            }
                        }
                        , function(e, t, n) {
                            var i = n(16)
                                , o = Math.min;
                            e.exports = function(e) {
                                return e > 0 ? o(i(e), 9007199254740991) : 0
                            }
                        }
                        , function(e, t, n) {
                            var i = n(16)
                                , o = Math.max
                                , a = Math.min;
                            e.exports = function(e, t) {
                                return (e = i(e)) < 0 ? o(e + t, 0) : a(e, t)
                            }
                        }
                        , function(e, t, n) {
                            var i = n(41)("keys")
                                , o = n(43);
                            e.exports = function(e) {
                                return i[e] || (i[e] = o(e))
                            }
                        }
                        , function(e, t, n) {
                            var i = n(2)
                                , o = n(8)
                                , a = o["__core-js_shared__"] || (o["__core-js_shared__"] = {});
                            (e.exports = function(e, t) {
                                    return a[e] || (a[e] = void 0 !== t ? t : {})
                                }
                            )("versions", []).push({
                                version: i.version,
                                mode: n(42) ? "pure" : "global",
                                copyright: "© 2019 Denis Pushkarev (zloirock.ru)"
                            })
                        }
                        , function(e, t) {
                            e.exports = !0
                        }
                        , function(e, t) {
                            var n = 0
                                , i = Math.random();
                            e.exports = function(e) {
                                return "Symbol(".concat(void 0 === e ? "" : e, ")_", (++n + i).toString(36))
                            }
                        }
                        , function(e, t) {
                            e.exports = "constructor,hasOwnProperty,isPrototypeOf,propertyIsEnumerable,toLocaleString,toString,valueOf".split(",")
                        }
                        , function(e, t) {
                            t.f = Object.getOwnPropertySymbols
                        }
                        , function(e, t) {
                            t.f = {}.propertyIsEnumerable
                        }
                        , function(e, t, n) {
                            var i = n(15);
                            e.exports = function(e) {
                                return Object(i(e))
                            }
                        }
                        , function(e, t, n) {
                            e.exports = {
                                default: n(49),
                                __esModule: !0
                            }
                        }
                        , function(e, t, n) {
                            n(50);
                            var i = n(2).Object;
                            e.exports = function(e, t, n) {
                                return i.defineProperty(e, t, n)
                            }
                        }
                        , function(e, t, n) {
                            var i = n(7);
                            i(i.S + i.F * !n(3), "Object", {
                                defineProperty: n(11).f
                            })
                        }
                        , function(e, t, n) {
                            function i(e) {
                                return e && e.__esModule ? e : {
                                    default: e
                                }
                            }
                            Object.defineProperty(t, "__esModule", {
                                value: !0
                            }),
                                t.default = void 0;
                            var o = i(n(0))
                                , a = i(n(1))
                                , r = i(n(52))
                                , s = i(n(4))
                                , c = window.__SDKLIB__ || {}
                                , d = c.envi
                                , l = c.version
                                , u = function() {
                                function e(t) {
                                    (0,
                                        o.default)(this, e),
                                        this.props = t
                                }
                                return (0,
                                    a.default)(e, [{
                                    key: "render",
                                    value: function() {
                                        var e = this.props.title
                                            , t = this.props.app
                                            , n = t && r.default["title-" + t]
                                            , i = this.getIsNewHeader() ? "padding-top: " + (this.parsePtToPx(18) || 12) + "px" : "";
                                        return '\n      <h1 class="' + r.default.title + " " + (n || "") + ' uc-nf-fontsize-change-dom" style="' + i + '">' + s.default.htmlEscape(e) + "</h1>\n    "
                                    }
                                }, {
                                    key: "getIsNewHeader",
                                    value: function() {
                                        if (!d || !l)
                                            return !1;
                                        var e = d.get("ve");
                                        return l.match(e, "11.9.4~")
                                    }
                                }, {
                                    key: "parsePtToPx",
                                    value: function(e) {
                                        var t = document.createElement("div");
                                        t.style.opacity = 0,
                                            t.style.position = "absolute",
                                            t.style.width = e + "pt",
                                            t.style.left = "-99999",
                                            document.body.appendChild(t);
                                        var n = t.getBoundingClientRect && t.getBoundingClientRect() || {}
                                            , i = n && n.width || 0;
                                        return t.remove(),
                                            i
                                    }
                                }]),
                                    e
                            }();
                            t.default = u
                        }
                        , function(e, t, n) {
                            var i = n(53);
                            "string" == typeof i && (i = [[e.i, i, ""]]);
                            var o = {
                                hmr: !0,
                                transform: void 0
                            };
                            n(6)(i, o),
                            i.locals && (e.exports = i.locals)
                        }
                        , function(e, t, n) {
                            (t = e.exports = n(5)(!1)).push([e.i, ".title__title__e436dd806a{font-size:22px;text-align:justify;line-height:30px;padding:12px 0;margin:0;color:#333;font-family:Helvetica Neuce,Helvetica,Arial,PingFang SC,Hiragino Sans GB,Heiti SC,Microsoft YaHei,WenQuanYi Micro Hei,sans-serif;word-break:break-all}.title__title-new-header__9ba6046773{padding:28pt 0 12px!important}.title__title-meizu__4ebe4d35ec,.title__title-meizubrw__c0c4ed4b57{padding-top:10px;padding-bottom:10px;font-size:24px;line-height:30px;font-family:Roboto,Source Han Sans CN,\\\\601D\\6E90\\9ED1\\4F53,sans-serif}.title__title-meizubrw__c0c4ed4b57{padding-top:30px}.title__title-wps__bf32b7433c{font-size:24px;padding:0 0 20px;line-height:1.5}.title__title-vivo__33e88400ef{font-size:23px;padding:27px 0 17px;line-height:1.5;text-align:center;font-weight:700;color:#000}.title__title-mojitianqi__bb9b731ec5{font-size:21px;line-height:31px;padding:12px 0 9px}.title__title-mm__2f821606e4,.title__title-mojitianqi__bb9b731ec5{text-align:left;font-weight:700}.title__title-mm__2f821606e4{font-size:20px;line-height:28px;padding:12px 0 4px;font-family:Source Han Sans CN}", ""]),
                                t.locals = {
                                    title: "title__title__e436dd806a",
                                    "title-new-header": "title__title-new-header__9ba6046773",
                                    "title-meizu": "title__title-meizu__4ebe4d35ec",
                                    "title-meizubrw": "title__title-meizubrw__c0c4ed4b57",
                                    "title-wps": "title__title-wps__bf32b7433c",
                                    "title-vivo": "title__title-vivo__33e88400ef",
                                    "title-mojitianqi": "title__title-mojitianqi__bb9b731ec5",
                                    "title-mm": "title__title-mm__2f821606e4"
                                }
                        }
                        , function(e, t) {
                            e.exports = function(e) {
                                var t = "undefined" != typeof window && window.location;
                                if (!t)
                                    throw new Error("fixUrls requires window.location");
                                if (!e || "string" != typeof e)
                                    return e;
                                var n = t.protocol + "//" + t.host
                                    , i = n + t.pathname.replace(/\/[^\/]*$/, "/");
                                return e.replace(/url\s*\(((?:[^)(]|\((?:[^)(]+|\([^)(]*\))*\))*)\)/gi, function(e, t) {
                                    var o, a = t.trim().replace(/^"(.*)"$/, function(e, t) {
                                        return t
                                    }).replace(/^'(.*)'$/, function(e, t) {
                                        return t
                                    });
                                    return /^(#|data:|http:\/\/|https:\/\/|file:\/\/\/)/i.test(a) ? e : (o = 0 === a.indexOf("//") ? a : 0 === a.indexOf("/") ? n + a : i + a.replace(/^\.\//, ""),
                                    "url(" + JSON.stringify(o) + ")")
                                })
                            }
                        }
                        , function(e, t, n) {
                            function i(e) {
                                return e && e.__esModule ? e : {
                                    default: e
                                }
                            }
                            Object.defineProperty(t, "__esModule", {
                                value: !0
                            }),
                                t.default = void 0;
                            var o = i(n(0))
                                , a = i(n(1))
                                , r = i(n(56))
                                , s = i(n(4))
                                , c = function() {
                                function e(t) {
                                    (0,
                                        o.default)(this, e),
                                        this.props = t,
                                        this.props.name = this.props.name || "热点"
                                }
                                return (0,
                                    a.default)(e, [{
                                    key: "render",
                                    value: function() {
                                        return '\n      <div class="' + r.default["header-site"] + " " + this.getAppClass() + '">\n        ' + this.getInner() + "\n      </div>\n    "
                                    }
                                }, {
                                    key: "getInner",
                                    value: function() {
                                        var e = this.props || {};
                                        if (e && e.hideSource)
                                            return "";
                                        var t = e && e.app || "";
                                        return "\n      " + (t && "wps" === t ? this.getCategory() : "") + "\n      " + this.getSource() + "\n      " + this.getTime() + "\n      " + this.getCount() + "\n    "
                                    }
                                }, {
                                    key: "getTime",
                                    value: function() {
                                        return '\n      <span class="' + r.default["header-site__time"] + '">' + (this.props && this.props.parsedTime || "") + "</span>\n    "
                                    }
                                }, {
                                    key: "getSource",
                                    value: function() {
                                        return "\n      " + this.getLogo() + '\n      <span id="header-site-logo" class="' + r.default["header-site__name"] + '">' + this.props.name + "</span>\n    "
                                    }
                                }, {
                                    key: "getCount",
                                    value: function() {
                                        var e = this.props || {};
                                        return e && e.config && e.config.showViewCount && void 0 !== e.viewCount && "" !== e.viewCount && null !== e.viewCount ? '<span class="' + r.default["header-site__count"] + '">浏览 ' + e.viewCount + "</span>" : ""
                                    }
                                }, {
                                    key: "getAppClass",
                                    value: function() {
                                        return "" + ((this.props.app ? r.default["header-site-" + this.props.app] : "") || "")
                                    }
                                }, {
                                    key: "getLogo",
                                    value: function() {
                                        var e = this.props && this.props.config;
                                        return e && e.hideLogo ? "" : '\n      <span class="' + r.default["header-site__logo"] + '">\n        <span id="header-site__logo" class="' + r.default["header-site__logo-text"] + '">' + this.props.name[0] + "</span>\n        " + (this.props.logo ? '\n          <span class="' + r.default["header-site__logo-pic"] + '" style="background-image: url(' + s.default.replaceUrlSchema(this.props.logo) + ')"></span>\n        ' : "") + "\n      </span>\n    "
                                    }
                                }, {
                                    key: "getCategory",
                                    value: function() {
                                        var e = (this.props || {}).category
                                            , t = void 0 === e ? [] : e;
                                        return t && t.length && t[0] ? '\n      <span class="' + r.default["header-site__category"] + '">' + t[0] + "</span>\n    " : ""
                                    }
                                }, {
                                    key: "updateProp",
                                    value: function(e) {
                                        this.update(e)
                                    }
                                }, {
                                    key: "update",
                                    value: function(e) {
                                        var t = this.props || {};
                                        this.props = e || {};
                                        var n = t.hideSource && !this.props.hideSource
                                            , i = document.querySelector("." + r.default["header-site"]);
                                        if (i)
                                            if (n) {
                                                var o = r.default["header-site-fade"]
                                                    , a = r.default["header-site-hide"];
                                                i.classList.add(a),
                                                    i.innerHTML = this.getInner(),
                                                    setTimeout(function() {
                                                        i.classList.add(o),
                                                            i.classList.remove(a)
                                                    }, 30)
                                            } else
                                                i.innerHTML = this.getInner()
                                    }
                                }]),
                                    e
                            }();
                            t.default = c
                        }
                        , function(e, t, n) {
                            var i = n(57);
                            "string" == typeof i && (i = [[e.i, i, ""]]);
                            var o = {
                                hmr: !0,
                                transform: void 0
                            };
                            n(6)(i, o),
                            i.locals && (e.exports = i.locals)
                        }
                        , function(e, t, n) {
                            (t = e.exports = n(5)(!1)).push([e.i, ".site__header-site__66c0b2b692{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-flex-wrap:wrap;flex-wrap:wrap;-webkit-box-align:center;-webkit-align-items:center;align-items:center;text-align:left;font-size:14px;line-height:20px;height:20px;color:#333;font-family:Helvetica Neuce,Helvetica,Arial,PingFang SC,Hiragino Sans GB,Heiti SC,Microsoft YaHei,WenQuanYi Micro Hei,sans-serif;opacity:1}.site__header-site-hide__00391ec3d3{opacity:0!important}.site__header-site-fade__3ed5113a47{-webkit-transition:opacity .2s;transition:opacity .2s}.site__header-site__66c0b2b692 span{margin-right:8px}#header-site__logo.UCUNNIC{background-color:#eee!important;color:#666!important;font-weight:700}.site__header-site__logo__6f00d99c97{display:block;width:24px;height:24px;line-height:24px;-webkit-transform-origin:center;transform-origin:center;-webkit-transform:scale(.75);transform:scale(.75);border-radius:50%;overflow:hidden;position:relative;text-align:center}.site__header-site__logo-pic__44e6ccd85a{-webkit-background-size:cover;background-size:cover;background-repeat:no-repeat}.site__header-site__logo-pic__44e6ccd85a,.site__header-site__logo-text__d136db0f86{position:absolute;display:block;left:0;top:0;width:100%;height:100%;margin:0!important}.site__header-site__logo-text__d136db0f86{color:#666;background-color:#eee;font-size:12px}.site__header-site-meitu__d8d7715a92,.site__header-site-nubia__2e4318b374,.site__header-site-nubiabro__3a4e8bc9eb,.site__header-site-nubiaggcs__7f61bd181b,.site__header-site-nubiatest__eda69016e5,.site__header-site__time__29e91dab67{color:#bbb}.site__header-site-meizu__dc799a0a68,.site__header-site-meizubrw__4a966fb7e5,.site__header-site-meizunews__66540d6559{font-size:12px;height:auto!important;line-height:14px;color:#bbb;font-family:Roboto,Source Han Sans CN,\\\\601D\\6E90\\9ED1\\4F53,sans-serif}.UCUNNIC.UCNightMode_transparentBkg.UCUNNIC_Done.site__header-site-meizubrw__4a966fb7e5 span,.UCUNNIC.UCNightMode_transparentBkg.UCUNNIC_Done.site__header-site-meizunews__66540d6559 span,.UCUNNIC.UCNightMode_transparentBkg.UCUNNIC_Done.site__header-site-meizu__dc799a0a68 span{color:hsla(0,0%,100%,.3)!important}.site__header-site-meizu__dc799a0a68 .site__header-site__time__29e91dab67,.site__header-site-meizunews__66540d6559 .site__header-site__time__29e91dab67{color:#bbb}.site__header-site-wps__f1d25fba52{color:#888;font-size:12px;line-height:16px;padding-top:15px;border-top:1px solid #eee;margin-bottom:24px}.site__header-site-wps__f1d25fba52 span{margin-right:18px}.site__header-site__category__6424fcc5cf{border:1px solid #888;padding:0 5px;border-radius:2px}.site__header-site-mojitianqi__0aef688cc5{color:rgba(26,26,26,.4);font-size:12px;line-height:12px;height:12px}.site__header-site-mm__d05ee25a0e{color:#bdbdbd;font-size:14px;line-height:14px;height:14px;font-family:Source Han Sans CN}.site__header-site-mm__d05ee25a0e span{margin-right:16px}.site__header-site-huaweibro__24e44b737b{display:block}", ""]),
                                t.locals = {
                                    "header-site": "site__header-site__66c0b2b692",
                                    "header-site-hide": "site__header-site-hide__00391ec3d3",
                                    "header-site-fade": "site__header-site-fade__3ed5113a47",
                                    "header-site__logo": "site__header-site__logo__6f00d99c97",
                                    "header-site__logo-pic": "site__header-site__logo-pic__44e6ccd85a",
                                    "header-site__logo-text": "site__header-site__logo-text__d136db0f86",
                                    "header-site-meitu": "site__header-site-meitu__d8d7715a92",
                                    "header-site-nubia": "site__header-site-nubia__2e4318b374",
                                    "header-site-nubiabro": "site__header-site-nubiabro__3a4e8bc9eb",
                                    "header-site-nubiaggcs": "site__header-site-nubiaggcs__7f61bd181b",
                                    "header-site-nubiatest": "site__header-site-nubiatest__eda69016e5",
                                    "header-site__time": "site__header-site__time__29e91dab67",
                                    "header-site-meizu": "site__header-site-meizu__dc799a0a68",
                                    "header-site-meizubrw": "site__header-site-meizubrw__4a966fb7e5",
                                    "header-site-meizunews": "site__header-site-meizunews__66540d6559",
                                    "header-site-wps": "site__header-site-wps__f1d25fba52",
                                    "header-site__category": "site__header-site__category__6424fcc5cf",
                                    "header-site-mojitianqi": "site__header-site-mojitianqi__0aef688cc5",
                                    "header-site-mm": "site__header-site-mm__d05ee25a0e",
                                    "header-site-huaweibro": "site__header-site-huaweibro__24e44b737b"
                                }
                        }
                        , function(e, t, n) {
                            function i(e) {
                                return e && e.__esModule ? e : {
                                    default: e
                                }
                            }
                            Object.defineProperty(t, "__esModule", {
                                value: !0
                            }),
                                t.default = void 0;
                            var o = i(n(0))
                                , a = i(n(1))
                                , r = i(n(59))
                                , s = i(n(4))
                                , c = function() {
                                function e(t) {
                                    (0,
                                        o.default)(this, e),
                                        this.props = t,
                                        this.props.name = this.props.name || "热点"
                                }
                                return (0,
                                    a.default)(e, [{
                                    key: "render",
                                    value: function() {
                                        return '\n      <div class="' + r.default["header-site"] + " " + this.getAppClass() + '">\n        ' + this.getInner() + "\n      </div>\n    "
                                    }
                                }, {
                                    key: "getInner",
                                    value: function() {
                                        var e = this.props || {};
                                        if (e && e.hideSource)
                                            return "";
                                        var t = e && e.app || "";
                                        return "\n      " + (t && "wps" === t ? this.getCategory() : "") + "\n      " + this.getSource() + "\n      " + this.getCount() + "\n    "
                                    }
                                }, {
                                    key: "getSource",
                                    value: function() {
                                        return '\n      <div class="' + r.default["header-site__source-container"] + '">\n        <div class="' + r.default["header-site__logo-container"] + '">\n          ' + this.getLogo() + '\n        </div>\n        <div class="' + r.default["header-site__info-container"] + '">\n          <span id="header-site-logo" class="' + r.default["header-site__name"] + '">' + this.props.name + '</span>\n          <span class="' + r.default["header-site__time"] + '">' + (this.props && this.props.parsedTime || "") + "</span>\n        </div>\n      </div>\n    "
                                    }
                                }, {
                                    key: "getCount",
                                    value: function() {
                                        var e = this.props || {};
                                        return e && e.config && e.config.showViewCount && void 0 !== e.viewCount && "" !== e.viewCount && null !== e.viewCount ? '<span class="' + r.default["header-site__count"] + '">浏览 ' + e.viewCount + "</span>" : ""
                                    }
                                }, {
                                    key: "getAppClass",
                                    value: function() {
                                        return "" + ((this.props.app ? r.default["header-site-" + this.props.app] : "") || "")
                                    }
                                }, {
                                    key: "getLogo",
                                    value: function() {
                                        var e = this.props && this.props.config;
                                        return e && e.hideLogo ? "" : '\n      <span class="' + r.default["header-site__logo"] + '">\n        <span id="header-site__logo" class="' + r.default["header-site__logo-text"] + '">' + this.props.name[0] + "</span>\n        " + (this.props.logo ? '\n          <span class="' + r.default["header-site__logo-pic"] + '" style="background-image: url(' + s.default.replaceUrlSchema(this.props.logo) + ')"></span>\n        ' : "") + "\n      </span>\n    "
                                    }
                                }, {
                                    key: "getCategory",
                                    value: function() {
                                        var e = (this.props || {}).category
                                            , t = void 0 === e ? [] : e;
                                        return t && t.length && t[0] ? '\n      <span class="' + r.default["header-site__category"] + '">' + t[0] + "</span>\n    " : ""
                                    }
                                }, {
                                    key: "updateProp",
                                    value: function(e) {
                                        this.update(e)
                                    }
                                }, {
                                    key: "update",
                                    value: function(e) {
                                        var t = this.props || {};
                                        this.props = e || {};
                                        var n = t.hideSource && !this.props.hideSource
                                            , i = document.querySelector("." + r.default["header-site"]);
                                        if (i)
                                            if (n) {
                                                var o = r.default["header-site-fade"]
                                                    , a = r.default["header-site-hide"];
                                                i.classList.add(a),
                                                    i.innerHTML = this.getInner(),
                                                    setTimeout(function() {
                                                        i.classList.add(o),
                                                            i.classList.remove(a)
                                                    }, 30)
                                            } else
                                                i.innerHTML = this.getInner()
                                    }
                                }]),
                                    e
                            }();
                            t.default = c
                        }
                        , function(e, t, n) {
                            var i = n(60);
                            "string" == typeof i && (i = [[e.i, i, ""]]);
                            var o = {
                                hmr: !0,
                                transform: void 0
                            };
                            n(6)(i, o),
                            i.locals && (e.exports = i.locals)
                        }
                        , function(e, t, n) {
                            (t = e.exports = n(5)(!1)).push([e.i, ".site__header-site__d4546ff56d{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-flex-wrap:wrap;flex-wrap:wrap;-webkit-box-align:center;-webkit-align-items:center;align-items:center;text-align:left;font-size:14px;line-height:14px;color:#333;font-family:Helvetica Neuce,Helvetica,Arial,PingFang SC,Hiragino Sans GB,Heiti SC,Microsoft YaHei,WenQuanYi Micro Hei,sans-serif;opacity:1}.site__header-site-hide__2593af1ad0{opacity:0!important}.site__header-site-fade__8416c59a3c{-webkit-transition:opacity .2s;transition:opacity .2s}.site__header-site__d4546ff56d span{margin-right:12px}#header-site__logo.UCUNNIC{background-color:#eee!important;color:#666!important;font-weight:700}.site__header-site__logo__3cbf52755f{display:block;width:29px;height:29px;line-height:29px;-webkit-transform-origin:center;transform-origin:center;border-radius:50%;position:relative;text-align:center}.site__header-site__logo-pic__04289a680d{-webkit-background-size:contain;background-size:contain;background-repeat:no-repeat;background-position:50%}.site__header-site__logo-pic__04289a680d,.site__header-site__logo-text__564ec3af5e{position:absolute;display:block;left:0;top:0;width:100%;height:100%;margin:0!important;border-radius:50%}.site__header-site__logo-text__564ec3af5e{color:#666;background-color:#eee;font-size:16px}.site__header-site__time__4db5b726b1{color:#aaa;font-size:12px;line-height:12px;padding-top:3px}.UCUNNIC.UCNightMode_transparentBkg.UCUNNIC_Done.site__header-site-meizubrw__4dd85ebffc span,.UCUNNIC.UCNightMode_transparentBkg.UCUNNIC_Done.site__header-site-meizunews__9036ab5342 span,.UCUNNIC.UCNightMode_transparentBkg.UCUNNIC_Done.site__header-site-meizu__a4cdddab98 span{color:hsla(0,0%,100%,.3)!important}.site__header-site__source-container__3809ea4212{width:100%;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center}.site__header-site__info-container__2014898785{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column}", ""]),
                                t.locals = {
                                    "header-site": "site__header-site__d4546ff56d",
                                    "header-site-hide": "site__header-site-hide__2593af1ad0",
                                    "header-site-fade": "site__header-site-fade__8416c59a3c",
                                    "header-site__logo": "site__header-site__logo__3cbf52755f",
                                    "header-site__logo-pic": "site__header-site__logo-pic__04289a680d",
                                    "header-site__logo-text": "site__header-site__logo-text__564ec3af5e",
                                    "header-site__time": "site__header-site__time__4db5b726b1",
                                    "header-site-meizubrw": "site__header-site-meizubrw__4dd85ebffc",
                                    "header-site-meizunews": "site__header-site-meizunews__9036ab5342",
                                    "header-site-meizu": "site__header-site-meizu__a4cdddab98",
                                    "header-site__source-container": "site__header-site__source-container__3809ea4212",
                                    "header-site__info-container": "site__header-site__info-container__2014898785"
                                }
                        }
                        , function(e, t, n) {
                            function i(e) {
                                return e && e.__esModule ? e : {
                                    default: e
                                }
                            }
                            Object.defineProperty(t, "__esModule", {
                                value: !0
                            }),
                                t.default = void 0;
                            var o = i(n(0))
                                , a = i(n(1))
                                , r = i(n(62))
                                , s = i(n(4))
                                , c = i(n(64))
                                , d = i(n(65))
                                , l = i(n(66))
                                , u = i(n(67))
                                , f = ["", d.default, l.default, u.default]
                                , p = function() {
                                function e(t) {
                                    (0,
                                        o.default)(this, e),
                                        this.followClickCallbacks = [],
                                        this.invokeOpenHomePageCallback = [],
                                        this.upBtnClickCallbacks = [],
                                        this.props = t,
                                        this.initLocalFollowState()
                                }
                                return (0,
                                    a.default)(e, [{
                                    key: "initLocalFollowState",
                                    value: function() {
                                        var e = this.props && this.props.wmId;
                                        e && JSON.parse(localStorage.getItem("HEADER_FOLLOW_STATE_" + e)) && (this.props.followed = !0)
                                    }
                                }, {
                                    key: "bindEvent",
                                    value: function() {
                                        var e = this
                                            , t = document.querySelector("." + r.default["header-wm-follow_btn"]);
                                        t && t.addEventListener && t.addEventListener("click", function(t) {
                                            e.followClickCallbacks.forEach(function(e) {
                                                try {
                                                    e(t)
                                                } catch (e) {}
                                            })
                                        });
                                        var n = document.querySelector("." + r.default["header-wm-avatar"])
                                            , i = document.querySelector("." + r.default["header-wm-info"]);
                                        n && n.addEventListener("click", function() {
                                            e.openHomePage({})
                                        }),
                                        i && i.addEventListener("click", function() {
                                            e.openHomePage({})
                                        });
                                        var o = document.querySelector("." + r.default["header-wm-up"]);
                                        o && o.addEventListener("click", function() {
                                            e.triggerUpBtnClick()
                                        })
                                    }
                                }, {
                                    key: "openHomePage",
                                    value: function(e) {
                                        var t = e.from
                                            , n = e.wmId
                                            , i = this.props || {};
                                        i && i.noJump || window.ucapi && window.ucapi.wemedia && window.ucapi.wemedia.openHomePage && (this.invokeOpenHomePage(n || i.wmId),
                                            window.ucapi.wemedia.openHomePage({
                                                id: n || i.wmId,
                                                name: i.name,
                                                avatar_url: i.logo,
                                                followed: i.isFollowed,
                                                target: "index",
                                                from: t || 16,
                                                fail: function() {
                                                    i.homePageUrl && (window.location.href = i.homePageUrl)
                                                }
                                            }))
                                    }
                                }, {
                                    key: "addOpenHomePageCallback",
                                    value: function(e) {
                                        this.invokeOpenHomePageCallback.push(e)
                                    }
                                }, {
                                    key: "invokeOpenHomePage",
                                    value: function(e) {
                                        this.invokeOpenHomePageCallback.forEach(function(t) {
                                            t(e)
                                        })
                                    }
                                }, {
                                    key: "shouldScaleFootball",
                                    value: function() {
                                        return !1
                                    }
                                }, {
                                    key: "shouldScale",
                                    value: function() {
                                        return this.props.name && this.props.name.length > 6 && window.innerWidth <= 350
                                    }
                                }, {
                                    key: "render",
                                    value: function() {
                                        return '\n      <div class="' + r.default["header-wm"] + '">\n        <div class="' + r.default["header-wm-avatar"] + '">\n            ' + this.renderAvatar() + '\n        </div>\n        <div class="' + r.default["header-wm-info"] + '">\n            <h3 class="' + r.default["header-wm-info_name"] + " " + (this.shouldScale() ? r.default["header-wm-info_name-small"] : "") + '">\n              ' + (this.renderName() || "") + '\n            </h3>\n            <p class="' + r.default["header-wm-info_detail"] + '">\n              ' + (this.renderDetail() || "") + '\n            </p>\n        </div>\n        <div class="' + r.default["header-wm-follow"] + '">\n          ' + (this.renderFollowBtn() || "") + "\n        </div>\n      </div>\n    "
                                    }
                                }, {
                                    key: "renderAvatar",
                                    value: function() {
                                        var e = this.props || {};
                                        return e && e.logo && !e.hideSource ? e.vipLevel && f[e.vipLevel] ? '\n        <div class="' + r.default["header-wm-avatar_vip-conatiner"] + '">\n          <img src="' + s.default.replaceUrlSchema(f[e.vipLevel]) + '" uc-image-reader_state="disabled" alt="" class="' + r.default["header-wm-avatar_vip-extra"] + '">\n          <img src="' + s.default.replaceUrlSchema(this.props.logo) + '" uc-image-reader_state="disabled" alt="" class="' + r.default["header-wm-avatar_img"] + '">\n        </div>\n        ' : '\n        <img src="' + s.default.replaceUrlSchema(this.props.logo) + '" uc-image-reader_state="disabled" alt="" class="' + r.default["header-wm-avatar_img"] + '">\n      ' : '\n      <div class="' + r.default["header-wm-avatar_placeholder"] + '"></div>\n    '
                                    }
                                }, {
                                    key: "renderName",
                                    value: function() {
                                        var e = this.props || {};
                                        return e && !e.hideSource ? e.name ? "\n        <p>" + (this.props.name || "") + "</p>\n        " + (this.getBrandLogo() || "") + "\n      " : "" : '\n      <span class="' + r.default["header-wm-info_name-placeholder"] + '"></span>\n    '
                                    }
                                }, {
                                    key: "getBrandLogo",
                                    value: function() {
                                        return this.props.single ? '<span class="' + r.default["header-wm-info_brand-text"] + '">独家</span>' : this.props.original ? '\n      <span class="' + r.default["header-wm-info_brand-text"] + '">原创</span>\n      ' : ""
                                    }
                                }, {
                                    key: "renderDetail",
                                    value: function() {
                                        var e = this.props || {};
                                        return e && !e.hideSource ? '\n        <span class="' + r.default["header-wm-info_detail-time"] + '">' + (e.parsedTime || "") + "</span>\n        " + (e.authDesc ? '\n        <span class="' + r.default["header-wm-info_detail-author"] + '">' + (e.authDesc || "") + "</span>\n        " : "") + '\n        \x3c!--<span class="' + r.default["header-wm-info_detail-author"] + '">' + (e.author || "") + "</span>--\x3e\n      " : '\n      <span class="' + r.default["header-wm-info_detail-placeholder"] + '"></span>\n    '
                                    }
                                }, {
                                    key: "renderFollowBtn",
                                    value: function() {
                                        var e = this.props || {}
                                            , t = e && e.followed;
                                        return e && e.noFollowBtn ? "" : e && e.hideSource ? '\n        <div class="' + r.default["header-wm-follow_btn-placeholder"] + '"></div>\n      ' : '\n      <button class="' + r.default["header-wm-follow_btn"] + " " + this.getAndroidBtn() + " " + (t ? r.default["header-wm-follow_btn-followed"] : "") + '" id="' + r.default["header-follow-btn"] + '">\n        ' + this.getFollowBtnInside() + '\n      </button>\n      <div class="' + r.default["header-wm-up"] + '">\n        <img class="' + r.default["header-wm-up_img"] + '" src="' + c.default + '">\n      </div>\n    '
                                    }
                                }, {
                                    key: "getAndroidBtn",
                                    value: function() {
                                        var e = navigator.userAgent
                                            , t = !1;
                                        return /android/gi.test(e) && (t = !0),
                                            t ? r.default["header-wm-follow_btn-android"] : ""
                                    }
                                }, {
                                    key: "getReproduce",
                                    value: function() {
                                        return this.props.original || !this.props.reproduceFrom ? "" : '\n      <span class="' + r.default["header-wm-info_detail-reproduce"] + '">转载自：' + (this.props.reproduceFrom || "") + "</span>    \n    "
                                    }
                                }, {
                                    key: "updateFollowState",
                                    value: function(e) {
                                        this.props.followed = e;
                                        var t = document.querySelector("." + r.default["header-wm-follow_btn"]);
                                        if (t) {
                                            var n = e ? "add" : "remove"
                                                , i = this.getFollowBtnInside();
                                            t.innerHTML = i,
                                            t.classList && t.classList[n] && t.classList[n](r.default["header-wm-follow_btn-followed"])
                                        }
                                    }
                                }, {
                                    key: "getFollowBtnInside",
                                    value: function() {
                                        var e = this.props && this.props.followed;
                                        return '\n      <span class="' + r.default["header-wm-follow_btn-text"] + '">\n        <span>' + (e ? "已关注" : "关注") + "</span>\n      </span>\n    "
                                    }
                                }, {
                                    key: "updateLogo",
                                    value: function(e) {
                                        if (e) {
                                            var t = document.querySelector("." + r.default["header-wm-avatar_img"]);
                                            t && (t.src = e)
                                        }
                                    }
                                }, {
                                    key: "updateProp",
                                    value: function(e) {
                                        this.update(e)
                                    }
                                }, {
                                    key: "update",
                                    value: function(e) {
                                        this.props = e;
                                        var t = document.querySelector("." + r.default["header-wm-avatar"]);
                                        t && (t.innerHTML = this.renderAvatar());
                                        var n = document.querySelector("." + r.default["header-wm-info_name"]);
                                        n && (n.innerHTML = this.renderName(),
                                        this.shouldScale() && n.classList.add(r.default["header-wm-info_name-small"]));
                                        var i = document.querySelector("." + r.default["header-wm-info_detail"]);
                                        i && (i.innerHTML = this.renderDetail());
                                        var o = document.querySelector("." + r.default["header-wm-follow"]);
                                        o && (o.innerHTML = this.renderFollowBtn()),
                                            this.bindEvent()
                                    }
                                }, {
                                    key: "onUpBtnClick",
                                    value: function(e) {
                                        this.upBtnClickCallbacks.push(e)
                                    }
                                }, {
                                    key: "triggerUpBtnClick",
                                    value: function() {
                                        this.upBtnClickCallbacks.forEach(function(e) {
                                            e && e()
                                        })
                                    }
                                }, {
                                    key: "showUpBtn",
                                    value: function() {
                                        var e = document.querySelector("." + r.default["header-wm-up"]);
                                        e && (e.style.display = "block")
                                    }
                                }, {
                                    key: "hideUpBtn",
                                    value: function() {
                                        var e = document.querySelector("." + r.default["header-wm-up"]);
                                        e && (e.style.display = "none",
                                            e.classList.remove("close"))
                                    }
                                }, {
                                    key: "setUpBtnOpenState",
                                    value: function(e) {
                                        var t = document.querySelector("." + r.default["header-wm-up"]);
                                        if (t) {
                                            var n = e ? "remove" : "add";
                                            t.classList && t.classList[n] && t.classList[n]("close")
                                        }
                                    }
                                }]),
                                    e
                            }();
                            t.default = p
                        }
                        , function(e, t, n) {
                            var i = n(63);
                            "string" == typeof i && (i = [[e.i, i, ""]]);
                            var o = {
                                hmr: !0,
                                transform: void 0
                            };
                            n(6)(i, o),
                            i.locals && (e.exports = i.locals)
                        }
                        , function(e, t, n) {
                            (t = e.exports = n(5)(!1)).push([e.i, '.wmAuthor__header-wm__d4b7a9ac02{font-family:微软雅黑,Helvetica Neuce,Helvetica,Arial,PingFang SC,Hiragino Sans GB,Heiti SC,Microsoft YaHei,WenQuanYi Micro Hei,sans-serif!important;color:#333;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center}.wmAuthor__header-wm-avatar__086c1ea8b5{width:32px;height:32px;margin-right:10px}.wmAuthor__header-wm-avatar_img__cdda30a4a7{display:block}.wmAuthor__header-wm-avatar_img__cdda30a4a7,.wmAuthor__header-wm-avatar_placeholder__f8504f37cd{border-radius:50%;background-color:#eee;width:100%;height:100%}.wmAuthor__header-wm-info__d72f02b4f2{-webkit-box-flex:1;-webkit-flex:1;flex:1;margin-right:8px;overflow:hidden}.wmAuthor__header-wm-info_name-placeholder__fe948e6da8{display:inline-block;width:80px;height:8px;background-color:#eee;border-radius:2px;margin-top:6px}.wmAuthor__header-wm-info_brand__996ce51d50{width:46px;height:16px;vertical-align:top;margin-top:4px}.wmAuthor__header-wm-info_brand-text__e20d7cda83{padding-left:12px;font-size:12px;color:#bbb;position:relative}.wmAuthor__header-wm-info_brand-text__e20d7cda83:before{content:"";display:block;width:2px;height:5px;background-color:#2696ff;position:absolute;left:5px;top:50%;-webkit-transform:translateY(-50%);transform:translateY(-50%)}.wmAuthor__header-wm-info_brand-football__c13a6aaf55{width:86px!important;min-width:86px!important;height:16px!important;vertical-align:top;margin-top:3px}.wmAuthor__header-wm-info_brand-small__db1d1fe26f{width:30px;height:10px;margin-top:7px}.wmAuthor__header-wm-info_brand-football__c13a6aaf55.wmAuthor__header-wm-info_brand-small__db1d1fe26f{width:58px!important;min-width:58px!important;height:10px!important;margin-top:7px}.wmAuthor__header-wm-info_name__b83df9cdc5{margin:0;text-align:left;height:20px;line-height:20px;font-size:15px;color:#333;margin-bottom:2px;display:-webkit-box;display:-webkit-flex;display:flex}.wmAuthor__header-wm-info_name__b83df9cdc5,.wmAuthor__header-wm-info_name__b83df9cdc5 p{white-space:nowrap;overflow:hidden;text-overflow:ellipsis}.wmAuthor__header-wm-info_name__b83df9cdc5 p{margin:0}.wmAuthor__header-wm-info_name-small__ba5c964d60{font-size:14px}.wmAuthor__header-wm-info_name-small__ba5c964d60 p{margin-right:0}.wmAuthor__header-wm-info_detail__3ccfd1e8a9{height:16px;line-height:16px;font-size:12px;text-align:left;margin:0;color:#bbb;white-space:nowrap;overflow:hidden;text-overflow:ellipsis}.wmAuthor__header-wm-info_detail-placeholder__e3ac62aca6{display:inline-block;width:120px;height:8px;background-color:#eee;border-radius:2px;margin-top:2px}.wmAuthor__header-wm-info_detail-origin__0f42f4c210,.wmAuthor__header-wm-info_detail-single__d3ccf89508{color:#333}.wmAuthor__header-wm-info_detail-origin__0f42f4c210 a{color:inherit}.wmAuthor__header-wm-follow__e037821b10{display:-webkit-box;display:-webkit-flex;display:flex}.wmAuthor__header-wm-follow_btn__dbc72ba34f{position:relative;background-color:#2696ff;color:#fff;white-space:nowrap;text-align:center}.wmAuthor__header-wm-follow_btn__dbc72ba34f,.wmAuthor__header-wm-follow_btn-placeholder__6b7e2291d7{width:60px;border:0;padding:0;margin:0;outline:none;-webkit-tap-highlight-color:transparent;border-radius:6px;font-size:0!important}.wmAuthor__header-wm-follow_btn-placeholder__6b7e2291d7{background-color:#eee;height:30px}.wmAuthor__header-wm-follow_btn-android__e25aff28fb{background-color:#52ade7}.wmAuthor__header-wm-follow_btn-android__e25aff28fb .wmAuthor__header-wm-follow_btn-text__12a16b8de9{padding-bottom:6px}.wmAuthor__header-wm-follow_btn__dbc72ba34f.wmAuthor__header-wm-follow_btn-followed__aa4e8aee0c{background-color:#eee;color:#bbb;font-size:14px}.wmAuthor__header-wm-follow_btn-plus__b37f5c69ee{height:30px;line-height:30px;font-size:16px;padding-right:2px;font-weight:700;vertical-align:top!important;font-family:PingFangSC-Semibold}.wmAuthor__header-wm-follow_btn-text__12a16b8de9{display:block;font-weight:700;padding:8px 0;line-height:14px!important;font-size:14px!important;vertical-align:top!important;font-family:Helvetica Neuce,Helvetica,Arial,PingFang SC,Hiragino Sans GB,Heiti SC,Microsoft YaHei,WenQuanYi Micro Hei,sans-serif!important}.wmAuthor__header-wm-follow_btn-text__12a16b8de9:before{content:"+";font-size:16px;display:inline-block;margin-right:-2px;font-family:PingFangSC-Semibold}.wmAuthor__header-wm-follow_btn__dbc72ba34f.wmAuthor__header-wm-follow_btn-followed__aa4e8aee0c .wmAuthor__header-wm-follow_btn-text__12a16b8de9{font-weight:400}.wmAuthor__header-wm-follow_btn__dbc72ba34f.wmAuthor__header-wm-follow_btn-followed__aa4e8aee0c .wmAuthor__header-wm-follow_btn-text__12a16b8de9:before{display:none}.UCUNNIC#wmAuthor__header-follow-btn__9e71f1de22.wmAuthor__header-wm-follow_btn__dbc72ba34f{color:#999!important;background-color:#134b80!important}.UCUNNIC#wmAuthor__header-follow-btn__9e71f1de22.wmAuthor__header-wm-follow_btn-followed__aa4e8aee0c{background-color:#282828!important;color:hsla(0,0%,40%,.5)!important}.UCTransparentMode#wmAuthor__header-follow-btn__9e71f1de22.wmAuthor__header-wm-follow_btn__dbc72ba34f{color:#fff!important;background-color:#2696ff!important}.UCTransparentMode#wmAuthor__header-follow-btn__9e71f1de22.wmAuthor__header-wm-follow_btn-followed__aa4e8aee0c{background-color:hsla(0,0%,100%,.1)!important;color:hsla(0,0%,100%,.5)!important}#header-follow-btn.wmAuthor__header-wm-follow_btn-followed__aa4e8aee0c{background-color:#eee!important;color:#bbb!important}@media screen and (max-width:320px){.wmAuthor__header-wm-avatar__086c1ea8b5,.wmAuthor__header-wm-info__d72f02b4f2{margin-right:5px}.wmAuthor__header-wm-info_brand__996ce51d50{width:36px;height:12px;margin-top:6px}.wmAuthor__header-wm-info_brand-football__c13a6aaf55{width:58px!important;min-width:58px!important;height:10px!important;margin-top:7px}}.wmAuthor__header-wm-up__da123913ae{display:none;border-radius:6px;background-color:#eee;width:30px;height:30px;text-align:center;margin-left:4px}.wmAuthor__header-wm-up__da123913ae.close .wmAuthor__header-wm-up_img__7825d1cb0f{-webkit-transform:rotate(180deg);transform:rotate(180deg)}.wmAuthor__header-wm-up_img__7825d1cb0f{width:16px;height:16px;margin-top:7px;-webkit-transition:.3s;transition:.3s}.wmAuthor__header-wm-avatar_vip-conatiner__5f3f6532da{position:relative;width:100%;height:100%}.wmAuthor__header-wm-avatar_vip-extra__a8cad46a9a{position:absolute;bottom:0;right:0;width:14px;height:14px;border-radius:50%}', ""]),
                                t.locals = {
                                    "header-wm": "wmAuthor__header-wm__d4b7a9ac02",
                                    "header-wm-avatar": "wmAuthor__header-wm-avatar__086c1ea8b5",
                                    "header-wm-avatar_img": "wmAuthor__header-wm-avatar_img__cdda30a4a7",
                                    "header-wm-avatar_placeholder": "wmAuthor__header-wm-avatar_placeholder__f8504f37cd",
                                    "header-wm-info": "wmAuthor__header-wm-info__d72f02b4f2",
                                    "header-wm-info_name-placeholder": "wmAuthor__header-wm-info_name-placeholder__fe948e6da8",
                                    "header-wm-info_brand": "wmAuthor__header-wm-info_brand__996ce51d50",
                                    "header-wm-info_brand-text": "wmAuthor__header-wm-info_brand-text__e20d7cda83",
                                    "header-wm-info_brand-football": "wmAuthor__header-wm-info_brand-football__c13a6aaf55",
                                    "header-wm-info_brand-small": "wmAuthor__header-wm-info_brand-small__db1d1fe26f",
                                    "header-wm-info_name": "wmAuthor__header-wm-info_name__b83df9cdc5",
                                    "header-wm-info_name-small": "wmAuthor__header-wm-info_name-small__ba5c964d60",
                                    "header-wm-info_detail": "wmAuthor__header-wm-info_detail__3ccfd1e8a9",
                                    "header-wm-info_detail-placeholder": "wmAuthor__header-wm-info_detail-placeholder__e3ac62aca6",
                                    "header-wm-info_detail-origin": "wmAuthor__header-wm-info_detail-origin__0f42f4c210",
                                    "header-wm-info_detail-single": "wmAuthor__header-wm-info_detail-single__d3ccf89508",
                                    "header-wm-follow": "wmAuthor__header-wm-follow__e037821b10",
                                    "header-wm-follow_btn": "wmAuthor__header-wm-follow_btn__dbc72ba34f",
                                    "header-wm-follow_btn-placeholder": "wmAuthor__header-wm-follow_btn-placeholder__6b7e2291d7",
                                    "header-wm-follow_btn-android": "wmAuthor__header-wm-follow_btn-android__e25aff28fb",
                                    "header-wm-follow_btn-text": "wmAuthor__header-wm-follow_btn-text__12a16b8de9",
                                    "header-wm-follow_btn-followed": "wmAuthor__header-wm-follow_btn-followed__aa4e8aee0c",
                                    "header-wm-follow_btn-plus": "wmAuthor__header-wm-follow_btn-plus__b37f5c69ee",
                                    "header-follow-btn": "wmAuthor__header-follow-btn__9e71f1de22",
                                    "header-wm-up": "wmAuthor__header-wm-up__da123913ae",
                                    "header-wm-up_img": "wmAuthor__header-wm-up_img__7825d1cb0f",
                                    "header-wm-avatar_vip-conatiner": "wmAuthor__header-wm-avatar_vip-conatiner__5f3f6532da",
                                    "header-wm-avatar_vip-extra": "wmAuthor__header-wm-avatar_vip-extra__a8cad46a9a"
                                }
                        }
                        , function(e, t) {
                            e.exports = "data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIzMiIgaGVpZ2h0PSIzMiIgdmlld0JveD0iMCAwIDMyIDMyIj4KICA8cG9seWxpbmUgZmlsbD0ibm9uZSIgc3Ryb2tlPSIjQkJCIiBzdHJva2UtbGluZWNhcD0icm91bmQiIHN0cm9rZS1saW5lam9pbj0icm91bmQiIHN0cm9rZS13aWR0aD0iMyIgcG9pbnRzPSI2IDE4LjYgMTYgMTIgMjYgMTguNiIvPgo8L3N2Zz4K"
                        }
                        , function(e, t) {
                            e.exports = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAAAXNSR0IArs4c6QAABvlJREFUWAmlV1tsVUUUXedxX22BFtpiqYWGGoVGoSYagUSJCf0xPj6MMUGN/pmgfhgTNWKN4WGifPAFP8QgEUxMjBo+SEz50RjwA5SXgNSW8miBNn333vbec+4Z1z7nbnp6aQXjtHPnzJw9e629Z2bPPhbusRhjEkB+E+A+D5Nvg0Ej7GRdOD0oDMJCH6zUKcA/DKSOWpbl3Ytq625CBF6KwNsGy7yKwnkPo4cWIHfChtePsBpqcJaRF2vFYwFqXplApjUBYx2EnfiERG79G8a8BAicBIIOmMK7GN3rYvDzFPwB0PKZGszz7NQDDR/ksXSLTy/tBuztJFKYi8icBEKrTf4Icp2rcGNLBbxr5BIDm4+EjqtsoglYuTeHmvaLXJ5n5vLGHQQIvgZmuhPDO2swuCMxJ7AClANKX95J0Wdpmz72sHzrCOz0JpI4G74v/cwiEFk+fQb9b9Rj/NsZZXMBioL4uD7Hx5WMtLUvA61fDZDEmrgnbJGXEq65uH2Ilit43Iq5nhU03hZFGauOaX+ABl3+rAZB/kiIJaAstwlwRgeyXPOBMrerIm1FoT4LkPbjY/KsVcmIXM/2BIaIIVilEi5ByfXd6Hqw8o4NJ4qkVLUDyRYgdx7IynEfj8bjwApmpYFEI1DgCfQmZ06NvE81AU9eysJJt8hSuKEWOecjPGoF7nYRUkX6vOJrYMlmEqcZhoiWOI5xpvd9oH/PzJxEA/DQfmDhOspQdTEPjPwCnHmJc/1ILkeMK8Rqfmcblbxp0XoGjcIoLjZVhOe83KKFLwAt34fKjJ/jHHGaQeHkFyj2HEBq6SiNIVByBfDorwxK1QyUYzAeZQ0tsCyYW51wet6O+mKUWw+0X8sxRlTTFIbXPCOcBBlZJxEQElobPuJYkf/TkeVU6F/5CX7XQSRrJiNwkW39LgQPcgO0JxuBcTgksXg9vKnFkU7ByBNrgpjEJgHG9hGGVwUXAvGaXk2vS1gXy6PqndsDt2oK7gICCfiKT4HKVoaPERpBV5cVy61EkOGyGM5XA68Sk9h2eLFkGdsVVIio9VYtrapiXwY5mWsfDP0JM96LZPVEJGe44e5/K3S58abKoGPd5BIEBd5nSmCYmMV8m8uBRhR4sQioktDWzpQG2dD1QqJ48zjslAfLKW2q5g95mDMwuZt8P1OCsb/DZTKjF2AteABmiktTpMNFjeifIibQ6MLilZpnR5nJsJLRZZGxkvuDiasz6y5yDa/TeloeeikUhH/pEPyL+2A7eSTTWdi5szA+oWSdVXeOmLzOS8eQtPSFWi/9vBxLWhoeu0i5meyj4pL1NRu5+2thsoPRS/76fx0g+JdIZCaRSPMkBFTIf8sheFy3eJSnhGvPZMLl+VUC0sarz40lBGSC7IFsP5uSJbQePq33ZNcXUbzeGYInBTwlG5SIqkvA489pYhpv0KZf+pBgMiEC4vK4kIyNHSO2QzH5Y/HpUrVm0bpo5wcFeuE6vNO74CZ5OgRc5sar6JW+tqkQs48EmEZVMpMpF1Yil3fO8gCPRaRp4QaeoioSGKXxhRDcxiTXvHQ6dL4CSisGCo60Sx4PyPQUfcscrpZplL7UCcp2/CR37FXOkGUg36rGSEHdc4z1k9wiOQQ3foYZ/oPgvB8k+qkxqktb1Slt82Zi+oepNXU0zOEkjVJBabWK8KX3iC+W23BqGJh8Plev4806ShJjKHbtg+tOw9Y8VOfG9enyir4ksRYxb3RSR23eSAxzTCCXM4fTiXGmMnbrR5ih3yhmwbnvCZhFT3MlKni2hxH0fAOrMIREUnY8ZRVIwbXPV7f3wMPEsqyDgh3uq/A6Dqa7cYzX8bQcvZJwnIi7GOapLgKnUOz9gQGynkHpBIrndhF8CrbNC2mueTomhKRkmoAXZ65jLoEYxtRZstdVTCBFsLyKksIwrN+ZVvHYOcufhUk1IujeD8fxZoPr3DiwjElf2vXEcJK7Q0x2Qw+w5d5hGh7kj6N7xyOsdyajJSXGrkOh5jX4vUdgB0PIZIY4mS8VUNs4qABIv63DQ9vWs4zl60mgIMO3CUintBRncJpJaT9zuHJl2i/ySvYq4Dpy+ZTAFVBlpI2PNdN7G5mUOvMkpUIgWop0O9ZSsIWptCjQqgqlT2auK8GGnfL3cTkls5a6InBJy5mnzZRZHtDhyBPMkAeYQJ7ih4mkUapMAPVZ27nG5J1suA1c82X8MHHv8cMkRiJJ8zpQ5KdZD3O4C/w0my59mgmgFLVenuNk5Jyv5VFbzU8zbjjGj//2aSb6tETeYNIKfpyOM426wkxmkMmEXKdShUSGcT3NWseQvpJRVYIMz/n/+jhVAtqSSIIZzCY4TOF8fp5bsc9zv/R5ztgu4VUiHNeaAe7u5R8O1PhtnVsyXQAAAABJRU5ErkJggg=="
                        }
                        , function(e, t) {
                            e.exports = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEsAAABLCAYAAAA4TnrqAAAAAXNSR0IArs4c6QAAGl9JREFUeAHtnNmTX8V1x/s3mn3VSJrRCK1ICCEWoxBiUjhUEjB5SCXFH2CK4sEPrlTZ5ZcUVQ6PdqpcfogrfuCFBxeF/wCeUgkYE1cK45hFyIA2hBbQaKTRMiNpNPv88v2c0+fe+5v5DUggQZKipb7dffr06XO+vdxe7m9S+tp9jcCtQKB2K4R+lsx6vd4hngfl98rvyX6jwj75Xvlu+WvyV+WvyJ+VP5z9QYVv1mq1WYVfqvvSwBJA98qyJ+QflX9YvlO+mRNrPQkM8lbTb0Z5r8u/Kv+SeN9TeMvdasrclIpl9JAEPSn/lPy+ELq0VK9PTc/WZucX0uz8YppTuLCwmERO+m8OrMwLr9bWltTR1pba29YobE09XR31lhZHM8vcr/AF+RcF3Him3fTgloAlkLZK03+U/658F1rPzM2ny1dn0tXp2TQ7twDJHCYHQBBQKOPl+TntPc3BhKejoy31dLan/t7O1NneZrx6TMs/L/8z8X8cxJsV3lSwBNKgFPuxPCC104MuXblWk09zAggQosJqXGTvRoFagWAVuhwv8soyADfY25XW9nVHj5tTLqA9K9AuKbwpLnT/QsIEEnKelv+p/NCiULowMVW7MHE1LQqAmv6pTygLsMSa7TaCHuS5Is4XPJK7kj+KB9om1hNr1tTSuv6etH5tT32NxqlEMySfkf+lQHMFlPi8znX8vKVVTgbxFvuV/GMkL05O1cYuTKbFpcCkBMtBE5cBZ5A4UNZbMlUa0cFMsYhXQoo6NBIDkyVyhHKSBUwb1/endQM9wfqKOJ9UHm/Vz+2o5XM7AcWbDaBGpmfn0ydnLyXC63UYRu8JB2ZhfNANxwwCNOMBJUO0DD2vYo7yuzrb0ubhwdSlYSo3Jv8d1ckb9HO5ivQbKy/lvq8SP5dvOa/hNjo+kZbUm7ADoWFL2fwimrNcxSJUbBlomdF4HKzoIIDlAEeIHAeQOp0vysBD/LYNAxqaLN8SGv5Q9F+QuFGHxjfspNRPVOhHmr/rp85ctAnch1ieYwqJPlPZgFNNGBNx60HwGWbWdcSQ01GeNESMJlYFI/M0L25UryKLXtvbnbZuGqxrxUHmPyv4pyziugMK3pCTws+pwPcWF5fqH34yXtN6SckQU7W2BMZ6mbgilxCH2pGHiCKuPOM1sZWMGxTguCDLdenuaku7Ng/V16yxyf855f+DKXKdD1PnOnlpWetR8wuL9SMnz9VYOy130cOq9KBRWQmUg+CglHOXGWio5eGGoALVrG7OtzoiHqERGx9RL2FHe2vavW243taqV+cN9rBce6PwZikBxRz1rwvqUYdOjNVmNJGv1K9UK1qzhEelw2gfVLmaUgXPVi9QhCEXofVcsZn0TKdw8GRBHuTet1K3kotF7F07NkYP+4Hqua45rNS0lLUiJqV4672s5VMNoKamWfOV3duAMUuNXHT7AhOz0kuE4cZZGVZF8eh6YghaKAkAOOjI8QYBNGhFJdZ7vUzQPFU2XC31drWnO7dvZBGL1MdV/jPfkiGF2ps6AcU6ir3XyNGPz6VLk9dMGa+4USVoPhW7qIrdRjBuQwAzMTdLqdIKo5VboBOMlHGQXIDzWA+EoP8OmlWnpNMc3axbrpS89VrA7trK9tWWFftU9lPXYS0utvlTQCHa1lFnL1xOWpXnza6qwlp0UcQ3wE6DTBoPE/nhiC5pfQEFuuVknoKmtHpwqgef8VpViMt1edrkK9/rDx7qXmqgWUGVNV2RbXWmdOHyVDp78TLqjci/KDr2ruo+FSyVelr+Md54H41eKCoJcFAKA7xylMhgBE2FQ0FAgh9ngAWvpQEo8pQBLcsw4CTYAXRDC5oZnY3PIBTAmWK5fspnTwsV+qvMyTOXUp5Wvq1qn6bu1dyqSMpINsUcuG04cOR0jdOCcFKvGG7VeIyrZrTIawgRCDbSwhXhifFO0zPTI0YGADDcnEZjRNwyyS/0WybIixtHUanK93Z1pPt2byb3vPweDcemm+9P61mcHgydOT9Zu3xtpmgZWgUDl7eUtZZaKvKp2Xym1Sth0KFFnN5iMo0mqmXQC71XRZ7Jl2yR5XNvzHHrxdCsuIMeNK+fkZDrJKQu8V65NpvGLlwGfiYw7G7qvEGXZUkg51EfapnQ9of3T9QUqoWZWHH+jInWJtSsHLmkUSgc6VatAQf6OCnWObEU49DPHHzeLayMd5asUsjI+VBLqdYvLB0GRN6qfMiRTPisTE57/fWkU4r04N3b661rWlg83iG9PzYdK4/WSrwa5eCu/fS5iaQFqNFdmaiKSj1et9YVdK6LG53jFLxz+3AaHtS+LBvtwuo6lainhcXFNK+TUg4Dp7XAvTYzlyY4+xKtcBk0qz+qVybkFq0rN67rT4P93albB4GAAAunrhNXp9PH2thrp+GilIHONLK9YiTAGlz6Ey4oHD03Udu2aV27CmD/D7xg+TSQyyRK2FHwSZ1Jdf7uwEe1xUXVEloE47I0Cq4QJMJdO0bS8DruIK7TyYCTYxc16V40A+ihjnG1Qq/ptqH+tG1kXdLWZVXhDOEToxc1xCYN3GCMho3QIdYIkKyH7tvBWRhn/NvVuxqOqJvV9KQYu0bHJ2sLCz6PFPONMqpzB8bEHAJgpAmhbdJ5UlOgKCMj8A0WiH7w+Fg6KeOiPonyt2Auo8DcN3ZvTrdv3vCpQMHI+d/OLet1TDOQdZN+haxsWxaK5oyisfM2d3EUDg4NrtkwfAqOM+OTeQKNlbK6bww55RssahoqByHSzE8AwD71Dl/sNVS2sLCU5jX0zGG4dxINlXp65Q/H0uTUtF9K6IKiXb5L+zhOP6kDVozft2erhpydT7mceErevIbcvOoohp4Kca8xvG4gnZ+4piXCrFdZdCnX16Rjh+ij5ycF7lqkgsO/hHjCBrCkFNdV+67o7ccbkLFsSDg08Ete9CaMYD4Qj2iGWU7ftX1jqmnCrDpeEgVQZCAaJx3/7Y2j6eTZSa8q0wF+58betLaXK0ZrmvSAelQzoADo2sx80ctN7rJHy5o2NcaVNNDTbgte5LPwLW1ULUpfnZq1l1Bvd8c+8BBfcc3WaJHf69EVTXFalCFlQEjhGIJ0CvIKOkPKaG7WUJ6nsBvPkGPSxQUtwneOauiNCaiKa5Uhe27rl2Ft1pup585tw6mnG+Aa3dT0vG6M5j4VKEpsHe5Ppy9cS5eu+nrRpgHRaQbiVXu0jIhKuOcs3HKwHiWHk88AibTFqwIVN5ryfK0SoNa5YbGJEjBwGBpvVKdFTs2GzJuHR8teJn6GzS4B1dnRYmVli73tNum0s8GJflVAzeVGaMhrkuBFMLKuV8Psmt1VBjgGFJBJntPq2tZxEW7O8IhEAZYYabaHOau6PKWXgQozR0ULAA4Ogcvj5MQWZvNQo1F6q5oiNp/lsefxlN47Pm6Km1wecrdr6HW2O1DUg9dxSgOg8E1p2EUjkL4eNzzYoyXLUjo/ycsudwLswlbT00G7rLUgOIjl4YyL8RdgKfWgfCe3M+QAlMnJgHkc5TVPmXDF1cMiThm6dF9346086yl1FnOEEQeEd46MarpDhnjkhwY6dHG6xuu1npzSri0b7MDOJfhzZk632NfZo6rl+ns6UTddmpqzl4oBpDS6QMfHkLx02XDAGHAxVwVrLxR6lRfwwmaL6NajsgFM6zhoVgmhIlTaqTdYOFOCjCZuVPMivQMHR01vuqEBGaMELw4vVU9bNrJFLR1vzhu5QSpL6osTnWHhsO9qPrys2uX2yBblX9ZEn53hQrwKFl+z6E0wV4KgrmkGR4gh4rF1EN1W8aJ1SKuSlsoikfRq7sTYhGUFluv6OjRIAd2BJ9y+ab3Nf1UZ127gqq1ajnh7W2nu1LRvuWx0KC+mHGsspf1ugVL2lY9Fym6QiVenfdMMEjEVxymPzJBUlSPDcNAjQsQp7q9iEijgIUMvQHFK0so6LxUgKH99b1shyuoReduyXsU2iCXIZ7mJKzPp9PjldEXrKsBg+G3VwrS67JibZ5rJNVVCZENnc52ddSLiVbA4EbX9GVqbmDAyG02+GS59DS/AESF6EHn4cGF0pCOPt9jFK9NGhr2nQ4tPDUNXnspquuvr97mqUvf0bN6Ah8Bl4Xmd4r5z5IwO9K5a41h9ufx+0Qf68nwq2pwWxwAJTzQqRqEDblr71OwMF+JVsGwTx8KRoYezINdIj3FBOcyWMwzj7QY/PmeBeJFX0ES8eNmBsjqU7u1s9bqsVh5L2qbYcW9BYUIPvQpijmD0gWNj6Y/HzjVkZTMKGj0uHB0UKwMwGsgIMKhgZQFdbG4bwMLWxYUllfL/JlhgWPn8DDCoxKQLBQORpNXH5kGRVRx5F9QDSs3oWbwBEeCOC9G+ZQvQWb0BmzlOLX7zznHrTY35rkN7W816rq6+VDP7P63SZxjOvM29ob1q7KSMG2IHCJ5oClbXkuA2lVXaBdBNDQHJycaQF1op4uIVgSjPSr1dH5yFc5WVCj0UtZ6liZAiba211KaXQvQawNyxeV0Ut5B5aiE3WjVjRsPy1299JHmA3+g6NJmv72sr3s6hB3Zxk88+lfqzoR7IxsIeZbHH1GKWTbW50ioNU95kMdSstEp6D8q2SrqBp15FRYYjPcw08WrYoxVgGV2MppVXCK9Nns5uG2aAMlnGV08bZE0UgW2mer6VxbAg/fVbxxqGtGWpwGBve1rb7ZvtmE/tJYXQXG85R7rAcpohTUMWb/aiJapgXZEcRJXd04DwQeWjLkyAq2gUm+AxFsfh3do+b4xMSihqcT2QUEzUSrerZ9m6Kr9yN+igkCHjTa3WVQHegiGfOljo/ubtE7qd0dxXUYlTiY0D7alTn1PSg2h4L0fFmTHXYwUDQXht5KCLEoq36iBApfTfPgKm2oZ1Fl8Fa0j4/BHDwq6kJIAQB52xTo9DcPQ8iys9fsnEGG9M/NQYDugBK6tuPYsbKMrjWVspsHx4ZnSK6nWS71LeOnRaB3qqJ4SITE8BqA4BBT+ycFU9Ta4etjbMPJYvvsijFPGW8tSkMKjas84ivEOvcY54VaPrQqPQrSohfKYpRvLPahCLmlGHhp6tJ63a7CoOAMypHF8cGFCSA5DrB3pMph5IsPP6MBzSxzqhOHSSS5jSCac01N9eDmllWSOKrv8GnoWyI3qom2SV5PqdN6R2CofsDBfi5ZLWr73sWghwrHUyEGZMbglrAeUTRgthGNWS5jJietbXKNGzTGNqQ2N5M94QlgLS3ppFAkY29PnpJ/Lk7QxME7H3DjbPc+n1904hyRx1InKD9pS8KIwvdJcA19vrq9pDnArg914oIaSzp5y+iLY69DgckRVg9eXNJgyMPANEcZXPgs00V6Qpnda/RHHHBmuIR2gJyTOqJlFpYEaKsnlIJ5SqyIxUPj2QenEY8t8ffGJvMRNsVB0J9bQmHVIYH5rBThkPAYSVOkT9z+AQV9R4PO48BZ/YKwcCTcE6SP1r9dWvIY40F+fGSJIpoUfkY5QZanneMtD+eOyMlYyelXEqbRQhaAh1OYlvQC1uNYs+DVj8U/zk2QkddV9x0JXG9bSv0dGz3uBoKlroAkABUpGnfHiMz0IACp3LjmC9S7YP5JeURBsu1FcMTMXflJ8ZXtffIZFmC6cxWMVcgpAIRbW4SGYM7FQsouXMac7jfpCFJYBZHlnZsa6aTeUiE4M2rPVDQ9qIgcnikWGISEK2KyTgRQ/26/3dsfIHBMsAtczjAJhKyiqcMZIih0I4nwqMlyEgnuHBPjLZIIKLuWIYyigyXtevGGqcdloriWBdN3dlACNNfd4C3n2NjjijO+3wCb53ZU6yoByGSvd2xnzgjYDMLfpQFqAAFj/DRSxxFX//+LliSLpBAOXLCzi8fgpLLxPSGJquJtfpiqpMPlGhWD6jM7psZekDDqr69YyLGVGA5SbZb2HSiK6xcKY4YcQBKuLZkDDOFA2FFB46cdYuT+lZeJzF1Yp9PYAlmslwYzes7amk1cVZXqiySe3njp2+YOVzEa2jfNXvdasYeok3Gs0OLlUi9Ec3z1dDZnrQ4HF8keFy+Cw8u1cjQrgcrJcg3n4bax0JkRTzOQ5UinqeCXZDoTW2lPPtP+w34I4VgwfAWGFHz2JLoe+kBFR7a6sbK1mszll4Yvy7H2r+E401I+V5IfTqfD5ePBG6vj4Pwe8gSA/mLxECCEAqe5rXQQVhJ/EdWutlZ3hEogEstTzXPvu5DmeCk1zg4WEOJazVIJkCxlDEnRYALqXDJxk+87lHiRdr5YZ0Fo5SOE1HeQjmcgLJ34J1Xb9PatM95cVsha3f1uUDPEojwsMMRqZheOhS8MGrAg36Gz+0LEv52I39cvszHsTNNYCVaS8Q7tKNL9p4BRKYWwjt4k0TLeYtVc5fxoMC+vf7905kYwOrmtZF3fkVAg+XoNoLUlfuTazw2eJ8cPys5bskVum6JNAQDDDQQwzeUzJAgIFz3XKezU/Rw6C5rrY7ES9zVtD0NbOV18NwiARhM7BeFH16j763bNUeTTa4ISIGcCI5TZkBWGl9ScOo45pvuIdj8elOFxMadtwN8s7dpNsg8kIOQ5C330H1ytmFhdwZKaujlvaSz/QSNRrOZJuuJQ2ZgEmAs6Qe1dCB9/w29drd24fg5sANHBrcCrDU9fgY4nkBVbv79hEDJQyJFi0rKyumZch33rIOjPn3331gAHjf8g8wvnnPZl2idtivH5DnZdlkL9pJwinO6DE0/9ORl+CiPigYrpDelOPUG3pCI6NoXPKKnme5xgu/mDyu/L36kKWV7wVkf8YBSYVbAVbO+ZnCuXt2bdL34r6WQS6uUMjrQX3qy/TybYNydmeoMpwdvfbmESsfj4f2bk737xoxEANk+Dk3f/eoLl6zAyCU7NB2BhdGm5257qjfdQuQymFXApzzpBuuoCvOScfdOzeRwV4N+1e4pmAJVV5jz+tcqvbg3dtcqDTylnBgArRQHslmAC1ocT35T1oZJ85cSEdOjtnbkBHJt+g7Ng3YJWsMJeYq5infaCPFRAgoj1EXjrqjjM81XpfVpzzTA1bIlhZNZWNeglaURz957MRelaJX+WucyiquKVg5/1mF43tvH6kP6TCuAAdN5FwJD115B7MwRDxexnQ2hX779oc2f1EewLboG6t7dw6ndgHHQvCawBrVrYyhDZPqYlDogxqXJRIyDQTLdmAw3OoFBJusobs+picDWGkrSuiiFTofSxd9SwaZKQi7m7pVwRK67Iafka898sAdthKPyrxVSmWQHHkeV17RC3jzZF5lvvTagXT01LgNUXjX6me7LEgn9JPgl3+voSpw3AhyNfwyUNGDTRa9IWQq5I3qYGCvxw1UpbzBvH7kGagZXHSm0R75kzvIUiw9k+0mvcLBsKqTAuS/LP/Y+9oc//ado5JYKUIU/cJFOkLoEa+ERPt6etPeXZt0Xd+WPjhxPh0RgNoXmzORsoSj/DbbL2UQDBZYKsJMgWraZZSKkRfO5QBQAPWtfbvSPTs3wfCK/N8IrKpFUdDCqqSGjEgIsI2K75cf+Y83DqZjn4x7RSJ41Yrk2ot0k7zSvlJTXR+mmYVShTXSE1GA0dqiH1fqGJ2k9x2met/MLw9DdtCRUMRdACR3kVbIWvLxP98LnY3sF/uFBVKENCeF35FfevTP9tS1G4ds3Vka8d8nS4U2FAjlcbSeDdmIi1DwKN7ZCiAA4G5RHZmbOAAjD96YiK2c1ps2vJCLcP4bT5ab0wpW5olkQ5IhrPhG2fHXsgeyPL9wLU5ElW7qVp2zqtwS9KrSP9QHqrW/e+S+OvOMG73MGClubx0pZHNMhq2cb0rjgtZWW0q97bo+W7OkISfwWpdSd+uiyaEO+pYBgmz+AQ5x8xmAHI+8mPANNEkoQIJPafT/27+4l8+4aSd+2Yp9n+miUT+TEQYp8xMFP9LPN+ovvba/5pel9D7yXIQqNkNiaBAyz2EIeTQ5vEVclDIfGc5ThstppE2ABTyKOpFU0QVOXNAIB3X89MRf3V/v6dJ24Fb93tBq1UNGP6fge/p2vf7Sfx6ojemDVXNUjaGORGOYswIU0x6DAdgAdGhgo+2Dz0BwJoOwmr88Trpw6GKyc5gz2Fr9vUaGfqAJx639JWuuE8Csh2kPV9ekXzty8qxsNrRcyWDMpEiaASREJwt7wi1PQzfQxBVigt/TMeFnXKL7hEATIM7ceLu3DaXHH9obQ+/L+Y106CLAvq/4z+VbDhw9re3MUa2duAwN01zPZTorSb7Mrra8lQlazg8+BFRcOeQqYKo8wxxn9WfZ0PiZyV/+6e7Et/NyTObMUb8gcaOutOxGS4pfyjyq4FfyI1yuvvzGIX2gcaVR8QIVryCG2TK0PLPgdcMd2JzVJFi9MzlaXK19+5t7dX6mjxu+yr/rELoLMNZhAPaYVKwfOPJJ7b/2H9OxsB/6WYuHVWqaxvnI4TBo1AsaeqUEVlvSzY9aK2F0xAqJC9Jv3b8rfePOLayq4WDB+dX+xZDQT4Cg0NPyP5UfYvJ/69Cp2tsHT+VNcQUUMYQzOzMKxIMrgPHQuJSlMA+1yIdGY1hZxfme9YG7tspvi0mcvR5btl+qISj2hZzr+IVElIWl+KBSP5b/rnw7n0e/q5723oejaZxvy7OVMXF7yQyGJcp4zD2+MiKzeR58bPTvveM25qX4EwQcszwv/6zy/cYXEV/Q3VSwQheBtlVxfoYGaF3Qz2ku44dMx0fPKy7gVrho+FCpMU3HwuXOpT/M02cXC3t36pdneVeh7Gl5QPrf//ezpGSDE2gcaD8p/5T8vsjUJUZdP5OrjV+6ahcSl3QpwTdb9hfauMHInYiftPGtF5e13Fbj+aXZtpHBus7DAlXEsnd9Qf7/3l9mQ/vlTsDdK9oT8rxBH5bPX8MqVnHqOXV+tKnjXaakKiAVrsTHoa/Ls035//E3/6rWVeMCjovDB+X3yu/Jnrcqu3Q8Q5chxbdR+LPyfKCBPyj/lfw1SdX7tfsagVuAwP8AfaVRJij8ChEAAAAASUVORK5CYII="
                        }
                        , function(e, t) {
                            e.exports = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEsAAABLCAYAAAA4TnrqAAAAAXNSR0IArs4c6QAAGDVJREFUeAHtXGmQXcV17vv2N/uMkEYjtBsBkgXIlihABsuWWAImcZxKUrYhFCmcMpUYinLiIgX88A9wBbvKcWwnJBWccgiucmEXDhExi0GJWWQDkiIrCCMMWkcS0mj25c287eb7zum+y+iNZtFIUVKcmb7dfbr79DnfPb3cvnfGmA/oAwTOBALemRA6mUzf97Oosw5hJcJFNrQjbkRoQKhDGEEYQhhEOIawx4ZfI97med4Y4rNKZw0sALQaln0aYSPCeoQcQg3yfVMpGZNMo8ybSL9RFG5F2ILwFIB7E/EZp4mUmZWOAdBcCLoV4TaENU6oXxrxSz3vepWBI6YyfFxCtdBn/AqchUBBKyrmJ9LGS2ZNItdikg3zTLJ+rkk2nW/SbRf4XrouqvtOVH8M4XEA1+X6me042uGsyQZIiyDsKwhfQMhTcBnAFI9uN6Wut01l8Ag4vvzSd5CyF8ROI2FG8qxDIh+Nkk0LTHrOxSazYK1JIW2pgPhRhG8AtEOOOVuxU21W5AGkVgh6EIEgZeAp/tjBX3pjna+ZyhAAEkNREgXC8qiIYyMZkmO6Ci5mDZsmcNmFV5jsoit9eCK5RQSC9gBA60U8K0TBp00AiXJuR3gYYa5fKvij+3/uIRikA6NQFvcca2yIIitE0YumWQZyGtsiRVgzGJomt/TjCBswTPOsySF5L8L3ARornRa5rmcsBEC1o/EPEDbBUH/04FZv5O2nMe64mHng+Bg1kZjWWbVlCCLNcjJRNVIXrBm2N6m8qbv4ZpNbvF4kQtALCLeiH66qM6bTAgtAcGUjUPPLA4fN8K4fmnL/QasMERkvPs5TiGx1QTBaP15Xa8V5k7VPNS8x9Zd+FnPa+Wz+PsItAIwr6Iwoqt20BACou9DgWwiJ0QOvmOHdTxq/WhYZzggR7rwKJc7UaMwG4llwK/JJs9oeW5C6VZ8x+SVXU3QV4R709x1mpkszAgtAPYSO7vMrJX9w5+Ne8ciOYPggERir1gMCx+M4QylHnSSprSATDtWgLssEvdlpn+34iGlYcysWgDR7/BoAu59dTIemDRaAegQd3FnFXmngtX/wSj17xXh2qnMOE2onQSEaaBMAJLxIedDmLLRPti43LVd80e3RHgFgf0oNp0rTAst5VHW03+//xXe9yuD7wAVAWEDoJZIWl6BocY2AF5ZpPSp5ttsnGttNy1V3+YlcMxWclodNGSwAxTnq2/Sovpe/GQOKRo8nB0KMj97Ey4gqqGYd26Bm2Sy1TzV2mJZrvowHBHkKuHuqc9iUwIKBXPV+hjnK63v12165d5+YJIZjXLmYjkQjHUEJogM3suAwDRI+YtfOxWezfaoNQ3L9XZzDqNR10GnSVXJSsGAI91F89prf/8b3TPHwDoXDgRDEqMESCwxztiIS7EbLbIpIad0gtg3OYvvswrWm+fI72DG3FWsA2Cn3YQnWnIgAFG2TfVRh78tmrHO7qdI4BFwtGIyZC3l+FWnLYzUliALvXGo/1rnDFPa+RPXmIzxu7VV1a1xPCRbq346wqdTfaQZ2PSEA8KFBgJAY2xabD3kEDkSwImW+Xz0n2w/u+rGhfaBrEW5nYiKaECwYz4diPOv5/sD2x7Gdq6jx9CDiIRewLShhB9arLFDCl7r0LP6eY+1xJCT2qUEPW7tDcyKpCcFCnQcR5o7sfRl7qf0QpSBwiMm8Q8ODNMrs0GMcpYB/DrenfbST9iLQ7prECicRgOF51LvVUiHd9dP7PRzWnVQnZAh0cl9EmJMoXqRzOE8DMnMvFJBLPPAbOh42t5M/nW+i9pHKNZKT91+jUYSl7Q10nHfTQ9hO5HH6aC7AZH8oUkmSqfEMm+fBXWbkNy+aanFYWG5D6WIyNV2V2KpsPFkTdLixvPnyPza5ReuwSIZOLPNXpWj84oipjA6YaqHXlIe69IDw2B5THcWpKX5Evgxh15floYyUSOVMbsmVJjt/tUk3zVcu5sYq5Ba79pjht58z2BdKXae3i8nUtOpv0Gb4Ny96jatuzqCI9t/NOlGSmxllwKvoigf88lju2NN/6dEgSKX1Ibm8i6XQiWJFpPHbcsUdJr/o8rDdpCnfDL7172ZoN454Atkqbnz/9R/6pGlYdaPxcBxTk9DeLxfN4O7NZuS9/5yS/l6mzrTf/Fe+l8ryjH8JvCt2RB3e7rDHW5HMcwwTKM5VVFRiFDB281DIp2Wujm5S65Z/fAKg2L6iwXqNtq2a3tf+SYDSPvXunNS/lzRzPvHnpvHS35sYKBEIvJMZ04R69RdePyX9q2PDmLteoTG8A8QhRrWG4W2sMbx3a6wD8vwqtgqxTWPcIHoDjcOdMU1r/pBNYlQtj2FY2DdYBMrKogcc2vx1U+x+16TSKQyvlEmm0iaVzcDgRKCHwcuLuRv/wqQauS0aT9jDQbYEyBOCfA/g5pddYwpHdplKP462J9F/eN+rAHcTmxOHvxY59hIDC4byddWaUl+nKfUdkpEA6XAguwKiUPZZNg/ogjqACUap1JaPfs54iZhoEwOK1ZzSaHTgqa+bwX07tLFc0R/muKb580yusSHof86Ge2oCVS2N4mC2H2+HsL0ZR1Yl47WsMmNH3zPZurpAXi39S72HYHunSbcsXEM8MBSD12zjhyHf65nCgdekSxrPyRjSlcAQz0FOgLF8qcMazCPkFn6EuYA47Kole7ctvA7mrm2b40ChfSKRMC2L8BKioT7ov3ntLTQgkKkJ35SGe01psKcmUNHKDUs/aoa6B8zY0LBocCr9nf1oL3g4OePB2siC0SNvyryk1svYEpCkA94Xu6dieZX7Kv5aIDPtF8kq5TpgXC0WcEUlkk5vEleLo6brl0+wMQpECDwSK+j5HSaV4aJEvmdy81eZumVXIR0lADXUa6pjlD05JXhiumAlAOs2lWJJ9KX88fqTR/stCR4uE4AFY/lKfT22Cn6xt9Oir57EylGPAldtFvvlEoDbsPwaJ1viKnbIrA8UECxSdhvRs+t5U8GkGgCIFs0d7ZirspH+wVv3eZQ4lFV8aagPN4GL1tSpruNCeGDVFAYGJtSfqtJ+4gDJ6y0u0kkAFnLrEHJjx/ZgksJehXeb1a3HMC3eE/EkV4d8IUSpcUMFxzoocoYy1jTnl643/tX2ATba1rW2mHQeb/Uhz8luuuR3TDLPJ6+QKqND1ltD3lRSmWYcoKCf0cFhPL1harA2RvWXNOwfJQ76iQFxEYqCtZKcIiY4bRACIDWRVaGWT2aNzpJ1bYoHutL5Dps+pKOBTUc635JhJGJw4fCra2mWPoL+E0lTv2IDqwRETy0XBoL8dBLpxvO0Om54eQxzaA392TcDJ3pLggvTUbD4NQt20TzaUdK5CacFwRylOEieHgZSABFLHQCDJT8g+/Ad5K1XYYUxA3u3C9tBn2tsUuFhZdNw4XUnzX/l4X50Fqk0jWQiy+2TUqmgQ3i8/q48goPgQn50fRdmqf+ozj/0hmD4WBFQEtBZPjLyaBPGvFHc1zgSRWSeokejUIhpfEf07usS80JOvqVRbrTUFEH49ujCDUEdJipj2CS7PVSsJJ4Z6z1ihg++aYoDxzFHlUy2pcM0LF1jUvXhcC6Xy1alcfpDFPUuAgdLNcHiiagpD/doHSoMksnZphx8mFHAUQD0yroMnMSlsl647YiRFpaGus1o72Fbx8MzbA7DUJ3c3em6xZdjrmqJtMaXSKP8VGtiKnTtNydefxIb0LdjldjqxBtPmkxbuPWolnRFjOuvTx9sXBnudjIEF2aintVIho9lngqHQjQlkw74DhZuVYmMehqTtp6yKUqHqPCZYzkI5WMnsOFFrM/cvsnkOTxcufbRtPpGqe4uFax8tTadLOc+rnv7ZtOz8xnmrGauZRgXezolQxU5bbBiXH8WWBvDlVZwYcM4WECpWi5Ca/1lhdiG06pB+9XxOHnzbkhFacb6OhTJrEGoP3rigEjihRClc/lg6FNYZs5yk25eYBurHK6AtaiCD08OP/e38KZ3VJgoE+qfwONTOpeTRyje0GqpbEqjBTxR4PlUdI3rr8aAx1VcvMarCVbex7GJEtC1G3cCEyMoo+prgehGDpmMoLyX5ZeOrqHGCqq2HKVnWaFeKmkSacxzFMRiFDSulGczFYgrbiDmKm5B4lQuDJrOZ/4GnnpAC1Q80j4+HMyaXHOjPF9qIXtEBexMck0NAhb54/VXxaz9wAPPucGqEPWsAp/SRWEVK+3cHKJd6eSuPJuGI7uFgLqWh06YjIAFuy3STgaVI6840OVwkQfmWJ+0Z/5Ke1PZK+aPUWxcxxGfB2NAuXJsQfJYWTN4VBKdFQ1NoyM5wwKPD+jsl/NvVH/3YRJtETz021aRHt06DIoleAAW4yBQY95suqpI1hh56SjCc22K3Qec2kHsQHMxPYJEhZLptMh07bMdq0wC50osJa9aKePxpMDqAfEDlMPP/13oUa4Ei0T9nDaTqUf7GerPPhk8fKJp73Yw/uNgoVMvnZPKrn/XmDFJ8jiqieajdQtHIytR5HTU1YECpjLSF2STmFMcUWbDiqvRCecA3hyugNB13PnX8V/8yIwc/rVrJnECnlLf1oYjnkygGwtEX8iJ6sujpmjeCYryiIOlYAmOgnWMhck63YtMtPF0EiSmQSBRyG5SRw7+FznCl+0Ah2I0oCSYrNHeS6ony+oEj83Nw/Mb5UqoSl01jgBWsJndZvp2bxH5wYVDr7UNXmpHBQpmqr8DLLJtEVzYVxSsPWSkmzpEUW1EpZm1ykvG5XHDZfnVOqxIBatjQ9ir9VIUQHLiOXuQGNshLXkoQBZE8JJfuEYODkUWvEvPwDC5AyR6W2moxxx76THb0rbDjahvbcXcl5T+FWTnSarbdPR37VPNwEFJcGHSWcO0gmUriQ2CkV0WUYGdMmiZWEi7hKcGM41T1n26O5c5il5FcsAh7+Yu5cNIuRl4kF66FgLUgyioUsAQtEOS3nVs6w+x9GO/BZH2vQgOBxuxLcD84tSx8enoT70yk4Alk0BmzmK5Q/JErtZAEfUa2kStxMU1Yw0Fjz/kIfTu+InEChDUFrxQJrGI0HIkBTi04U9u7nI0J1iUU8UD86DNV3FAuN2MHHqTCogYLjrc+XMPxfryI+2QooczLYROWQ6eslxay53O4KKc/Wo5cbAUTI5Rz9qGwtF8x0pU18U0DooqaeWp3RRMBoh10Z8Q56TS4HFJ6yswouSQgjtjD+S8w216s3NXyOKiymKuwgpY5b4PHsVnwhNv/ESmPu0B+mHlyzbwefLk/slhbzPVn/YTB4jg0zZxEQrAwh0eA2drIlvvZdrUu8R6uSNsR2BUAU3rHaAUp7DjE7T+Xc+ySIySWIajDsFU4xxW1QA+29cvwyszWaV0pdIhyD6rpudXz9lFIQSdZ/Pu5tTqX24eK8xAf9pPHKDhVosLTYjNWcxv4SW/cLXTg9nAMPUCIqY8mCLpQFlmYTjr9b1JA7HqYq5yL1glBjiZ5nkiVi62Ta79AmQxBAEYV70yvJPzVLHvqBl451X1FPYHE3iSmkxhi3CK/lEzJGakH8i2bTQiE7/WO12a9lsSPFwm8CzLeIpx44qP4QpV7F1RAFQwB2g07zpydUUOqrJ99+tPSFbHD6wUx8DwaTtf+awFQHLzPoSNKF5OCFB8o4xJnEcxAK17278hpkBpLMBn8nyRofqcqn+nU1Tfqeiv9ouKgodTNgYWXI4z6M7snCUm3crPHUhiuSZxrdIgkrsbcjscKzSAig7sfgHehfNuroS0VS8mP2+ZNCCLO/T6pZdDHIYfZPMEoQyPZH5o/6/w0L0fzVBTf3HsnIezIjOF/qWTaerPIUj7QTstHioG1xhYlvsY46aLPyEKyQ3Exd0lGihGMZZCjcUrHA+x6Ijyrpf/WY0Va3lfufFcypy096FCrgPna3KqqicBlQLOyDGp9+x6DpUIjMpLYAOb5g6doNr2TIjn2JvoPM31P139Gy/aAMlCgoPLMK4F1uPgF5pXbfT57t91aq2TG0pFXUIP/cmh+SCrPBNUfBDzTeHwW8FEz3kmP285euZjDs7duRHFWbt4FryJ+yhuRrlL5+t0IRGNrQK8ij1Np39tgBZ6d5zaNfXHpG5oN7ooIBCHGJ0EFlyPH0M8mkjnvJbLbhKD9c6p8UzbfsXAMB16n1qj/bB+5+avyTGL+pUHnDKm/erPmkxLu6lbfIl4ingWh+DIIB6QD2II4g21rKAqJ5XB3x5iuzCT/qeqf8slN2Jbk6NJj1octHN7PQksy/8G4mLrpTf5RDskyIHx7FwIkUtKwmVYB3OWPA4BOU7W7z//nVAMUu1X/YE5b+2n8LeY2LHIgzK8CvNXafCE6dnxNASzL+BFDXFJZvlgO7P+w44nbs8FpvWym2gYD/Vo/0lUEyygyvdAjyaydd55V35OwREAdHLXO+XSiC1IAmEkDdUshr4Zeu910/fWlkCBVL7JNC5fK3OTLBoYghXs2Ht3vYCdO75bQGNdufC86l66RualcI6cWv9UJGwTTWv789Z/Hnsr+S6eXkX7T6KaYNlaDyDuall9rZ9vX6GAgaHDgDBomndfwCNIVMgGl2asRvvm2It/bwpH8QjK5hhiDQtXmbbLroPX1ONPeRfiAXwARy+77Sgm9Jj+ManzixrKJZ1O/xO1z2Lr0vLhTeyAUxDtrkkTggV0eXRwL4zy5m38op2QwYHS9ARRXvBRIyg9apC1WHjku7KDP3rA9L/9qp5xA7Bs6wKsjstMseeIOfTTb1KMkHxBiPIkvnmItkfmtPof354LTfumO3nzeAvvtXZbLeKRukicF+SgJMt/hrCpF8v4sS3/qF7BGsCI4uWGsxYxs9Ik6zCMlkXqJPFConX1dXiX12J6d/8HhujPBRiKdp9aEih+qxXIjrQ/3f5d+3mf/BPTeukN7PYFhOsBltOcvBhZ82K8WAaAtYMhf2FxGHd+8J2tcqd5I3jH5X4ISvQeBZACNO3EOys11nY4ix/BAzfetDjiapdI4uUFiF+9ZOrc4lK7/en237BivVn4qS+zu/cRTu8vLCgFoPCk8BaEasf1X/K5gVTPoQEgRFRa7r7Ny11jEfgaJBPkXfs0Hlv46OJckhNwBS8/uePP5PHR2STt2d1M+6cdC274Eo3ADC9/4RqciFJsLZpwzopWBmBcxu7B/shb9Lv3+ZyMBSAwJRajouCEc5TIsUYLoBZc1z6FLUG+qRnfY+HdHnbn2fpGeBS+9kObgE7Rfib9U3/aQXvQB/+ylfZNSm6cTFqRFaDYQ4juw7Gxf+DHX/WK3fziRoeeGod1DxJDHmojz04CHtLiebbngM8Eap7p9pk5i8yS3/+qj+8eqMGZ+XtD2kgCKI8guhPv8vyDTz7oxd7mEJbQeosSaltgJCHllARSfDQt1zPbPo8v/xZ/5n4/mZOzqjP7l6zOKudheFPsH3nm217/nlfoE1Ksg0f3Vq6+izE4JRnWtXsw8EMeq4R511a5M2/fdNHHzIIb73ZDb1oe5XQI7rljTDUGYHeh7rcQEj07nzXvb/me7p2cAEpW2xxHYreKxpk16s5Se/zxpZm/8Q7Ttua32CUnc85R8WcvlkyBZgwWZQOwjYh+gDB/9Ph+c/jZ7+LzwnfJVz+TCQil0V5iwxQFBNSWSzu0ma32eXxDuuCGP5MjIfTC7cH/zv91QMdCMIz7MAK2iVbivNw79tK/yGssN1kLGNbLxvOCPKXFQEWWWDowp9E+mWsw7df8EbzpBtw1SjkH/mMI7SMBIyp0O8LDCHPxBbLfvW2zxyPh+EcdUcsVGfEisQctLXFu0znM1Q9LFNGQH21PkOas+20GH8+b7IDPevcifB+YWbidrOnHqvH029VsAcX57v9BhC8gZHCQ5/fsfM7r/e8XDYepG3OBx4BDBZwVsbTVTDwLdZQUpPHts/OWmtZLroUnXY8/gZPzKB6zPIpw7v2XI2tJEAE0HuB/BYGg5VlQOL7P9L/1khncuwPA7SNLx5jzKodKBAmBxuWj9ZDOtS83jfhOtPnDG4IzfUgsIBCkc///Z0HJGAG0uWDcinAbwhpXiJew/tCBXR69baz7sBnrOSyHfvJpUeQDWw8nqvjXTiaDT7Kz550vb4Vy7ctMw+JLsFdqiI4KPrs+hvB/7z+zOVCiMYDjy7hPI3AFXY+QQziZcMTKL/149IwT0igg0bp8U7wVgY8p/z/+51/UumgawGWRX4ewEgGvdiRwVW20gUOXQwpvac+d/yYJXT6gDxA4Awj8D4arYHGHYHtrAAAAAElFTkSuQmCC"
                        }
                        , function(e, t, n) {
                            function i(e) {
                                return e && e.__esModule ? e : {
                                    default: e
                                }
                            }
                            Object.defineProperty(t, "__esModule", {
                                value: !0
                            }),
                                t.default = void 0;
                            var o = i(n(0))
                                , a = i(n(1))
                                , r = i(n(69))
                                , s = function() {
                                function e(t) {
                                    (0,
                                        o.default)(this, e),
                                        this.props = t
                                }
                                return (0,
                                    a.default)(e, [{
                                    key: "render",
                                    value: function() {
                                        return '\n      <div class="' + r.default["header-wm-simple"] + '">\n        \x3c!-- 简版标题 --\x3e\n        ' + (this.getOriginOrSinger() || "") + '\n        <span class="' + r.default["header-wm-simple-brand"] + '">大鱼号</span>\n        ' + (this.props.reproduceFrom ? '\n          <span class="' + r.default["header-wm-simple-reproduce"] + '">转载自:' + this.props.reproduceFrom + "</span>\n        " : "") + "\n        " + this.getAuthor() + '\n        <span class="' + r.default["header-wm-simple-date"] + '">' + this.props.parsedTime + "</span>\n      </div>\n    "
                                    }
                                }, {
                                    key: "getAuthor",
                                    value: function() {
                                        return this.props.original ? '\n      <span class="' + r.default["header-wm-simple-author"] + '">' + this.props.author + "</span>\n    " : ""
                                    }
                                }, {
                                    key: "getOriginOrSinger",
                                    value: function() {
                                        return this.props.single ? '<span class="' + r.default["header-wm-simple-single"] + '">独家</span>' : this.props.original ? '\n        <span class="' + r.default["header-wm-simple-original"] + '">原创</span>\n      ' : ""
                                    }
                                }, {
                                    key: "updateFollowState",
                                    value: function() {}
                                }, {
                                    key: "goToHomePage",
                                    value: function() {
                                        var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : 16;
                                        if (this.props.wmId) {
                                            var t = this;
                                            window.ucapi && window.ucapi.wemedia && window.ucapi.wemedia.openHomePage({
                                                id: t.props.wmId,
                                                name: t.props.name,
                                                avatar_url: t.props.logo,
                                                followed: t.props.isFollowed,
                                                target: "index",
                                                from: e,
                                                fail: function() {
                                                    t.props.homePageUrl && (window.location.href = t.props.homePageUrl)
                                                }
                                            })
                                        }
                                    }
                                }, {
                                    key: "updateProp",
                                    value: function(e) {
                                        this.props = e
                                    }
                                }]),
                                    e
                            }();
                            t.default = s
                        }
                        , function(e, t, n) {
                            var i = n(70);
                            "string" == typeof i && (i = [[e.i, i, ""]]);
                            var o = {
                                hmr: !0,
                                transform: void 0
                            };
                            n(6)(i, o),
                            i.locals && (e.exports = i.locals)
                        }
                        , function(e, t, n) {
                            (t = e.exports = n(5)(!1)).push([e.i, '.WmAuthorSimple__header-wm-simple__511e568a13{line-height:20px;font-size:12px;text-align:left;color:#bbb;font-family:Helvetica Neuce,Helvetica,Arial,PingFang SC,Hiragino Sans GB,Heiti SC,Microsoft YaHei,WenQuanYi Micro Hei,sans-serif}.WmAuthorSimple__header-wm-simple__511e568a13 span{display:inline-block;margin:0 2px}.WmAuthorSimple__header-wm-simple-original__9486dd8c54,.WmAuthorSimple__header-wm-simple-single__d7fe2b6160{line-height:16px;border-radius:16px;border:1px solid #bbb;padding:0 4px}.WmAuthorSimple__header-wm-simple-original_link__6b8181bf6c{color:#bbb}.WmAuthorSimple__header-wm-simple-brand__82bdad688d:after,.WmAuthorSimple__header-wm-simple-brand__82bdad688d:before{content:"";display:inline-block;margin-right:9px;font-size:15px;-webkit-transform:rotate(26deg);transform:rotate(26deg);width:0;height:12px;border-left:1px solid #bbb;position:relative;top:2px}.WmAuthorSimple__header-wm-simple-brand__82bdad688d:after{margin-right:0;margin-left:7px;border-left:0;border-right:1px solid #bbb}', ""]),
                                t.locals = {
                                    "header-wm-simple": "WmAuthorSimple__header-wm-simple__511e568a13",
                                    "header-wm-simple-original": "WmAuthorSimple__header-wm-simple-original__9486dd8c54",
                                    "header-wm-simple-single": "WmAuthorSimple__header-wm-simple-single__d7fe2b6160",
                                    "header-wm-simple-original_link": "WmAuthorSimple__header-wm-simple-original_link__6b8181bf6c",
                                    "header-wm-simple-brand": "WmAuthorSimple__header-wm-simple-brand__82bdad688d"
                                }
                        }
                        , function(e, t, n) {
                            Object.defineProperty(t, "__esModule", {
                                value: !0
                            });
                            var i = n(72)
                                , o = n(73)
                                , a = n(74)
                                , r = n(75)
                                , s = n(76)
                                , c = n(77)
                                , d = n(78)
                                , l = n(79)
                                , u = n(80)
                                , f = n(81)
                                , p = n(82)
                                , m = n(83);
                            t.default = {
                                meitu: i,
                                meizu: o,
                                meizubrw: a,
                                nubia: r,
                                nubiabro: s,
                                nubiatest: c,
                                nubiaggcs: d,
                                wps: l,
                                vivo: u,
                                mojitianqi: f,
                                mm: p,
                                huaweibro: m
                            }
                        }
                        , function(e, t, n) {
                            e.exports = {
                                leftAlign: !0,
                                timeFormat: "MM-dd",
                                hideLogo: !0
                            }
                        }
                        , function(e, t, n) {
                            e.exports = {
                                leftAlign: !0,
                                showViewCount: !0,
                                timeFormat: "M/d hh:mm:ss",
                                hideLogo: !0
                            }
                        }
                        , function(e, t, n) {
                            e.exports = {
                                leftAlign: !0,
                                showViewCount: !0,
                                timeFormat: "MM-dd hh:mm:ss",
                                hideLogo: !0
                            }
                        }
                        , function(e, t, n) {
                            e.exports = {
                                leftAlign: !0,
                                timeFormat: "MM-dd hh:mm",
                                hideLogo: !0,
                                sourceColor: "#bbb"
                            }
                        }
                        , function(e, t, n) {
                            e.exports = {
                                leftAlign: !0,
                                timeFormat: "MM-dd hh:mm",
                                hideLogo: !0,
                                sourceColor: "#bbb"
                            }
                        }
                        , function(e, t, n) {
                            e.exports = {
                                leftAlign: !0,
                                timeFormat: "MM-dd hh:mm:ss",
                                hideLogo: !0,
                                sourceColor: "#bbb"
                            }
                        }
                        , function(e, t, n) {
                            e.exports = {
                                leftAlign: !0,
                                timeFormat: "MM-dd hh:mm:ss",
                                hideLogo: !0,
                                sourceColor: "#bbb"
                            }
                        }
                        , function(e, t, n) {
                            e.exports = {
                                timeFormat: "yyyy-MM-dd",
                                hideLogo: !0
                            }
                        }
                        , function(e, t, n) {
                            e.exports = {
                                leftAlign: !1,
                                showViewCount: !1,
                                timeFormat: "yyyy-MM-dd",
                                hideLogo: !1
                            }
                        }
                        , function(e, t, n) {
                            e.exports = {
                                leftAlign: !0,
                                showViewCount: !1,
                                timeFormat: "yyyy-MM-dd hh:mm",
                                hideLogo: !0
                            }
                        }
                        , function(e, t, n) {
                            e.exports = {
                                leftAlign: !0,
                                showViewCount: !1,
                                timeFormat: "MM-dd",
                                hideLogo: !0
                            }
                        }
                        , function(e, t, n) {
                            e.exports = {
                                leftAlign: !0,
                                showViewCount: !1,
                                timeFormat: "yyyy/M/d hh:mm",
                                hideLogo: !0
                            }
                        }
                    ])
                })
            }
        ).call(this, n(117)(e))
    }
    , function(e, t, n) {
        "use strict";
        var i = function(e) {
            return e && e.__esModule ? e : {
                default: e
            }
        }(n(4)).default.utLogger
            , o = n(118)
            , a = n(1)
            , r = n(5)
            , s = n(3)
            , c = !1
            , d = null;
        e.exports = {
            setFollow: function(e) {
                c = !!e,
                d && d.updateFollowState(!!e)
            },
            onShowListCallbacks: [],
            onShowList: function(e) {
                this.onShowListCallbacks.push(e)
            },
            triggerShowList: function(e) {
                this.onShowListCallbacks.forEach(function(t) {
                    t && t(e)
                })
            },
            showUpBtn: function() {
                window.headerSDK && window.headerSDK.showUpBtn()
            },
            hideUpBtn: function() {
                window.headerSDK && window.headerSDK.hideUpBtn()
            },
            init: function(e, t) {
                var n = this;
                e = e || {};
                var l = "";
                (t.showSimpleInfo || t.showNewInfo) && (l = t.showSimpleInfo ? "wemedia-simple" : "wemedia"),
                "taojin-iflow" === a.urlQuery.app && (l = "site");
                var u = document.querySelector(".content-header");
                if (l) {
                    var f = a.getVipInfo(e)
                        , p = !(!a.platform || !a.platform.isUCMini)
                        , m = a.isHuaweiPre()
                        , h = p || m || a.platform.isQuark || a.platform.isDingTalk
                        , v = a.platform.isQuark || a.platform.isDingTalk
                        , g = {
                        container: u,
                        title: t.showTitle && e.title || "",
                        name: e.wm_name,
                        time: new Date(e.publish_at.replace(/-/g, "/")).getTime(),
                        timeFormat: t.showSimpleInfo ? "MM-dd hh:mm" : void 0,
                        logo: e.avatar_url,
                        type: l,
                        original: e.is_original,
                        single: e._extra && e._extra.is_exclusive,
                        noMarginTop: !(!a.platform || !a.platform.isUCBrowser),
                        wmId: e.wm_id,
                        homePageUrl: v ? "" : "http://a.mp.uc.cn/media?mid=" + e.wm_id + "&from=xss&uc_param_str=frdnsnpfvecpntnwprdssskt&uc_biz_str=S:custom%7CC:iflow_ncmt",
                        followed: c,
                        author: e.author ? "作者: " + e.author : "",
                        reproduceFrom: e.reproduce_from && (e.reproduce_from.wm_name || e.reproduce_from.wmName),
                        reproduceFromWmId: e.reproduce_from && e.reproduce_from.wm_id,
                        noFollowBtn: h,
                        showVip: !!f.level,
                        vipLevel: f.level,
                        authDesc: f.authDesc
                    };
                    d = o.init(g),
                    "wemedia" === l && setTimeout(function() {
                        r.log({
                            region: "top_sub",
                            action: "show"
                        }),
                            r.log({
                                region: "top_homepage",
                                action: "show"
                            }),
                            i.expose("wm_tag_show", {
                                spm: "content.wm_tag",
                                location: 0
                            }),
                            i.expose("follow_show", {
                                spm: "content.follow",
                                location: 0
                            })
                    }, 500),
                        d.notify(),
                        d.bindEvent(),
                        d.onFollowClick(function() {
                            var e = c;
                            if (r.log({
                                region: "top_sub",
                                action: "click"
                            }),
                                i.click("follow_click", {
                                    spm: "content.follow",
                                    location: 0,
                                    follow_type: e ? 1 : 0,
                                    is_followed: 1
                                }),
                                s.event({
                                    action: "follow_click"
                                }),
                                e)
                                a.gotoHomePage({
                                    from: 18
                                });
                            else if (a.is_share_mode) {
                                if (a.urlQuery.app && "smds-iflow" === a.urlQuery.app)
                                    return !1;
                                var t = globalConfig.utps && globalConfig.utps[176] || void 0
                                    , o = window.location
                                    , d = ((o.search && o.search.indexOf("?")) > -1 ? "&" : "?") + "action=follow&action_from=content"
                                    , l = o.origin + o.pathname + o.search + d + o.hash;
                                t ? t && $(document).trigger("utp:click", [t, l]) : a.openUrl(a.urlQuery.client, l)
                            } else
                                a.directlyFollow({
                                    from: 18,
                                    success: function(e) {
                                        e && e.success && void 0 !== e.is_followed && (n.setFollow(e.is_followed),
                                        e.is_followed && n.triggerShowList(!0))
                                    },
                                    fail: function() {
                                        a.debug("directlyFollow error"),
                                            a.gotoHomePage({
                                                from: 18
                                            })
                                    }
                                })
                        }),
                        d.addOpenHomePageCallback(function(e) {
                            r.log({
                                region: "top_homepage",
                                action: "click"
                            }),
                                i.click("wm_tag_click", {
                                    spm: "content.wm_tag",
                                    location: 0
                                })
                        });
                    var _ = !0;
                    d.onUpBtnClick(function() {
                        _ = !_,
                            d.setUpBtnOpenState(_),
                            n.triggerShowList(_)
                    }),
                    window.fetchUcParams && window.fetchUcParams.then(function() {
                        if (a.isHuaweiPre()) {
                            var e = u.querySelector("button");
                            e && (e.style.display = "none")
                        }
                    }).catch(function(e) {}),
                        window.headerSDK = d
                }
            }
        }
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.init = void 0;
        var i = a(n(4))
            , o = a(n(8));
        function a(e) {
            return e && e.__esModule ? e : {
                default: e
            }
        }
        var r = i.default.utLogger;
        t.init = function() {
            window.addEventListener("message", function(e) {
                var t = e.data || {}
                    , n = t.type || ""
                    , i = t.data && t.data.cardData || {};
                "card_welfare_click" === n && (r.click("goodscard_click", {
                    spm: "content.goodscard",
                    goods_id: i.id,
                    goods_name: i.name
                }),
                    r.click("welfaregoodscard_click", {
                        spm: "content.welfare_goodscard",
                        goods_id: i.id,
                        goods_name: i.name
                    }),
                    window.location.href = i.url),
                "card_welfare_expose_data" === n && (r.expose("goodscard_show", {
                    spm: "content.goodscard",
                    goods_id: i.id,
                    goods_name: i.name
                }),
                    r.expose("welfaregoodscard_show", {
                        spm: "content.welfare_goodscard",
                        goods_id: i.id,
                        goods_name: i.name
                    }))
            });
            var e = document.querySelectorAll("iframe.article-card-tb-welfare");
            setTimeout(function() {
                for (var t = function(t) {
                    var n = e[t];
                    o.default.listen(n).then(function() {
                        n.getAttribute("_has_show") || (n.setAttribute("_has_show", "true"),
                            n.contentWindow.postMessage({
                                type: "card_welfare_expose"
                            }, "*"))
                    })
                }, n = 0; n < e.length; n++)
                    t(n)
            }, 2e3)
        }
    }
    , function(e, t, n) {
        "use strict";
        var i = n(3)
            , o = n(1)
            , a = n(10)
            , r = ["//mparticle.uc.cn", "//mobile.dayu.com", globalConfig.cardHost];
        t.init = function(e) {
            window.addEventListener("message", function(e) {
                if (r.indexOf(e.origin.replace(/^https?:/, "")) > -1) {
                    var t = e.data
                        , n = t.type
                        , s = t.data;
                    if ("book-card-read-click" == n)
                        if (i.event({
                            action: "book_card_read_click",
                            title: s.cardData.title,
                            card_name: s.cardName,
                            wm_id: globalConfig.wm_id,
                            wm_aid: globalConfig.wm_aid,
                            wm_name: globalConfig.wm_name
                        }),
                        o.platform.isUCBrowser && (o.platform.isAndroid && a.match(globalConfig.VERSION, "11.7.2.954~") || o.platform.isiPhone && a.match(globalConfig.VERSION, "11.7.5.1022~"))) {
                            var c = s.cardData.reader_url.split(",")
                                , d = "";
                            d = o.platform.isiPhone ? "ext:open_novelbox_reader_inbox::extparam:book_id=" + c[0] + "&book_type=shuqi&chapter_id=" + c[1] : "ext:open_novel_reader:bid=" + c[0] + "&type=shuqi&cid=" + c[1],
                                window.location.href = o.getSafeUrl(d)
                        } else
                            window.location.href = o.getSafeUrl(s.cardData.detail_url);
                    else
                        "book-card-click" == n && (i.event({
                            action: "book_card_click",
                            title: s.cardData.title,
                            card_name: s.cardName,
                            wm_id: globalConfig.wm_id,
                            wm_aid: globalConfig.wm_aid,
                            wm_name: globalConfig.wm_name
                        }),
                            window.location.href = o.getSafeUrl(s.cardData.detail_url))
                }
            })
        }
    }
    , function(e, t, n) {
        "use strict";
        var i = n(3)
            , o = n(1)
            , a = ["//mparticle.uc.cn", "//mobile.dayu.com", globalConfig.cardHost];
        t.init = function(e) {
            window.addEventListener("message", function(t) {
                if (a.indexOf(t.origin.replace(/^https?:/, "")) > -1) {
                    var n = t.data
                        , r = n.type
                        , s = n.data;
                    t.source;
                    if ("tb-list-item-click" === r) {
                        var c = s.item;
                        i.event({
                            action: "tb_list_card_click",
                            wm_id: e.wm_id,
                            wm_aid: e._id,
                            num_iid: c.id,
                            has_coupon: c.hasCoupon
                        });
                        var d = c.hasCoupon ? c.couponClickUrl : c.url;
                        window.location !== window.top.location ? window.open(o.getSafeurl(d)) : o.checkucapi({
                            apiName: "biz.openTaobao",
                            success: function() {
                                window.ucapi && window.ucapi.biz && window.ucapi.biz.openTaobao ? window.ucapi.biz.openTaobao({
                                    link_url: d
                                }) : location.href = o.getSafeurl(d)
                            },
                            fail: function() {
                                location.href = o.getSafeurl(d)
                            }
                        })
                    } else
                        "tb-list-card-pv" === r ? i.event({
                            action: "tb_list_card_pv",
                            wm_id: e.wm_id,
                            wm_aid: e._id
                        }) : "log" === r && console.log(s.message)
                }
            })
        }
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        });
        var i = function(e) {
            return e && e.__esModule ? e : {
                default: e
            }
        }(n(46));
        var o = 1
            , a = 2
            , r = (window.__SDKLIB__ || {}).envi.os.ios ? a : o
            , s = window.ucapi
            , c = function(e) {
            return new Promise(function(t) {
                    r === o ? (!function(e) {
                        var t = document.createElement("iframe");
                        t.src = e,
                            document.body.appendChild(t)
                    }(e),
                        t(!0)) : s.biz.startApp({
                        pkg: e,
                        data: "",
                        appstoreURL: "",
                        success: function(e) {
                            var n = e && e.result;
                            if ("string" == typeof n)
                                try {
                                    n = JSON.parse(n)
                                } catch (e) {}
                            t(n)
                        },
                        fail: function(e) {
                            t(!1)
                        }
                    })
                }
            )
        };
        t.default = function() {
            var e = function(e) {
                return function() {
                    var t = e.apply(this, arguments);
                    return new Promise(function(e, n) {
                            return function i(o, a) {
                                try {
                                    var r = t[o](a)
                                        , s = r.value
                                } catch (e) {
                                    return void n(e)
                                }
                                if (!r.done)
                                    return Promise.resolve(s).then(function(e) {
                                        i("next", e)
                                    }, function(e) {
                                        i("throw", e)
                                    });
                                e(s)
                            }("next")
                        }
                    )
                }
            }(i.default.mark(function e() {
                var t, n, a = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {
                    invokeLink: "",
                    fallbackLink: ""
                };
                return i.default.wrap(function(e) {
                    for (; ; )
                        switch (e.prev = e.next) {
                            case 0:
                                if (t = a.invokeLink,
                                    n = a.fallbackLink,
                                t || n) {
                                    e.next = 3;
                                    break
                                }
                                return e.abrupt("return");
                            case 3:
                                if (!t) {
                                    e.next = 9;
                                    break
                                }
                                return e.next = 6,
                                    c(t);
                            case 6:
                                !e.sent && n && (window.location.href = n),
                                r === o && new Promise(function(e) {
                                        var t = 0
                                            , n = setInterval(function() {
                                            if (document.hidden || document.webkitHidden)
                                                return clearInterval(n),
                                                    void e(!0);
                                            t >= 15 && (clearInterval(n),
                                                e(!1)),
                                                t += 1
                                        }, 200)
                                    }
                                ).then(function(e) {
                                    !e && n && (window.location.href = n)
                                });
                            case 9:
                            case "end":
                                return e.stop()
                        }
                }, e, void 0)
            }));
            return function() {
                return e.apply(this, arguments)
            }
        }()
    }
    , function(e, t, n) {
        "use strict";
        var i = r(n(4))
            , o = r(n(8))
            , a = r(n(123));
        function r(e) {
            return e && e.__esModule ? e : {
                default: e
            }
        }
        var s = n(3)
            , c = n(1)
            , d = i.default.utLogger
            , l = {};
        c.userInfo(function(e, t) {
            t && t.utdId && (l.utdid = t.utdId,
                l.userid = t.uId)
        });
        var u = []
            , f = []
            , p = ["//mparticle.uc.cn", "//mobile.dayu.com", globalConfig.cardHost];
        t.init = function(e) {
            function t() {
                for (var e = function(e) {
                    var t = u[e];
                    f.forEach(function(n) {
                        var i = $(n).attr("data-tblink");
                        t.url !== i && t.couponClickUrl !== i || (u.splice(e, 1),
                            d.expose("goodscard_show", {
                                spmc: "content",
                                spmd: "goodscard",
                                spm: "content.goodscard",
                                goods_id: t.id,
                                goods_name: t.title
                            }))
                    })
                }, t = u.length - 1; t > -1; t--)
                    e(t)
            }
            window.addEventListener("message", function(n) {
                var i = window.__SDKLIB__
                    , o = i.util;
                if (p.indexOf(n.origin.replace(/^https?:/, "")) > -1) {
                    var r = n.data
                        , f = r.type
                        , m = r.data;
                    n.source;
                    if ("tb-card-click" === f) {
                        var h = m.cardData;
                        s.event({
                            action: "tb_click",
                            wm_id: e.wm_id,
                            wm_aid: e._id,
                            num_iid: h.id,
                            card_name: m.cardName,
                            has_coupon: h.hasCoupon
                        }),
                            d.click("goodscard_click", {
                                spmc: "content",
                                spmd: "goodscard",
                                spm: "content.goodscard",
                                goods_id: h.id,
                                goods_name: h.title
                            });
                        var v = h.hasCoupon ? h.couponClickUrl : h.url;
                        if (v && v.indexOf("://d.alipay.com") > -1)
                            try {
                                var g = o.getUrlParams(v)
                                    , _ = decodeURIComponent(g.iframeSrc || "") || ""
                                    , w = o.getUrlParams(_);
                                if (w.extInfo) {
                                    w.extInfo = decodeURIComponent(w.extInfo) || "";
                                    var b = Object.keys(w).map(function(e) {
                                        return e + "=" + encodeURIComponent(w[e])
                                    }).join("&");
                                    _ = (_.split("?")[0] || "") + "?" + b
                                }
                                return void (0,
                                    a.default)({
                                    invokeLink: _,
                                    fallbackLink: v
                                })
                            } catch (e) {}
                        try {
                            if (v) {
                                var y = o.getUrlParams(v)
                                    , k = l.utdid
                                    , x = void 0 === k ? "" : k
                                    , E = l.userid
                                    , P = void 0 === E ? "" : E
                                    , S = Date.now()
                                    , N = {
                                    contentid: "UC_" + (globalConfig.sm_article_id || ""),
                                    deviceid: x,
                                    devicetype: "UTDID",
                                    clickid: i.md5(x + S),
                                    clicktime: S
                                };
                                P && (N.userid = P);
                                var I = decodeURIComponent(y.ptl || "").split(";").filter(function(e) {
                                    return !!e
                                }).concat(Object.keys(N).map(function(e) {
                                    return e + ":" + N[e]
                                })).join(";");
                                y.ptl = I;
                                var C = v.split("?")[0]
                                    , A = Object.keys(y).map(function(e) {
                                    return e + "=" + y[e]
                                }).join("&");
                                v = C + "?" + A
                            }
                        } catch (e) {
                            console.log(e)
                        }
                        window.location !== window.top.location ? window.open(c.getSafeurl(v)) : c.checkucapi({
                            apiName: "biz.openTaobao",
                            success: function() {
                                window.ucapi && window.ucapi.biz && window.ucapi.biz.openTaobao ? window.ucapi.biz.openTaobao({
                                    link_url: v
                                }) : location.href = c.getSafeurl(v)
                            },
                            fail: function() {
                                location.href = c.getSafeurl(v)
                            }
                        })
                    } else if ("tb-card-pv" === f) {
                        (h = m.cardData).id && (u.push(h),
                            t()),
                            s.event({
                                action: "tb_pv",
                                wm_id: e.wm_id,
                                wm_aid: e._id,
                                num_iid: h.id,
                                card_name: m.cardName,
                                has_coupon: h.hasCoupon
                            })
                    } else
                        "log" === f && console.log(m.message)
                }
            }),
                $("iframe.article-card.article-card-tb").each(function(e, n) {
                    o.default.listen(n, {
                        exposeHeight: "50%"
                    }).then(function() {
                        f.push(n),
                            t()
                    })
                })
        }
    }
    , function(e, t, n) {
        "use strict";
        var i = n(3)
            , o = n(1)
            , a = ["//mparticle.uc.cn", "//mobile.dayu.com", globalConfig.cardHost];
        t.init = function(e) {
            window.addEventListener("message", function(t) {
                if (a.indexOf(t.origin.replace(/^https?:/, "")) > -1) {
                    var n = t.data
                        , r = n.type
                        , s = n.data
                        , c = t.source;
                    if ("wm-recommend-card-click" === r) {
                        var d = s.cardData;
                        i.event({
                            action: "recommend_click",
                            article_title: e.title,
                            article_wm_id: e.wm_id,
                            article_wm_name: e.wm_name,
                            recommended_wm_id: d.id,
                            recommended_wm_name: d.name,
                            is_followed: Number(!!d.isFollowed),
                            card_name: s.cardName
                        }),
                            o.gotoHomePage({
                                is_followed: Number(!!d.isFollowed),
                                from: 40,
                                wm_id: d.id,
                                wm_name: d.name,
                                avatar_url: d.avatarUrl,
                                wm_aid: e._id,
                                wm_id_src: e.wm_id,
                                wm_name_src: e.wm_name
                            })
                    } else if ("wm-recommend-card-pv" === r) {
                        d = s.cardData;
                        i.event({
                            action: "recommend_pv",
                            article_title: e.title,
                            article_wm_id: e.wm_id,
                            article_wm_name: e.wm_name,
                            recommended_wm_id: d.id,
                            recommended_wm_name: d.name,
                            is_followed: Number(!!d.isFollowed),
                            card_name: s.cardName
                        })
                    } else
                        "get-is-followed" === r ? o.userInfo(function(e, t) {
                            e ? c.postMessage({
                                type: "is-followed",
                                data: {
                                    isFollowed: !1
                                }
                            }, "*") : (t = t || {},
                            o.is_client_wemedia_homepage_support || (t.sign = t.kps = ""),
                                o.request({
                                    url: globalConfig.WM_SERVER_DOMAIN + "/api/v1/users/subscribers/wemedias/" + s.id + "/check",
                                    dataType: "jsonp",
                                    data: {
                                        s: t.sign || "",
                                        k: t.kps || "",
                                        v: t.vcode || "",
                                        s_wg: t.sign_wg || "",
                                        k_wg: t.kps_wg || "",
                                        app: o.uc_app_str(),
                                        from: "article",
                                        fetch_unread: 1
                                    }
                                }, function(e, t) {
                                    t.data && c.postMessage({
                                        type: "is-followed",
                                        data: {
                                            isFollowed: Boolean(t.data.is_followed || 0)
                                        }
                                    }, "*")
                                }))
                        }, !0) : "log" === r && console.log(s.message)
                }
            })
        }
    }
    , function(e, t, n) {
        "use strict";
        var i = n(3)
            , o = n(125)
            , a = n(124)
            , r = n(122)
            , s = n(121)
            , c = n(120)
            , d = n(1);
        t.init = function(e) {
            var t = {};
            function n(t, n, o) {
                n && $(t).css({
                    height: n + "px"
                }),
                    setTimeout(function() {
                        var n, a;
                        function r() {
                            var r = $(t).offset()
                                , s = r.top
                                , c = r.top + $(t).height()
                                , d = document.body.scrollTop
                                , l = d + window.innerHeight;
                            !n && d < s && s < l && (n = !0,
                                i.event({
                                    action: "card_half_visible",
                                    card_name: o.cardName,
                                    wm_id: e.wm_id,
                                    wm_aid: e._id
                                })),
                            !a && d < c && c < l && (a = !0,
                                i.event({
                                    action: "card_all_visible",
                                    card_name: o.cardName,
                                    wm_id: e.wm_id,
                                    wm_aid: e._id
                                }))
                        }
                        document.addEventListener("scroll", r),
                            r()
                    })
            }
            $("iframe.article-card").attr("scrolling", "no"),
            d.platform.isUCBrowser || $("iframe.article-book-card").remove(),
                window.addEventListener("message", function(e) {
                    var i = e.data
                        , o = i.type
                        , a = i.data;
                    switch (o) {
                        case "card-load":
                            var r = f(a.src);
                            if (!r)
                                return;
                            var s = a.data
                                , c = a.height
                                , d = $("iframe.article-card");
                            if (t[r])
                                break;
                            t[r] = !0;
                            for (var l = 0; l < d.length; l++) {
                                var u = d[l];
                                f(u.getAttribute("src")) === r && n(u, c, s)
                            }
                    }
                    function f(e) {
                        var t = e.match(/\/card\/cards\/([0-9a-f]+)/);
                        return t && t[1]
                    }
                }),
                o.init(e),
                a.init(e),
                r.init(e),
                s.init(e),
                c.init(e)
        }
    }
    , function(e, t, n) {
        "use strict";
        var i = n(1);
        e.exports = {
            init: function(e) {
                if (i.urlQuery.UC_LOGGER_LAZY) {
                    var t = document.createElement("div")
                        , n = e.map(function(e) {
                        return '<li class="lazyload-img" style="border-bottom: 1px solid #999;"></li>'
                    }).join("");
                    t.innerHTML = '<div class="lazyload-viewport"></div><hr/><ul class="lazyload-images">' + n + "</ul>",
                        t.style = "position: fixed; bottom: 0; left: 0;z-index: 999999;background-color: #eee;opacity: 0.9;word-break: break-all;",
                        document.body.appendChild(t),
                        this.container = t
                }
            },
            updateViewport: function(e) {
                i.urlQuery.UC_LOGGER_LAZY && ((this.container && this.container.querySelector(".lazyload-viewport")).innerHTML = JSON.stringify(e))
            },
            updateImage: function(e) {
                if (i.urlQuery.UC_LOGGER_LAZY) {
                    $(e);
                    var t = $(".article-content img").index(e)
                        , n = $(".lazyload-images li").get(t)
                        , o = e.getBoundingClientRect()
                        , a = {
                        t: o.top,
                        b: o.bottom,
                        l: o.left,
                        r: o.right
                    };
                    $(n).html(Object.keys(a).map(function(e) {
                        return e + "=" + a[e]
                    }).join(" "))
                }
            }
        }
    }
    , function(e, t, n) {
        "use strict";
        "function" == typeof Symbol && Symbol.iterator;
        var i, o, a = n(127);
        void 0 === (o = "function" == typeof (i = function() {
                var e, t, n;
                return function(r) {
                    if (!document.querySelectorAll) {
                        var c = document.createStyleSheet();
                        document.querySelectorAll = function(e, t, n, i, o) {
                            for (o = document.all,
                                     t = [],
                                     e = e.replace(/\[for\b/gi, "[htmlFor").split(","),
                                     n = e.length; n--; ) {
                                for (c.addRule(e[n], "k:v"),
                                         i = o.length; i--; )
                                    o[i].currentStyle.k && t.push(o[i]);
                                c.removeRule(0)
                            }
                            return t
                        }
                    }
                    var d = this
                        , l = d._util = {};
                    l.elements = [],
                        l.destroyed = !0,
                        d.options = r || {},
                        d.options.error = d.options.error || !1,
                        d.options.offset = d.options.offset || 100,
                        d.options.success = d.options.success || !1,
                        d.options.selector = d.options.selector || ".b-lazy",
                        d.options.separator = d.options.separator || "|",
                        d.options.container = !!d.options.container && document.querySelectorAll(d.options.container),
                        d.options.errorClass = d.options.errorClass || "b-error",
                        d.options.breakpoints = d.options.breakpoints || !1,
                        d.options.loadInvisible = d.options.loadInvisible || !1,
                        d.options.successClass = d.options.successClass || "b-loaded",
                        d.options.validateDelay = d.options.validateDelay || 25,
                        d.options.saveViewportOffsetDelay = d.options.saveViewportOffsetDelay || 50,
                        d.options.src = e = d.options.src || "data-src",
                        n = window.devicePixelRatio > 1,
                        (t = {}).top = 0 - d.options.offset,
                        t.left = 0 - d.options.offset,
                        a.init(u(d.options.selector)),
                        d.revalidate = function() {
                            i(this)
                        }
                        ,
                        d.load = function(e, t) {
                            var n = this.options;
                            void 0 === e.length ? s(e, t, n) : h(e, function(e) {
                                s(e, t, n)
                            })
                        }
                        ,
                        d.forceLoadAll = function() {
                            !function(e) {
                                for (var t = e._util, n = 0; n < t.count; n++) {
                                    var i = t.elements[n];
                                    e.load(i),
                                        t.elements.splice(n, 1),
                                        t.count--,
                                        n--
                                }
                                0 === t.count && e.destroy()
                            }(d)
                        }
                        ,
                        d.destroy = function() {
                            var e = this._util;
                            this.options.container && h(this.options.container, function(t) {
                                m(t, "scroll", e.validateT)
                            }),
                                m(window, "scroll", e.validateT),
                                m(window, "resize", e.validateT),
                                m(window, "resize", e.saveViewportOffsetT),
                                e.count = 0,
                                e.elements.length = 0,
                                e.destroyed = !0
                        }
                        ,
                        l.validateT = v(function() {
                            o(d)
                        }, d.options.validateDelay, d),
                        l.saveViewportOffsetT = v(function() {
                            f(d.options.offset)
                        }, d.options.saveViewportOffsetDelay, d),
                        f(d.options.offset),
                        h(d.options.breakpoints, function(t) {
                            if (t.width >= window.screen.width)
                                return e = t.src,
                                    !1
                        }),
                        i(d)
                }
                    ;
                function i(e) {
                    setTimeout(function() {
                        var t = e._util;
                        if (t.elements = u(e.options.selector),
                            t.count = t.elements.length,
                            t.destroyed) {
                            t.destroyed = !1,
                            e.options.container && h(e.options.container, function(e) {
                                p(e, "scroll", t.validateT)
                            }),
                                p(window, "resize", t.saveViewportOffsetT),
                                p(window, "resize", t.validateT),
                                p(window, "scroll", t.validateT);
                            var n = u(e.options.selector);
                            p(window, "scroll", function() {
                                n.forEach(function(e) {
                                    a.updateImage(e)
                                })
                            })
                        }
                        o(e)
                    }, 1)
                }
                function o(e) {
                    for (var t = e._util, n = 0; n < t.count; n++) {
                        var i = t.elements[n];
                        (r(i) || d(i, e.options.successClass)) && (e.load(i),
                            t.elements.splice(n, 1),
                            t.count--,
                            n--)
                    }
                    0 === t.count && e.destroy()
                }
                function r(e) {
                    var n = e.getBoundingClientRect();
                    return n.right >= t.left && n.bottom >= t.top && n.left <= t.right && n.top <= t.bottom
                }
                function s(t, i, o) {
                    if (!d(t, o.successClass) && (i || o.loadInvisible || t.offsetWidth > 0 && t.offsetHeight > 0)) {
                        var a = t.getAttribute(e) || t.getAttribute(o.src);
                        if (a) {
                            var r = a.split(o.separator)
                                , s = r[n && r.length > 1 ? 1 : 0]
                                , u = "img" === t.nodeName.toLowerCase();
                            if (u || void 0 === t.src) {
                                var f = new Image;
                                f.onerror = function() {
                                    o.error && o.error(t, "invalid", s),
                                        l(t, o.errorClass)
                                }
                                    ,
                                    f.onload = function() {
                                        u ? t.src = s : t.style.backgroundImage = 'url("' + s + '")',
                                            c(t, o)
                                    }
                                    ,
                                    f.src = s
                            } else
                                t.src = s,
                                    c(t, o)
                        } else
                            o.error && o.error(t, "missing"),
                            d(t, o.errorClass) || l(t, o.errorClass)
                    }
                }
                function c(e, t) {
                    l(e, t.successClass),
                    t.success && t.success(e),
                        h(t.breakpoints, function(t) {
                            e.removeAttribute(t.src)
                        }),
                        e.removeAttribute(t.src)
                }
                function d(e, t) {
                    return -1 !== (" " + e.className + " ").indexOf(" " + t + " ")
                }
                function l(e, t) {
                    e.className = e.className + " " + t
                }
                function u(e) {
                    for (var t = [], n = document.querySelectorAll(e), i = n.length; i--; t.unshift(n[i]))
                        ;
                    return t
                }
                function f(e) {
                    t.bottom = (window.innerHeight || document.documentElement.clientHeight) + e,
                        t.right = (window.innerWidth || document.documentElement.clientWidth) + e,
                        a.updateViewport(t)
                }
                function p(e, t, n) {
                    e.attachEvent ? e.attachEvent && e.attachEvent("on" + t, n) : e.addEventListener(t, n, !1)
                }
                function m(e, t, n) {
                    e.detachEvent ? e.detachEvent && e.detachEvent("on" + t, n) : e.removeEventListener(t, n, !1)
                }
                function h(e, t) {
                    if (e && t)
                        for (var n = e.length, i = 0; i < n && !1 !== t(e[i], i); i++)
                            ;
                }
                function v(e, t, n) {
                    var i = 0;
                    return function() {
                        var o = +new Date;
                        o - i < t || (i = o,
                            e.apply(n, arguments))
                    }
                }
            }
        ) ? i.call(t, n, t, e) : i) || (e.exports = o)
    }
    , function(e, t) {
        e.exports = '<wm-recommend :active="hasFollowed && showList" @show="onShowWmRecommend" :category="authorCategory" pos="header"></wm-recommend>\n<div class="article-content uc-nf-fontsize-change-dom simple-ui">\n {{{article.content}}}\n</div>'
    }
    , function(e, t, n) {
        "use strict";
        var i = function(e) {
            if (e && e.__esModule)
                return e;
            var t = {};
            if (null != e)
                for (var n in e)
                    Object.prototype.hasOwnProperty.call(e, n) && (t[n] = e[n]);
            return t.default = e,
                t
        }/*!
 * content.js
 * Copyright(c) 2016
 * AUTHOR: shafeng
 * TAB SIZE: 4
 */
            (n(51))
            , o = r(n(4))
            , a = r(n(8));
        function r(e) {
            return e && e.__esModule ? e : {
                default: e
            }
        }
        var s = n(129)
            , c = n(1)
            , d = n(3)
            , l = n(10)
            , u = (n(13),
            n(128))
            , f = n(126)
            , p = n(5)
            , m = n(119)
            , h = n(116)
            , v = n(20)
            , g = n(40)
            , _ = n(21)
            , w = n(107)
            , b = n(102)
            , y = o.default.utLogger;
        e.exports = function(e, t) {
            var n = /img:(\d+)/
                , o = /video:(\d+)/;
            function r() {
                return "scrollTop"in window ? window.scrollTop : window.pageYOffset
            }
            globalConfig.isFromFashFish && (e.content = e.content || "",
                e.content = e.content.replace(/<\!--{(img|video):\d+}-->/gi, function(t) {
                    var i = e && e.body;
                    if (n.test(t)) {
                        var a = parseInt(RegExp.$1)
                            , r = i && i.inner_imgs && i.inner_imgs[a];
                        return r ? function(e, t) {
                            var n = "";
                            c.is_share_mode && (n = '<span class="share-import-title">打开' + ("taojin-iflow" === c.urlQuery.app ? "精彩头条" : "UC浏览器") + "  查看更多精彩图片</span>");
                            return '<span class="image-box"><img src="' + e.url + '" uploaded="1" data-infoed="1" data-width="' + e.width + '" data-height="' + e.height + '" data-format="' + e.format + '" data-size="' + 1e3 * e.size + '" data-index="' + t + '"/>' + n + "</span>" + function(e) {
                                return window.isOrgArticle && e && e.description ? '<span class="imgbox_desc">' + e.description + "</span>" : ""
                            }(e)
                        }(r, a) : ""
                    }
                    if (o.test(t)) {
                        a = parseInt(RegExp.$1);
                        var s = i && i.inner_videos && i.inner_videos[a];
                        return s ? function(e) {
                            return '\n        <span class="video-box">\n          <video src="" data-umsid="' + e.ums_id + '" controls controlslist="nodownload" preload="none" poster="' + (e.thumbnail || "") + '" playsinline webkit-playsinline="true" x-webkit-airplay="allow" preload="none" oncontextmenu="return false;"></video>\n        </span>\n    '
                        }(s) : ""
                    }
                }));
            var k = !c.urlQuery.nolazy
                , x = (n = /<img.*?(?:>|\/>)/gi,
                /\ssrc=[\'\"]?([^\'\"]*)[\'\"]?/i)
                , E = /\sdata\-format=[\'\"]?([^\'\"]*)[\'\"]?/i;
            e.content = e.content.replace(n, function(e) {
                var t = E.test(e) ? RegExp.$1 : "";
                return e.replace(x, function(e, n) {
                    var i = _.compress({
                        src: n,
                        extension: t.toLowerCase(),
                        useLentp: !0
                    });
                    return i = (i = i && i.replace(/(http:\/\/image.uc.cn)/g, window.location.protocol + "//image.uc.cn")) && i.replace(/(http:\/\/dayu-img.uc.cn)/g, window.location.protocol + "//dayu-img.uc.cn"),
                        k ? ' data-original="' + n + '" data-src="' + i + '" src="//image.uc.cn/s/uae/g/1v/images/image-lazyload.png"' : ' data-original="' + n + '" src="' + i + '"'
                })
            }),
                e.content = e.content.replace(/(https:\/\/mobile\.dayu\.com)/g, ""),
                e.content = e.content.replace("都云作者痴，谁解其中味。", ""),
                c.is_https_mode ? (e.content = e.content.replace(/(http:\/\/a\.mp\.uc\.cn)/g, "https://mparticle.uc.cn"),
                    e.content = e.content.replace(/(http:\/\/api\.mp\.uc\.cn)/g, "https://mpapi.uc.cn")) : (e.content = e.content.replace(/(https:\/\/mparticle\.uc\.cn)/g, "http://a.mp.uc.cn"),
                    e.content = e.content.replace(/(https:\/\/mpapi\.uc\.cn)/g, "http://api.mp.uc.cn")),
            "ag.mp.uc.cn" !== location.host && "agmp.uc.cn" !== location.host || (e.content = e.content.replace(/(http:\/\/a\.mp\.uc\.cn)/g, ""));
            try {
                e.content = c.processHtml(e.content, function(e) {
                    $(e).find("iframe.article-card").not("iframe.article-xiami-card").not("iframe.article-film-card").not("iframe.article-card-tb-welfare").toArray().forEach(function(e) {
                        var t, n = e.getAttribute("src"), i = globalConfig.cardHost;
                        t = n.match(/^\//) ? i + n : n.replace(/https?:\/\/[^\/]+/, i),
                            e.setAttribute("src", t)
                    });
                    var t = $(e).find("iframe.article-film-card").toArray();
                    $(e).find("iframe.article-card-tb-welfare").forEach(function(e) {
                        $(e).css("min-width", $(window).width()).css("margin", "0px 0px -20px -15px").css("height", "135px")
                    }),
                        $(e).find("iframe.article-xiami-card").toArray().concat(t).forEach(function(e) {
                            var t, n = e.getAttribute("src"), i = window.location.origin;
                            t = n.match(/^\//) ? i + n : n.replace(/https?:\/\/[^\/]+/, i),
                                e.setAttribute("src", t)
                        })
                })
            } catch (e) {}
            var P = navigator.userAgent || ""
                , S = "simple" === e.editorMode && -1 === P.indexOf("UCNewsApp");
            c.debug("init article content");
            Date.now();
            var N = !c.is_hide_titlebar
                , I = !0
                , C = !1
                , A = !1;
            c.is_share_mode ? (I = !1,
                C = !0) : c.platform.isUCBrowser && (c.platform.isAndroid && l.match(globalConfig.VERSION, "11.6.6.951~") && (I = !1,
                C = !1),
            c.platform.isiPhone && l.match(globalConfig.VERSION, "11.6.2.1004~") && (I = !1,
                C = !1),
            l.match(globalConfig.VERSION, "11.8.3.960~") && (I = !1,
                C = !0,
                N = !0)),
            e.reproduce_from || (c.platform.isUCNews ? A = !!e.author : e.author && e.author !== e.wm_name && (A = !0)),
            (c.platform.isQuark || c.platform.isDingTalk) && (A = !0,
                C = !0,
                I = !1),
                m.init(e, {
                    showSimpleInfo: I,
                    showNewInfo: C,
                    showTitle: N,
                    showAuthor: A
                });
            new Vue({
                el: ".contentbox",
                replace: !1,
                template: s,
                data: {
                    isSimpleMode: S,
                    article: e,
                    authorCategory: e && e._author && e._author.category || "",
                    hasFollowed: !1,
                    showList: !1
                },
                components: {
                    wmRecommend: g
                },
                computed: {
                    reproduceWmName: function() {
                        return this.$data.article.reproduce_from.wm_name || this.$data.article.reproduce_from.wmName
                    },
                    publishRelativeTime: function() {
                        var e = this.article && this.article.publish_at;
                        if (!e)
                            return e;
                        var t = function(e) {
                            return e > 9 ? e : "0" + e
                        };
                        /^\d+$/.test(e) || (-1 === e.indexOf(":") && (e += " 00:00:00"),
                        -1 === e.indexOf("T") && (e = e.replace(/\s+/g, "T")),
                        -1 !== e.indexOf("T") && (e = e.substring(0, 19).concat(".000+08:00")));
                        var n = new Date(e)
                            , i = Date.now() - n.getTime();
                        return c.platform && "pc" === c.platform.os ? [[t(n.getMonth() + 1), t(n.getDate())].join("-"), [t(n.getHours()), t(n.getMinutes())].join(":")].join(" ") : i < 36e5 ? Math.floor(i / 6e4) + "分钟前" : i < 864e5 ? Math.floor(i / 36e5) + "小时前" : [t(n.getMonth() + 1), t(n.getDate())].join("-")
                    }
                },
                directives: {
                    reflow: v
                },
                ready: function() {
                    try {
                        var n = function() {
                            o = parseInt(window.innerWidth || document.documentElement.clientWidth),
                                parseInt(window.innerHeight || document.documentElement.clientHeight),
                            "pc" === c.platform.os && (o = $(".wm-container").width()),
                                o = parseInt($(".article-content").css("width")) || o
                        }
                            , i = this;
                        this.initFollowState(),
                            this.initVideos(),
                            window.setRenderState(9),
                            b.init(e),
                            $(document).trigger("page_render_completed"),
                        c.platform.isUCBrowser && c.platform.isiPhone && l.match(globalConfig.VERSION, "11.4.10~") && window.ucapi && window.ucapi.webview && window.ucapi.webview.notifyPageStatus && window.ucapi.webview.notifyPageStatus({
                            status: 1
                        }),
                        S && $("blockquote").each(function(e, t) {
                            var n = $(t);
                            n.find(".icon-quota")[0] || n.prepend('<p class="icon-quota"><span class="iconfont wm-icon-yinyong"></span></p>')
                        });
                        var o = 0;
                        n();
                        var s = function(e, t, n) {
                            t && (parseInt(t) > o / 2 ? e.css("width", o + "px !important") : e.css("width", parseInt(t) + "px !important")),
                            n && e.css("height", e.width() * parseInt(n) / parseInt(t) + "px !important")
                        }
                            , m = $(".article-content img:first-child").eq(0)
                            , h = "image-default-bg"
                            , v = m.offset()
                            , g = m.data("format");
                        k && (h += " image-loaded"),
                            m.addClass(h),
                            s(m, m.data("width") || "", m.data("height") || ""),
                        v && v.top < (window.innerHeight || document.documentElement.clientHeight) && k && (g && "gif" === g.toLowerCase() ? m.attr("src", c.optimizeGifImage(m.data("original"))) : m.attr("src", m.data("src")),
                            m.addClass("image-loaded")),
                            $(".article-content style").insertBefore(".article-content"),
                            setTimeout(function() {
                                var t, f;
                                if ($(".article-content img").each(function(e, t) {
                                    var n = $(t)
                                        , i = n.data("format")
                                        , a = n.data("size")
                                        , r = Math.ceil((e + 50) * Math.random()) + 50;
                                    n.addClass("image-default-bg"),
                                        n.removeClass("b-lazy b-loaded");
                                    var d = n.data("width")
                                        , l = n.data("height");
                                    if (d && l && parseInt(d) >= 200 && parseInt(l) >= 50 && n.attr("heavypress", n.data("src") || n.attr("src")),
                                        e < 3 ? s(n, d, l) : setTimeout(function() {
                                            s(n, d, l)
                                        }, r),
                                    d && l || n.addClass("initwh"),
                                    k && n.addClass("b-lazy"),
                                    globalConfig.imageGifOptimize && a && parseInt(a) > globalConfig.imageGifOptimizeSizeLimit && i && "gif" === i.toLowerCase() && "wifi" != globalConfig.NETWORK_TYPE.toLowerCase()) {
                                        n.addClass("image-gif"),
                                            n.data("gifsrc", n.data("src")),
                                            n.data("src", c.optimizeGifImage(n.data("original"))),
                                            n.attr("uc-image-reader_state", "disabled");
                                        var u = "IMAGE-GIF-MASK-" + Math.ceil(+new Date * Math.random())
                                            , f = "#" + u
                                            , p = f + " span"
                                            , m = !1
                                            , h = '<span class="image-gif-box" id="' + u + '"></span>';
                                        c.is_share_mode ? n.parent().prepend(h) : n.parent().append(h),
                                            n.on("load", function() {
                                                $(this).attr("src") === $(this).attr("data-gifsrc") && ($(this).attr("src").indexOf(".png") > -1 || ($(this).parent().removeClass("image-gif-loading").addClass("image-gif-loaded"),
                                                    $(this).removeAttr("uc-image-reader_state")))
                                            }),
                                            setTimeout(function() {
                                                if (S) {
                                                    var e = n.width() > o / 2 ? "100% !important" : n.width()
                                                        , t = e * parseInt(n.height()) / parseInt(n.width()) + "px !important";
                                                    $(f).css({
                                                        height: t,
                                                        width: e
                                                    }).append(n).append('<span class="btn-gif-play"></span>'),
                                                        $(p).text("GIF")
                                                } else
                                                    $(f).css({
                                                        height: n.height(),
                                                        width: n.width()
                                                    }).append(n).append("<span></span>"),
                                                        $(p).css({
                                                            top: n.height() / 2 - 25,
                                                            left: n.width() / 2 - 25
                                                        })
                                            }, r + 50),
                                            $(f).on("click", function(e) {
                                                if (!m) {
                                                    var t = $(this).find(".image-gif");
                                                    $(this).addClass("image-gif-loading"),
                                                        t.on("load", function() {
                                                            $(this).parent().removeClass("image-gif-loading").addClass("image-gif-loaded"),
                                                                $(this).removeAttr("uc-image-reader_state")
                                                        }),
                                                        t.attr("src", t.data("gifsrc")),
                                                        m = !0
                                                }
                                            }),
                                            $(p).on("touchstart", function() {
                                                $(this).css("opacity", .5)
                                            }).on("touchend", function() {
                                                $(this).css("opacity", 1)
                                            })
                                    }
                                }),
                                    window.addEventListener("resize", function() {
                                        t && clearTimeout(t);
                                        t = setTimeout(function() {
                                            n(),
                                                console.log("resize"),
                                                $(".article-content img").each(function(e, t) {
                                                    var n = $(t)
                                                        , i = n.data("width")
                                                        , o = n.data("height");
                                                    0 === e && console.log(i),
                                                        setTimeout(function() {
                                                            s(n, i, o)
                                                        }, 16 * e)
                                                })
                                        }, 100)
                                    }),
                                    k) {
                                    c.debug("init image lazyload"),
                                        f = new u({
                                            container: ".article-content",
                                            offset: 500,
                                            loadInvisible: !0,
                                            error: function(e, t, n) {
                                                p.log({
                                                    region: "lazyload",
                                                    action: t,
                                                    label: n
                                                }),
                                                    $(e).removeClass("b-lazy b-error image-default-bg");
                                                var i = $(e).data("original");
                                                i && $(e).attr("src", i)
                                            },
                                            success: function(e) {
                                                setTimeout(function() {
                                                    $(e).removeClass("b-lazy b-loaded image-default-bg")
                                                }, 350)
                                            }
                                        });
                                    var m = !1
                                        , h = !1
                                        , v = [];
                                    window.addEventListener("scroll", function() {
                                        if (!h) {
                                            var e = r();
                                            v.length < 20 ? v.push(e) : h = !0,
                                                !m && e > 5 ? m = !0 : 0 === e && m && setTimeout(function() {
                                                    h = !0,
                                                    0 === r() && (f.forceLoadAll(),
                                                    window.send_log && window.send_log({
                                                        page: window.waPage || "",
                                                        type: "forceload",
                                                        action: "force_load_all",
                                                        page_url: window.location.href,
                                                        host: window.location.host,
                                                        app: window.urlQuery.app,
                                                        msg: v.join("_")
                                                    }))
                                                }, 3e3)
                                        }
                                    })
                                }
                                $(".article-content a").each(function(t, n) {
                                    var i = $(n).attr("href");
                                    if (i && -1 !== i.indexOf("/link/proxy/wemedias/")) {
                                        var o = c.parseUriQuery(i).redirect;
                                        if (-1 !== o.indexOf(".uc.cn") && -1 !== o.indexOf("/media") && -1 !== o.indexOf("mid=")) {
                                            if (/mid=(\w+)/.test(o)) {
                                                var a = RegExp.$1;
                                                c.debug("wm_id : " + a),
                                                    $(n).on("click", function(t) {
                                                        t.preventDefault(),
                                                            d.event({
                                                                action: "external_homepage",
                                                                orgi_wm_id: globalConfig.wm_id,
                                                                target_wm_id: a
                                                            }),
                                                            c.gotoHomePage({
                                                                wm_id: a,
                                                                is_followed: 0,
                                                                wm_id_src: globalConfig.wm_id,
                                                                wm_aid: globalConfig.wm_aid,
                                                                wm_name_src: e.wm_name,
                                                                from: 35
                                                            })
                                                    })
                                            }
                                        } else
                                            $(n).on("click", function(e) {
                                                e.preventDefault(),
                                                    c.request({
                                                        url: i,
                                                        dataType: "jsonp"
                                                    }, function(e, t) {
                                                        t && t.data && t.data.redirect && (window.location.href = t.data.redirect_url)
                                                    })
                                            })
                                    }
                                }),
                                    i.listenContentElementsEvent();
                                var g = document.querySelector(".content-bottom-anchor");
                                if (a.default.listen(g, {}).then(function() {
                                    var e = 0;
                                    $(".pages-article-toolbar_award").size() && (e = 1),
                                        y.expose("bottom_show", {
                                            spm: "content.article_bottom"
                                        }),
                                        d.event({
                                            action: "scroll_bottom",
                                            award: e
                                        }),
                                        p.log({
                                            region: "touch_bottom",
                                            action: "show"
                                        }),
                                    c.platform.isUCBrowser && window.ucapi && window.ucapi.infoflow && window.ucapi.infoflow.userDidScroll && window.ucapi.infoflow.userDidScroll({
                                        visibleElements: ["article_end"],
                                        success: function(e) {},
                                        fail: function(e) {}
                                    })
                                }),
                                    a.default.listen(g, {
                                        offsetY: -140
                                    }).then(function() {
                                        window.showPushPop && window.showPushPop()
                                    }),
                                    $("#pageLoadStatus").html("<end></end>"),
                                f && $(".article-content img").on("click", function(e) {
                                    var t = e.target;
                                    if (t) {
                                        var n = $(t)
                                            , i = +n.attr("data-index") || 0
                                            , o = n.attr("src")
                                            , a = n.attr("data-src");
                                        i < 2 || !a || o === a || setTimeout(function() {
                                            f && f.forceLoadAll(),
                                            window.send_log && window.send_log({
                                                page: window.waPage || "",
                                                type: "forceload",
                                                action: "force_load_all_touch",
                                                page_url: window.location.href,
                                                host: window.location.host,
                                                app: window.urlQuery.app
                                            })
                                        }, 10)
                                    }
                                }),
                                c.platform.isUCBrowser && (c.platform.isAndroid && l.match(globalConfig.VERSION, "11.0.5~") || c.platform.isiPhone && l.match(globalConfig.VERSION, "11.1.0~"))) {
                                    var _ = []
                                        , w = 0;
                                    $(".article-content img").each(function(t, n) {
                                        var i = $(n)
                                            , o = i.data("src")
                                            , a = parseInt(i.data("width"), 10)
                                            , r = parseInt(i.data("height"), 10);
                                        a >= 100 && r >= 80 && (_.push({
                                            index: w,
                                            title: e.title,
                                            url: o
                                        }),
                                            w++)
                                    });
                                    $(".article-content").on("click", function(e) {
                                        var t = e.target;
                                        if ("img" === t.tagName.toLowerCase()) {
                                            var n = $(t)
                                                , i = n.attr("src");
                                            if (!function(e, t, n) {
                                                for (var i = !1, o = n || 5, a = 0, r = e.parentNode; a < o; ) {
                                                    if (r.tagName.toLowerCase() === t) {
                                                        i = !0;
                                                        break
                                                    }
                                                    r = r.parentNode,
                                                        ++a
                                                }
                                                return i
                                            }(t, "a", 5)) {
                                                var o = function(e) {
                                                    var t = -1;
                                                    return _.forEach(function(n, i) {
                                                        n.url === e && (t = i)
                                                    }),
                                                        t
                                                }(i);
                                                if (-1 !== o) {
                                                    if (f) {
                                                        var a = n.attr("data-src");
                                                        if (a && i !== a)
                                                            return
                                                    }
                                                    c.is_share_mode || (c.platform.isiPhone ? _.length && window.ucapi && window.ucapi.infoflow && window.ucapi.infoflow.openInfoFlowImageGallery({
                                                        data: {
                                                            cid: -1,
                                                            ori_url: window.location.href,
                                                            image: _,
                                                            selected: o
                                                        }
                                                    }) : c.platform.isAndroid && l.match(globalConfig.VERSION, "11.0.5~") && window.ucapi && window.ucapi.biz && window.ucapi.biz.openPicViewer({
                                                        success: function() {},
                                                        fail: function() {}
                                                    }))
                                                }
                                            }
                                        }
                                    })
                                }
                            }, 300),
                            f.init(e),
                            w.init(),
                            setTimeout(function() {
                                t && t()
                            }, 0)
                    } catch (e) {
                        console.log(e),
                            p.log({
                                region: "js_error",
                                action: e.message
                            })
                    }
                },
                methods: {
                    listenContentElementsEvent: function() {
                        var e = document.querySelector(".contentbox");
                        if (e) {
                            var t = e.querySelectorAll("video");
                            t && t.length && [].slice.call(t).forEach(function(e) {
                                a.default.listen(e, {
                                    exposeHeight: "50%"
                                }).then(function() {
                                    y.expose("video_show", {
                                        spm: "content.video",
                                        ums_id: e.getAttribute("data-umsid")
                                    })
                                })
                            }),
                                $(".contentbox img").click(function() {
                                    this.__hasLogClickForUT || (this.__hasLogClickForUT = !0,
                                        d.event({
                                            action: "picture_click"
                                        }),
                                        y.click("picture_click", {
                                            spm: "content.picture",
                                            picture_num: $(".contentbox img").size(),
                                            img_type: "GIF" === this.getAttribute("data-format") ? 1 : 0
                                        }))
                                }),
                                $(".contentbox video").on("play", function() {
                                    var e = !this.__hasPlay
                                        , t = this.currentTime;
                                    this.__hasPlay = !0,
                                        y.other("video_play", {
                                            spm: "content.video",
                                            ums_id: this.getAttribute("data-umsid"),
                                            play_type: e ? 0 : t ? 1 : 2
                                        })
                                })
                        }
                    },
                    initVideos: function() {
                        var t = this;
                        try {
                            var n = globalConfig.ids || []
                                , i = globalConfig.wm_id || e.author_id
                                , o = n.indexOf(i) > -1
                                , a = []
                                , r = e.body;
                            (a = r && (r.inner_videos || r.videos)) && a instanceof Array && a.length && a.forEach(function(e, n) {
                                var i = $(".article-content video").eq(n);
                                e && e.duration > 900 && o ? i.on("click", function(e) {
                                    e && e.preventDefault && e.preventDefault(),
                                        c.toast("该视频无法播放", "", {
                                            timeout: 3e3
                                        })
                                }) : t.getParsedVideoUrl(e.ums_id).then(function(e) {
                                    i.attr("src", e)
                                })
                            })
                        } catch (e) {
                            console.log(e)
                        }
                    },
                    tryGetNetwork: function() {
                        var e = "high";
                        return new Promise(function(t) {
                                if (/micromessenger/i.test(window.navigator.userAgent))
                                    return /nettype\/(4g|wifi)/i.test(window.navigator.userAgent) || (e = "low"),
                                        void t(e);
                                if (/dingtalk/i.test(window.navigator.userAgent)) {
                                    try {
                                        i.device.connection.getNetworkType({
                                            onSuccess: function(n) {
                                                n && n.result && "wifi" !== n.result && "4g" !== n.result && (e = "low"),
                                                    t(e)
                                            },
                                            onFail: function(n) {
                                                t(e)
                                            }
                                        })
                                    } catch (n) {
                                        t(e)
                                    }
                                    setTimeout(function() {
                                        t(e)
                                    }, 500)
                                } else {
                                    try {
                                        "cellular" === navigator.connection.type && (e = "low")
                                    } catch (e) {}
                                    t(e)
                                }
                            }
                        )
                    },
                    getParsedVideoUrl: function(t) {
                        var n = h.get("vpstoken")
                            , i = globalConfig.wm_cid || e.content_id
                            , o = globalConfig.wm_id || e.author_id;
                        return this.tryGetNetwork().then(function(e) {
                            return new Promise(function(a, r) {
                                    $.ajax({
                                        type: "GET",
                                        url: "/api/vps",
                                        data: {
                                            token: n,
                                            ums_id: t,
                                            wm_cid: i,
                                            wm_id: o,
                                            resolution: e
                                        },
                                        success: function(e) {
                                            if (e && 0 === e.status) {
                                                var t = e.data || {};
                                                if (t && t.url) {
                                                    var n = t.url;
                                                    n && n.replace && a(n.replace("http://", window.location.protocol + "//"))
                                                }
                                            }
                                        },
                                        fail: function(e) {
                                            r("vps parse error")
                                        }
                                    })
                                }
                            )
                        })
                    },
                    gotoHomePage: function(e, t) {
                        t && (t.is_followed = 0),
                            e.preventDefault(),
                            c.gotoHomePage(t || null)
                    },
                    initFollowState: function() {
                        var e = this;
                        if (c.is_share_mode)
                            return !1;
                        m.onShowList(function(t) {
                            e.showList = t
                        }),
                            $(document).on("media:followWithId", function(t, n) {
                                if (n.wm_id === globalConfig.wm_id) {
                                    var i = n.is_followed;
                                    e.hasFollowed = !!i,
                                    m.setFollow && m.setFollow(!!i),
                                    i || (e.showList = !1,
                                        m.hideUpBtn())
                                }
                            }),
                            c.getIsFollowed(globalConfig.wm_id, function(t, n) {
                                n && n.data && void 0 !== n.data.is_followed && (e.hasFollowed = !!n.data.is_followed,
                                m.setFollow && m.setFollow(!!n.data.is_followed))
                            }),
                        window.ucapi && window.ucapi.wemedia && window.ucapi.wemedia.onFollow && window.ucapi.wemedia.onFollow({
                            trigger: function(e) {
                                e && void 0 !== e.is_followed && ($(document).trigger("media:follow", [!!e.is_followed]),
                                    $(document).trigger("media:followWithId", [e]))
                            }
                        })
                    },
                    onShowWmRecommend: function() {
                        m.showUpBtn()
                    }
                }
            })
        }
    }
    , function(e, t, n) {
        "use strict";
        /*!
 * Copyright(c) Alibaba Group Holding Limited.
 * AUTHOR: shafeng
 * TAB SIZE: 4
 */
        e.exports = function(e, t) {
            var n = document.createElement("script");
            n.setAttribute("exparams", "wm_id=" + t.wm_id + "&page_item_id=" + t.xss_item_id + "&page_type=" + e + "&guide_type=2&app=" + (window.urlQuery && window.urlQuery.app || "")),
                n.setAttribute("frontPlugins", window.globalConfig.aplusPlugins || ""),
                n.id = "tb-beacon-aplus",
                n.src = "https://g.alicdn.com/alilog/mlog/aplus_wap.js",
                document.body.insertBefore(n, document.body.firstChild)
        }
    }
    , function(e, t, n) {
        "use strict";
        /*!
 * readtimes.js
 * Copyright(c) 2016
 * AUTHOR: shafeng
 * TAB SIZE: 4
 */
        var i = n(1);
        e.exports = function(e) {
            if (!(parseInt(100 * Math.random(), 10) > globalConfig.readtimesPersent)) {
                var t = parseInt((Date.now() + 288e5) / 864e5, 10) % 2;
                if (globalConfig.isFromFashFish) {
                    var n = "click1";
                    1 !== t && (n = "click2"),
                        i.request({
                            url: globalConfig.FASTFISH_DOMAIN + "/contents/" + e + "/incr/" + n + "/1?biz_id=" + globalConfig.biz_id,
                            method: "POST"
                        }, function(e) {
                            i.debug("readtimes +1 success")
                        })
                } else {
                    n = "readtimes";
                    1 !== t && (n = "readtimes_even"),
                        i.request({
                            url: "/classes/article/objects/" + e + "/incrs/" + n + "?_ch=" + n,
                            method: "POST",
                            napi: !0
                        }, function(e) {
                            i.debug("readtimes +1 success")
                        })
                }
            }
        }
    }
    , function(e, t, n) {
        "use strict";
        /*!
 * detact.js
 * Copyright(c) 2016
 * AUTHOR: shafeng
 * TAB SIZE: 4
 */
        var i = n(1);
        e.exports = function() {
            var e = [];
            if (i.platform.isAndroid && e.push("android"),
            i.platform.isiPhone && e.push("iphone"),
            window.devicePixelRatio && devicePixelRatio >= 2) {
                var t = document.createElement("div");
                t.style.border = ".5px solid transparent",
                    document.body.appendChild(t),
                1 == t.offsetHeight && e.push("hairlines"),
                    document.body.removeChild(t)
            }
            document.documentElement.className += " " + e.join(" ")
        }
    }
    , function(e, t, n) {
        "use strict";
        var i, o = "function" == typeof Symbol && "symbol" == typeof Symbol.iterator ? function(e) {
                return typeof e
            }
            : function(e) {
                return e && "function" == typeof Symbol && e.constructor === Symbol && e !== Symbol.prototype ? "symbol" : typeof e
            }
            , a = /(.*)\[\]=(.*)/, r = /[=\[\]\&]/, s = /(.*)=(.*)/, c = {};
        /*!
 * hash.js
 * Copyright(c) 2016
 * AUTHOR: shafeng
 * TAB SIZE: 4
 */
        c.parseHash = function() {
            for (var e = {}, t = window.location.hash.slice(2), n = -1 !== t.indexOf("!!") ? "!!" : "&", o = t && t.split(n), r = 0; r < o.length; r++) {
                var c = null
                    , d = o[r];
                "" !== d && ((c = d.match(a)) ? e[c[1]] ? e[c[1]].push(c[2]) : e[c[1]] = [c[2]] : (c = d.match(s)) && (e[c[1]] = c[2]))
            }
            i = e
        }
            ,
            c.updateUrl = function() {
                var e = "#!";
                for (var t in i)
                    if (i[t]instanceof Array)
                        for (var n = 0; n < i[t].length; n++)
                            e += "&" + t + "[]=" + i[t][n];
                    else
                        e += "&" + t + "=" + i[t];
                window.onhashchange = null,
                    window.location.hash = e,
                    window.onhashchange = function(e, t) {
                        c.parseHash(),
                        d.onchange && d.onchange(e, t)
                    }
            }
            ,
            c.parseHash(),
            window.onhashchange = function(e, t) {
                c.parseHash(),
                d.onchange && d.onchange(e, t)
            }
        ;
        var d = function(e, t) {
            if (!arguments.length)
                return i;
            if (2 == arguments.length) {
                if (e.toString().match(r))
                    throw "Cannot use key '" + e + "', because it contains special characters.";
                void 0 === t ? delete i[e] : i[e] = t,
                    c.updateUrl()
            } else {
                var n = arguments[0];
                if ("object" !== (void 0 === n ? "undefined" : o(n)))
                    return i[e] || "";
                for (var a in n) {
                    if (a.match(r))
                        throw "Cannot use key '" + a + "', because it contains special characters.";
                    i[a] = n[a]
                }
                c.updateUrl()
            }
        };
        e.exports = d
    }
    , function(e, t) {
        e.exports = function(e) {
            return !(null == e || !e.constructor || "function" != typeof e.constructor.isBuffer || !e.constructor.isBuffer(e))
        }
    }
    , function(e, t) {
        !function() {
            var t = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
                , n = {
                rotl: function(e, t) {
                    return e << t | e >>> 32 - t
                },
                rotr: function(e, t) {
                    return e << 32 - t | e >>> t
                },
                endian: function(e) {
                    if (e.constructor == Number)
                        return 16711935 & n.rotl(e, 8) | 4278255360 & n.rotl(e, 24);
                    for (var t = 0; t < e.length; t++)
                        e[t] = n.endian(e[t]);
                    return e
                },
                randomBytes: function(e) {
                    for (var t = []; e > 0; e--)
                        t.push(Math.floor(256 * Math.random()));
                    return t
                },
                bytesToWords: function(e) {
                    for (var t = [], n = 0, i = 0; n < e.length; n++,
                        i += 8)
                        t[i >>> 5] |= e[n] << 24 - i % 32;
                    return t
                },
                wordsToBytes: function(e) {
                    for (var t = [], n = 0; n < 32 * e.length; n += 8)
                        t.push(e[n >>> 5] >>> 24 - n % 32 & 255);
                    return t
                },
                bytesToHex: function(e) {
                    for (var t = [], n = 0; n < e.length; n++)
                        t.push((e[n] >>> 4).toString(16)),
                            t.push((15 & e[n]).toString(16));
                    return t.join("")
                },
                hexToBytes: function(e) {
                    for (var t = [], n = 0; n < e.length; n += 2)
                        t.push(parseInt(e.substr(n, 2), 16));
                    return t
                },
                bytesToBase64: function(e) {
                    for (var n = [], i = 0; i < e.length; i += 3)
                        for (var o = e[i] << 16 | e[i + 1] << 8 | e[i + 2], a = 0; a < 4; a++)
                            8 * i + 6 * a <= 8 * e.length ? n.push(t.charAt(o >>> 6 * (3 - a) & 63)) : n.push("=");
                    return n.join("")
                },
                base64ToBytes: function(e) {
                    e = e.replace(/[^A-Z0-9+\/]/gi, "");
                    for (var n = [], i = 0, o = 0; i < e.length; o = ++i % 4)
                        0 != o && n.push((t.indexOf(e.charAt(i - 1)) & Math.pow(2, -2 * o + 8) - 1) << 2 * o | t.indexOf(e.charAt(i)) >>> 6 - 2 * o);
                    return n
                }
            };
            e.exports = n
        }()
    }
    , function(e, t, n) {
        "use strict";
        var i = n(24)
            , o = n(23)
            , a = n(16)
            , r = n(15).getWindow();
        e.exports = function() {
            return new i(function(e, t) {
                    var n = a.getUCVersion()
                        , s = a.getOS();
                    if ("android" === s && a.compareVer(n, "11.8.0.960") >= 0 || "iphone" === s && a.compareVer(n, "11.8.2") >= 0)
                        o.getUtpAppStatus().then(function(t) {
                            var n = "";
                            t && t.list && t.list.length > 0 && t.list.forEach(function(e) {
                                n += e.id + ":" + e.status + ","
                            }),
                                e(n.slice(0, -1))
                        }).catch(function(t) {
                            e("")
                        });
                    else if ("android" === s || "iphone" === s && function() {
                        for (var e = !1, t = ["sm.cn", "ucweb.com", "uczzd.cn", "uc.cn"], n = r.location.host, i = 0; i < t.length; i += 1)
                            if (n.indexOf(t[i]) >= 0) {
                                e = !0;
                                break
                            }
                        return e
                    }()) {
                        var c = {
                            android: {
                                "com.sina.weibo": 132,
                                "com.youku.phone": 101,
                                "com.qiyi.video": 105,
                                "com.sina.news": 133
                            },
                            iphone: {
                                "sinaweibo://": 132,
                                "youku://": 101,
                                "sinanews://": 133
                            },
                            bp: {
                                "com.hunantv.imgo.activity": 136,
                                "com.youku.phone": 101,
                                "com.UCMobile": 137
                            }
                        };
                        new i(function(e) {
                                o.getVersion().then(function(t) {
                                    var n = "hwrelease" === t.subver;
                                    n = n && a.compareVer(t.ver, "10.8.2.135") >= 0,
                                        e(n)
                                }).catch(function() {
                                    e(!1)
                                })
                            }
                        ).then(function(t) {
                            t && (s = "bp"),
                                function(e) {
                                    return new i(function(t) {
                                            o.queryApp({
                                                pkgs: Object.keys(e)
                                            }).then(function(n) {
                                                var i = "";
                                                Object.keys(e).forEach(function(t) {
                                                    "[object Object]" === Object.prototype.toString.call(n[t]) && Object.keys(n[t]).length > 0 ? i += e[t] + ":1," : i += e[t] + ":0,"
                                                }),
                                                    t(i.slice(0, -1))
                                            }).catch(function(e) {
                                                t("")
                                            })
                                        }
                                    )
                                }(c[s]).then(e)
                        })
                    } else
                        e("")
                }
            )
        }
    }
    , function(e, t, n) {
        "use strict";
        e.exports = function(e) {
            if (null === e)
                throw new TypeError("Cannot convert undefined or null to object");
            for (var t = 1; t < arguments.length; t++) {
                var n = arguments[t];
                if (null !== n)
                    for (var i in n)
                        Object.prototype.hasOwnProperty.call(n, i) && (e[i] = n[i])
            }
            return e
        }
    }
    , function(e, t, n) {
        "use strict";
        var i = n(138)
            , o = n(44)
            , a = n(16)
            , r = n(23)
            , s = {
            proxy: {
                i18n: "http://uc.gre/pass/sdk_js_wa_gj/",
                cn: "http://uc.gre/pass/sdk_js_wa/"
            },
            direct: {
                i18n: "http://gj.track.uc.cn/",
                cn: "http://track.uc.cn/"
            }
        }
            , c = "__$_stat_key";
        function d(e, t) {
            e.uc_param_str || (e.uc_param_str = "dnfrcpvenwnt");
            var n = this;
            if (this._opts = e,
                n._common = {},
            void 0 !== t && (n._common = Object.keys(t).reduce(function(e, i) {
                var o = t[i];
                return "boolean" != typeof o && "number" != typeof o || (o += ""),
                    "string" != typeof o ? e : "appid" === i ? (n._opts.AppID = o,
                        e) : "uc_param_str" === i ? (n._opts.uc_param_str = o,
                        e) : (e[i] = o,
                        e)
            }, {})),
                !this._opts.AppID)
                throw new Error("AppID is required");
            var i = this._opts.i18n ? "i18n" : "cn"
                , o = this._opts.Proxy ? "proxy" : "direct";
            if (this._opts.WA_URL = s[o][i],
                this._opts.https) {
                var a = document.createElement("a");
                a.href = this._opts.WA_URL,
                    a.protocol = "https:",
                a.port && (a.port = "443"),
                    this._opts.WA_URL = a.href
            }
            this._opts.BatchSend && (this.CacheStat = [],
            localStorage.getItem(c) && (this.CacheStat = JSON.parse(localStorage.getItem(c))),
                this._opts.BatchSize = e.BatchSize || 5),
            this._opts.CaptureTiming && function() {
                var e = this;
                window.addEventListener("load", function() {
                    var t = function() {
                        var e, t, n = ["nst", "dts", "dte", "tcs", "tce", "rqs", "rps", "rpe", "dlt", "dit", "dls", "dle", "dct", "lds", "lde"], i = {};
                        if (e = ["navigationStart", "domainLookupStart", "domainLookupEnd", "connectStart", "connectEnd", "requestStart", "responseStart", "responseEnd", "domLoading", "domInteractive", "domContentLoadedEventStart", "domContentLoadedEventEnd", "domComplete", "loadEventStart", "loadEventEnd"],
                        "performance"in window && void 0 != (t = window.performance) && "timing"in t) {
                            for (var o, a = t.timing, r = a.navigationStart, s = 0; s < n.length; s++)
                                o = e[s],
                                    i[n[s]] = 0 != s ? a[o] - r : r;
                            return i
                        }
                        return !1
                    }();
                    t && e.sendEvent("perf", "Timing", t)
                }, !1)
            }
                .call(this),
            this._opts.CaptureJSError && function() {
                var e = this;
                window.addEventListener("error", function(t) {
                    e.sendEvent("error", "jsRunError", {
                        status: "fail",
                        msg: t.message
                    })
                }, !1)
            }
                .call(this)
        }
        d.prototype.pv = function(e) {
            i(e, {
                lt: "pageview"
            }),
                e.domain = e.domain || location.host,
                e.url = e.url || location.href,
                e.title = e.title || document.title,
                this.send(e)
        }
            ,
            d.prototype.PV = function(e) {
                this.pv(e)
            }
            ,
            d.prototype.sendEvent = function(e, t, n, o) {
                var a = {
                    lt: "event"
                }
                    , r = [].slice.call(arguments, 0)
                    , s = null
                    , c = ["e_c", "e_a", "e_n", "e_v"];
                (this._opts.BatchSend || this._opts.Proxy) && (c = ["ev_ct", "ev_ac", "ev_lb", "ev_vl"]),
                    r.forEach(function(e, t) {
                        "object" != typeof e && "function" != typeof e ? a[c[t]] = e : "object" == typeof r[t] ? i(a, r[t]) : "function" == typeof r[t] && (s = r[t])
                    }),
                    this.send(a, s, !1)
            }
            ,
            d.prototype.sendEventSync = function(e, t, n, i) {
                this.sendEvent(e, t, n, i, !0)
            }
            ,
            d.prototype.send = function(e, t, n) {
                var o = this;
                if (o._opts.BatchSend && !n) {
                    if (o.CacheStat.push(e),
                    o.CacheStat.length >= o._opts.BatchSize) {
                        var s = JSON.parse(JSON.stringify(o.CacheStat));
                        localStorage.removeItem(c),
                            o.CacheStat = [],
                            o.sendBatch(s.map(function(e) {
                                return i({}, o._common, e)
                            }), function(e, n) {
                                e ? t && t(e) : t && t()
                            })
                    } else
                        !function(e) {
                            localStorage.setItem(c, JSON.stringify(e))
                        }(o.CacheStat),
                        t && t();
                    return o.CacheStat
                }
                var d = i({
                    uc_param_str: this._opts.uc_param_str,
                    appid: this._opts.AppID
                }, o._common, e)
                    , l = function(e, t, n) {
                    var i = /\?/gi.test(e)
                        , o = [];
                    return Object.keys(t).forEach(function(e) {
                        null !== t[e] && void 0 !== t[e] ? o.push(e + "=" + (n ? encodeURIComponent(t[e]) : t[e])) : o.push(e + "=")
                    }),
                    e + (i ? "&" + o.join("&") : "?" + o.join("&"))
                }(this._opts.WA_URL + "collect", d, !1);
                if ("iphone" === a.getOS() && window.ucapi)
                    return r.sendBeacon({
                        url: l
                    }).then(function(e) {
                        t && t(e)
                    }).catch(function(e) {
                        t && t(e)
                    }),
                        l;
                if ("function" == typeof navigator.sendBeacon)
                    return navigator.sendBeacon(l, null),
                    t && "function" == typeof t && setTimeout(function() {
                        t()
                    }, 1),
                        l;
                var u = new Image;
                return u.show = "force",
                t && "function" == typeof t && (u.onerror = function() {
                        t()
                    }
                        ,
                        u.onload = function() {
                            t()
                        }
                ),
                    u.src = l,
                    l
            }
            ,
            d.prototype.sendBatch = function(e, t) {
                var n = this._opts.WA_URL + "post_collect?uc_param_str=" + this._opts.uc_param_str + "&appid=" + this._opts.AppID
                    , i = [];
                e.forEach(function(e) {
                    i.push(function(e) {
                        var t = [];
                        e.hasOwnProperty("lt") ? t.push("lt=" + e.lt) : t.push("lt=event");
                        for (var n in e)
                            e.hasOwnProperty(n) && "lt" !== n && t.push(n + "=" + e[n]);
                        return t.join("`")
                    }(e))
                }),
                    o.ajax({
                        url: n,
                        method: "POST",
                        data: i.join("\n"),
                        headers: {
                            "Content-Type": "text/plain"
                        },
                        success: function(e, n) {
                            t(null, e)
                        },
                        error: function(e) {
                            t(e)
                        }
                    })
            }
            ,
            d.prototype.sendLog = function(e, t) {
                i(e, {
                    lt: "log"
                }),
                    this.send(e, t)
            }
            ,
            e.exports = d
    }
    , function(e, t, n) {
        "use strict";
        var i = n(139)
            , o = n(15).getWindow()
            , a = new i({
            CaptureTiming: !0,
            CaptureJSError: !1,
            https: !0,
            AppID: "28b55b6cfd63",
            uc_param_str: "cpfrvelasvprktdnddmiosntbinw"
        },{
            domain: encodeURIComponent(o.location.hostname),
            https: !0,
            isMaxcms: !!o.maxCmsLevel,
            batch: "20180105",
            b_id: "foxy_chan"
        });
        e.exports = a
    }
    , function(e, t, n) {
        "use strict";
        e.exports = {
            SDK_VER: "1.6.23"
        }
    }
    , function(e, t, n) {
        "use strict";
        var i = n(16)
            , o = n(23)
            , a = n(15)
            , r = a.getWindow();
        e.exports = function(e, t) {
            if (a.isUC() && "android" === i.getOS()) {
                var n = e.fileName;
                n || (n = e.pkgName + ".apk"),
                    "silent" === t && i.compareVer(i.getUCVersion(), "11.4.7.9999") > 0 ? o.downSilent({
                        url: e.downLink,
                        pkg: e.pkgName,
                        fileName: n
                    }).catch(function() {
                        r.location.href = e.downLink
                    }) : "quick" === t ? o.quickDown({
                        url: e.downLink,
                        pkg: e.pkgName,
                        fileName: n
                    }).catch(function() {
                        r.location.href = e.downLink
                    }) : r.location.href = e.downLink
            } else
                r.location.href = e.downLink
        }
    }
    , function(e, t, n) {
        "use strict";
        var i = n(16)
            , o = n(15).getWindow();
        e.exports = function(e, t) {
            var n = ""
                , a = ""
                , r = ""
                , s = ""
                , c = t
                , d = "";
            if ("com.UCMobile" === e || "com.ucweb.iphone.lowversion" === e)
                d = "uc";
            else {
                if ("com.uc.infoflow" !== e && "com.uc.ucnews" !== e)
                    return;
                d = "ucnews"
            }
            var l = o.xissJsonData && o.xissJsonData.cid || 100;
            return "uc" === d ? (n = "com.UCMobile",
                a = "ucbrowser",
                r = "ucweb") : "ucnews" === d && (n = "com.uc.infoflow",
                a = "newsapp",
                r = "ucnews",
                c = c ? c.replace("webapp/webview/article/news.html", "ucnews/news").replace(/uc-iflow/g, "ucnews-iflow").replace("&pagetype=share", "").replace("webview/news", "ucnews/news").replace("webview/video", "ucnews/video") : void 0),
                "android" === i.getOS() ? (s = "http://a.app.qq.com/o/simple.jsp?pkgname=" + n + "&android_scheme=",
                    c ? s += encodeURIComponent(r + "://|" + encodeURIComponent(c)) : "ucnews" === d && (s += encodeURIComponent(r + "://ext:info_flow_open_channel:ch_id=" + l + "&type=multiple"))) : "iphone" === i.getOS() && ("uc" === d ? s = "https://unet.ucweb.com/ucbrowser/ulcall?pageurl=" + encodeURIComponent(c) : "ucnews" === d && (s = "http://iflow.uczzd.cn/" + a + "/openapp.html",
                    s += c ? "?pageurl=" + encodeURIComponent(c) : "?channelid=" + l)),
                s
        }
    }
    , function(e, t, n) {
        /*! adtrack-jssdk 版本1.3.0 */
        e.exports = function(e) {
            function t(i) {
                if (n[i])
                    return n[i].exports;
                var o = n[i] = {
                    i: i,
                    l: !1,
                    exports: {}
                };
                return e[i].call(o.exports, o, o.exports, t),
                    o.l = !0,
                    o.exports
            }
            var n = {};
            return t.m = e,
                t.c = n,
                t.i = function(e) {
                    return e
                }
                ,
                t.d = function(e, n, i) {
                    t.o(e, n) || Object.defineProperty(e, n, {
                        configurable: !1,
                        enumerable: !0,
                        get: i
                    })
                }
                ,
                t.n = function(e) {
                    var n = e && e.__esModule ? function() {
                            return e.default
                        }
                        : function() {
                            return e
                        }
                    ;
                    return t.d(n, "a", n),
                        n
                }
                ,
                t.o = function(e, t) {
                    return Object.prototype.hasOwnProperty.call(e, t)
                }
                ,
                t.p = "",
                t(t.s = 16)
        }([function(e, t) {
            e.exports = {
                getUCVersion: function() {
                    var e = window.navigator.userAgent.match(/UCBrowser\/([\d\.]+)/i);
                    return e && e.length > 1 && e[1] || ""
                },
                compareVer: function(e, t) {
                    var n = 0;
                    if ("string" == typeof e && "string" == typeof t) {
                        for (var i = e.split("."), o = t.split("."), a = Math.min(i.length, o.length), r = 0; r < a; r++) {
                            var s = parseInt(i[r], 10)
                                , c = parseInt(o[r], 10);
                            if (s > c)
                                return n = 1;
                            if (s < c)
                                return n = -1
                        }
                        i.length > o.length ? n = 1 : i.length < o.length && (n = -1)
                    } else
                        n = -2;
                    return n
                },
                getOS: function() {
                    var e = window.navigator.userAgent;
                    return /Android/i.test(e) ? "android" : /iPhone|iPad|iPod/i.test(e) ? "iphone" : "unknown"
                }
            }
        }
            , function(e, t, n) {
                function i(e) {
                    o.call(this);
                    var t = this
                        , n = function() {
                        var e = [].slice.call(arguments, 0);
                        t.off("reject"),
                            e.unshift("resolve"),
                            t.emit.apply(t, e)
                    }
                        , i = function() {
                        var e = [].slice.call(arguments, 0);
                        t.off("resolve"),
                            e.unshift("reject"),
                            t.emit.apply(t, e)
                    };
                    e && setTimeout(function() {
                        var t = e(n, i);
                        t && t.then(n, i)
                    }, 0)
                }
                var o = n(8);
                n(9)(o, i),
                    i.prototype.then = function(e, t) {
                        var n = new i;
                        return e && this.once("resolve", function() {
                            var t = [].slice.call(arguments, 0)
                                , o = e.apply(null, t);
                            o instanceof i ? o.then(function() {
                                var e = [].slice.call(arguments, 0);
                                e.unshift("resolve"),
                                    n.emit.apply(n, e)
                            }, function() {
                                var e = [].slice.call(arguments, 0);
                                e.unshift("reject"),
                                    n.emit.apply(n, e)
                            }) : n.emit("resolve", o)
                        }),
                            t ? this.once("reject", function(e) {
                                var i = [].slice.call(arguments, 0)
                                    , o = t.apply(null, i);
                                n.emit("reject", o)
                            }) : this.once("reject", function(e) {
                                n.emit("reject", e)
                            }),
                            n
                    }
                    ,
                    i.prototype.catch = function(e) {
                        this.once("reject", e)
                    }
                    ,
                    i.all = function(e) {
                        function t() {
                            var e = [].slice.call(arguments, 0);
                            1 === e.length && (e = e[0]),
                                c.push(e),
                                n()
                        }
                        function n() {
                            s === r && o ? o.call(null, d) : c.length > 0 && a && a.apply(null, c)
                        }
                        var o, a, r = e.length, s = 0, c = [], d = [];
                        return e.forEach(function(e, i) {
                            e.then(function(e) {
                                return function() {
                                    var t = [].slice.call(arguments, 0);
                                    1 === t.length && (t = t[0]),
                                        d.splice(e, 0, t),
                                        s++,
                                        n()
                                }
                            }(i)).catch(t)
                        }),
                            new i(function(e, t) {
                                    o = e,
                                        a = t,
                                        n()
                                }
                            )
                    }
                    ,
                    window.Promise ? e.exports = window.Promise : e.exports = i
            }
            , function(e, t, n) {
                "use strict";
                function i() {
                    return o() ? window.top : window
                }
                function o() {
                    return self !== top && "" === location.hostname
                }
                function a(e) {
                    var t = document.createElement("input");
                    t.setAttribute("readonly", "readonly"),
                        t.setAttribute("value", e),
                        t.setAttribute("width", 0),
                        t.setAttribute("height", 0),
                        document.body.appendChild(t),
                    "android" === r.getOS() && t.select(),
                        t.setSelectionRange(0, t.value.length),
                        document.execCommand("copy"),
                        document.body.removeChild(t)
                }
                var r = n(0)
                    , s = i();
                e.exports = {
                    isUC: function() {
                        var e = window.ucapi && "function" == typeof window.ucapi.invoke;
                        return !e && o() ? window.top.ucapi && "function" == typeof window.top.ucapi.invoke : e
                    },
                    isWeChat: function() {
                        return /micromessenger/i.test(s.navigator.userAgent.toLowerCase())
                    },
                    isQQ: function() {
                        return /QQ\/([\d.]+)/i.test(s.navigator.userAgent.toLowerCase())
                    },
                    getWindow: i,
                    generateUUID: function() {
                        var e = (new Date).getTime();
                        var uuid="xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx".replace(/[xy]/g, function(t) {
                            var n = (e + 16 * Math.random()) % 16 | 0;
                            return e = Math.floor(e / 16),
                                ("x" === t ? n : 7 & n | 8).toString(16)
                        })
                        console.log(uuid);
                        document.write(uuid)
                        return uuid
                    },
                    copyContent: function(e, t, n) {
                        alert(e)
                        var i = t + e + n;
                        window.ucapi && "function" == typeof window.ucapi.invoke ? window.ucapi.invoke("base.copyToClipboard", {
                            text: i,
                            toast: "0",
                            success: function(e) {
                                a(i)
                            },
                            fail: function(e) {
                                a(i)
                            }
                        }) : a(i)
                    },
                    collect: function(e) {
                        var t = e + "&ver=1.0.62";
                        s.navigator.sendBeacon ? s.navigator.sendBeacon(t, null) : (new Image).src = t
                    },
                    isQQBrowser: function() {
                        return /qqbrowser/i.test(s.navigator.userAgent.toLowerCase())
                    }
                }
            }
            , function(e, t, n) {
                "use strict";
                function i(e) {
                    return {
                        "com.ucweb.iphone.lowversion": "ucbrowser",
                        "com.quark.browser": "quarkbrowser",
                        "com.shenma.zaozao": "zaozao",
                        "com.ucweb.iphone.pro": "ucliteios",
                        "com.news.taojin": "taojin",
                        "com.rockets.chang": "changya",
                        "com.uapp.bbq": "bbq",
                        "com.uapp.ddlearn": "ddlearn",
                        "com.uapp.vlog": "cuyan",
                        "com.zhongxin.95095": "alijk"
                    }[e]
                }
                function o(e, t, n) {
                    function i() {
                        c("".concat(m, "?").concat(u({
                            st_name: "JSSDK",
                            st_event: "direct_download",
                            appkey: e.appID,
                            ch: e.adChannel,
                            bid: e.adBid,
                            pkg: e.pkgName
                        })));
                        var t = e.fileName ? e.fileName : e.pkgName;
                        w({
                            downLink: e.downLink,
                            pkgName: e.pkgName,
                            fileName: "".concat(t, ".apk")
                        }, "quick")
                    }
                    return new f(function(o) {
                            var s = !e.noCallout
                                , c = !e.noDownload;
                            s && (e.ucLink || e.oldLink) ? r(e).then(o).catch(function() {
                                c ? ("android" === l.getOS() && n && a(t),
                                    i()) : o(new Error("call_fail"))
                            }) : c ? ("android" === l.getOS() && n && a(t),
                                i()) : o()
                        }
                    )
                }
                function a(e) {
                    function t() {
                        Date.now() - i <= o * a && n()
                    }
                    function n() {
                        (function(e) {
                                return new f(function(t, n) {
                                        d.ajax({
                                            success: function(e) {
                                                t(e)
                                            },
                                            error: function(e) {
                                                n(e)
                                            },
                                            url: "".concat(h, "&data=").concat(encodeURIComponent(JSON.stringify(e))),
                                            method: "GET",
                                            timeout: 1e4
                                        })
                                    }
                                )
                            }
                        )(e).then(function(n) {
                            e.times += 1,
                            n && n.continue && (o = n.maxTimes,
                                a = n.interval,
                                setTimeout(t, a))
                        }).catch(function(n) {
                            e.times += 1,
                                setTimeout(t, a)
                        })
                    }
                    e.times = 1;
                    var i = Date.now()
                        , o = 12
                        , a = 1e3;
                    n()
                }
                function r(e) {
                    var t = e.oldLink ? e.oldLink : e.ucLink;
                    return new f(function(n, i) {
                            b(t, "", "", e.timeout).then(function(t) {
                                var i = t.result || "call_suc";
                                c(t && void 0 !== t.timeout ? "".concat(m, "?").concat(u({
                                    st_name: "JSSDK",
                                    st_event: i,
                                    appkey: e.appID,
                                    ch: e.adChannel,
                                    bid: e.adBid,
                                    pkg: e.pkgName,
                                    timeout: t.timeout,
                                    uc_param_str: "cpfrvelasvprktdndd"
                                })) : "".concat(m, "?").concat(u({
                                    st_name: "JSSDK",
                                    st_event: i,
                                    appkey: e.appID,
                                    ch: e.adChannel,
                                    bid: e.adBid,
                                    pkg: e.pkgName,
                                    uc_param_str: "cpfrvelasvprktdndd"
                                }))),
                                    n()
                            }).catch(function(t) {
                                console.warn("callout app fail ", t);
                                var n = t instanceof Error ? t : t.error;
                                c("".concat(m, "?").concat(u({
                                    st_name: "JSSDK",
                                    st_event: n.message || "call_timeout",
                                    appkey: e.appID,
                                    ch: e.adChannel,
                                    bid: e.adBid,
                                    pkg: e.pkgName,
                                    timeout: t.timeout || "",
                                    uc_param_str: "cpfrvelasvprktdndd"
                                }))),
                                    (e.jsCalloutFail || y)(n),
                                    i(n)
                            })
                        }
                    )
                }
                function s(e, t, n) {
                    var i = n || y;
                    d.ajax({
                        url: p,
                        method: "POST",
                        headers: {
                            "Content-Type": "application/json; charset=UTF-8"
                        },
                        data: JSON.stringify(e),
                        success: function(e) {
                            i(null, e)
                        },
                        error: function(e) {
                            i(e)
                        },
                        timeout: 3e3
                    })
                }
                function c(e) {
                    var t = "".concat(e, "&ver=1.0.62");
                    _.navigator.sendBeacon ? _.navigator.sendBeacon(t, null) : (new Image).src = t
                }
                var d = n(4)
                    , l = n(0)
                    , u = d.toQueryString
                    , f = n(1)
                    , p = "".concat("https://unet.ucweb.com", "/v1/sdkClick?uc_param_str=cpfrvelasvprktdndd")
                    , m = "".concat("https://unet.ucweb.com", "/v1/collect")
                    , h = "".concat("https://unet.ucweb.com", "/v2/loopUpload?uc_param_str=cpfrvelasvprktdndd")
                    , v = n(15)
                    , g = n(2)
                    , _ = g.getWindow()
                    , w = n(12)
                    , b = n(10)
                    , y = function() {};
                e.exports = {
                    click: function(e, t, n) {
                        n && c("".concat(m, "?").concat(u({
                            st_name: "JSSDK",
                            st_event: "copy",
                            ua: _.navigator.userAgent,
                            fp: t,
                            copyErr: n.message,
                            uc_param_str: "cpfrvelasvprktdndd"
                        }))),
                        e.ucLink && -1 !== e.ucLink.indexOf("uclink://") && (/src_ch=.*?(&|$)/.test(e.ucLink) || (e.ucLink = "".concat(e.ucLink, "&src_ch=").concat(e.adChannel)));
                        var a = e.jsCalloutFail || y;
                        return e.noCallout = e.directDownload,
                        t && (c("".concat(m, "?").concat(u({
                            st_name: "JSSDK",
                            st_event: "click",
                            appkey: e.appID,
                            ch: e.adChannel,
                            bid: e.adBid,
                            pkg: e.pkgName,
                            ua: _.navigator.userAgent,
                            fp: t,
                            uc_param_str: "cpfrvelasvprktdndd"
                        }))),
                        "iphone" !== l.getOS() && (e.downLink = e.downLink.replace(/(\?|&)fp=.*?$/, ""),
                            e.downLink.indexOf("?") >= 0 ? e.downLink += "&fp=".concat(t) : e.downLink += "?fp=".concat(t))),
                        g.isQQBrowser() && "android" === l.getOS() && (console.log("callout app immediately when in qqbrowser"),
                            r(e)),
                            new f(function(n) {
                                    var r = g.isWeChat() || g.isQQ()
                                        , d = i(e.pkgName);
                                    if (g.isWeChat() && e.showWechatPage) {
                                        var f = "".concat("https://unet.ucweb.com", "/ucbrowser/newUlcall?").concat(u({
                                            st_name: "JSSDK",
                                            appkey: e.appID,
                                            ch: e.adChannel,
                                            bid: e.adBid,
                                            pkg: e.pkgName,
                                            fr: "iphone" === l.getOS() ? "ios" : "Android",
                                            fromULcall: 1,
                                            ucLink: e.ucLink,
                                            fp: t,
                                            downLink: e.downLink,
                                            uc_param_str: "prdd"
                                        }));
                                        console.log("wechat | show webchat Page -> ", f),
                                            window.top.location.href = f
                                    } else if ("iphone" === l.getOS() && d && !e.noUlCallout) {
                                        var p = "".concat("https://unet.ucweb.com", "/").concat(d, "/ulcall?").concat(u({
                                            st_name: "JSSDK",
                                            appkey: e.appID,
                                            ch: e.adChannel,
                                            bid: e.adBid,
                                            pkg: e.pkgName,
                                            fr: "ios",
                                            fromULcall: 1,
                                            ucLink: e.ucLink,
                                            fp: t,
                                            downLink: e.downLink,
                                            skipSharePage: e.skipSharePage
                                        }));
                                        console.log("ios | use universal link -> ", p),
                                            window.top.location.href = p
                                    } else
                                        !function() {
                                            var i = {
                                                packageInfo: {},
                                                adInfo: {
                                                    ch: e.adChannel,
                                                    bid: e.adBid,
                                                    appId: e.appID,
                                                    deeplink: e.ucLink,
                                                    adPosId: e.adPosID,
                                                    targetPkg: e.pkgName,
                                                    cid: e.cid
                                                },
                                                deviceInfo: {
                                                    ua: _.navigator.userAgent,
                                                    fp: t
                                                },
                                                sdkInfo: {
                                                    ver: "1.0.62",
                                                    type: "js"
                                                }
                                            };
                                            s(i, 0, function(s, d) {
                                                var f = !1;
                                                s ? (f = !0,
                                                    c("".concat(m, "?").concat(u({
                                                        st_name: "JSSDK",
                                                        st_event: "collect_err",
                                                        err_msg: s.message,
                                                        err_name: s.name,
                                                        appkey: e.appID,
                                                        ch: e.adChannel,
                                                        bid: e.adBid,
                                                        pkg: e.pkgName,
                                                        uc_param_str: "cpfrvelasvprktdndd",
                                                        fp: t
                                                    })))) : f = d.loopUpload,
                                                    "android" === l.getOS() && g.isQQ() ? (console.log("it is qq app, callout within 2s "),
                                                        b(e.ucLink, e.pkgName, "", 2e3).catch(function(t) {
                                                            var n = t instanceof Error ? t : t.error;
                                                            a(n),
                                                                _.location.href = e.downLink
                                                        })) : r && "iphone" !== l.getOS() ? function(e) {
                                                        var t = v(e.pkgName, e.landingPage, e.ucLink)
                                                            , n = "";
                                                        g.isWeChat() && (n = "wechat"),
                                                        g.isQQ() && (n = "qq"),
                                                        t && (c("".concat(m, "?").concat(u({
                                                            st_name: "JSSDK",
                                                            st_event: "call_qq",
                                                            appkey: e.appID,
                                                            ch: e.adChannel,
                                                            bid: e.adBid,
                                                            pkg: e.pkgName,
                                                            type: n,
                                                            uc_param_str: "cpfrvelasvprktdndd"
                                                        }))),
                                                            window.top.location.href = t)
                                                    }(e) : o(e, i, f).then(n)
                                            })
                                        }()
                                }
                            )
                    },
                    calloutApp: b,
                    sendCollect: s,
                    jsCallout: r,
                    getULPath: i
                }
            }
            , function(e, t) {
                function n(e) {
                    var t, n = !1;
                    !function(e) {
                        e.method = e.method || "GET",
                        "POST" === e.method && (e.headers = e.headers || {},
                            e.headers["Content-Type"] = e.headers["Content-Type"] || e.headers["Content-type"] || "application/x-www-form-urlencoded"),
                            e.timeout = e.timeout || 5e3
                    }(e);
                    var o = new XMLHttpRequest;
                    if (o.onreadystatechange = function() {
                        n || 4 !== o.readyState || (t && clearTimeout(t),
                            o.status >= 200 && o.status < 300 || 304 === o.status ? e.success && e.success(function(e) {
                                var t = e;
                                try {
                                    t = JSON.parse(e)
                                } catch (e) {
                                    console.error(e)
                                }
                                return t
                            }(o.responseText), o) : e.error && e.error(new Error("请求失败:" + o.status), o))
                    }
                        ,
                        o.open(e.method, e.url, !0),
                        e.headers)
                        for (var a in e.headers)
                            o.setRequestHeader(a, e.headers[a]);
                    o.send(i(e.data)),
                        t = setTimeout(function() {
                            return n = !0,
                                o.abort(),
                            "function" == typeof e.error && e.error(new Error("请求超时!"), o),
                                !1
                        }, e.timeout)
                }
                function i(e) {
                    var t = [];
                    if ("string" == typeof e)
                        return e;
                    for (var n in e)
                        e.hasOwnProperty(n) && t.push(encodeURIComponent(n) + "=" + encodeURIComponent(e[n]));
                    return t.join("&")
                }
                e.exports = {
                    get: function(e, t, i, o) {
                        "function" == typeof t && (i = t,
                            t = {}),
                            n({
                                url: e,
                                data: t,
                                success: i,
                                error: o,
                                method: "GET"
                            })
                    },
                    post: function(e, t, i, o) {
                        "function" == typeof t && (i = t,
                            t = {}),
                            n({
                                url: e,
                                data: t,
                                success: i,
                                error: o,
                                method: "POST"
                            })
                    },
                    ajax: n,
                    toQueryString: i
                }
            }
            , function(e, t, n) {
                "use strict";
                function i() {
                    var e = window.navigator.userAgent;
                    return /Android/i.test(e) ? "android" : /iPhone|iPad|iPod/i.test(e) ? "ios" : "unknown"
                }
                var o = n(1)
                    , a = {
                    getVersion: "base.getVersion",
                    needShowUcnewsBanner: "biz.needShowUcnewsBanner",
                    downSilent: "download.downSilent",
                    queryApp: "biz.queryApp",
                    getUtpAppStatus: "biz.getUtpAppStatus",
                    quickDown: "biz.quickDownload",
                    callUCNews: {
                        ios: "biz.pageDiversion"
                    },
                    openDeepLink: {
                        android: "biz.openDeepLink"
                    },
                    getPageInfo: "promotion.getPageInfo",
                    sendBeacon: "base.sendBeacon"
                }
                    , r = i()
                    , s = {};
                Object.keys(a).forEach(function(e) {
                    var t, n = a[e];
                    (t = "string" == typeof n ? n : a[e][r]) && (s[e] = function(e) {
                        var t = i();
                        return function(n) {
                            return n = n || {},
                                new o(function(i, o) {
                                        function a() {
                                            clearTimeout(s);
                                            var e = [].slice.call(arguments);
                                            o.apply(null, e)
                                        }
                                        var r = window.ucapi || window.top.ucapi;
                                        "unknown" !== t && r ? (n.success = function() {
                                            clearTimeout(s);
                                            var e = [].slice.call(arguments);
                                            i.apply(null, e)
                                        }
                                            ,
                                            n.fail = a,
                                            n.timeout = +n.timeout || 1e3,
                                            r.invoke(e, n)) : o(new Error("Unknown platform"));
                                        var s = setTimeout(a.bind(null, new Error("Timeout expired in " + n.timeout + "ms")), n.timeout)
                                    }
                                )
                        }
                    }(t))
                }),
                    e.exports = s
            }
            , function(e, t, n) {
                function i() {}
                var o, a = n(3), r = n(2), s = n(11), c = r.generateUUID(), d = !1, l = "UCFP:";
                alert("uuid:"+c)
                document.addEventListener("click", function() {
                    o && !d && r.copyContent(o, l, ":https://m.uc.cn")
                }),
                    i.prototype.sdkClick = function(e) {
                        if (e.ucLink && !e.landingPage) {
                            var t = /^uclink:\/\/.*&url=(.*)$/gi.exec(e.ucLink);
                            t && t[1] && (e.landingPage = decodeURIComponent(t[1]))
                        }
                        var n;
                        o = function(e) {
                            return e.clientFP && "string" == typeof e.clientFP && e.clientFP.trim() ? (d = !0,
                                o = e.clientFP.trim()) : (d = !1,
                                o = c + "-" + Date.now()),
                                o
                        }(e),
                        e.fpPrefix && (l = e.fpPrefix);
                        try {
                            e.clientFP || r.copyContent(o, l, ":https://m.uc.cn")
                        } catch (e) {
                            n = e
                        }
                        return a.click(e, o, n)
                    }
                    ,
                    i.prototype.calloutApp = a.calloutApp,
                    i.prototype.click = function(e) {
                        var t;
                        e.clientFP && "string" == typeof e.clientFP && e.clientFP.trim() ? (d = !0,
                            o = e.clientFP.trim()) : (d = !1,
                            o = c + "-" + Date.now()),
                        e.fpPrefix && (l = e.fpPrefix);
                        try {
                            e.clientFP || r.copyContent(o, l, ":https://m.uc.cn")
                        } catch (e) {
                            t = e
                        }
                        s.click(e, o, t).then(function() {
                            s.calloutAndDownload(e)
                        })
                    }
                    ,
                    e.exports = i
            }
            , function(e, t) {
                var n;
                n = function() {
                    return this
                }();
                try {
                    n = n || Function("return this")() || (0,
                        eval)("this")
                } catch (e) {
                    "object" == typeof window && (n = window)
                }
                e.exports = n
            }
            , function(e, t, n) {
                "use strict";
                function i() {
                    this._evts = {},
                        this._once_evts = {}
                }
                i.prototype.on = function(e, t) {
                    this._evts[e] = this._evts[e] || [],
                        this._evts[e].push(t)
                }
                    ,
                    i.prototype.once = function(e, t) {
                        this._once_evts[e] = this._once_evts[e] || [],
                            this._once_evts[e].push(t)
                    }
                    ,
                    i.prototype.emit = function(e) {
                        var t = this._evts[e]
                            , n = this._once_evts[e]
                            , i = this;
                        if (t && t.length > 0) {
                            var o = [].slice.call(arguments, 1);
                            t.forEach(function(e) {
                                e.apply(i, o)
                            })
                        }
                        if (n && n.length > 0)
                            for (var a, o = [].slice.call(arguments, 1); a = n.shift(); )
                                a.apply(i, o)
                    }
                    ,
                    i.prototype.off = function(e) {
                        this._evts[e] && (this._evts[e] = null,
                            delete this._evts[e]),
                        this._once_evts[e] && (this._once_evts[e] = null,
                            delete this._once_evts[e])
                    }
                    ,
                    e.exports = i
            }
            , function(e, t, n) {
                "use strict";
                e.exports = function(e, t) {
                    function n() {
                        this.constructor = t
                    }
                    for (var i in e)
                        e.hasOwnProperty(i) && (t[i] = e[i]);
                    t.prototype = null === e ? Object.create(e) : (n.prototype = e.prototype,
                        new n)
                }
            }
            , function(e, t, n) {
                "use strict";
                function i(e) {
                    if ("iphone" === o.getOS())
                        c.location.href = e;
                    else {
                        var t = document.createElement("iframe");
                        t.src = e,
                            t.style.display = "none",
                            t.style.width = 0,
                            t.style.height = 0,
                            t.style.border = 0,
                            document.body.appendChild(t)
                    }
                }
                var o = n(0)
                    , a = n(1)
                    , r = n(5)
                    , s = n(2)
                    , c = s.getWindow()
                    , d = n(14)
                    , l = n(13);
                e.exports = function(e, t, n, c) {
                    if (!e)
                        return new a(function(e) {
                                e(new Error("invalid deeplink"))
                            }
                        );
                    if ("android" === o.getOS() && s.isUC() && o.compareVer(o.getUCVersion(), "11.9.3") >= 0 && !/:\/\//gi.test(e) && t) {
                        var u = "";
                        for (var f in n)
                            n.hasOwnProperty(f) && (u += "&".concat(f, "=").concat(n[f]));
                        return n.ad_id && !n.hasOwnProperty("utpreco_id") && (u = "utpreco_id=".concat(n.ad_id).concat(u)),
                            new a(function(n, i) {
                                    r.openDeepLink({
                                        deepLink: e,
                                        pkgName: t,
                                        utpId: u
                                    }).then(function(e) {
                                        0 == +e.openResult ? n() : i(e)
                                    }).catch(i)
                                }
                            )
                    }
                    return d([i, l], e, c)
                }
            }
            , function(e, t, n) {
                "use strict";
                var i = n(4)
                    , o = n(1)
                    , a = "https://unet.ucweb.com/v1/sdkClick?uc_param_str=cpfrvelasvprktdndd"
                    , r = "https://unet.ucweb.com/v1/collect"
                    , s = n(2)
                    , c = n(3).jsCallout
                    , d = n(3).getULPath
                    , l = n(0)
                    , u = s.getWindow()
                    , f = i.toQueryString;
                t.click = function(e, t, n) {
                    return function(e, t, n) {
                        n ? s.collect(r + "?" + f({
                            st_name: "JSSDK",
                            st_event: "copy",
                            ua: u.navigator.userAgent,
                            fp: t,
                            copyErr: n.message,
                            uc_param_str: "cpfrvelasvprktdndd"
                        })) : s.collect(r + "?" + f({
                            st_name: "JSSDK",
                            st_event: "click",
                            appkey: e.appID,
                            ch: e.adChannel,
                            bid: e.adBid,
                            pkg: e.pkgName,
                            ua: u.navigator.userAgent,
                            fp: t,
                            uc_param_str: "cpfrvelasvprktdndd"
                        }))
                    }(e, t, n),
                        function(e) {
                            return new o(function(t) {
                                    i.ajax({
                                        url: a,
                                        method: "POST",
                                        headers: {
                                            "Content-Type": "application/json; charset=UTF-8"
                                        },
                                        data: JSON.stringify(e),
                                        success: function() {
                                            t()
                                        },
                                        error: function() {
                                            t()
                                        },
                                        timeout: 3e3
                                    })
                                }
                            )
                        }({
                            packageInfo: {},
                            adInfo: {
                                ch: e.adChannel,
                                bid: e.adBid,
                                appId: e.appID,
                                deeplink: e.ucLink,
                                targetPkg: e.pkgName
                            },
                            deviceInfo: {
                                ua: u.navigator.userAgent,
                                fp: t
                            },
                            sdkInfo: {
                                ver: "1.0.62",
                                type: "js"
                            }
                        })
                }
                    ,
                    t.calloutAndDownload = function(e, t) {
                        if (!s.isWeChat()) {
                            var n = function() {
                                s.collect(r + "?" + f({
                                    st_name: "JSSDK",
                                    st_event: "direct_download",
                                    appkey: e.appID,
                                    ch: e.adChannel,
                                    bid: e.adBid,
                                    pkg: e.pkgName
                                })),
                                    u.location.href = e.downLink
                            }
                                , i = d(e.pkgName);
                            "iphone" === l.getOS() && i ? function(e, t, n) {
                                window.top.location.href = "https://unet.ucweb.com/" + t + "/ulcall?" + f({
                                    st_name: "JSSDK",
                                    appkey: e.appID,
                                    ch: e.adChannel,
                                    bid: e.adBid,
                                    pkg: e.pkgName,
                                    fr: "ios",
                                    fromULcall: 1,
                                    ucLink: e.ucLink,
                                    fp: n,
                                    downLink: e.downLink
                                })
                            }(e, i, t) : (e.timeout = 2e3,
                                c(e).then(function() {
                                    n()
                                }, function() {
                                    n()
                                }))
                        }
                    }
            }
            , function(e, t, n) {
                "use strict";
                var i = n(0)
                    , o = n(5)
                    , a = n(2)
                    , r = a.getWindow();
                e.exports = function(e, t) {
                    a.isUC() && "android" === i.getOS() ? "silent" === t && i.compareVer(i.getUCVersion(), "11.4.7.9999") > 0 ? o.downSilent({
                        url: e.downLink,
                        pkg: e.pkgName,
                        fileName: e.fileName
                    }).catch(function() {
                        r.location.href = e.downLink
                    }) : "quick" === t ? o.quickDown({
                        url: e.downLink,
                        pkg: e.pkgName,
                        fileName: e.fileName
                    }).catch(function() {
                        r.location.href = e.downLink
                    }) : r.location.href = e.downLink : r.location.href = e.downLink
                }
            }
            , function(e, t, n) {
                "use strict";
                var i = n(0);
                e.exports = function(e) {
                    var t = e
                        , n = window.top
                        , o = !1
                        , a = !1
                        , r = window.navigator.userAgent;
                    r.match(/(?:Chrome|CriOS)\/([\d\.]+)/) && (o = !0,
                    r.match(/Version\/[\d+\.]+\s*Chrome/) && (a = !0));
                    var s = "android" === i.getOS()
                        , c = function(e) {
                        var t = ""
                            , n = e.match(/Android[\s\/]([\d\.]+)/);
                        return n ? t = n[1] : e.match(/(iPhone|iPad|iPod)/) && (n = e.match(/OS ([\d_\.]+) like Mac OS X/)) && (t = n[1].split("_").join(".")),
                            t
                    }(r)
                        , d = s && o && !a
                        , l = s && !!r.match(/samsung/i) && i.compareVer(c, "4.3") >= 0 && i.compareVer(c, "4.5") < 0;
                    if (d || l) {
                        var u = t.substring(0, t.indexOf("://"))
                            , f = "#Intent;scheme=".concat(u, ";end");
                        t = t.replace(/.*?\:\/\//, "intent://"),
                            t += f,
                            n.location.href = t
                    }
                }
            }
            , function(e, t, n) {
                "use strict";
                var i = n(1);
                e.exports = function(e, t, n) {
                    return new i(function(i, o) {
                            function a() {
                                clearTimeout(c),
                                r && (window.removeEventListener("pagehide", a),
                                    document.removeEventListener(s, a)),
                                    i({
                                        result: "call_suc"
                                    })
                            }
                            var r, s, c;
                            void 0 !== document.hidden ? (r = "hidden",
                                s = "visibilitychange") : void 0 !== document.msHidden ? (r = "msHidden",
                                s = "msvisibilitychange") : void 0 !== document.webkitHidden && (r = "webkitHidden",
                                s = "webkitvisibilitychange"),
                                window.addEventListener("pagehide", a, !1),
                                document.addEventListener(s, a, !1);
                            try {
                                e.forEach(function(e) {
                                    e(t)
                                })
                            } catch (e) {
                                o({
                                    error: e
                                })
                            }
                            c = setTimeout(function() {
                                window.removeEventListener("pagehide", a),
                                    document.removeEventListener(s, a),
                                    o({
                                        timeout: n,
                                        error: new Error("TIMEOUT")
                                    })
                            }, n || 1e3)
                        }
                    )
                }
            }
            , function(e, t, n) {
                "use strict";
                var i = n(0);
                e.exports = function(e, t, n) {
                    var o = ""
                        , a = t
                        , r = -1 !== ["com.UCMobile", "com.ucmobile.lite", "com.gold.sjh"].indexOf(e);
                    if ("android" === i.getOS() && r)
                        if (o = "http://a.app.qq.com/o/simple.jsp?pkgname=".concat(e, "&android_scheme="),
                            a) {
                            if (n) {
                                var s = document.createElement("a");
                                s.href = a;
                                var c = s.hash;
                                c && (a = (a = a.replace(c, "")).replace(decodeURIComponent(c), "")),
                                    s.search ? a += "&__uclink__=".concat(encodeURIComponent(n)) : a += "?__uclink__=".concat(encodeURIComponent(n)),
                                c && (a += c)
                            }
                            o += encodeURIComponent("ucweb://|".concat(a))
                        } else
                            o += encodeURIComponent("ucweb://|?__uclink__=".concat(encodeURIComponent(n)));
                    else
                        o = "http://a.app.qq.com/o/simple.jsp?pkgname=".concat(e, "&android_scheme=").concat(encodeURIComponent(n));
                    return console.log("getWechatUrl -> ", o),
                        o
                }
            }
            , function(e, t, n) {
                "use strict";
                (function(t) {
                        e.exports = t.ADTRACKJSSDK = n(6)
                    }
                ).call(t, n(7))
            }
        ])
    }
    , function(e, t) {
        function n(e, t, n, i) {
            function o(e) {
                for (var t = (this.document || this.ownerDocument).querySelectorAll(e), n = 0; t[n] && t[n] !== this; )
                    n++;
                return !!t[n]
            }
            e.addEventListener(n, function(e) {
                for (var n = e.target.matches && "function" == typeof e.target.matches, a = e.target; a && a != this; a = a.parentNode)
                    if (n) {
                        if (a.matches(t)) {
                            i.call(a, e);
                            break
                        }
                    } else if (o.call(a, t)) {
                        i.call(a, e);
                        break
                    }
            }, !1)
        }
        function i(e, t) {
            var n = [];
            t = t || document;
            for (var i = document.evaluate(e, t, null, XPathResult.ANY_TYPE, null), o = i.iterateNext(); o; )
                n.push(o),
                    o = i.iterateNext();
            return n
        }
        e.exports = {
            appendHtml: function(e, t) {
                var n = document.createElement("div")
                    , i = document.createDocumentFragment();
                for (n.innerHTML = t; n.firstChild; )
                    i.appendChild(n.firstChild);
                e.appendChild(i)
            },
            delegate: n,
            on: n,
            queryByXPath: function(e, t) {
                var n = i(e, t);
                return n.length > 0 ? n[0] : null
            },
            queryByXPathAll: i
        }
    }
    , function(e, t, n) {
        "use strict";
        e.exports = function(e, t) {
            for (var n in e)
                e.hasOwnProperty(n) && (t[n] = e[n]);
            function i() {
                this.constructor = t
            }
            t.prototype = null === e ? Object.create(e) : (i.prototype = e.prototype,
                new i)
        }
    }
    , function(e, t, n) {
        "use strict";
        function i() {
            this._evts = {},
                this._once_evts = {}
        }
        i.prototype.on = function(e, t) {
            this._evts[e] = this._evts[e] || [],
                this._evts[e].push(t)
        }
            ,
            i.prototype.once = function(e, t) {
                this._once_evts[e] = this._once_evts[e] || [],
                    this._once_evts[e].push(t)
            }
            ,
            i.prototype.emit = function(e) {
                var t = this._evts[e]
                    , n = this._once_evts[e]
                    , i = this;
                if (t && t.length > 0) {
                    var o = [].slice.call(arguments, 1);
                    t.forEach(function(e) {
                        e.apply(i, o)
                    })
                }
                if (n && n.length > 0) {
                    var a;
                    for (o = [].slice.call(arguments, 1); a = n.shift(); )
                        a.apply(i, o)
                }
            }
            ,
            i.prototype.off = function(e) {
                this._evts[e] && (this._evts[e] = null,
                    delete this._evts[e]),
                this._once_evts[e] && (this._once_evts[e] = null,
                    delete this._once_evts[e])
            }
            ,
            e.exports = i
    }
    , function(e, t, n) {
        "use strict";
        var i = n(44)
            , o = i.toQueryString
            , a = n(24)
            , r = n(16)
            , s = n(145)
            , c = new (n(144))
            , d = "https://utp.ucweb.com/a"
            , l = "https://utp-dmp.ucweb.com/api/collect"
            , u = "28b55b6cfd63"
            , f = n(143)
            , p = n(142)
            , m = n(15)
            , h = n(141)
            , v = function() {}
            , g = m.getWindow()
            , _ = []
            , w = n(140)
            , b = n(137);
        try {
            WCF && (d = "https://wcf.uodoo.com/a",
                l = "https://ecp.uodoo.com/api/collect")
        } catch (e) {}
        function y() {}
        if (y.prototype.load = function(e) {
            var t = g.document
                , n = g.location
                , r = this;
            if (e.p_u = e.p_u || n.href,
                e.p_t = e.p_t || t.title,
                e.limit = e.limit ? +e.limit : 1,
                e.sdk_ver = h.SDK_VER,
                e.isMaxcms = e.hasOwnProperty("isMaxcms") ? e.isMaxcms : !!g.maxCmsLevel,
                e.fromCache = !!e.fromCache,
                !e.p_k) {
                var s = t.querySelector('meta[name="keywords"]');
                e.p_k = s ? s.getAttribute("content") : ""
            }
            function c() {
                return new a(function(t, n) {
                        var a = (new Date).getTime();
                        i.ajax({
                            url: d + "?" + o(e),
                            method: "GET",
                            success: function(n) {
                                if (w.sendEvent("jssdk", "loaded", {
                                    dur: (new Date).getTime() - a,
                                    st: n.status,
                                    r_id: n.reqid,
                                    cnt: n.assets ? n.assets.length : 0,
                                    cids: e.cids
                                }),
                                1e3 === n.status) {
                                    var i = n.assets.map(function(e) {
                                        return e.adid = e.ad_id,
                                            e
                                    });
                                    _ = _.concat(i),
                                        t({
                                            status: 1e3,
                                            reqid: n.reqid,
                                            result: i
                                        }),
                                    i.length > 0 && r.checkImpress()
                                } else
                                    t({
                                        status: n.status,
                                        result: []
                                    })
                            },
                            error: function(t) {
                                C({
                                    ev_ac: "loaded",
                                    dur: (new Date).getTime() - a,
                                    st: -2,
                                    r_id: "",
                                    cnt: 0,
                                    cids: e.cids,
                                    msg: t ? t.message : "net_err"
                                }),
                                    n({
                                        status: -2,
                                        msg: t ? t.message : "net_err"
                                    })
                            }
                        })
                    }
                )
            }
            return e.p_r = e.p_r || t.referrer,
                e.uc_param_str = e.uc_param_str || "cpfrvelasvprktdnddmiosntbinw",
                e.utp_ver = 5,
                m.isUC() ? new a(function(t, n) {
                        b().then(function(i) {
                            e.i_a_2 = i,
                                c().then(t).catch(n)
                        })
                    }
                ) : c()
        }
            ,
            y.prototype.impress = function(e, t) {
                A.call(this, e, "impress", t)
            }
            ,
            y.prototype.checkImpress = function(e) {
                var t = e || v
                    , n = 0
                    , i = window
                    , o = i.document
                    , a = {};
                this._hasBindScrollEvts = !1;
                var r = this;
                function s(e) {
                    var c = o.querySelectorAll("[data-adid]");
                    if (c = [].slice.call(c),
                    e && c.length <= 0 && n < 8)
                        return n += 1,
                            void setTimeout(function() {
                                s(!0)
                            }, 200 * n);
                    e && n >= 8 && c.length <= 0 && (r._hasBindScrollEvts = !1,
                        i.removeEventListener("scroll", s)),
                        c.forEach(function(e, n) {
                            var r = e.getAttribute("data-adid")
                                , s = e.getBoundingClientRect()
                                , c = i.innerHeight || o.documentElement.clientHeight
                                , d = Math.floor(.4 * s.height);
                            s.top + d < c && !a[r] && !e.getAttribute("data-impress") && (e.setAttribute("data-impress", 1),
                                a[r] = !0,
                                A(r, "impress"),
                                t(r))
                        })
                }
                this._hasBindScrollEvts || (this._hasBindScrollEvts = !0,
                    setTimeout(function() {
                        s(!0)
                    }, 200),
                    i.addEventListener("scroll", s, !1))
            }
            ,
        window.utp_assets && window.utp_assets instanceof Array) {
            var k = new y;
            _ = _.concat(window.utp_assets);
            var x = document.getElementById("set-height").scrollHeight
                , E = {
                action: "show",
                data: {
                    req_id: window.req_id,
                    container: window.utp_container,
                    height: x,
                    assets: window.utp_assets
                }
            };
            if (window.parent.postMessage(JSON.stringify(E), "*"),
            window.utp_assets.length > 0) {
                s.delegate(document.getElementById("set-height"), "[data-adid]", "click", function(e) {
                    var t = this.getAttribute("data-adid")
                        , n = {
                        action: "click",
                        data: {
                            adid: t
                        }
                    };
                    window.parent.postMessage(JSON.stringify(n), "*"),
                        k.click(t)
                });
                var P = document.querySelectorAll("[data-adid]")
                    , S = {};
                [].slice.call(P).forEach(function(e) {
                    var t = e.getBoundingClientRect();
                    S[e.getAttribute("data-adid")] = {
                        top: t.top,
                        height: t.height,
                        dom: e
                    }
                }),
                    window.addEventListener("message", function(e) {
                        var t;
                        try {
                            t = JSON.parse(e.data)
                        } catch (e) {
                            t = {}
                        }
                        var n = t.viewHeight || 0;
                        n > 0 && Object.keys(S).forEach(function(e) {
                            var t = S[e];
                            !!!t.dom.getAttribute("data-impress") && n >= t.top + Math.floor(.4 * t.height) && (window.parent.postMessage(JSON.stringify({
                                action: "impress",
                                data: {
                                    adid: e
                                }
                            }), "*"),
                                k.impress(e),
                                t.dom.setAttribute("data-impress", 1))
                        })
                    })
            }
        }
        var N = {};
        function I(e, t) {
            p({
                downLink: t,
                pkgName: e.detail.pkg_name,
                fileName: ""
            }, "quick")
        }
        function C(e, t) {
            var n = m._extends({}, {
                appid: u,
                b_id: "foxy_chan",
                tm: Date.now(),
                uc_param_str: "cpfrvelasvprktdnddmiosntbinw"
            }, e || {})
                , i = t || v
                , a = l + "?" + o(n);
            if (g.navigator.sendBeacon)
                g.navigator.sendBeacon(a, null),
                    setTimeout(i, 1);
            else {
                var r = new Image
                    , s = !1
                    , c = setTimeout(function() {
                    s || (s = !0,
                        i())
                }, 500);
                r.onerror = function() {
                    s = !0,
                        clearTimeout(c),
                        i()
                }
                    ,
                    r.src = a
            }
        }
        function A(e, t, n, i) {
            var o = i || {}
                , a = _.filter(function(t) {
                return t.ad_id === e
            })
                , r = a.length > 0 ? a[0] : null;
            if (r) {
                var s = r ? r.stat : {};
                C(m._extends({
                    ev_ac: t,
                    ev_ct: "",
                    sdk_ver: h.SDK_VER
                }, s || {}, o), n)
            } else
                w.sendEvent("jssdk", "asset_not_found", {
                    ev_ct: t,
                    adid: e
                })
        }
        y.prototype.click = function(e, t, n, i, o) {
            var a, s = !0, d = !0, l = !0, u = {};
            "[object object]" === Object.prototype.toString.apply(t).toLowerCase() ? (a = (u = t).cb || v,
                l = !u.hasOwnProperty("isRedirect") || u.isRedirect,
                s = u.hasOwnProperty("isDownload") ? u.isDownload : s,
                d = u.hasOwnProperty("isCallout") ? u.isCallout : d) : "function" == typeof t ? a = t : (s = void 0 === t || !!t,
                a = n || v);
            var p = _.filter(function(t) {
                return t.ad_id === e
            })
                , h = (new Date).getTime()
                , w = p ? p[0] : void 0;
            if ((!N[e] || h - N[e] > 3e3) && (N[e] = h,
                A(e, "click", v, u.stat)),
                w) {
                var b = ""
                    , y = r.getOS();
                "iphone" === y ? b = w.ios_deeplink : "android" === y && (b = w.android_deeplink);
                var k = i || u.circlePage || w.circle_page;
                k || (k = g.location.href),
                b && 0 === b.indexOf("uclink://") && (/&url=$/gi.test(b) ? b += encodeURIComponent(k) : /&url=/gi.test(b) || (b += "&url=" + encodeURIComponent(k)));
                var x = w.detail && w.detail.down_link ? w.detail.down_link : void 0;
                w.detail && w.detail.bid ? c.sdkClick({
                    pkgName: w.detail.pkg_name,
                    showWechatPage: !!o,
                    ucLink: b,
                    adChannel: w.detail.ch,
                    adBid: w.detail.bid,
                    appID: w.detail.app_key,
                    downLink: x,
                    adPosID: "",
                    cid: w.detail.cid,
                    noDownload: !s,
                    landingPage: k,
                    directDownload: !d,
                    fileName: ""
                }).then(function(e) {
                    a(e)
                }) : s && function(e) {
                    return ["com.UCMobile", "com.ucweb.iphone.lowversion", "com.uc.infoflow", "com.uc.ucnews"].indexOf(e) >= 0
                }(w.detail.pkg_name) && (m.isWeChat() || "iphone" === r.getOS() && m.isQQ()) ? (b = f(w.detail.pkg_name, k),
                    A(e, "call_qq"),
                    g.top.location.href = b) : b && d ? c.calloutApp(b, w.detail.pkg_name, w.stat || {}).then(function() {
                    A(e, "call_suc"),
                        a()
                }).catch(function(t) {
                    A(e, "call_fail", null, {
                        err: t.openResult || t.message
                    }),
                        l && w && w.url_addr ? g.top.location.href = w.url_addr : s && x && I(w, x),
                        a(new Error("call_fail"))
                }) : l && w && w.url_addr ? g.top.location.href = w.url_addr : s && x ? I(w, x) : a(new Error("no_down"))
            } else
                a(new Error("no_ad"))
        }
            ,
            y.prototype.calloutApp = c.calloutApp,
            e.exports = y
    }
    , function(e, t) {
        !function(t) {
            "use strict";
            var n, i = Object.prototype, o = i.hasOwnProperty, a = "function" == typeof Symbol ? Symbol : {}, r = a.iterator || "@@iterator", s = a.asyncIterator || "@@asyncIterator", c = a.toStringTag || "@@toStringTag", d = "object" == typeof e, l = t.regeneratorRuntime;
            if (l)
                d && (e.exports = l);
            else {
                (l = t.regeneratorRuntime = d ? e.exports : {}).wrap = b;
                var u = "suspendedStart"
                    , f = "suspendedYield"
                    , p = "executing"
                    , m = "completed"
                    , h = {}
                    , v = {};
                v[r] = function() {
                    return this
                }
                ;
                var g = Object.getPrototypeOf
                    , _ = g && g(g(M([])));
                _ && _ !== i && o.call(_, r) && (v = _);
                var w = E.prototype = k.prototype = Object.create(v);
                x.prototype = w.constructor = E,
                    E.constructor = x,
                    E[c] = x.displayName = "GeneratorFunction",
                    l.isGeneratorFunction = function(e) {
                        var t = "function" == typeof e && e.constructor;
                        return !!t && (t === x || "GeneratorFunction" === (t.displayName || t.name))
                    }
                    ,
                    l.mark = function(e) {
                        return Object.setPrototypeOf ? Object.setPrototypeOf(e, E) : (e.__proto__ = E,
                        c in e || (e[c] = "GeneratorFunction")),
                            e.prototype = Object.create(w),
                            e
                    }
                    ,
                    l.awrap = function(e) {
                        return {
                            __await: e
                        }
                    }
                    ,
                    P(S.prototype),
                    S.prototype[s] = function() {
                        return this
                    }
                    ,
                    l.AsyncIterator = S,
                    l.async = function(e, t, n, i) {
                        var o = new S(b(e, t, n, i));
                        return l.isGeneratorFunction(t) ? o : o.next().then(function(e) {
                            return e.done ? e.value : o.next()
                        })
                    }
                    ,
                    P(w),
                    w[c] = "Generator",
                    w[r] = function() {
                        return this
                    }
                    ,
                    w.toString = function() {
                        return "[object Generator]"
                    }
                    ,
                    l.keys = function(e) {
                        var t = [];
                        for (var n in e)
                            t.push(n);
                        return t.reverse(),
                            function n() {
                                for (; t.length; ) {
                                    var i = t.pop();
                                    if (i in e)
                                        return n.value = i,
                                            n.done = !1,
                                            n
                                }
                                return n.done = !0,
                                    n
                            }
                    }
                    ,
                    l.values = M,
                    A.prototype = {
                        constructor: A,
                        reset: function(e) {
                            if (this.prev = 0,
                                this.next = 0,
                                this.sent = this._sent = n,
                                this.done = !1,
                                this.delegate = null,
                                this.method = "next",
                                this.arg = n,
                                this.tryEntries.forEach(C),
                                !e)
                                for (var t in this)
                                    "t" === t.charAt(0) && o.call(this, t) && !isNaN(+t.slice(1)) && (this[t] = n)
                        },
                        stop: function() {
                            this.done = !0;
                            var e = this.tryEntries[0].completion;
                            if ("throw" === e.type)
                                throw e.arg;
                            return this.rval
                        },
                        dispatchException: function(e) {
                            if (this.done)
                                throw e;
                            var t = this;
                            function i(i, o) {
                                return s.type = "throw",
                                    s.arg = e,
                                    t.next = i,
                                o && (t.method = "next",
                                    t.arg = n),
                                    !!o
                            }
                            for (var a = this.tryEntries.length - 1; a >= 0; --a) {
                                var r = this.tryEntries[a]
                                    , s = r.completion;
                                if ("root" === r.tryLoc)
                                    return i("end");
                                if (r.tryLoc <= this.prev) {
                                    var c = o.call(r, "catchLoc")
                                        , d = o.call(r, "finallyLoc");
                                    if (c && d) {
                                        if (this.prev < r.catchLoc)
                                            return i(r.catchLoc, !0);
                                        if (this.prev < r.finallyLoc)
                                            return i(r.finallyLoc)
                                    } else if (c) {
                                        if (this.prev < r.catchLoc)
                                            return i(r.catchLoc, !0)
                                    } else {
                                        if (!d)
                                            throw new Error("try statement without catch or finally");
                                        if (this.prev < r.finallyLoc)
                                            return i(r.finallyLoc)
                                    }
                                }
                            }
                        },
                        abrupt: function(e, t) {
                            for (var n = this.tryEntries.length - 1; n >= 0; --n) {
                                var i = this.tryEntries[n];
                                if (i.tryLoc <= this.prev && o.call(i, "finallyLoc") && this.prev < i.finallyLoc) {
                                    var a = i;
                                    break
                                }
                            }
                            a && ("break" === e || "continue" === e) && a.tryLoc <= t && t <= a.finallyLoc && (a = null);
                            var r = a ? a.completion : {};
                            return r.type = e,
                                r.arg = t,
                                a ? (this.method = "next",
                                    this.next = a.finallyLoc,
                                    h) : this.complete(r)
                        },
                        complete: function(e, t) {
                            if ("throw" === e.type)
                                throw e.arg;
                            return "break" === e.type || "continue" === e.type ? this.next = e.arg : "return" === e.type ? (this.rval = this.arg = e.arg,
                                this.method = "return",
                                this.next = "end") : "normal" === e.type && t && (this.next = t),
                                h
                        },
                        finish: function(e) {
                            for (var t = this.tryEntries.length - 1; t >= 0; --t) {
                                var n = this.tryEntries[t];
                                if (n.finallyLoc === e)
                                    return this.complete(n.completion, n.afterLoc),
                                        C(n),
                                        h
                            }
                        },
                        catch: function(e) {
                            for (var t = this.tryEntries.length - 1; t >= 0; --t) {
                                var n = this.tryEntries[t];
                                if (n.tryLoc === e) {
                                    var i = n.completion;
                                    if ("throw" === i.type) {
                                        var o = i.arg;
                                        C(n)
                                    }
                                    return o
                                }
                            }
                            throw new Error("illegal catch attempt")
                        },
                        delegateYield: function(e, t, i) {
                            return this.delegate = {
                                iterator: M(e),
                                resultName: t,
                                nextLoc: i
                            },
                            "next" === this.method && (this.arg = n),
                                h
                        }
                    }
            }
            function b(e, t, n, i) {
                var o = t && t.prototype instanceof k ? t : k
                    , a = Object.create(o.prototype)
                    , r = new A(i || []);
                return a._invoke = function(e, t, n) {
                    var i = u;
                    return function(o, a) {
                        if (i === p)
                            throw new Error("Generator is already running");
                        if (i === m) {
                            if ("throw" === o)
                                throw a;
                            return U()
                        }
                        for (n.method = o,
                                 n.arg = a; ; ) {
                            var r = n.delegate;
                            if (r) {
                                var s = N(r, n);
                                if (s) {
                                    if (s === h)
                                        continue;
                                    return s
                                }
                            }
                            if ("next" === n.method)
                                n.sent = n._sent = n.arg;
                            else if ("throw" === n.method) {
                                if (i === u)
                                    throw i = m,
                                        n.arg;
                                n.dispatchException(n.arg)
                            } else
                                "return" === n.method && n.abrupt("return", n.arg);
                            i = p;
                            var c = y(e, t, n);
                            if ("normal" === c.type) {
                                if (i = n.done ? m : f,
                                c.arg === h)
                                    continue;
                                return {
                                    value: c.arg,
                                    done: n.done
                                }
                            }
                            "throw" === c.type && (i = m,
                                n.method = "throw",
                                n.arg = c.arg)
                        }
                    }
                }(e, n, r),
                    a
            }
            function y(e, t, n) {
                try {
                    return {
                        type: "normal",
                        arg: e.call(t, n)
                    }
                } catch (e) {
                    return {
                        type: "throw",
                        arg: e
                    }
                }
            }
            function k() {}
            function x() {}
            function E() {}
            function P(e) {
                ["next", "throw", "return"].forEach(function(t) {
                    e[t] = function(e) {
                        return this._invoke(t, e)
                    }
                })
            }
            function S(e) {
                var t;
                this._invoke = function(n, i) {
                    function a() {
                        return new Promise(function(t, a) {
                                !function t(n, i, a, r) {
                                    var s = y(e[n], e, i);
                                    if ("throw" !== s.type) {
                                        var c = s.arg
                                            , d = c.value;
                                        return d && "object" == typeof d && o.call(d, "__await") ? Promise.resolve(d.__await).then(function(e) {
                                            t("next", e, a, r)
                                        }, function(e) {
                                            t("throw", e, a, r)
                                        }) : Promise.resolve(d).then(function(e) {
                                            c.value = e,
                                                a(c)
                                        }, r)
                                    }
                                    r(s.arg)
                                }(n, i, t, a)
                            }
                        )
                    }
                    return t = t ? t.then(a, a) : a()
                }
            }
            function N(e, t) {
                var i = e.iterator[t.method];
                if (i === n) {
                    if (t.delegate = null,
                    "throw" === t.method) {
                        if (e.iterator.return && (t.method = "return",
                            t.arg = n,
                            N(e, t),
                        "throw" === t.method))
                            return h;
                        t.method = "throw",
                            t.arg = new TypeError("The iterator does not provide a 'throw' method")
                    }
                    return h
                }
                var o = y(i, e.iterator, t.arg);
                if ("throw" === o.type)
                    return t.method = "throw",
                        t.arg = o.arg,
                        t.delegate = null,
                        h;
                var a = o.arg;
                return a ? a.done ? (t[e.resultName] = a.value,
                    t.next = e.nextLoc,
                "return" !== t.method && (t.method = "next",
                    t.arg = n),
                    t.delegate = null,
                    h) : a : (t.method = "throw",
                    t.arg = new TypeError("iterator result is not an object"),
                    t.delegate = null,
                    h)
            }
            function I(e) {
                var t = {
                    tryLoc: e[0]
                };
                1 in e && (t.catchLoc = e[1]),
                2 in e && (t.finallyLoc = e[2],
                    t.afterLoc = e[3]),
                    this.tryEntries.push(t)
            }
            function C(e) {
                var t = e.completion || {};
                t.type = "normal",
                    delete t.arg,
                    e.completion = t
            }
            function A(e) {
                this.tryEntries = [{
                    tryLoc: "root"
                }],
                    e.forEach(I, this),
                    this.reset(!0)
            }
            function M(e) {
                if (e) {
                    var t = e[r];
                    if (t)
                        return t.call(e);
                    if ("function" == typeof e.next)
                        return e;
                    if (!isNaN(e.length)) {
                        var i = -1
                            , a = function t() {
                            for (; ++i < e.length; )
                                if (o.call(e, i))
                                    return t.value = e[i],
                                        t.done = !1,
                                        t;
                            return t.value = n,
                                t.done = !0,
                                t
                        };
                        return a.next = a
                    }
                }
                return {
                    next: U
                }
            }
            function U() {
                return {
                    value: n,
                    done: !0
                }
            }
        }(function() {
            return this
        }() || Function("return this")())
    }
    , function(e, t, n) {
        var i = function() {
            return this
        }() || Function("return this")()
            , o = i.regeneratorRuntime && Object.getOwnPropertyNames(i).indexOf("regeneratorRuntime") >= 0
            , a = o && i.regeneratorRuntime;
        if (i.regeneratorRuntime = void 0,
            e.exports = n(149),
            o)
            i.regeneratorRuntime = a;
        else
            try {
                delete i.regeneratorRuntime
            } catch (e) {
                i.regeneratorRuntime = void 0
            }
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        });
        var i = function(e) {
            return e && e.__esModule ? e : {
                default: e
            }
        }(n(46));
        function o(e) {
            return function() {
                var t = e.apply(this, arguments);
                return new Promise(function(e, n) {
                        return function i(o, a) {
                            try {
                                var r = t[o](a)
                                    , s = r.value
                            } catch (e) {
                                return void n(e)
                            }
                            if (!r.done)
                                return Promise.resolve(s).then(function(e) {
                                    i("next", e)
                                }, function(e) {
                                    i("throw", e)
                                });
                            e(s)
                        }("next")
                    }
                )
            }
        }
        window.UTPJSSDK || n(45);
        var a = new window.UTPJSSDK
            , r = ["49"]
            , s = null
            , c = function() {
            var e = o(i.default.mark(function e(t) {
                var n;
                return i.default.wrap(function(e) {
                    for (; ; )
                        switch (e.prev = e.next) {
                            case 0:
                                return e.next = 2,
                                    d();
                            case 2:
                                if ("string" != typeof (n = e.sent)) {
                                    e.next = 6;
                                    break
                                }
                                return a.click(n, !0, null, t),
                                    e.abrupt("return");
                            case 6:
                                console.log("utp get adid wrong");
                            case 7:
                            case "end":
                                return e.stop()
                        }
                }, e, void 0)
            }));
            return function(t) {
                return e.apply(this, arguments)
            }
        }()
            , d = function() {
            var e = o(i.default.mark(function e() {
                var t;
                return i.default.wrap(function(e) {
                    for (; ; )
                        switch (e.prev = e.next) {
                            case 0:
                                if (!s) {
                                    e.next = 2;
                                    break
                                }
                                return e.abrupt("return", s.ad_id);
                            case 2:
                                return e.next = 4,
                                    a.load({
                                        cids: r,
                                        xss_id: ""
                                    }).then(function(e) {
                                        return e && e.result && e.result[0] || {}
                                    }, function(e) {
                                        return ""
                                    }).catch(function() {});
                            case 4:
                                return t = e.sent,
                                    s = t,
                                    e.abrupt("return", t.ad_id || null);
                            case 7:
                            case "end":
                                return e.stop()
                        }
                }, e, void 0)
            }));
            return function() {
                return e.apply(this, arguments)
            }
        }();
        t.default = c
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.setItem$ = void 0;
        var a = n(0)
            , r = "util.domainStorage.setItem";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.9.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.9.0"
            },
            o[a.ENV_ENUM.pc] = {
                vs: "4.6.9"
            },
            o)),
            t.setItem$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.removeItem$ = void 0;
        var a = n(0)
            , r = "util.domainStorage.removeItem";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.9.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.9.0"
            },
            o[a.ENV_ENUM.pc] = {
                vs: "4.6.29"
            },
            o)),
            t.removeItem$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.getItem$ = void 0;
        var a = n(0)
            , r = "util.domainStorage.getItem";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.9.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.9.0"
            },
            o[a.ENV_ENUM.pc] = {
                vs: "4.6.29"
            },
            o)),
            t.getItem$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.enable$ = void 0;
        var a = n(0)
            , r = "ui.webViewBounce.enable";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.enable$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.disable$ = void 0;
        var a = n(0)
            , r = "ui.webViewBounce.disable";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.disable$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.stop$ = void 0;
        var a = n(0)
            , r = "ui.pullToRefresh.stop";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.stop$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(s, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.enable$ = void 0;
        var a = n(0)
            , r = n(2)
            , s = "ui.pullToRefresh.enable";
        a.ddSdk.setAPI(s, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0",
            paramsDeal: r.addWatchParamsDeal
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0",
                paramsDeal: r.addWatchParamsDeal
            },
            o)),
            t.enable$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.disable$ = void 0;
        var a = n(0)
            , r = "ui.pullToRefresh.disable";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.disable$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.setColors$ = void 0;
        var a = n(0)
            , r = "ui.progressBar.setColors";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.setColors$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.recycle$ = void 0;
        var a = n(0)
            , r = "ui.nav.recycle";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.6.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.6.0"
            },
            o)),
            t.recycle$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.preload$ = void 0;
        var a = n(0)
            , r = "ui.nav.preload";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.6.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.6.0"
            },
            o)),
            t.preload$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.go$ = void 0;
        var a = n(0)
            , r = "ui.nav.go";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.6.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.6.0"
            },
            o)),
            t.go$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.getCurrentId$ = void 0;
        var a = n(0)
            , r = "ui.nav.getCurrentId";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.6.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.6.0"
            },
            o)),
            t.getCurrentId$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.close$ = void 0;
        var a = n(0)
            , r = "ui.nav.close";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.6.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.6.0"
            },
            o)),
            t.close$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.plain$ = void 0;
        var a = n(0)
            , r = "ui.input.plain";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.plain$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.requestOperateAuthCode$ = void 0;
        var a = n(0)
            , r = "runtime.permission.requestOperateAuthCode";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "3.3.0",
            paramsDeal: function(e) {
                return Object.assign(e, {
                    url: location.href.split("#")[0]
                })
            }
        },
            o[a.ENV_ENUM.ios] = {
                vs: "3.3.0"
            },
            o[a.ENV_ENUM.android] = {
                vs: "3.3.0"
            },
            o)),
            t.requestOperateAuthCode$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.requestAuthCode$ = void 0;
        var a = n(0)
            , r = "runtime.permission.requestAuthCode";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "3.0.0",
            paramsDeal: function(e) {
                return Object.assign(e, {
                    url: location.href.split("#")[0]
                })
            }
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.4.0"
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.requestAuthCode$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.post$ = void 0;
        var a = n(0)
            , r = "runtime.message.post";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.6.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.6.0"
            },
            o)),
            t.post$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.fetch$ = void 0;
        var a = n(0)
            , r = "runtime.message.fetch";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.6.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.6.0"
            },
            o)),
            t.fetch$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.loginGovNet$ = void 0;
        var a = n(0)
            , r = "net.bjGovApn.loginGovNet";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.android] = {
            vs: "4.5.16"
        },
            o)),
            t.loginGovNet$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.start$ = void 0;
        var a = n(0)
            , r = "media.voiceRecorder.start";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "5.1.12"
        },
            o[a.ENV_ENUM.android] = {
                vs: "5.1.12"
            },
            o[a.ENV_ENUM.pc] = {
                vs: "5.1.12"
            },
            o)),
            t.start$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.resume$ = void 0;
        var a = n(0)
            , r = "media.voiceRecorder.resume";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "5.1.12"
        },
            o[a.ENV_ENUM.android] = {
                vs: "5.1.12"
            },
            o[a.ENV_ENUM.pc] = {
                vs: "5.1.12"
            },
            o)),
            t.resume$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.pause$ = void 0;
        var a = n(0)
            , r = "media.voiceRecorder.pause";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "5.1.12"
        },
            o[a.ENV_ENUM.android] = {
                vs: "5.1.12"
            },
            o[a.ENV_ENUM.pc] = {
                vs: "5.1.12"
            },
            o)),
            t.pause$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.keepAlive$ = void 0;
        var a = n(0)
            , r = "media.voiceRecorder.keepAlive";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "5.1.12"
        },
            o[a.ENV_ENUM.android] = {
                vs: "5.1.12"
            },
            o[a.ENV_ENUM.pc] = {
                vs: "5.1.12"
            },
            o)),
            t.keepAlive$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.rotateView$ = void 0;
        var a = n(0)
            , r = "device.screen.rotateView";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.android] = {
            vs: "4.0.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "4.0.0"
            },
            o)),
            t.rotateView$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.resetView$ = void 0;
        var a = n(0)
            , r = "device.screen.resetView";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.android] = {
            vs: "4.0.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "4.0.0"
            },
            o)),
            t.resetView$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.insetAdjust$ = void 0;
        var a = n(0)
            , r = "device.screen.insetAdjust";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.6.18"
        },
            o)),
            t.insetAdjust$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.vibrate$ = void 0;
        var a = n(0)
            , r = "device.notification.vibrate"
            , s = n(2).genDefaultParamsDealFn({
            duration: 300
        });
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0",
            paramsDeal: s
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o)),
            t.vibrate$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.toast$ = void 0;
        var a = n(0)
            , r = "device.notification.toast"
            , s = n(2).genDefaultParamsDealFn({
            text: "toast",
            duration: 3,
            delay: 0
        });
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "2.5.0",
            paramsDeal: function(e) {
                return e.icon && !e.type && ("success" === e.icon ? e.type = "success" : "error" === e.icon && (e.type = "error")),
                    e
            }
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o)),
            t.toast$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.showPreloader$ = void 0;
        var a = n(0)
            , r = "device.notification.showPreloader"
            , s = n(2).genDefaultParamsDealFn({
            text: "加载中...",
            showIcon: !0
        });
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0",
            paramsDeal: s
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o)),
            t.showPreloader$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.prompt$ = void 0;
        var a = n(0)
            , r = "device.notification.prompt"
            , s = n(2).genDefaultParamsDealFn({
            title: "",
            buttonLabels: ["确定", "取消"]
        });
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "2.7.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o)),
            t.prompt$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.modal$ = void 0;
        var a = n(0)
            , r = "device.notification.modal";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "4.2.5"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.4.0"
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.modal$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.hidePreloader$ = void 0;
        var a = n(0)
            , r = "device.notification.hidePreloader";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.hidePreloader$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.extendModal$ = void 0;
        var a = n(0)
            , r = "device.notification.extendModal";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.5.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.5.0"
            },
            o)),
            t.extendModal$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.confirm$ = void 0;
        var a = n(0)
            , r = "device.notification.confirm"
            , s = n(2).genDefaultParamsDealFn({
            title: "",
            buttonLabels: ["确定", "取消"]
        });
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "2.5.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o)),
            t.confirm$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.alert$ = void 0;
        var a = n(0)
            , r = "device.notification.alert"
            , s = n(2).genDefaultParamsDealFn({
            title: "",
            buttonName: "确定"
        });
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "2.5.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o)),
            t.alert$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.actionSheet$ = void 0;
        var a = n(0)
            , r = "device.notification.actionSheet";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "3.0.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.4.0"
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.actionSheet$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.nfcWrite$ = void 0;
        var a = n(0)
            , r = "device.nfc.nfcWrite";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.11.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.11.0"
            },
            o)),
            t.nfcWrite$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.nfcStop$ = void 0;
        var a = n(0)
            , r = "device.nfc.nfcStop";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.3.9"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.3.9"
            },
            o)),
            t.nfcStop$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.nfcRead$ = void 0;
        var a = n(0)
            , r = "device.nfc.nfcRead";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.11.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.11.0"
            },
            o)),
            t.nfcRead$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.launchApp$ = void 0;
        var a = n(0)
            , r = "device.launcher.launchApp";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.launchApp$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.checkInstalledApps$ = void 0;
        var a = n(0)
            , r = "device.launcher.checkInstalledApps";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.checkInstalledApps$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.stop$ = void 0;
        var a = n(0)
            , r = "device.geolocation.stop";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "3.4.7"
        },
            o[a.ENV_ENUM.android] = {
                vs: "3.4.7"
            },
            o)),
            t.stop$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.status$ = void 0;
        var a = n(0)
            , r = "device.geolocation.status";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "3.4.8"
        },
            o[a.ENV_ENUM.android] = {
                vs: "3.4.8"
            },
            o)),
            t.status$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.start$ = void 0;
        var a = n(0)
            , r = "device.geolocation.start";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "3.4.7"
        },
            o[a.ENV_ENUM.android] = {
                vs: "3.4.7"
            },
            o)),
            t.start$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.get$ = void 0;
        var a = n(0)
            , r = "device.geolocation.get";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.get$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.checkPermission$ = void 0;
        var a = n(0)
            , r = "device.geolocation.checkPermission";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.android] = {
            vs: "4.5.0"
        },
            o)),
            t.checkPermission$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.getNetworkType$ = void 0;
        var a = n(0)
            , r = "device.connection.getNetworkType";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.getNetworkType$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.getWifiStatus$ = void 0;
        var a = n(0)
            , r = "device.base.getWifiStatus";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.11.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.11.0"
            },
            o)),
            t.getWifiStatus$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.getUUID$ = void 0;
        var a = n(0)
            , r = "device.base.getUUID";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o[a.ENV_ENUM.pc] = {
                vs: "4.7.6"
            },
            o)),
            t.getUUID$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.getPhoneInfo$ = void 0;
        var a = n(0)
            , r = "device.base.getPhoneInfo";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "3.5.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "3.5.0"
            },
            o)),
            t.getPhoneInfo$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.getInterface$ = void 0;
        var a = n(0)
            , r = "device.base.getInterface";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.getInterface$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.translateVoice$ = void 0;
        var a = n(0)
            , r = "device.audio.translateVoice";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.8.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.8.0"
            },
            o)),
            t.translateVoice$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.stopRecord$ = void 0;
        var a = n(0)
            , r = "device.audio.stopRecord";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.8.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.8.0"
            },
            o)),
            t.stopRecord$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.stop$ = void 0;
        var a = n(0)
            , r = "device.audio.stop";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.8.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.8.0"
            },
            o)),
            t.stop$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.startRecord$ = void 0;
        var a = n(0)
            , r = "device.audio.startRecord";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.8.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.8.0"
            },
            o)),
            t.startRecord$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.resume$ = void 0;
        var a = n(0)
            , r = "device.audio.resume";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.8.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.8.0"
            },
            o)),
            t.resume$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.play$ = void 0;
        var a = n(0)
            , r = "device.audio.play";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.8.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.8.0"
            },
            o)),
            t.play$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.pause$ = void 0;
        var a = n(0)
            , r = "device.audio.pause";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.8.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.8.0"
            },
            o)),
            t.pause$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.onRecordEnd$ = void 0;
        var a = n(0)
            , r = "device.audio.onRecordEnd";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.8.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.8.0"
            },
            o)),
            t.onRecordEnd$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.onPlayEnd$ = void 0;
        var a = n(0)
            , r = "device.audio.onPlayEnd";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.8.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.8.0"
            },
            o)),
            t.onPlayEnd$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.download$ = void 0;
        var a = n(0)
            , r = "device.audio.download";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.8.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.8.0"
            },
            o)),
            t.download$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(s, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.watchShake$ = void 0;
        var a = n(0)
            , r = n(2)
            , s = "device.accelerometer.watchShake";
        a.ddSdk.setAPI(s, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0",
            paramsDeal: function(e) {
                return r.forceChangeParamsDealFn({
                    sensitivity: 3.2
                })(r.addWatchParamsDeal(e))
            }
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0",
                paramsDeal: r.addWatchParamsDeal
            },
            o)),
            t.watchShake$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.clearShake$ = void 0;
        var a = n(0)
            , r = "device.accelerometer.clearShake";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.clearShake$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.requestAuthCode$ = void 0;
        var a = n(0)
            , r = "channel.permission.requestAuthCode";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "3.0.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "3.0.0"
            },
            o)),
            t.requestAuthCode$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.startAuth$ = void 0;
        var a = n(0)
            , r = "biz.verify.startAuth";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.5.21"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.5.21"
            },
            o)),
            t.startAuth$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.openBindIDCard$ = void 0;
        var a = n(0)
            , r = "biz.verify.openBindIDCard";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.5.21"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.5.21"
            },
            o)),
            t.openBindIDCard$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.ut$ = void 0;
        var a = n(0)
            , r = "biz.util.ut"
            , s = function(e) {
            var t = Object.assign({}, e)
                , n = t.value
                , i = [];
            if (n && "object" == typeof n) {
                for (var o in n)
                    n[o] && i.push(o + "=" + n[o]);
                n = i.join(",")
            }
            return t.value = n || "",
                t
        };
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "3.5.0",
            paramsDeal: s
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.4.0",
                paramsDeal: function(e) {
                    var t = Object.assign({}, e)
                        , n = t.value;
                    return n && "object" == typeof n && (n = JSON.stringify(n)),
                        t.value = n,
                        t
                }
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o)),
            t.ut$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.uploadImageFromCamera$ = void 0;
        var a = n(0)
            , r = "biz.util.uploadImageFromCamera";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.uploadImageFromCamera$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.uploadImage$ = void 0;
        var a = n(0)
            , r = "biz.util.uploadImage"
            , s = n(2).genDefaultParamsDealFn({
            multiple: !1
        });
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "2.5.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o)),
            t.uploadImage$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.uploadAttachment$ = void 0;
        var a = n(0)
            , r = "biz.util.uploadAttachment";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "3.0.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.7.0"
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.7.0"
            },
            o)),
            t.uploadAttachment$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.timepicker$ = void 0;
        var a = n(0)
            , r = "biz.util.timepicker";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.timepicker$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.systemShare$ = void 0;
        var a = n(0)
            , r = "biz.util.systemShare";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.5.11"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.5.11"
            },
            o)),
            t.systemShare$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.startDocSign$ = void 0;
        var a = n(0)
            , r = "biz.util.startDocSign";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.android] = {
            vs: "4.6.33"
        },
            o)),
            t.startDocSign$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.shareImage$ = void 0;
        var a = n(0)
            , r = "biz.util.shareImage";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.1"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.1"
            },
            o)),
            t.shareImage$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.share$ = void 0;
        var a = n(0)
            , r = "biz.util.share"
            , s = n(2).genDefaultParamsDealFn({
            title: "",
            buttonName: "确定"
        });
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0",
            paramsDeal: s
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o[a.ENV_ENUM.pc] = {
                vs: "4.6.37",
                paramsDeal: s
            },
            o)),
            t.share$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.setScreenBrightnessAndKeepOn$ = void 0;
        var a = n(0)
            , r = "biz.util.setScreenBrightnessAndKeepOn";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.6.37"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.3.3"
            },
            o)),
            t.setScreenBrightnessAndKeepOn$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.scanCard$ = void 0;
        var a = n(0)
            , r = "biz.util.scanCard";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.8.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.8.0"
            },
            o)),
            t.scanCard$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.scan$ = void 0;
        var a = n(0)
            , r = "biz.util.scan"
            , s = n(2).genDefaultParamsDealFn({
            type: "qrCode"
        });
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0",
            paramsDeal: s
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o)),
            t.scan$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.saveImage$ = void 0;
        var a = n(0)
            , r = "biz.util.saveImage";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.1"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.1"
            },
            o)),
            t.saveImage$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.previewVideo$ = void 0;
        var a = n(0)
            , r = "biz.util.previewVideo";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.3.7"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.3.7"
            },
            o[a.ENV_ENUM.pc] = {
                vs: "4.6.33"
            },
            o)),
            t.previewVideo$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.previewImage$ = void 0;
        var a = n(0)
            , r = "biz.util.previewImage";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "2.7.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.4.0"
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.previewImage$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.presentWindow$ = void 0;
        var a = n(0)
            , r = "biz.util.presentWindow";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.8.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.8.0"
            },
            o)),
            t.presentWindow$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.openSlidePanel$ = void 0;
        var a = n(0)
            , r = "biz.util.openSlidePanel";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "2.5.0"
        },
            o)),
            t.openSlidePanel$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.openModal$ = void 0;
        var a = n(0)
            , r = "biz.util.openModal";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "2.5.0"
        },
            o)),
            t.openModal$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.openLocalFile$ = void 0;
        var a = n(0)
            , r = "biz.util.openLocalFile";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "2.5.0"
        },
            o)),
            t.openLocalFile$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.openLink$ = void 0;
        var a = n(0)
            , r = "biz.util.openLink"
            , s = n(2).genDefaultParamsDealFn({
            credible: !0,
            showMenuBar: !0
        });
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "2.7.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o)),
            t.openLink$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.open$ = void 0;
        var a = n(0)
            , r = "biz.util.open";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "2.7.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.4.0"
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.open$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.multiSelect$ = void 0;
        var a = n(0)
            , r = "biz.util.multiSelect";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "3.0.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "3.0.0"
            },
            o)),
            t.multiSelect$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.isLocalFileExist$ = void 0;
        var a = n(0)
            , r = "biz.util.isLocalFileExist";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "2.5.0"
        },
            o)),
            t.isLocalFileExist$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.getPerfInfo$ = void 0;
        var a = n(0)
            , r = "biz.util.getPerfInfo";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "5.1.14"
        },
            o[a.ENV_ENUM.android] = {
                vs: "5.1.14"
            },
            o)),
            t.getPerfInfo$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.encrypt$ = void 0;
        var a = n(0)
            , r = "biz.util.encrypt";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "3.0.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.9.1"
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.9.1"
            },
            o)),
            t.encrypt$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.downloadFile$ = void 0;
        var a = n(0)
            , r = "biz.util.downloadFile";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "2.5.0"
        },
            o)),
            t.downloadFile$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.decrypt$ = void 0;
        var a = n(0)
            , r = "biz.util.decrypt";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "3.0.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.9.1"
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.9.1"
            },
            o)),
            t.decrypt$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.datetimepicker$ = void 0;
        var a = n(0)
            , r = "biz.util.datetimepicker";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.datetimepicker$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.datepicker$ = void 0;
        var a = n(0)
            , r = "biz.util.datepicker";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.datepicker$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.chosen$ = void 0;
        var a = n(0)
            , r = "biz.util.chosen";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.chosen$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.chooseImage$ = void 0;
        var a = n(0)
            , r = "biz.util.chooseImage";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "5.1.1"
        },
            o[a.ENV_ENUM.android] = {
                vs: "5.1.1"
            },
            o)),
            t.chooseImage$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.get$ = void 0;
        var a = n(0)
            , r = "biz.user.get";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "3.0.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.4.0"
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.get$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.checkPassword$ = void 0;
        var a = n(0)
            , r = "biz.user.checkPassword";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.5.8"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.5.8"
            },
            o)),
            t.checkPassword$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.showCallMenu$ = void 0;
        var a = n(0)
            , r = "biz.telephone.showCallMenu";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.8.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.8.0"
            },
            o)),
            t.showCallMenu$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.quickCallList$ = void 0;
        var a = n(0)
            , r = "biz.telephone.quickCallList";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "3.5.6"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "3.5.6"
            },
            o[a.ENV_ENUM.android] = {
                vs: "3.5.6"
            },
            o)),
            t.quickCallList$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.checkBizCall$ = void 0;
        var a = n(0)
            , r = "biz.telephone.checkBizCall";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "4.0.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "3.5.6"
            },
            o[a.ENV_ENUM.android] = {
                vs: "3.5.6"
            },
            o)),
            t.checkBizCall$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.call$ = void 0;
        var a = n(0)
            , r = "biz.telephone.call";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.call$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(s, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.inquiry$ = void 0;
        var a = n(0)
            , r = n(2)
            , s = "biz.store.inquiry";
        a.ddSdk.setAPI(s, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.3.7",
            paramsDeal: r.genBizStoreParamsDealFn
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.3.7",
                paramsDeal: r.genBizStoreParamsDealFn
            },
            o[a.ENV_ENUM.pc] = {
                vs: "4.5.3",
                paramsDeal: r.genBizStoreParamsDealFn
            },
            o)),
            t.inquiry$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(s, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.getPayUrl$ = void 0;
        var a = n(0)
            , r = n(2)
            , s = "biz.store.getPayUrl";
        a.ddSdk.setAPI(s, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.3.7",
            paramsDeal: r.genBizStoreParamsDealFn
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.3.7",
                paramsDeal: r.genBizStoreParamsDealFn
            },
            o[a.ENV_ENUM.pc] = {
                vs: "4.5.3",
                paramsDeal: r.genBizStoreParamsDealFn
            },
            o)),
            t.getPayUrl$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(s, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.createOrder$ = void 0;
        var a = n(0)
            , r = n(2)
            , s = "biz.store.createOrder";
        a.ddSdk.setAPI(s, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.3.7",
            paramsDeal: r.genBizStoreParamsDealFn
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.3.7",
                paramsDeal: r.genBizStoreParamsDealFn
            },
            o[a.ENV_ENUM.pc] = {
                vs: "4.5.3",
                paramsDeal: r.genBizStoreParamsDealFn
            },
            o)),
            t.createOrder$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(s, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.closeUnpayOrder$ = void 0;
        var a = n(0)
            , r = n(2)
            , s = "biz.store.closeUnpayOrder";
        a.ddSdk.setAPI(s, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.3.7",
            paramsDeal: r.genBizStoreParamsDealFn
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.3.7",
                paramsDeal: r.genBizStoreParamsDealFn
            },
            o[a.ENV_ENUM.pc] = {
                vs: "4.5.3",
                paramsDeal: r.genBizStoreParamsDealFn
            },
            o)),
            t.closeUnpayOrder$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.addShortCut$ = void 0;
        var a = n(0)
            , r = "biz.shortCut.addShortCut";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.android] = {
            vs: "4.7.32"
        },
            o)),
            t.addShortCut$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.unsubscribe$ = void 0;
        var a = n(0)
            , r = "biz.realm.unsubscribe";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.7.18"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.7.18"
            },
            o)),
            t.unsubscribe$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.subscribe$ = void 0;
        var a = n(0)
            , r = "biz.realm.subscribe";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.7.18"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.7.18"
            },
            o)),
            t.subscribe$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.stopMatchRuleFromPartner$ = void 0;
        var a = n(0)
            , r = "biz.pbp.stopMatchRuleFromPartner";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "5.1.10"
        },
            o[a.ENV_ENUM.android] = {
                vs: "5.1.10"
            },
            o)),
            t.stopMatchRuleFromPartner$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.startMatchRuleFromPartner$ = void 0;
        var a = n(0)
            , r = "biz.pbp.startMatchRuleFromPartner";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "5.1.10"
        },
            o[a.ENV_ENUM.android] = {
                vs: "5.1.10"
            },
            o)),
            t.startMatchRuleFromPartner$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.componentPunchFromPartner$ = void 0;
        var a = n(0)
            , r = "biz.pbp.componentPunchFromPartner";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "5.1.10"
        },
            o[a.ENV_ENUM.android] = {
                vs: "5.1.10"
            },
            o)),
            t.componentPunchFromPartner$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.setTitle$ = void 0;
        var a = n(0)
            , r = "biz.navigation.setTitle";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "2.5.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.4.0"
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.setTitle$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.setRight$ = void 0;
        var a = n(0)
            , r = "biz.navigation.setRight"
            , s = n(2).genDefaultParamsDealFn({
            watch: !0,
            show: !0,
            control: !1,
            showIcon: !0,
            text: ""
        });
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0",
            paramsDeal: s
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o)),
            t.setRight$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(s, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.setMenu$ = void 0;
        var a = n(0)
            , r = n(2)
            , s = "biz.navigation.setMenu";
        a.ddSdk.setAPI(s, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.6.0",
            paramsDeal: r.addWatchParamsDeal
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.6.0",
                paramsDeal: r.addWatchParamsDeal
            },
            o)),
            t.setMenu$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.setLeft$ = void 0;
        var a = n(0)
            , r = "biz.navigation.setLeft"
            , s = n(2).genDefaultParamsDealFn({
            watch: !0,
            show: !0,
            control: !1,
            showIcon: !0,
            text: ""
        });
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "2.5.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o)),
            t.setLeft$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.setIcon$ = void 0;
        var a = n(0)
            , r = "biz.navigation.setIcon"
            , s = n(2).genDefaultParamsDealFn({
            watch: !0,
            showIcon: !0,
            iconIndex: 1
        });
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0",
            paramsDeal: s
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o)),
            t.setIcon$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.replace$ = void 0;
        var a = n(0)
            , r = "biz.navigation.replace";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "3.4.6"
        },
            o[a.ENV_ENUM.android] = {
                vs: "3.4.6"
            },
            o)),
            t.replace$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.quit$ = void 0;
        var a = n(0)
            , r = "biz.navigation.quit";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "2.5.0"
        },
            o)),
            t.quit$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.hideBar$ = void 0;
        var a = n(0)
            , r = "biz.navigation.hideBar";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "3.5.6"
        },
            o[a.ENV_ENUM.android] = {
                vs: "3.5.6"
            },
            o)),
            t.hideBar$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.goBack$ = void 0;
        var a = n(0)
            , r = "biz.navigation.goBack";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.6.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.6.0"
            },
            o)),
            t.goBack$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.close$ = void 0;
        var a = n(0)
            , r = "biz.navigation.close";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o[a.ENV_ENUM.pc] = {
                vs: "4.3.5"
            },
            o)),
            t.close$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.openApp$ = void 0;
        var a = n(0)
            , r = "biz.microApp.openApp";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.5.6"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.5.6"
            },
            o)),
            t.openApp$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.compressVideo$ = void 0;
        var a = n(0)
            , r = "biz.media.compressVideo";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.6.37"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.6.37"
            },
            o)),
            t.compressVideo$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.view$ = void 0;
        var a = n(0)
            , r = "biz.map.view";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.8.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.8.0"
            },
            o)),
            t.view$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.search$ = void 0;
        var a = n(0)
            , r = "biz.map.search"
            , s = n(2).genDefaultParamsDealFn({
            scope: 500
        });
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0",
            paramsDeal: s
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o)),
            t.search$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.locate$ = void 0;
        var a = n(0)
            , r = "biz.map.locate";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.locate$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.startUnifiedLive$ = void 0;
        var a = n(0)
            , r = "biz.live.startUnifiedLive";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "5.1.18"
        },
            o)),
            t.startUnifiedLive$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.startClassRoom$ = void 0;
        var a = n(0)
            , r = "biz.live.startClassRoom";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "5.1.19"
        },
            o)),
            t.startClassRoom$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.unbind$ = void 0;
        var a = n(0)
            , r = "biz.iot.unbind";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.6.34"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.6.34"
            },
            o)),
            t.unbind$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.setDeviceProperties$ = void 0;
        var a = n(0)
            , r = "biz.iot.setDeviceProperties";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.6.42"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.6.42"
            },
            o)),
            t.setDeviceProperties$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.queryMeetingRoomList$ = void 0;
        var a = n(0)
            , r = "biz.iot.queryMeetingRoomList";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.6.34"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.6.34"
            },
            o)),
            t.queryMeetingRoomList$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.invokeThingService$ = void 0;
        var a = n(0)
            , r = "biz.iot.invokeThingService";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.6.42"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.6.42"
            },
            o)),
            t.invokeThingService$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.getDeviceProperties$ = void 0;
        var a = n(0)
            , r = "biz.iot.getDeviceProperties";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.6.42"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.6.42"
            },
            o)),
            t.getDeviceProperties$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.bindMeetingRoom$ = void 0;
        var a = n(0)
            , r = "biz.iot.bindMeetingRoom";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.6.34"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.6.34"
            },
            o)),
            t.bindMeetingRoom$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.bind$ = void 0;
        var a = n(0)
            , r = "biz.iot.bind";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.6.34"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.6.34"
            },
            o)),
            t.bind$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.fetchData$ = void 0;
        var a = n(0)
            , r = "biz.intent.fetchData";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.7.6"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.7.6"
            },
            o)),
            t.fetchData$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.notifyWeex$ = void 0;
        var a = n(0)
            , r = "biz.event.notifyWeex";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.5.0"
        },
            o)),
            t.notifyWeex$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.post$ = void 0;
        var a = n(0)
            , r = "biz.ding.post";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "3.0.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.4.0"
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o)),
            t.post$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.create$ = void 0;
        var a = n(0)
            , r = "biz.ding.create";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "3.5.1",
            resultDeal: function(e) {
                return "" === e ? e = {
                    dingCreateResult: !1
                } : "object" == typeof e && (e.dingCreateResult = !!e.dingCreateResult),
                    e
            }
        },
            o[a.ENV_ENUM.android] = {
                vs: "3.5.1"
            },
            o[a.ENV_ENUM.pc] = {
                vs: "4.5.9"
            },
            o)),
            t.create$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.multipleChoose$ = void 0;
        var a = n(0)
            , r = "biz.customContact.multipleChoose"
            , s = n(2).genDefaultParamsDealFn({
            isShowCompanyName: !1,
            max: 50
        });
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "3.0.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o)),
            t.multipleChoose$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.choose$ = void 0;
        var a = n(0)
            , r = "biz.customContact.choose"
            , s = n(2).genDefaultParamsDealFn({
            isShowCompanyName: !1,
            max: 50
        });
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "3.0.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.5.2",
                paramsDeal: s
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.5.2",
                paramsDeal: s
            },
            o)),
            t.choose$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.saveFile$ = void 0;
        var a = n(0)
            , r = "biz.cspace.saveFile";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.7.6"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.7.6"
            },
            o)),
            t.saveFile$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.preview$ = void 0;
        var a = n(0)
            , r = "biz.cspace.preview";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "3.0.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.7.0"
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.7.0"
            },
            o)),
            t.preview$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.delete$ = void 0;
        var a = n(0)
            , r = "biz.cspace.delete";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.5.21"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.5.21"
            },
            o[a.ENV_ENUM.pc] = {
                vs: "4.5.21"
            },
            o)),
            t.delete$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.chooseSpaceDir$ = void 0;
        var a = n(0)
            , r = "biz.cspace.chooseSpaceDir";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "3.5.6"
        },
            o[a.ENV_ENUM.android] = {
                vs: "3.5.6"
            },
            o[a.ENV_ENUM.pc] = {
                vs: "5.1.27"
            },
            o)),
            t.chooseSpaceDir$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.setRule$ = void 0;
        var a = n(0)
            , r = "biz.contact.setRule";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.15"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.15"
            },
            o)),
            t.setRule$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.externalEditForm$ = void 0;
        var a = n(0)
            , r = "biz.contact.externalEditForm";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "3.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "3.0"
            },
            o)),
            t.externalEditForm$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.externalComplexPicker$ = void 0;
        var a = n(0)
            , r = "biz.contact.externalComplexPicker";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "3.0.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "3.0"
            },
            o[a.ENV_ENUM.android] = {
                vs: "3.0"
            },
            o)),
            t.externalComplexPicker$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.departmentsPicker$ = void 0;
        var a = n(0)
            , r = "biz.contact.departmentsPicker";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "4.2.5"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "3.0"
            },
            o[a.ENV_ENUM.android] = {
                vs: "3.0"
            },
            o)),
            t.departmentsPicker$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.createGroup$ = void 0;
        var a = n(0)
            , r = "biz.contact.createGroup";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0"
            },
            o[a.ENV_ENUM.pc] = {
                vs: "4.6.1"
            },
            o)),
            t.createGroup$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.complexPicker$ = void 0;
        var a = n(0)
            , r = "biz.contact.complexPicker";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.9.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.9.0"
            },
            o[a.ENV_ENUM.pc] = {
                vs: "4.3.5"
            },
            o)),
            t.complexPicker$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.chooseMobileContacts$ = void 0;
        var a = n(0)
            , r = "biz.contact.chooseMobileContacts";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "3.1"
        },
            o[a.ENV_ENUM.android] = {
                vs: "3.1"
            },
            o)),
            t.chooseMobileContacts$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.choose$ = void 0;
        var a = n(0)
            , r = "biz.contact.choose"
            , s = n(2).genDefaultParamsDealFn({
            multiple: !0,
            startWithDepartmentId: 0,
            users: []
        });
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.pc] = {
            vs: "2.5.0"
        },
            o[a.ENV_ENUM.ios] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.0",
                paramsDeal: s
            },
            o)),
            t.choose$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.videoConfCall$ = void 0;
        var a = n(0)
            , r = "biz.conference.videoConfCall";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "5.0.8"
        },
            o[a.ENV_ENUM.android] = {
                vs: "5.0.8"
            },
            o[a.ENV_ENUM.pc] = {
                vs: "5.1.28"
            },
            o)),
            t.videoConfCall$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.setData$ = void 0;
        var a = n(0)
            , r = "biz.clipboardData.setData";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.7.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.7.0"
            },
            o[a.ENV_ENUM.pc] = {
                vs: "4.6.1"
            },
            o)),
            t.setData$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.toConversation$ = void 0;
        var a = n(0)
            , r = "biz.chat.toConversation";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.6.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.6.0"
            },
            o)),
            t.toConversation$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.sendEmotion$ = void 0;
        var a = n(0)
            , r = "biz.chat.sendEmotion";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.6.12"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.6.12"
            },
            o)),
            t.sendEmotion$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.pickConversation$ = void 0;
        var a = n(0)
            , r = "biz.chat.pickConversation";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.4.2"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.4.2"
            },
            o[a.ENV_ENUM.pc] = {
                vs: "4.7.9"
            },
            o)),
            t.pickConversation$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.openSingleChat$ = void 0;
        var a = n(0)
            , r = "biz.chat.openSingleChat";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "3.4.10"
        },
            o[a.ENV_ENUM.android] = {
                vs: "3.4.10"
            },
            o)),
            t.openSingleChat$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.locationChatMessage$ = void 0;
        var a = n(0)
            , r = "biz.chat.locationChatMessage";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.7.6"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.7.6"
            },
            o)),
            t.locationChatMessage$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.getRealmCid$ = void 0;
        var a = n(0)
            , r = "biz.chat.getRealmCid";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.7.12"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.7.12"
            },
            o[a.ENV_ENUM.pc] = {
                vs: "4.7.12"
            },
            o)),
            t.getRealmCid$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.createSceneGroup$ = void 0;
        var a = n(0)
            , r = "biz.chat.createSceneGroup";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.7.17"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.7.17"
            },
            o[a.ENV_ENUM.pc] = {
                vs: "4.7.17"
            },
            o)),
            t.createSceneGroup$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.collectSticker$ = void 0;
        var a = n(0)
            , r = "biz.chat.collectSticker";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "4.6.25"
        },
            o[a.ENV_ENUM.android] = {
                vs: "4.6.25"
            },
            o)),
            t.collectSticker$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.chooseConversationByCorpId$ = void 0;
        var a = n(0)
            , r = "biz.chat.chooseConversationByCorpId"
            , s = n(2).genDefaultParamsDealFn({
            max: 50
        });
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.6.0",
            paramsDeal: s
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.6.0",
                paramsDeal: s
            },
            o[a.ENV_ENUM.pc] = {
                vs: "4.7.11",
                paramsDeal: s
            },
            o)),
            t.chooseConversationByCorpId$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(s, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.chooseOneDay$ = void 0;
        var a = n(0)
            , r = n(2)
            , s = "biz.calendar.chooseOneDay";
        a.ddSdk.setAPI(s, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "3.5.0",
            paramsDeal: r.addDefaultCorpIdParamsDeal
        },
            o[a.ENV_ENUM.android] = {
                vs: "3.5.0",
                paramsDeal: r.addDefaultCorpIdParamsDeal
            },
            o)),
            t.chooseOneDay$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(s, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.chooseInterval$ = void 0;
        var a = n(0)
            , r = n(2)
            , s = "biz.calendar.chooseInterval";
        a.ddSdk.setAPI(s, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "3.5.0",
            paramsDeal: r.addDefaultCorpIdParamsDeal
        },
            o[a.ENV_ENUM.android] = {
                vs: "3.5.0",
                paramsDeal: r.addDefaultCorpIdParamsDeal
            },
            o)),
            t.chooseInterval$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(s, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.chooseHalfDay$ = void 0;
        var a = n(0)
            , r = n(2)
            , s = "biz.calendar.chooseHalfDay";
        a.ddSdk.setAPI(s, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "3.5.0",
            paramsDeal: r.addDefaultCorpIdParamsDeal
        },
            o[a.ENV_ENUM.android] = {
                vs: "3.5.0",
                paramsDeal: r.addDefaultCorpIdParamsDeal
            },
            o)),
            t.chooseHalfDay$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(s, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.chooseDateTime$ = void 0;
        var a = n(0)
            , r = n(2)
            , s = "biz.calendar.chooseDateTime";
        a.ddSdk.setAPI(s, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "3.5.0",
            paramsDeal: r.addDefaultCorpIdParamsDeal
        },
            o[a.ENV_ENUM.android] = {
                vs: "3.5.0",
                paramsDeal: r.addDefaultCorpIdParamsDeal
            },
            o)),
            t.chooseDateTime$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.requestAuthInfo$ = void 0;
        var a = n(0)
            , r = "biz.auth.requestAuthInfo";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "5.1.19"
        },
            o[a.ENV_ENUM.android] = {
                vs: "5.1.19"
            },
            o)),
            t.requestAuthInfo$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.pay$ = void 0;
        var a = n(0)
            , r = "biz.alipay.pay";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "2.8.0"
        },
            o[a.ENV_ENUM.android] = {
                vs: "2.8.0"
            },
            o)),
            t.pay$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.punchModePicker$ = void 0;
        var a = n(0)
            , r = "biz.ATMBle.punchModePicker";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "5.0.7"
        },
            o[a.ENV_ENUM.android] = {
                vs: "5.0.7"
            },
            o)),
            t.punchModePicker$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.faceManager$ = void 0;
        var a = n(0)
            , r = "biz.ATMBle.faceManager";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "5.0.7"
        },
            o[a.ENV_ENUM.android] = {
                vs: "5.0.7"
            },
            o)),
            t.faceManager$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.detectFaceFullScreen$ = void 0;
        var a = n(0)
            , r = "biz.ATMBle.detectFaceFullScreen";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "5.1.18"
        },
            o[a.ENV_ENUM.android] = {
                vs: "5.1.18"
            },
            o)),
            t.detectFaceFullScreen$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.detectFace$ = void 0;
        var a = n(0)
            , r = "biz.ATMBle.detectFace";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "5.1.18"
        },
            o[a.ENV_ENUM.android] = {
                vs: "5.1.18"
            },
            o)),
            t.detectFace$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return a.ddSdk.invokeAPI(r, e)
        }
        var o;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.beaconPicker$ = void 0;
        var a = n(0)
            , r = "biz.ATMBle.beaconPicker";
        a.ddSdk.setAPI(r, ((o = {})[a.ENV_ENUM.ios] = {
            vs: "5.0.7"
        },
            o[a.ENV_ENUM.android] = {
                vs: "5.0.7"
            },
            o)),
            t.beaconPicker$ = i,
            t.default = i
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.apiObj = void 0;
        var i = n(329)
            , o = n(328)
            , a = n(327)
            , r = n(326)
            , s = n(325)
            , c = n(324)
            , d = n(323)
            , l = n(322)
            , u = n(321)
            , f = n(320)
            , p = n(319)
            , m = n(318)
            , h = n(317)
            , v = n(316)
            , g = n(315)
            , _ = n(314)
            , w = n(313)
            , b = n(312)
            , y = n(311)
            , k = n(310)
            , x = n(309)
            , E = n(308)
            , P = n(307)
            , S = n(306)
            , N = n(305)
            , I = n(304)
            , C = n(303)
            , A = n(302)
            , M = n(301)
            , U = n(300)
            , O = n(299)
            , j = n(298)
            , T = n(297)
            , V = n(296)
            , L = n(295)
            , D = n(294)
            , $ = n(293)
            , R = n(292)
            , F = n(291)
            , z = n(290)
            , B = n(289)
            , W = n(288)
            , H = n(287)
            , q = n(286)
            , Q = n(285)
            , G = n(284)
            , K = n(283)
            , Y = n(282)
            , J = n(281)
            , X = n(280)
            , Z = n(279)
            , ee = n(278)
            , te = n(277)
            , ne = n(276)
            , ie = n(275)
            , oe = n(274)
            , ae = n(273)
            , re = n(272)
            , se = n(271)
            , ce = n(270)
            , de = n(269)
            , le = n(268)
            , ue = n(267)
            , fe = n(266)
            , pe = n(265)
            , me = n(264)
            , he = n(263)
            , ve = n(262)
            , ge = n(261)
            , _e = n(260)
            , we = n(259)
            , be = n(258)
            , ye = n(257)
            , ke = n(256)
            , xe = n(255)
            , Ee = n(254)
            , Pe = n(253)
            , Se = n(252)
            , Ne = n(251)
            , Ie = n(250)
            , Ce = n(249)
            , Ae = n(248)
            , Me = n(247)
            , Ue = n(246)
            , Oe = n(245)
            , je = n(244)
            , Te = n(243)
            , Ve = n(242)
            , Le = n(241)
            , De = n(240)
            , $e = n(239)
            , Re = n(238)
            , Fe = n(237)
            , ze = n(236)
            , Be = n(235)
            , We = n(234)
            , He = n(233)
            , qe = n(232)
            , Qe = n(231)
            , Ge = n(230)
            , Ke = n(229)
            , Ye = n(228)
            , Je = n(227)
            , Xe = n(226)
            , Ze = n(225)
            , et = n(224)
            , tt = n(223)
            , nt = n(222)
            , it = n(221)
            , ot = n(220)
            , at = n(219)
            , rt = n(218)
            , st = n(217)
            , ct = n(216)
            , dt = n(215)
            , lt = n(214)
            , ut = n(213)
            , ft = n(212)
            , pt = n(211)
            , mt = n(210)
            , ht = n(209)
            , vt = n(208)
            , gt = n(207)
            , _t = n(206)
            , wt = n(205)
            , bt = n(204)
            , yt = n(203)
            , kt = n(202)
            , xt = n(201)
            , Et = n(200)
            , Pt = n(199)
            , St = n(198)
            , Nt = n(197)
            , It = n(196)
            , Ct = n(195)
            , At = n(194)
            , Mt = n(193)
            , Ut = n(192)
            , Ot = n(191)
            , jt = n(190)
            , Tt = n(189)
            , Vt = n(188)
            , Lt = n(187)
            , Dt = n(186)
            , $t = n(185)
            , Rt = n(184)
            , Ft = n(183)
            , zt = n(182)
            , Bt = n(181)
            , Wt = n(180)
            , Ht = n(179)
            , qt = n(178)
            , Qt = n(177)
            , Gt = n(176)
            , Kt = n(175)
            , Yt = n(174)
            , Jt = n(173)
            , Xt = n(172)
            , Zt = n(171)
            , en = n(170)
            , tn = n(169)
            , nn = n(168)
            , on = n(167)
            , an = n(166)
            , rn = n(165)
            , sn = n(164)
            , cn = n(163)
            , dn = n(162)
            , ln = n(161)
            , un = n(160)
            , fn = n(159)
            , pn = n(158)
            , mn = n(157)
            , hn = n(156)
            , vn = n(155)
            , gn = n(154)
            , _n = n(153)
            , wn = n(152);
        t.apiObj = {
            biz: {
                ATMBle: {
                    beaconPicker: i.beaconPicker$,
                    detectFace: o.detectFace$,
                    detectFaceFullScreen: a.detectFaceFullScreen$,
                    faceManager: r.faceManager$,
                    punchModePicker: s.punchModePicker$
                },
                alipay: {
                    pay: c.pay$
                },
                auth: {
                    requestAuthInfo: d.requestAuthInfo$
                },
                calendar: {
                    chooseDateTime: l.chooseDateTime$,
                    chooseHalfDay: u.chooseHalfDay$,
                    chooseInterval: f.chooseInterval$,
                    chooseOneDay: p.chooseOneDay$
                },
                chat: {
                    chooseConversationByCorpId: m.chooseConversationByCorpId$,
                    collectSticker: h.collectSticker$,
                    createSceneGroup: v.createSceneGroup$,
                    getRealmCid: g.getRealmCid$,
                    locationChatMessage: _.locationChatMessage$,
                    openSingleChat: w.openSingleChat$,
                    pickConversation: b.pickConversation$,
                    sendEmotion: y.sendEmotion$,
                    toConversation: k.toConversation$
                },
                clipboardData: {
                    setData: x.setData$
                },
                conference: {
                    videoConfCall: E.videoConfCall$
                },
                contact: {
                    choose: P.choose$,
                    chooseMobileContacts: S.chooseMobileContacts$,
                    complexPicker: N.complexPicker$,
                    createGroup: I.createGroup$,
                    departmentsPicker: C.departmentsPicker$,
                    externalComplexPicker: A.externalComplexPicker$,
                    externalEditForm: M.externalEditForm$,
                    setRule: U.setRule$
                },
                cspace: {
                    chooseSpaceDir: O.chooseSpaceDir$,
                    delete: j.delete$,
                    preview: T.preview$,
                    saveFile: V.saveFile$
                },
                customContact: {
                    choose: L.choose$,
                    multipleChoose: D.multipleChoose$
                },
                ding: {
                    create: $.create$,
                    post: R.post$
                },
                event: {
                    notifyWeex: F.notifyWeex$
                },
                intent: {
                    fetchData: z.fetchData$
                },
                iot: {
                    bind: B.bind$,
                    bindMeetingRoom: W.bindMeetingRoom$,
                    getDeviceProperties: H.getDeviceProperties$,
                    invokeThingService: q.invokeThingService$,
                    queryMeetingRoomList: Q.queryMeetingRoomList$,
                    setDeviceProperties: G.setDeviceProperties$,
                    unbind: K.unbind$
                },
                live: {
                    startClassRoom: Y.startClassRoom$,
                    startUnifiedLive: J.startUnifiedLive$
                },
                map: {
                    locate: X.locate$,
                    search: Z.search$,
                    view: ee.view$
                },
                media: {
                    compressVideo: te.compressVideo$
                },
                microApp: {
                    openApp: ne.openApp$
                },
                navigation: {
                    close: ie.close$,
                    goBack: oe.goBack$,
                    hideBar: ae.hideBar$,
                    quit: re.quit$,
                    replace: se.replace$,
                    setIcon: ce.setIcon$,
                    setLeft: de.setLeft$,
                    setMenu: le.setMenu$,
                    setRight: ue.setRight$,
                    setTitle: fe.setTitle$
                },
                pbp: {
                    componentPunchFromPartner: pe.componentPunchFromPartner$,
                    startMatchRuleFromPartner: me.startMatchRuleFromPartner$,
                    stopMatchRuleFromPartner: he.stopMatchRuleFromPartner$
                },
                realm: {
                    subscribe: ve.subscribe$,
                    unsubscribe: ge.unsubscribe$
                },
                shortCut: {
                    addShortCut: _e.addShortCut$
                },
                store: {
                    closeUnpayOrder: we.closeUnpayOrder$,
                    createOrder: be.createOrder$,
                    getPayUrl: ye.getPayUrl$,
                    inquiry: ke.inquiry$
                },
                telephone: {
                    call: xe.call$,
                    checkBizCall: Ee.checkBizCall$,
                    quickCallList: Pe.quickCallList$,
                    showCallMenu: Se.showCallMenu$
                },
                user: {
                    checkPassword: Ne.checkPassword$,
                    get: Ie.get$
                },
                util: {
                    chooseImage: Ce.chooseImage$,
                    chosen: Ae.chosen$,
                    datepicker: Me.datepicker$,
                    datetimepicker: Ue.datetimepicker$,
                    decrypt: Oe.decrypt$,
                    downloadFile: je.downloadFile$,
                    encrypt: Te.encrypt$,
                    getPerfInfo: Ve.getPerfInfo$,
                    isLocalFileExist: Le.isLocalFileExist$,
                    multiSelect: De.multiSelect$,
                    open: $e.open$,
                    openLink: Re.openLink$,
                    openLocalFile: Fe.openLocalFile$,
                    openModal: ze.openModal$,
                    openSlidePanel: Be.openSlidePanel$,
                    presentWindow: We.presentWindow$,
                    previewImage: He.previewImage$,
                    previewVideo: qe.previewVideo$,
                    saveImage: Qe.saveImage$,
                    scan: Ge.scan$,
                    scanCard: Ke.scanCard$,
                    setScreenBrightnessAndKeepOn: Ye.setScreenBrightnessAndKeepOn$,
                    share: Je.share$,
                    shareImage: Xe.shareImage$,
                    startDocSign: Ze.startDocSign$,
                    systemShare: et.systemShare$,
                    timepicker: tt.timepicker$,
                    uploadAttachment: nt.uploadAttachment$,
                    uploadImage: it.uploadImage$,
                    uploadImageFromCamera: ot.uploadImageFromCamera$,
                    ut: at.ut$
                },
                verify: {
                    openBindIDCard: rt.openBindIDCard$,
                    startAuth: st.startAuth$
                }
            },
            channel: {
                permission: {
                    requestAuthCode: ct.requestAuthCode$
                }
            },
            device: {
                accelerometer: {
                    clearShake: dt.clearShake$,
                    watchShake: lt.watchShake$
                },
                audio: {
                    download: ut.download$,
                    onPlayEnd: ft.onPlayEnd$,
                    onRecordEnd: pt.onRecordEnd$,
                    pause: mt.pause$,
                    play: ht.play$,
                    resume: vt.resume$,
                    startRecord: gt.startRecord$,
                    stop: _t.stop$,
                    stopRecord: wt.stopRecord$,
                    translateVoice: bt.translateVoice$
                },
                base: {
                    getInterface: yt.getInterface$,
                    getPhoneInfo: kt.getPhoneInfo$,
                    getUUID: xt.getUUID$,
                    getWifiStatus: Et.getWifiStatus$
                },
                connection: {
                    getNetworkType: Pt.getNetworkType$
                },
                geolocation: {
                    checkPermission: St.checkPermission$,
                    get: Nt.get$,
                    start: It.start$,
                    status: Ct.status$,
                    stop: At.stop$
                },
                launcher: {
                    checkInstalledApps: Mt.checkInstalledApps$,
                    launchApp: Ut.launchApp$
                },
                nfc: {
                    nfcRead: Ot.nfcRead$,
                    nfcStop: jt.nfcStop$,
                    nfcWrite: Tt.nfcWrite$
                },
                notification: {
                    actionSheet: Vt.actionSheet$,
                    alert: Lt.alert$,
                    confirm: Dt.confirm$,
                    extendModal: $t.extendModal$,
                    hidePreloader: Rt.hidePreloader$,
                    modal: Ft.modal$,
                    prompt: zt.prompt$,
                    showPreloader: Bt.showPreloader$,
                    toast: Wt.toast$,
                    vibrate: Ht.vibrate$
                },
                screen: {
                    insetAdjust: qt.insetAdjust$,
                    resetView: Qt.resetView$,
                    rotateView: Gt.rotateView$
                }
            },
            media: {
                voiceRecorder: {
                    keepAlive: Kt.keepAlive$,
                    pause: Yt.pause$,
                    resume: Jt.resume$,
                    start: Xt.start$
                }
            },
            net: {
                bjGovApn: {
                    loginGovNet: Zt.loginGovNet$
                }
            },
            runtime: {
                message: {
                    fetch: en.fetch$,
                    post: tn.post$
                },
                permission: {
                    requestAuthCode: nn.requestAuthCode$,
                    requestOperateAuthCode: on.requestOperateAuthCode$
                }
            },
            ui: {
                input: {
                    plain: an.plain$
                },
                nav: {
                    close: rn.close$,
                    getCurrentId: sn.getCurrentId$,
                    go: cn.go$,
                    preload: dn.preload$,
                    recycle: ln.recycle$
                },
                progressBar: {
                    setColors: un.setColors$
                },
                pullToRefresh: {
                    disable: fn.disable$,
                    enable: pn.enable$,
                    stop: mn.stop$
                },
                webViewBounce: {
                    disable: hn.disable$,
                    enable: vn.enable$
                }
            },
            util: {
                domainStorage: {
                    getItem: gn.getItem$,
                    removeItem: _n.removeItem$,
                    setItem: wn.setItem$
                }
            }
        }
    }
    , function(e, t, n) {
        "use strict";
        var i;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.h5IosBridgeInit = void 0,
            t.h5IosBridgeInit = function() {
                return i || (i = new Promise(function(e, t) {
                        if ("undefined" != typeof WebViewJavascriptBridge) {
                            try {
                                WebViewJavascriptBridge.init(function(e, t) {})
                            } catch (e) {
                                return t()
                            }
                            return e()
                        }
                        document.addEventListener("WebViewJavascriptBridgeReady", function() {
                            if ("undefined" == typeof WebViewJavascriptBridge)
                                return t();
                            try {
                                WebViewJavascriptBridge.init(function(e, t) {})
                            } catch (e) {
                                return t()
                            }
                            return e()
                        }, !1)
                    }
                )),
                    i
            }
        ;
        t.default = function(e, n) {
            return i || (i = t.h5IosBridgeInit()),
                i.then(function() {
                    var t = Object.assign({}, n);
                    return new Promise(function(n, i) {
                            if (!0 === t.watch) {
                                var o = t.onSuccess;
                                delete t.onSuccess,
                                "undefined" != typeof WebViewJavascriptBridge && WebViewJavascriptBridge.registerHandler(e, function(e, t) {
                                    "function" == typeof o && o.call(null, e),
                                    t && t({
                                        errorCode: "0",
                                        errorMessage: "success"
                                    })
                                })
                            }
                            void 0 !== window.WebViewJavascriptBridge && window.WebViewJavascriptBridge.callHandler(e, Object.assign({}, t), function(e) {
                                var o = e || {};
                                "0" === o.errorCode ? ("function" == typeof t.onSuccess && t.onSuccess.call(null, o.result),
                                    n(o.result)) : ("-1" === o.errorCode && "function" == typeof t.onCancel ? t.onCancel.call(null, o.result, o.errorCode) : "function" == typeof t.onFail && t.onFail.call(null, o.result, o.errorCode),
                                    i(o.result))
                            })
                        }
                    )
                })
        }
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        });
        var i = n(0)
            , o = n(12)
            , a = n(11)
            , r = n(26)
            , s = n(49)
            , c = n(331)
            , d = n(25)
            , l = n(48)
            , u = n(47);
        i.ddSdk.setPlatform({
            platform: o.ENV_ENUM.ios,
            bridgeInit: function() {
                var e = o.getENV();
                return e.appType === a.APP_TYPE.MINI_APP ? Promise.resolve(r.default) : e.appType === a.APP_TYPE.WEBVIEW_IN_MINIAPP ? Promise.resolve(s.default) : e.appType === a.APP_TYPE.WEEX ? d.iosWeexBridge() : c.h5IosBridgeInit().then(function() {
                    return c.default
                })
            },
            authMethod: "runtime.permission.requestJsApis",
            event: {
                on: function(e, t) {
                    var n = o.getENV();
                    switch (n.appType) {
                        case a.APP_TYPE.WEB:
                        case a.APP_TYPE.WEBVIEW_IN_MINIAPP:
                            l.on(e, t);
                            break;
                        case a.APP_TYPE.WEEX:
                            u.on(e, t);
                            break;
                        default:
                            throw new Error("Not support global event in the platfrom: " + n.appType)
                    }
                },
                off: function(e, t) {
                    var n = o.getENV();
                    switch (n.appType) {
                        case a.APP_TYPE.WEB:
                        case a.APP_TYPE.WEBVIEW_IN_MINIAPP:
                            l.off(e, t);
                            break;
                        case a.APP_TYPE.WEEX:
                            u.off(e, t);
                            break;
                        default:
                            throw new Error("Not support global event in the platfrom: " + n.appType)
                    }
                }
            }
        })
    }
    , function(e, t, n) {
        "use strict";
        var i;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.h5AndroidbridgeInit = void 0,
            t.h5AndroidbridgeInit = function() {
                return i || (i = new Promise(function(e, t) {
                        var n = function() {
                            try {
                                window.WebViewJavascriptBridgeAndroid = window.nuva && window.nuva.require(),
                                    e()
                            } catch (e) {
                                t(e)
                            }
                        };
                        window.nuva && (void 0 === window.nuva.isReady || window.nuva.isReady) ? n() : (document.addEventListener("runtimeready", function() {
                            n()
                        }, !1),
                            document.addEventListener("runtimefailed", function(e) {
                                var n = e && e.detail || {
                                    errorCode: "2",
                                    errorMessage: "unknown nuvajs bootstrap error"
                                };
                                t(n)
                            }, !1))
                    }
                )),
                    i
            }
        ;
        t.default = function(e, n) {
            return i || (i = t.h5AndroidbridgeInit()),
                i.then(function() {
                    return new Promise(function(t, i) {
                            var o = e.split(".")
                                , a = o.pop() || ""
                                , r = o.join(".");
                            "function" == typeof window.WebViewJavascriptBridgeAndroid && window.WebViewJavascriptBridgeAndroid(function(e) {
                                "function" == typeof n.onSuccess && n.onSuccess(e),
                                    t(e)
                            }, function(e) {
                                "function" == typeof n.onFail && n.onFail(e),
                                    i(e)
                            }, r, a, n)
                        }
                    )
                })
        }
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        });
        var i = n(0)
            , o = n(12)
            , a = n(11)
            , r = n(26)
            , s = n(49)
            , c = n(333)
            , d = n(25)
            , l = n(48)
            , u = n(47);
        i.ddSdk.setPlatform({
            platform: o.ENV_ENUM.android,
            bridgeInit: function() {
                var e = o.getENV();
                return e.appType === a.APP_TYPE.MINI_APP ? Promise.resolve(r.default) : e.appType === a.APP_TYPE.WEBVIEW_IN_MINIAPP ? Promise.resolve(s.default) : e.appType === a.APP_TYPE.WEEX ? d.androidWeexBridge() : c.h5AndroidbridgeInit().then(function() {
                    return c.default
                })
            },
            authMethod: "runtime.permission.requestJsApis",
            event: {
                on: function(e, t) {
                    var n = o.getENV();
                    switch (n.appType) {
                        case a.APP_TYPE.WEB:
                        case a.APP_TYPE.WEBVIEW_IN_MINIAPP:
                            l.on(e, t);
                            break;
                        case a.APP_TYPE.WEEX:
                            u.on(e, t);
                            break;
                        default:
                            throw new Error("Not support global event in the platfrom: " + n.appType)
                    }
                },
                off: function(e, t) {
                    var n = o.getENV();
                    switch (n.appType) {
                        case a.APP_TYPE.WEB:
                        case a.APP_TYPE.WEBVIEW_IN_MINIAPP:
                            l.off(e, t);
                            break;
                        case a.APP_TYPE.WEEX:
                            u.off(e, t);
                            break;
                        default:
                            throw new Error("Not support global event in the platfrom: " + n.appType)
                    }
                }
            }
        })
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.off = t.on = void 0,
            t.on = function(e, t) {
                n(18).addEventListener(e, t)
            }
            ,
            t.off = function(e, t) {
                n(18).removeEventListener(e, t)
            }
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.h5PcBridgeInit = void 0,
            t.h5PcBridgeInit = function() {
                return Promise.resolve(n(18))
            }
        ;
        t.default = function(e, t) {
            return new Promise(function(i, o) {
                    return n(18).invokeAPI(e, t).result.then(function(e) {
                        return "function" == typeof t.onSuccess && t.onSuccess.call(null, e),
                            i(e)
                    }, function(e) {
                        return "function" == typeof t.onFail && t.onFail.call(null, e),
                            o(e)
                    })
                }
            )
        }
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        });
        var i = n(0)
            , o = n(12)
            , a = n(336)
            , r = n(26)
            , s = n(11)
            , c = n(335);
        i.ddSdk.setPlatform({
            platform: o.ENV_ENUM.pc,
            bridgeInit: function() {
                switch (o.getENV().appType) {
                    case s.APP_TYPE.MINI_APP:
                        return Promise.resolve(r.default);
                    default:
                        return a.h5PcBridgeInit().then(function() {
                            return a.default
                        })
                }
            },
            authMethod: "config",
            authParamsDeal: function(e) {
                var t = Object.assign({}, e);
                return t.url = window.location.href.split("#")[0],
                    t
            },
            event: {
                on: function(e, t) {
                    if (o.getENV().appType === s.APP_TYPE.WEB)
                        return c.on(e, t)
                },
                off: function(e, t) {
                    if (o.getENV().appType === s.APP_TYPE.WEB)
                        return c.off(e, t)
                }
            }
        })
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            n(337),
            n(334),
            n(332)
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.version = t.language = t.compareVersion = t.other = t.pc = t.android = t.ios = void 0;
        var i = n(12)
            , o = i.getENV();
        t.ios = o.platform === i.ENV_ENUM.ios,
            t.android = o.platform === i.ENV_ENUM.android,
            t.pc = o.platform === i.ENV_ENUM.pc,
            t.other = o.platform === i.ENV_ENUM.notInDingTalk,
            t.compareVersion = function(e, t, n) {
                function i(e) {
                    return parseInt(e, 10) || 0
                }
                if ("string" != typeof e || "string" != typeof t)
                    return !1;
                for (var o, a, r = e.split("-")[0].split(".").map(i), s = t.split("-")[0].split(".").map(i); o === a && s.length > 0; )
                    o = r.shift(),
                        a = s.shift();
                return n ? (a || 0) >= (o || 0) : (a || 0) > (o || 0)
            }
            ,
            t.language = o.language,
            t.version = o.version
    }
    , function(e, t) {
        Object.keys || (Object.keys = function(e) {
                if (e !== Object(e))
                    throw new TypeError("Object.keys called on a non-object");
                var t, n = [];
                for (t in e)
                    Object.prototype.hasOwnProperty.call(e, t) && n.push(t);
                return n
            }
        )
    }
    , function(e, t) {
        "function" != typeof Object.assign && Object.defineProperty(Object, "assign", {
            value: function(e, t) {
                "use strict";
                if (null == e)
                    throw new TypeError("Cannot convert undefined or null to object");
                for (var n = Object(e), i = 1; i < arguments.length; i++) {
                    var o = arguments[i];
                    if (null != o)
                        for (var a in o)
                            Object.prototype.hasOwnProperty.call(o, a) && (n[a] = o[a])
                }
                return n
            },
            writable: !0,
            configurable: !0
        })
    }
    , function(e, t) {
        var n, i, o = e.exports = {};
        function a() {
            throw new Error("setTimeout has not been defined")
        }
        function r() {
            throw new Error("clearTimeout has not been defined")
        }
        function s(e) {
            if (n === setTimeout)
                return setTimeout(e, 0);
            if ((n === a || !n) && setTimeout)
                return n = setTimeout,
                    setTimeout(e, 0);
            try {
                return n(e, 0)
            } catch (t) {
                try {
                    return n.call(null, e, 0)
                } catch (t) {
                    return n.call(this, e, 0)
                }
            }
        }
        !function() {
            try {
                n = "function" == typeof setTimeout ? setTimeout : a
            } catch (e) {
                n = a
            }
            try {
                i = "function" == typeof clearTimeout ? clearTimeout : r
            } catch (e) {
                i = r
            }
        }();
        var c, d = [], l = !1, u = -1;
        function f() {
            l && c && (l = !1,
                c.length ? d = c.concat(d) : u = -1,
            d.length && p())
        }
        function p() {
            if (!l) {
                var e = s(f);
                l = !0;
                for (var t = d.length; t; ) {
                    for (c = d,
                             d = []; ++u < t; )
                        c && c[u].run();
                    u = -1,
                        t = d.length
                }
                c = null,
                    l = !1,
                    function(e) {
                        if (i === clearTimeout)
                            return clearTimeout(e);
                        if ((i === r || !i) && clearTimeout)
                            return i = clearTimeout,
                                clearTimeout(e);
                        try {
                            i(e)
                        } catch (t) {
                            try {
                                return i.call(null, e)
                            } catch (t) {
                                return i.call(this, e)
                            }
                        }
                    }(e)
            }
        }
        function m(e, t) {
            this.fun = e,
                this.array = t
        }
        function h() {}
        o.nextTick = function(e) {
            var t = new Array(arguments.length - 1);
            if (arguments.length > 1)
                for (var n = 1; n < arguments.length; n++)
                    t[n - 1] = arguments[n];
            d.push(new m(e,t)),
            1 !== d.length || l || s(p)
        }
            ,
            m.prototype.run = function() {
                this.fun.apply(null, this.array)
            }
            ,
            o.title = "browser",
            o.browser = !0,
            o.env = {},
            o.argv = [],
            o.version = "",
            o.versions = {},
            o.on = h,
            o.addListener = h,
            o.once = h,
            o.off = h,
            o.removeListener = h,
            o.removeAllListeners = h,
            o.emit = h,
            o.prependListener = h,
            o.prependOnceListener = h,
            o.listeners = function(e) {
                return []
            }
            ,
            o.binding = function(e) {
                throw new Error("process.binding is not supported")
            }
            ,
            o.cwd = function() {
                return "/"
            }
            ,
            o.chdir = function(e) {
                throw new Error("process.chdir is not supported")
            }
            ,
            o.umask = function() {
                return 0
            }
    }
    , function(e, t, n) {
        (function(e, t) {
                !function(e, n) {
                    "use strict";
                    if (!e.setImmediate) {
                        var i, o = 1, a = {}, r = !1, s = e.document, c = Object.getPrototypeOf && Object.getPrototypeOf(e);
                        c = c && c.setTimeout ? c : e,
                            "[object process]" === {}.toString.call(e.process) ? i = function(e) {
                                    t.nextTick(function() {
                                        l(e)
                                    })
                                }
                                : function() {
                                    if (e.postMessage && !e.importScripts) {
                                        var t = !0
                                            , n = e.onmessage;
                                        return e.onmessage = function() {
                                            t = !1
                                        }
                                            ,
                                            e.postMessage("", "*"),
                                            e.onmessage = n,
                                            t
                                    }
                                }() ? function() {
                                    var t = "setImmediate$" + Math.random() + "$"
                                        , n = function(n) {
                                        n.source === e && "string" == typeof n.data && 0 === n.data.indexOf(t) && l(+n.data.slice(t.length))
                                    };
                                    e.addEventListener ? e.addEventListener("message", n, !1) : e.attachEvent("onmessage", n),
                                        i = function(n) {
                                            e.postMessage(t + n, "*")
                                        }
                                }() : e.MessageChannel ? function() {
                                    var e = new MessageChannel;
                                    e.port1.onmessage = function(e) {
                                        l(e.data)
                                    }
                                        ,
                                        i = function(t) {
                                            e.port2.postMessage(t)
                                        }
                                }() : s && "onreadystatechange"in s.createElement("script") ? function() {
                                    var e = s.documentElement;
                                    i = function(t) {
                                        var n = s.createElement("script");
                                        n.onreadystatechange = function() {
                                            l(t),
                                                n.onreadystatechange = null,
                                                e.removeChild(n),
                                                n = null
                                        }
                                            ,
                                            e.appendChild(n)
                                    }
                                }() : i = function(e) {
                                    setTimeout(l, 0, e)
                                }
                            ,
                            c.setImmediate = function(e) {
                                "function" != typeof e && (e = new Function("" + e));
                                for (var t = new Array(arguments.length - 1), n = 0; n < t.length; n++)
                                    t[n] = arguments[n + 1];
                                var r = {
                                    callback: e,
                                    args: t
                                };
                                return a[o] = r,
                                    i(o),
                                    o++
                            }
                            ,
                            c.clearImmediate = d
                    }
                    function d(e) {
                        delete a[e]
                    }
                    function l(e) {
                        if (r)
                            setTimeout(l, 0, e);
                        else {
                            var t = a[e];
                            if (t) {
                                r = !0;
                                try {
                                    !function(e) {
                                        var t = e.callback
                                            , i = e.args;
                                        switch (i.length) {
                                            case 0:
                                                t();
                                                break;
                                            case 1:
                                                t(i[0]);
                                                break;
                                            case 2:
                                                t(i[0], i[1]);
                                                break;
                                            case 3:
                                                t(i[0], i[1], i[2]);
                                                break;
                                            default:
                                                t.apply(n, i)
                                        }
                                    }(t)
                                } finally {
                                    d(e),
                                        r = !1
                                }
                            }
                        }
                    }
                }("undefined" == typeof self ? void 0 === e ? this : e : self)
            }
        ).call(this, n(27), n(342))
    }
    , function(e, t, n) {
        (function(e) {
                var i = void 0 !== e && e || "undefined" != typeof self && self || window
                    , o = Function.prototype.apply;
                function a(e, t) {
                    this._id = e,
                        this._clearFn = t
                }
                t.setTimeout = function() {
                    return new a(o.call(setTimeout, i, arguments),clearTimeout)
                }
                    ,
                    t.setInterval = function() {
                        return new a(o.call(setInterval, i, arguments),clearInterval)
                    }
                    ,
                    t.clearTimeout = t.clearInterval = function(e) {
                        e && e.close()
                    }
                    ,
                    a.prototype.unref = a.prototype.ref = function() {}
                    ,
                    a.prototype.close = function() {
                        this._clearFn.call(i, this._id)
                    }
                    ,
                    t.enroll = function(e, t) {
                        clearTimeout(e._idleTimeoutId),
                            e._idleTimeout = t
                    }
                    ,
                    t.unenroll = function(e) {
                        clearTimeout(e._idleTimeoutId),
                            e._idleTimeout = -1
                    }
                    ,
                    t._unrefActive = t.active = function(e) {
                        clearTimeout(e._idleTimeoutId);
                        var t = e._idleTimeout;
                        t >= 0 && (e._idleTimeoutId = setTimeout(function() {
                            e._onTimeout && e._onTimeout()
                        }, t))
                    }
                    ,
                    n(343),
                    t.setImmediate = "undefined" != typeof self && self.setImmediate || void 0 !== e && e.setImmediate || this && this.setImmediate,
                    t.clearImmediate = "undefined" != typeof self && self.clearImmediate || void 0 !== e && e.clearImmediate || this && this.clearImmediate
            }
        ).call(this, n(27))
    }
    , function(e, t, n) {
        (function(e, t) {
                !function(e, t) {
                    t()
                }(0, function() {
                    "use strict";
                    var n = setTimeout;
                    function i() {}
                    function o(e) {
                        if (!(this instanceof o))
                            throw new TypeError("Promises must be constructed via new");
                        if ("function" != typeof e)
                            throw new TypeError("not a function");
                        this._state = 0,
                            this._handled = !1,
                            this._value = void 0,
                            this._deferreds = [],
                            d(e, this)
                    }
                    function a(e, t) {
                        for (; 3 === e._state; )
                            e = e._value;
                        0 !== e._state ? (e._handled = !0,
                            o._immediateFn(function() {
                                var n = 1 === e._state ? t.onFulfilled : t.onRejected;
                                if (null !== n) {
                                    var i;
                                    try {
                                        i = n(e._value)
                                    } catch (e) {
                                        return void s(t.promise, e)
                                    }
                                    r(t.promise, i)
                                } else
                                    (1 === e._state ? r : s)(t.promise, e._value)
                            })) : e._deferreds.push(t)
                    }
                    function r(e, t) {
                        try {
                            if (t === e)
                                throw new TypeError("A promise cannot be resolved with itself.");
                            if (t && ("object" == typeof t || "function" == typeof t)) {
                                var n = t.then;
                                if (t instanceof o)
                                    return e._state = 3,
                                        e._value = t,
                                        void c(e);
                                if ("function" == typeof n)
                                    return void d(function(e, t) {
                                        return function() {
                                            e.apply(t, arguments)
                                        }
                                    }(n, t), e)
                            }
                            e._state = 1,
                                e._value = t,
                                c(e)
                        } catch (t) {
                            s(e, t)
                        }
                    }
                    function s(e, t) {
                        e._state = 2,
                            e._value = t,
                            c(e)
                    }
                    function c(e) {
                        2 === e._state && 0 === e._deferreds.length && o._immediateFn(function() {
                            e._handled || o._unhandledRejectionFn(e._value)
                        });
                        for (var t = 0, n = e._deferreds.length; t < n; t++)
                            a(e, e._deferreds[t]);
                        e._deferreds = null
                    }
                    function d(e, t) {
                        var n = !1;
                        try {
                            e(function(e) {
                                n || (n = !0,
                                    r(t, e))
                            }, function(e) {
                                n || (n = !0,
                                    s(t, e))
                            })
                        } catch (e) {
                            if (n)
                                return;
                            n = !0,
                                s(t, e)
                        }
                    }
                    o.prototype.catch = function(e) {
                        return this.then(null, e)
                    }
                        ,
                        o.prototype.then = function(e, t) {
                            var n = new this.constructor(i);
                            return a(this, new function(e, t, n) {
                                this.onFulfilled = "function" == typeof e ? e : null,
                                    this.onRejected = "function" == typeof t ? t : null,
                                    this.promise = n
                            }
                            (e,t,n)),
                                n
                        }
                        ,
                        o.prototype.finally = function(e) {
                            var t = this.constructor;
                            return this.then(function(n) {
                                return t.resolve(e()).then(function() {
                                    return n
                                })
                            }, function(n) {
                                return t.resolve(e()).then(function() {
                                    return t.reject(n)
                                })
                            })
                        }
                        ,
                        o.all = function(e) {
                            return new o(function(t, n) {
                                    if (!e || void 0 === e.length)
                                        throw new TypeError("Promise.all accepts an array");
                                    var i = Array.prototype.slice.call(e);
                                    if (0 === i.length)
                                        return t([]);
                                    var o = i.length;
                                    function a(e, r) {
                                        try {
                                            if (r && ("object" == typeof r || "function" == typeof r)) {
                                                var s = r.then;
                                                if ("function" == typeof s)
                                                    return void s.call(r, function(t) {
                                                        a(e, t)
                                                    }, n)
                                            }
                                            i[e] = r,
                                            0 == --o && t(i)
                                        } catch (e) {
                                            n(e)
                                        }
                                    }
                                    for (var r = 0; r < i.length; r++)
                                        a(r, i[r])
                                }
                            )
                        }
                        ,
                        o.resolve = function(e) {
                            return e && "object" == typeof e && e.constructor === o ? e : new o(function(t) {
                                    t(e)
                                }
                            )
                        }
                        ,
                        o.reject = function(e) {
                            return new o(function(t, n) {
                                    n(e)
                                }
                            )
                        }
                        ,
                        o.race = function(e) {
                            return new o(function(t, n) {
                                    for (var i = 0, o = e.length; i < o; i++)
                                        e[i].then(t, n)
                                }
                            )
                        }
                        ,
                        o._immediateFn = "function" == typeof e && function(t) {
                                e(t)
                            }
                            || function(e) {
                                n(e, 0)
                            }
                        ,
                        o._unhandledRejectionFn = function(e) {
                            "undefined" != typeof console && console && console.warn("Possible Unhandled Promise Rejection:", e)
                        }
                    ;
                    var l = function() {
                        if ("undefined" != typeof self)
                            return self;
                        if ("undefined" != typeof window)
                            return window;
                        if (void 0 !== t)
                            return t;
                        throw new Error("unable to locate global object")
                    }();
                    l.Promise || (l.Promise = o)
                })
            }
        ).call(this, n(344).setImmediate, n(27))
    }
    , function(e, t, n) {
        "function" != typeof Promise && n(345)
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            n(346),
            n(341),
            n(340)
    }
    , function(e, t, n) {
        "use strict";
        function i(e) {
            return (e = "00" + e).substring(e.length - 2, e.length)
        }
        var o = this && this.__spreadArrays || function() {
                for (var e = 0, t = 0, n = arguments.length; t < n; t++)
                    e += arguments[t].length;
                var i = Array(e)
                    , o = 0;
                for (t = 0; t < n; t++)
                    for (var a = arguments[t], r = 0, s = a.length; r < s; r++,
                        o++)
                        i[o] = a[r];
                return i
            }
        ;
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.log = void 0,
            t.log = function(e) {
                console.log.apply(console, o([i(e.time.getHours()) + ":" + i(e.time.getMinutes()) + ":" + i(e.time.getSeconds())], e.text))
            }
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        });
        var i = n(50);
        t.default = function(e, t, n) {
            var o = "Web" === n.platform
                , a = "iOS" === n.platform
                , r = "android" === n.platform
                , s = r || a
                , c = o ? window.navigator.userAgent.toLowerCase() : ""
                , d = function() {
                var e = {};
                if (o) {
                    var t = window.name;
                    try {
                        var n = JSON.parse(t);
                        e.containerId = n.containerId,
                            e.version = n.hostVersion,
                            e.language = n.language || "*"
                    } catch (e) {}
                }
                return e
            }()
                , l = s ? "DingTalk" === n.appName || "com.alibaba.android.rimet" === n.appName : c.indexOf("dingtalk") > -1 || !!d.containerId
                , u = function() {
                if (o) {
                    if (d.version)
                        return d.version;
                    var e = c.match(/aliapp\(\w+\/([a-zA-Z0-9.-]+)\)/);
                    return null === e && (e = c.match(/dingtalk\/([a-zA-Z0-9.-]+)/)),
                    e && e[1] || "Unknown"
                }
                return n.appVersion
            }()
                , f = !!d.containerId
                , p = /iphone|ipod|ios/.test(c)
                , m = /ipad/.test(c)
                , h = c.indexOf("android") > -1
                , v = c.indexOf("mac") > -1 && f
                , g = c.indexOf("win") > -1 && f
                , _ = !v && !g && f;
            return {
                isDingTalk: l,
                isWebiOS: p,
                isWebAndroid: h,
                isWeexiOS: a,
                isWeexAndroid: r,
                isDingTalkPCMac: v,
                isDingTalkPCWeb: _,
                isDingTalkPCWindows: g,
                isDingTalkPC: f,
                runtime: e,
                framework: t,
                platform: l ? p || a ? i.PLATFORM.IOS : h || r ? i.PLATFORM.ANDROID : m ? i.PLATFORM.IPAD : v ? i.PLATFORM.MAC : g ? i.PLATFORM.WINDOWS : _ ? i.PLATFORM.BROWSER : i.PLATFORM.UNKNOWN : i.PLATFORM.UNKNOWN,
                version: u,
                isWeex: s
            }
        }
    }
    , function(e, t, n) {
        "use strict";
        function i(e, t) {
            for (var n = e.length, i = 0, o = !0; i < n; i++)
                try {
                    if (!(e[i]in t)) {
                        o = !1;
                        break
                    }
                } catch (e) {
                    o = !1;
                    break
                }
            return o
        }
        Object.defineProperty(t, "__esModule", {
            value: !0
        });
        var o = "undefined" != typeof window
            , a = "undefined" != typeof weex
            , r = "undefined" != typeof callNative
            , s = ["__weex_config__", "__weex_options__", "__weex_require__"]
            , c = ["localStorage", "location", "navigator", "XMLHttpRequest"]
            , d = ["config", "requireModule", "document"];
        t.default = function() {
            return o && a ? i(d, weex) ? "Web.Vue" : "Web.Unknown" : !o && a ? i(d, weex) ? "Weex.Vue" : "Weex.Unknown" : o && r && !a ? i(s, window) ? "Weex.Rax" : "Weex.Unknown" : o && i(c, window) ? "Web.Unknown" : "Unknown.Unknown"
        }
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        });
        var i = n(350)
            , o = n(349)
            , a = n(50)
            , r = i.default().split(".")
            , s = r[0]
            , c = r[1]
            , d = function() {
            var e = {};
            switch (c) {
                case a.FRAMEWORK.VUE:
                    var t = weex.config.env;
                    e.platform = t.platform,
                    a.RUNTIME.WEEX === s && (e.appVersion = t.appVersion,
                        e.appName = t.appName);
                    break;
                case a.FRAMEWORK.RAX:
                    a.RUNTIME.WEEX === s && (e.platform = navigator.platform,
                        e.appName = navigator.appName,
                        e.appVersion = navigator.appVersion);
                    break;
                case a.FRAMEWORK.UNKNOWN:
                    a.RUNTIME.WEB === s && (e.platform = a.RUNTIME.WEB),
                    a.RUNTIME.UNKNOWN === s && (e.platform = a.RUNTIME.UNKNOWN)
            }
            return e
        }()
            , l = o.default(s, c, d);
        t.default = l
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        }),
            t.LogLevel = t.APP_TYPE = t.ENV_ENUM_SUB = t.ENV_ENUM = t.ERROR_CODE = t.compareVersion = t.isFunction = void 0,
            t.isFunction = function(e) {
                return "function" == typeof e
            }
            ,
            t.compareVersion = function(e, t) {
                function n(e) {
                    return parseInt(e, 10) || 0
                }
                for (var i = e.split(".").map(n), o = t.split(".").map(n), a = 0; a < i.length; a++) {
                    if (void 0 === o[a])
                        return !1;
                    if (i[a] < o[a])
                        return !1;
                    if (i[a] > o[a])
                        return !0
                }
                return !0
            }
            ,
            function(e) {
                e.cancel = "-1",
                    e.not_exist = "1",
                    e.no_permission = "7",
                    e.jsapi_internal_error = "22"
            }(t.ERROR_CODE || (t.ERROR_CODE = {})),
            function(e) {
                e.pc = "pc",
                    e.android = "android",
                    e.ios = "ios",
                    e.notInDingTalk = "notInDingTalk"
            }(t.ENV_ENUM || (t.ENV_ENUM = {})),
            function(e) {
                e.mac = "mac",
                    e.win = "win",
                    e.noSub = "noSub"
            }(t.ENV_ENUM_SUB || (t.ENV_ENUM_SUB = {})),
            function(e) {
                e.WEB = "WEB",
                    e.MINI_APP = "MINI_APP",
                    e.WEEX = "WEEX",
                    e.WEBVIEW_IN_MINIAPP = "WEBVIEW_IN_MINIAPP",
                    e.WEEX_WIDGET = "WEEX_WIDGET"
            }(t.APP_TYPE || (t.APP_TYPE = {})),
            function(e) {
                e[e.INFO = 1] = "INFO",
                    e[e.WARNING = 2] = "WARNING",
                    e[e.ERROR = 3] = "ERROR"
            }(t.LogLevel || (t.LogLevel = {}))
    }
    , function(e, t, n) {
        "use strict";
        var i = n(0)
            , o = n(339)
            , a = Object.assign({}, o, i.ddSdk.getExportSdk());
        e.exports = a
    }
    , function(e, t, n) {
        "use strict";
        var i = n(353);
        n(338),
            e.exports = i
    }
    , function(e, t, n) {
        "use strict";
        Object.defineProperty(t, "__esModule", {
            value: !0
        });
        var i = window.location.href
            , o = window.location.hash;
        -1 === i.indexOf("#") && o && (i = i + "#" + o);
        var a = function() {
            var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : i;
            if (!e || !e.split)
                return {};
            var t = e.split("?")[1] || "";
            return t.indexOf("#") && (t = t.split("#")[0] || ""),
                t
        }
            , r = function() {
            var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : i
                , t = {}
                , n = a(e);
            return n && n.split("&").forEach(function(e) {
                if (e) {
                    var n = e.split("=");
                    t[n[0]] = decodeURIComponent(n.slice(1, n.length).join("="))
                }
            }),
                t
        }
            , s = r(i);
        t.default = {
            queryObject: s,
            getQueryString: a,
            getQueryObject: r,
            getQueryParam: function(e) {
                var t = arguments.length > 1 && void 0 !== arguments[1] ? arguments[1] : i;
                return r(t)[e]
            },
            getHashString: function() {
                var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : i;
                return e && e.split ? e.split("#")[1] || "" : result
            },
            getHashObject: function() {
                var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : "!"
                    , t = arguments.length > 1 && void 0 !== arguments[1] ? arguments[1] : i
                    , n = this.getHashString(t)
                    , o = {};
                return n && n.split(e).forEach(function(e) {
                    if (e) {
                        var t = e.split("=");
                        o[t[0]] = decodeURIComponent(t.slice(1, t.length).join("="))
                    }
                }),
                    o
            },
            getHashParam: function(e) {
                var t = arguments.length > 1 && void 0 !== arguments[1] ? arguments[1] : "!"
                    , n = arguments.length > 2 && void 0 !== arguments[2] ? arguments[2] : i;
                return getHashObject(t, n)[e]
            },
            generateQueryStringFromObject: function() {
                var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {};
                return Object.keys(e || {}).map(function(t) {
                    return t + "=" + encodeURIComponent(e[t])
                }).join("&")
            },
            delQueryParam: function(e) {
                var t = arguments.length > 1 && void 0 !== arguments[1] ? arguments[1] : i
                    , n = this.getQueryObject(t);
                delete n[e];
                var o = this.getHashString(t);
                return t.split("?")[0] + "?" + this.generateQueryStringFromObject(n) + (o ? "#" + o : "")
            },
            addQueryParam: function(e, t) {
                var n = arguments.length > 2 && void 0 !== arguments[2] ? arguments[2] : i
                    , o = this.getQueryObject(n);
                o[e] = decodeURIComponent(t);
                var a = this.getHashString(n);
                return n.split("?")[0] + "?" + this.generateQueryStringFromObject(o) + (a ? "#" + a : "")
            }
        }
    }
    , function(e, t) {
        e.exports = '<div class="article-error" v-if="showStatusError">\n\t<div class="article-error-bg"></div>\n\t<p class="article-error-text_main">文章已被删除</p>\n\t<p class="article-error-text_sub">看看别的文章吧</p>\n</div>\n\n<div class="article-error-network" v-if="showNetworkError">\n\t<div></div>\n\t<p><a href=\'#\' v-on:click="reload($event)">刷新</a></p>\n</div>\n'
    }
    , , , , , , , , function(e, t, n) {}
    , function(e, t, n) {
        "use strict";
        /*!
 * article.js
 * Copyright(c) 2016
 * AUTHOR: shafeng
 * TAB SIZE: 4
 */
        new Promise(function(e, t) {
                globalConfig.VERSION && e({}),
                    window.ucapi.biz.ucparams({
                        params: "vektnwfrprdn",
                        success: function(t) {
                            e(t)
                        },
                        fail: function(e) {
                            t(e)
                        }
                    })
            }
        ).then(function(e) {
            e.ve && (globalConfig.VERSION = e.ve),
            e.kt && (globalConfig.KT = e.kt),
            e.nw && (globalConfig.NETWORK_TYPE = e.nw),
            e.fr && (globalConfig.PLATFORM = e.fr),
            e.pr && (globalConfig.PR = e.pr),
            e.dn && (globalConfig.DN = e.dn)
        }, function(e) {}).then(function() {
            n(364);
            var e = n(356)
                , t = n(1)
                , i = n(14)
                , o = n(3)
                , a = n(5)
                , r = n(134)
                , s = n(133)
                , c = n(132)
                , d = (n(131),
                n(130))
                , l = n(36)
                , u = n(101)
                , f = n(4).default
                , p = n(8).default;
            window.exposeChecker = p;
            var m = n(28).default;
            window.setRenderState(7),
                function() {
                    var p = r("wm_cid") || t.urlQuery.wm_cid || r("wm_aid") || t.urlQuery.wm_aid || ""
                        , h = r("wm_id") || t.urlQuery.wm_id || ""
                        , v = r("sm_article_id") || t.urlQuery.sm_article_id || "";
                    globalConfig.wm_aid = p,
                        globalConfig.wm_id = h,
                        globalConfig.sm_article_id = v,
                        globalConfig.CP = t.urlQuery.source || t.urlQuery.from || "",
                        t.debug("wm_aid:" + p),
                        o.init({
                            pg: window.waPage,
                            page: window.waPage,
                            aid: p,
                            wmid: h || "",
                            app: t.urlQuery.app || "",
                            zzd_from: t.urlQuery.zzd_from || "",
                            server: globalConfig.SERVER,
                            client: t.clientStr(),
                            source: t.is_share_mode ? "share" : globalConfig.CP,
                            cp: globalConfig.CP,
                            nw: t.urlQuery.nw || globalConfig.NETWORK_TYPE || "other",
                            app_ve: globalConfig.APP_VERSION,
                            https: -1 !== location.protocol.indexOf("https") ? 1 : 0,
                            title_type: t.urlQuery.title_type || "1",
                            test_tag: i.getTest("546") || ""
                        }),
                        t.debug("stat inited"),
                        document.addEventListener("touchend", function() {}),
                        s();
                    var g = function(n, i) {
                        t.debug("render error"),
                            n = n || "status",
                            new Vue({
                                el: ".contentbox",
                                replace: !1,
                                template: e,
                                data: {
                                    isiPhone: t.platform.isiPhone,
                                    isAndroid: t.platform.isAndroid,
                                    showStatusError: "status" === n,
                                    showNetworkError: "network" === n
                                },
                                methods: {
                                    reload: function(e) {
                                        e.preventDefault(),
                                            window.location.reload(!0)
                                    }
                                }
                            }),
                            $(".show-more-detail").remove(),
                        "network" !== n && $("#pageLoadStatus").html("<end></end>"),
                            o.event({
                                action: "article_error",
                                error_type: n,
                                where: i || ""
                            }),
                            window.send_discovery_log({
                                page: window.waPage,
                                aid: p,
                                wmid: h || "",
                                action: "article_error",
                                error_type: n,
                                where: i || ""
                            }, 500),
                        ucapi && ucapi.infoflow && ucapi.infoflow.notifyFlushWebItemInfo({
                            data: {
                                article_state: 1
                            },
                            success: function(e) {},
                            fail: function(e) {}
                        })
                    };
                    if (globalConfig.wm_aid)
                        if (window.is_article_request_error)
                            g(window.is_article_request_errortype || "network", "ajax_error");
                        else {
                            $(document.body).on("article:response:error", function(e, t) {
                                g(t || "network", "ajax_error")
                            });
                            var _ = function(e, i) {
                                if ($("#pageLoadStatus").html("<end></end>"),
                                    e.data = t.transFashFishToWeMedia(e.data),
                                    globalConfig.wm_aid = e.data.content_id,
                                    globalConfig.wm_id = e.data.wm_id,
                                    globalConfig.wm_cid = e.data.content_id,
                                    globalConfig.origin_id = e.data.wm_aid,
                                    o.init({
                                        aid: e.data.wm_aid,
                                        cid: e.data.content_id
                                    }),
                                    t.debug(e.data),
                                    e.data)
                                    if (6 === e.data.status || 5 === e.data.status || 1 === e.data.status) {
                                        t.debug("request article data success"),
                                            t.is_share_mode ? u("article", function() {
                                                setTimeout(function() {
                                                    window.SharePageSDK && window.SharePageSDK.SMDS() ? ($(".commentbox").hide(),
                                                        new window.SharePageSDK.page) : w()
                                                }, 30)
                                            }, function() {
                                                w()
                                            }) : $(".show-more-detail").remove();
                                        var s = e.data;
                                        document.title = s.title,
                                            globalConfig.sm_article_id = s.xss_item_id,
                                            globalConfig.wm_name = s.wm_name,
                                            globalConfig.wm_id = s.wm_id,
                                            globalConfig.avatar_url = s.avatar_url,
                                            s.pageUrl = t.shareUrl(t.urlQuery.client, globalConfig.wm_aid, globalConfig.wm_id),
                                            s.page_type = 6,
                                            l.pushMessageToClient(s);
                                        var p = {
                                            action: "article_request",
                                            cid: e.data.content_id,
                                            aid: e.data.wm_aid,
                                            wmid: e && e.data && e.data.wm_id || "",
                                            tt: (window.end_request_article_time || Date.now()) - window.article_request_begintime,
                                            ws: Date.now() - start_time,
                                            subver: globalConfig.SUB_VERSION || "",
                                            recoid: t.urlQuery.recoid || "",
                                            rd_type: t.urlQuery.rd_type || ""
                                        }
                                            , h = !1
                                            , v = e.data && e.data.body && e.data.body.text;
                                        v && v.indexOf && v.indexOf("/card-xiami.html") > -1 && (h = !0),
                                        h && (p.has_music_card = 1),
                                            setTimeout(function() {
                                                o.event(p)
                                            }, 0),
                                            d(s, function() {
                                                a.init(e.data),
                                                    a.log({
                                                        region: "view",
                                                        action: "visit"
                                                    });
                                                try {
                                                    a.elementPage({
                                                        page: "index"
                                                    })
                                                } catch (e) {}
                                                globalConfig.wm_aid && c(globalConfig.wm_aid),
                                                globalConfig.openDisCoveryPvLog && window.send_discovery_log({
                                                    page: window.waPage,
                                                    aid: e.data.wm_aid,
                                                    cid: e.data.content_id,
                                                    wmid: globalConfig.wm_id || "",
                                                    action: "article_request"
                                                }),
                                                    setTimeout(function() {
                                                        Promise.resolve().then(function(i) {
                                                            window.scriptLoaded("utp-sdkload");
                                                            var o = t.is_share_mode ? "22,52,70,176,179" : "21"
                                                                , a = t.urlQuery.app || "uc-iflow"
                                                                , r = n(45);
                                                            if (r) {
                                                                var s = new r({});
                                                                s && s.load({
                                                                    cids: o,
                                                                    xss_id: e.data.xss_item_id,
                                                                    app: a
                                                                }).then(function(e) {
                                                                    if (window.scriptLoaded("utp-adload"),
                                                                        t.debug("utp loaded"),
                                                                    e && e.result) {
                                                                        var n = {};
                                                                        e.result.forEach(function(e) {
                                                                            return n[e.channel_id] = e
                                                                        }),
                                                                            globalConfig.utps = n,
                                                                            $(document).trigger("utp:loaded", [n])
                                                                    }
                                                                    $(document).on("utp:click", function(e, n, i) {
                                                                        t.debug("utp click"),
                                                                            s.click(n.adid, !0, null, i)
                                                                    })
                                                                }).catch(function(e) {})
                                                            }
                                                        }
                                                            .bind(null, n)).catch(n.oe)
                                                    }, 300),
                                                window.getXissData && window.getXissData.then(function(e) {
                                                    var n = s && s._author || {}
                                                        , i = {
                                                        wm_id: n.author_id,
                                                        wm_level: n.author_level
                                                    }
                                                        , o = {
                                                        pageType: 3,
                                                        urlQuery: t.urlQuery || {},
                                                        xissJsonData: e,
                                                        wmAuthorInfo: i,
                                                        pageName: t.isTaojinIflow ? "page_feed_news" : "page_iflow_article",
                                                        articleData: s
                                                    }
                                                        , r = window.location
                                                        , c = r.host
                                                        , d = r.href
                                                        , l = d.indexOf("uae-2.uc.cn") > -1 || d.indexOf("newstjk.com") > -1 || c.indexOf(":") > -1;
                                                    t.isTaojinIflow && l && e && e.site_logo && e.site_logo.name && (document.querySelector("#header-site-logo").innerText = e.site_logo.name),
                                                    t.is_share_mode && (o.pageType = 9,
                                                        o.deeplink = m.getShareDepth());
                                                    var u = !0;
                                                    if (window.ucapi && window.ucapi.ut) {
                                                        var p = window.ucapi.ut.toUT2;
                                                        window.ucapi.ut.toUT2 = function(e) {
                                                            if ("2001" === e.funcId && u) {
                                                                u = !1;
                                                                var t = Date.now() - window.start_time;
                                                                setTimeout(function() {
                                                                    a.log({
                                                                        region: "tech",
                                                                        action: "ut_start",
                                                                        label: t
                                                                    })
                                                                }, 1e3)
                                                            }
                                                            p(e)
                                                        }
                                                    }
                                                    f.init(o),
                                                        window.uc_logger = f
                                                }),
                                                    o.send(globalConfig.IFLOWDOMAIN + "/log/api/v1/page/flow?uc_param_str=dnnivebichfrmintcpgieiwidsudsv&oppo=17&zzd_from=" + (t.urlQuery.zzd_from || "") + "&app=" + (t.urlQuery.app || "") + "&aid=" + globalConfig.sm_article_id + "&rd_id=" + t.randomToken(20, !0) + "&rc_id=" + (r("recoid") || t.urlQuery.rc_id || "") + "&refrd_id=" + (t.urlQuery.refrd_id || "") + "&rd_type=" + (t.urlQuery.rd_type || ("relate" === globalConfig.CP ? "relate" : "") || "") + "&innerType=" + (t.urlQuery.innerType || ("relate" === globalConfig.CP ? "relate" : "") || ""));
                                                var i = n(100);
                                                i && i.init && i.init(s)
                                            })
                                    } else
                                        g("status", "statuserror");
                                else
                                    g("network", "nodata");
                                i && i()
                            };
                            window.is_article_request_ready && _(window.article_response_json || {}),
                                $(document.body).on("article:response", function(e, t) {
                                    _(t || {})
                                }),
                            t.is_share_mode && $(".relatebox").remove()
                        }
                    else
                        g("status", "noid");
                    function w() {
                        $(".show-more-detail").on("click", function() {
                            o.event({
                                action: "showMoreClick"
                            }),
                                $(this).hide(),
                                $(".content-cover").css("max-height", "none")
                        })
                    }
                }()
        })
    }
    , function(e, t, n) {
        e.exports = n(365)
    }
]);
