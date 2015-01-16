<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8" />
<meta name="keywords" content="相亲,同城相亲"/>
<meta name="description" content="珍爱网专为单身男女提供相亲服务，实时发布高质量的同城相亲信息，6000万优质会员等你来珍爱网同城相亲！【专业红娘团队|高效同城相亲】"/>
<title>出错了啊 - 500</title>
<link rel="icon" href="https://i.alipayobjects.com/common/favicon/favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" href="https://i.alipayobjects.com/common/favicon/favicon.ico" type="image/x-icon" />
<link charset="utf-8" rel="stylesheet" href="https://a.alipayobjects.com/al/alice.base-1.2.css" />
<link charset="utf-8" rel="stylesheet" href="https://a.alipayobjects.com/u/css/201303/2R4UCTZnuv.css" />
<!-- CMS:珍爱网全站/监控埋点/seajs 部署开始:alipay/tracker/seajs.vm -->
<script charset="utf-8" id="seajsnode" src="https://a.alipayobjects.com/??seajs/1.3.1/sea.js,seajs/1.3.1/plugin-combo.js,jquery/jquery/1.7.2/jquery.js"></script>
<script>
  (function(){

    var JQ = '/jquery/1.7.2/jquery.js';
	seajs.cache['https://a.alipayobjects.com/gallery' + JQ] = seajs.cache['https://a.alipayobjects.com/jquery' + JQ];

    var GALLERY_MODULES = [
      'async','backbone','coffee','cookie','es5-safe','handlebars','iscroll',
      'jasmine','jasmine-jquery','jquery','jquery-color','json','keymaster',
      'labjs','less','marked','moment','mustache','querystring','raphael',
      'socketio','store','swfobject','underscore','zepto','ztree'
    ];

    var ARALE_MODULES = [
      'autocomplete','base','calendar','class','cookie','dialog','easing',
      'events','iframe-uploader','iframe-shim','messenger','overlay','popup',
      'position','select','switchable','tip','validator','widget'
    ];

    var util = seajs.pluginSDK.util;

    function contains(arr, item) {
      return util.indexOf(arr, item) > -1
    }

    function map(id) {
      id = id.replace('#', '');

      var parts = id.split('/');
      var len = parts.length;
      var root, name;

      // id = root/name/x.y.z/name
      if (len === 4) {
        root = parts[0];
        name = parts[1];

        // gallery 或 alipay 开头的没有问题
        if (root === 'alipay' || root === 'gallery') {
          return id;
        }

        // arale 开头的
        if (root === 'arale') {
          // 处理 arale/handlebars 的情况
          if (contains(GALLERY_MODULES, name)) {
            return id.replace('arale/', 'gallery/');
          } else {
            return id;
          }
        }
      }
      // id = name/x.y.z/name
      else if (len === 3) {
        name = parts[0]

        // 开头在 GALLERY_MODULES 或 ARALE_MODULES
        if (contains(GALLERY_MODULES, name)) {
          return 'gallery/' + id;
        } else if (contains(ARALE_MODULES, name)) {
          return 'arale/' + id;
        }
      }

      return id;
    }

    seajs.config({
      alias: {
        '$': 'jquery/jquery/1.7.2/jquery',
        '$-debug': 'jquery/jquery/1.7.2/jquery',
        'jquery': 'jquery/jquery/1.7.2/jquery'
      }
    });

    var _use = seajs.use;

    seajs.use = function(ids, callback) {
      if (typeof ids === 'string') {
        ids = [ids];
      }

      ids = util.map(ids, function(id) {
        return map(id);
      });

      return _use(ids, callback);
    }

  })();
</script><!-- CMS:珍爱网全站/监控埋点/seajs 部署结束:alipay/tracker/seajs.vm --><!-- CMS:珍爱网全站/监控埋点/全站页面效率统计开始:alipay/tracker/tracker_time.vm --><meta name="ABTest" content="" />


<script type="text/javascript">
  window.monitor||(function(){var M=window.monitor={};M._rate=0.01;M._errors=[];M._now=function(){return ("function"==typeof Date.now)?Date.now():new Date().valueOf();};M._startTime=window.performance&&performance.timing?performance.timing.navigationStart:M._now();var _TIMER={};M.time=function(name){_TIMER[name]=M._now();};M.timeEnd=function(name){var s=_TIMER[name];if(!s){return NaN;}var e=M._now(),t=e-s;M._errors.push({"time":t});if("function"==typeof M.timedSend){M.timedSend();}return t;};M.log=function(g,p,c){M._errors.push({constom:{type:"log",productLine:g,product:p,errorCode:c,counts:1}});if("function"==typeof M.timedSend){M.timedSend();}};M.error=function(e){if(!(msg instanceof Error)){return;}M._errors.push({constom:{msg:e.message,file:e.fileName||"",ln:e.lineNumber||e.line||0}});if("function"==typeof M.timedSend){M.timedSend();}};window.onerror=function(m,f,l){M._errors.push({jsError:{msg:m,file:f,ln:l}});if("function"==typeof M.timedSend){M.timedSend();}return false;}})();

window._to = { start: new Date() };
</script>


<script charset="utf-8" src="https://a.alipayobjects.com/ar/??alipay.light.base-1.1.js,alipay.tracker-1.10.js,alipay.fmsmng.monitor-1.4.js"></script>

<!-- CMS:珍爱网全站/监控埋点/全站页面效率统计结束:alipay/tracker/tracker_time.vm --><style type="text/css">
html,
body {
    color: #959595;
    text-align: center;
}
a:link,
a:visited {
    color: #0088CC;
    text-decoration: none;
}
a:hover,
a:active {
    text-decoration: underline;
}
.header,
.content,
.footer {
    width: 960px;
    margin: 0 auto;
    text-align: left;
}
.footer {
    margin-top: 20px;
    text-align: center;
}
.server {
    color: #fff;
}
.logo {
    overflow: hidden;
    width: 237px;
    height: 37px;
    margin: 15px 0;
    text-indent: -9999px;
    background: url(https://hi.alipay.com/cms/common/images/logo-ztf.png) no-repeat left top;
}
.container {
    background: #F7F7F7;
    box-shadow: 2px 2px 5px #ccc inset;
	overflow: hidden;
}
.content {
    padding: 80px 0;
    position: relative;
}
.error404 {
    width: 500px;
    height: 260px;
    position: relative;
    overflow: visible;
}
.tipbox {
    position: absolute;
    top: 100px;
    left: 560px;
    line-height: 2.0;
}
.tipbox h2 {
    font-size: 28px;
    font-family: Microsoft YaHei, SimHei;
    font-weight: 400;
    color: #E36C08;
}
.tipbox dl {
    margin: 20px 0 25px 0;
}
.tipbox dt {
    font-size: 14px;
    font-weight: 700;
}
.tipbox dd {
    padding: 0 0 0 20px;
}
.tipbox dd:before {
    overflow: hidden;
    position: absolute;
    display: block;
    content: "";
    width: 3px;
    height: 3px;
    margin: 10px 0 0 -10px;
    background: #959595;
}
.killIE6 {
    height: 24px;
    line-height: 1.8;
    font-weight:normal;
    text-align: center;
    border-bottom:1px solid #fce4b5;
    background-color:#FFFF9B;
    color:#e27839;
}
.close-killIE6 {
    position: absolute;
    top: -4px;
    right: 5px;
    font-size: 17px;
    font-weight: 700;
}
.close-killIE6:link,
.close-killIE6:visited {
    color: #E27839;
}
.close-killIE6:hover {
    color: #494949;
    text-decoration: none;
}
@media screen and (min-width: 800px) and (max-width: 1024px) {
    .header,
    .content,
    .footer {
        width: 780px;
    }
    .content {
        padding: 20px 0;
    }
    .tipbox {
        top: 40px;
        left: 520px;
    }
    .tipbox h2 {
        font-size: 22px;
    }
}
@media screen and (max-width: 800px) {
    .header,
    .content,
    .footer {
        width: 500px;
    }
    .content {
        padding: 20px 0;
    }
    .error404 {
        display: none;
    }
    .tipbox {
        position: static;
    }
}
/* 动画区块 */
.bg404_1, .bg404_2, .bg404_3, .bg404_4, .piece_1, .piece_2, .piece_3, .piece_4, .piece_5{background-image:url(https://i.alipayobjects.com/e/201303/2R3NXPtGay.png);}.bg404_1{overflow:visible;width:500px;height:260px;position:absolute;background-repeat:no-repeat;background-position:0 0;}.bg404_2{display:none;background-repeat:no-repeat;background-position:-501px 0;}.bg404_3{display:none;background-repeat:no-repeat;background-position:0 -261px;}.bg404_4{display:none;background-repeat:no-repeat;background-position:-501px -261px;}.piece_1{width:50px;height:50px;position:absolute;top:20px;left:50px;background-repeat:no-repeat;background-position:0 -522px;}.piece_2{width:50px;height:50px;position:absolute;top:100px;left:180px;background-repeat:no-repeat;background-position:-81px -522px;}.piece_3{width:50px;height:50px;position:absolute;top:200px;left:350px;background-repeat:no-repeat;background-position:-162px -522px;}.piece_4{width:50px;height:50px;position:absolute;top:100px;left:250px;background-repeat:no-repeat;background-position:-243px -522px;}.piece_5{width:50px;height:50px;position:absolute;top:230px;left:450px;background-repeat:no-repeat;background-position:-162px -522px;}.robot{position:absolute;left:184px;top:53px;cursor:pointer;}.smoke{position:absolute;top:-65px;left:240px;}
</style>
</head>
<body>
<div class="container">
    <div class="content">
        <div class="error404">
            <div class="bg404_1 fn-hide"></div>
            <div class="bg404_2" data-backgroundPosition="-501px 0">
                <div class="piece_2">
                </div>
                <div class="piece_4">
                </div>
            </div>
            <div class="bg404_3" data-backgroundPosition="0 -261px">
                <div class="piece_1">
                </div>
                <div class="piece_2">
                </div>
                <div class="piece_3">
                </div>
                <div class="piece_4">
                </div>
            </div>
            <div class="bg404_4" data-backgroundPosition="-501px -261px">
                <div class="piece_1">
                </div>
                <div class="piece_2">
                </div>
                <div class="piece_3">
                </div>
                <div class="piece_4">
                </div>
                <div class="piece_5">
                </div>
            </div>
            <img class="robot fn-hide" src="https://i.alipayobjects.com/e/201303/2QzV94fSgX.gif" alt="error 404" />
        </div>
        <div class="tipbox">
            <h2>抱歉，你撞到了500页面...</h2>
            <dl>
                <dt>最有可能的原因是：</dt>
                <dd>服务器内部出错</dd>
            </dl>
            <div class="other">
                <p>别担心，你可以点击链接继续浏览：</p>
                <a href="http://www.zhenai.com/">珍爱网首页</a>
            </div>
        </div>
    </div>
</div>
<div class="footer">
    <!-- CMS:珍爱网全站/全站底部/alipay_foot_copyright_vm开始:alipay/foot/copyright.vm --><style>
.copyright,.copyright a,.copyright a:hover{color:#808080;}
</style>
<div class="copyright">
  珍爱网版权所有  1998-2014
  <a href="https://i.alipayobjects.com/e/201201/2PFHAJCn91.jpg" target="_blank">ICP证：浙B2-20120045</a>
</div>
<div class="server" id="ServerNum">
  homeproxy &nbsp;
</div><!-- CMS:珍爱网全站/全站底部/alipay_foot_copyright_vm结束:alipay/foot/copyright.vm -->
</div>
<script type="text/javascript" charset="utf-8" src="https://a.alipayobjects.com/u/js/201303/2R4U8Mim1d.js"></script>
<script>
seajs.use(['$', 'arale/cookie/1.0.2/cookie'], function($, Cookie) {
    var jQuery = $;
    //killIE6 浮层
    if (jQuery.browser.version == '6.0') {
        if (typeof(Cookie.get('killIE6')) == 'undefined' || !Cookie.get('killIE6')) {
            window.setTimeout(function () {
                $('.J-killIE6').slideDown(1000);
				//全站404埋点
				Tracker.log('killIE6-show');
            }, 1500);
        }
        //关闭
        $(".J-close-killIE6").live("click",function(e){
            Cookie.set('killIE6', false);
            $('.J-killIE6').fadeOut(500);
            e.preventDefault();
        });
    }
    //撞头动画
    var fun = {
        level: 1,
        robot: $('.robot'),
        bg: {
            bg404_1: $('.bg404_1'),
            bg404_2: $('.bg404_2'),
            bg404_3: $('.bg404_3'),
            bg404_4: $('.bg404_4')
        },
        notSupportedBrowser: (jQuery.browser.msie && (jQuery.browser.version == '6.0' || jQuery.browser.version == '7.0' || jQuery.browser.version == '8.0')) || (jQuery.browser.safari && window.navigator.userAgent.indexOf('Chrome') == -1),
        shakeNum: 0,
        robotMouseOver: function() {
            window.Tracker.log('alipay_error404_mouseover' + this.level);
            if (this.level <= 3) {
                var that = this;
                if (jQuery.browser.msie || jQuery.browser.mozilla) {
                    TweenMax.to(this.robot, 0.2, {width: '172px', height: '250px',transformOrigin: '50% 50%', onStart: function() {that.robot.on('click', function() {that.robotClick();});}});
                } else {
                    TweenMax.to(this.robot, 0.2, {rotationX: -30, transformOrigin: '50% bottom', transformPerspective: 500, startAt: {transformPerspective: 500}, onStart: function() {that.robot.on('click', function() {that.robotClick();});}});
                }
            }
        },
        robotMouseOut: function() {
            window.Tracker.log('alipay_error404_mouseout' + this.level);
            if (this.level <= 3) {
                if (jQuery.browser.msie || jQuery.browser.mozilla) {
                    TweenMax.to(this.robot, 0.2, {width: '160px', height: '230px',transformOrigin: '50% 50%'});
                } else {
                    TweenMax.to(this.robot, 0.2, {rotationX: 0, transformOrigin: '50% bottom', transformPerspective: 500, startAt: {transformPerspective: 500}});
                }
            }
        },
        robotClick: function() {
            window.Tracker.click('alipay_error404_click' + this.level);
            if (this.level <= 3) {
                var that = this;
                if (jQuery.browser.msie || jQuery.browser.mozilla) {
                    TweenMax.to(this.robot, 0.2, {width: '140px', height: '200px', ease: Back.easeIn, delay: 0.2, transformOrigin: '50% 50%', onStart: function() {that.robot.unbind('click');}, onComplete: function() {that.shake();}});
                    TweenMax.to(this.robot, 0.2, {width: '172px', height: '250px', delay: 0.6, transformOrigin: '50% 50%', onComplete: function() {that.robot.on('click', function() {that.robotClick();});}});
                } else {
                    TweenMax.to(this.robot, 0.2, {rotationX: 15, ease: Back.easeIn, delay: 0.2, transformOrigin: '50% bottom', transformPerspective: 500, startAt: {transformPerspective: 500}, onStart: function() {that.robot.unbind('click');}, onComplete: function() {that.shake();}});
                    TweenMax.to(this.robot, 0.2, {rotationX: -30, delay: 0.6, transformOrigin: '50% bottom', transformPerspective: 500, startAt: {transformPerspective: 500}, onComplete: function() {that.robot.on('click', function() {that.robotClick();});}});
                }
            }
        },
        shake: function() {
            var that = this;
            TweenMax.to(that.bg.bg404_1, 0.05, {left: 5 + (that.level-1)*5, ease: Bounce.easeInOut, yoyo: true, repeat: 7 + (that.level-1)});
            TweenMax.to(that.bg.bg404_1, 0.05, {top: 3 + (that.level-1)*3, ease: Bounce.easeInOut, yoyo: true, repeat: 7 + (that.level-1), onRepeat: function() {
                that.shakeNum++;
                if (that.shakeNum == 2) {
                    that.bg.bg404_1.css('backgroundPosition', that.bg['bg404_' + that.level].attr('data-backgroundPosition'));
                    if (that.level == 2) {
                        that.robot.attr('src', 'https://i.alipayobjects.com/e/201303/2QzSIaf4RY.gif');
                        $('<img class="smoke" src="https://i.alipayobjects.com/e/201303/2RVA7TJRkK.gif" />').insertAfter(that.bg.bg404_1);
                    } else if (that.level == 3) {
                        that.robot.attr('src', 'https://i.alipayobjects.com/e/201303/2QzSKsCpDY.gif');
                        $('<img class="smoke" src="https://i.alipayobjects.com/e/201303/2RVD085JGn.gif" />').insertAfter(that.bg.bg404_1);
                    } else {
                        that.robot.attr('src', 'https://i.alipayobjects.com/e/201303/2QzVCyDXKn.gif');
                        $('<img class="smoke" src="https://i.alipayobjects.com/e/201303/2RVD1CgRVt.gif" />').insertAfter(that.bg.bg404_1);
                    }

                } else if (that.shakeNum == 6) {
                    if (!jQuery.browser.msie) {
                        that.bg['bg404_' + that.level].children().appendTo(that.bg.bg404_1).addClass('animated fadeOutDownBig');
                    }
					if (that.level == 4) {
                    	that.robot.attr('src', 'https://i.alipayobjects.com/e/201303/2RVKwb1XSG.gif').css('cursor','default');
                	}
                }
            }, onComplete: function() {
                that.shakeNum = 0;
            }});

            this.level++;
        },
        init: function() {
            //如果是ie6、7、8或safari则展示降级方案
            if(this.notSupportedBrowser) {
                this.bg.bg404_1.css('backgroundImage','url(https://i.alipayobjects.com/e/201303/2RN8R673W0.png)').removeClass('fn-hide');
            } else {
                this.bg.bg404_1.removeClass('fn-hide');
                this.robot.removeClass('fn-hide');
                var that = this;
                this.robot.hover(function() {
                    that.robotMouseOver();
                },function() {
                    that.robotMouseOut();
                });
                this.robot.on('click', function() {that.robotClick();});
                //robot的gif图预加载
                $('<img class="fn-hide" src="https://i.alipayobjects.com/e/201303/2QzSIaf4RY.gif" />').insertAfter(this.bg.bg404_1);
                $('<img class="fn-hide" src="https://i.alipayobjects.com/e/201303/2QzSKsCpDY.gif" />').insertAfter(this.bg.bg404_1);
                $('<img class="fn-hide" src="https://i.alipayobjects.com/e/201303/2QzVCyDXKn.gif" />').insertAfter(this.bg.bg404_1);
				$('<img class="fn-hide" src="https://i.alipayobjects.com/e/201303/2RVKwb1XSG.gif" />').insertAfter(this.bg.bg404_1);
				var that = this;
                window.setTimeout(function() {that.robot.trigger('mouseover');}, 500);
                window.setTimeout(function() {that.robot.trigger('click');}, 500);
            }
        }
    };
    fun.init();
});
</script>
<script type="text/javascript">
//全站404埋点
Tracker.log('alipay_error404');
//系统404埋点
Tracker.log(window.location.host.split(".")[0] + '_error404');
</script>

  </body>
</html>
