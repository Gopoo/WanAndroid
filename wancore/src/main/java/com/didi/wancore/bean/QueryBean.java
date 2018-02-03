package com.didi.wancore.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by didi on 2018/2/3.
 */

public class QueryBean {

    /**
     * http://www.wanandroid.com/article/query/0/json
     * data : {"curPage":1,"datas":[{"apkLink":"","author":"小编","chapterId":292,"chapterName":"pdf电子书","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2254,"link":"http://www.wanandroid.com/blog/show/2036","niceDate":"18小时前","origin":"","projectLink":"","publishTime":1517562829000,"title":"[PDF] Cm<em class='highlight'>a<\/em>ke实践下载","visible":1,"zan":0},{"apkLink":"","author":"cfanr","chapterId":182,"chapterName":"JNI编程","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2253,"link":"http://cfanr.cn/2017/08/26/Android-NDK-dev-CMake-s-usage/","niceDate":"18小时前","origin":"","projectLink":"","publishTime":1517561475000,"title":"<em class='highlight'>A<\/em>ndroid NDK 开发：CM<em class='highlight'>a<\/em>ke 使用","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2250,"link":"http://www.jianshu.com/p/cd984dd5aae8","niceDate":"22小时前","origin":"","projectLink":"","publishTime":1517548568000,"title":"<em class='highlight'>A<\/em>ndroid RxJ<em class='highlight'>a<\/em>v<em class='highlight'>a<\/em>：这是一份全面 & 详细 的RxJ<em class='highlight'>a<\/em>v<em class='highlight'>a<\/em>操作符 使用攻略","visible":1,"zan":0},{"apkLink":"","author":"看书的小蜗牛","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2251,"link":"http://www.jianshu.com/p/18e4efa2e0a2","niceDate":"22小时前","origin":"","projectLink":"","publishTime":1517548568000,"title":"<em class='highlight'>A<\/em>ndroid面试题：bindService获取代理是同步还是异步","visible":1,"zan":0},{"apkLink":"","author":"依然范特稀西","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2252,"link":"http://www.jianshu.com/p/a44bd13d2fa0","niceDate":"22小时前","origin":"","projectLink":"","publishTime":1517548568000,"title":"高效 | 几个<em class='highlight'>A<\/em>ndroid Studio 小技巧","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2249,"link":"http://www.jianshu.com/p/e1c48a00951a","niceDate":"22小时前","origin":"","projectLink":"","publishTime":1517548567000,"title":"<em class='highlight'>A<\/em>ndroid RxJ<em class='highlight'>a<\/em>v<em class='highlight'>a<\/em> 2.0：手把手带你 源码分析RxJ<em class='highlight'>a<\/em>v<em class='highlight'>a<\/em>","visible":1,"zan":0},{"apkLink":"","author":"恋猫月亮","chapterId":97,"chapterName":"音视频","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1630,"link":"http://www.jianshu.com/p/bb5876f34902","niceDate":"2天前","origin":"","projectLink":"","publishTime":1517407935000,"title":"<em class='highlight'>A<\/em>ndroid 列表视频的全屏、自动小窗口优化实践","visible":1,"zan":0},{"apkLink":"","author":"小编","chapterId":247,"chapterName":"防逆向","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2246,"link":"https://chaman.gitbooks.io/techblog/Android/apk-enchance/apk-enchance.html","niceDate":"2018-01-30","origin":"","projectLink":"","publishTime":1517302918000,"title":"<em class='highlight'>A<\/em>ndroid <em class='highlight'>A<\/em>PK加固技术初探","visible":1,"zan":0},{"apkLink":"","author":"小编","chapterId":305,"chapterName":"各类工具","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2245,"link":"http://www.wanandroid.com/blog/show/2034","niceDate":"2018-01-30","origin":"","projectLink":"","publishTime":1517297965000,"title":"工具分享 ：J<em class='highlight'>a<\/em>dx 反编译神器","visible":1,"zan":0},{"apkLink":"","author":"LowCoder","chapterId":99,"chapterName":"具体案例","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2242,"link":"http://blog.csdn.net/sdfsdfdfa/article/details/79120665","niceDate":"2018-01-30","origin":"","projectLink":"","publishTime":1517277762000,"title":"<em class='highlight'>A<\/em>ndroid拼图滑块验证码控件","visible":1,"zan":0},{"apkLink":"","author":"箫鉴哥","chapterId":97,"chapterName":"音视频","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2237,"link":"https://yq.aliyun.com/articles/8637","niceDate":"2018-01-29","origin":"","projectLink":"","publishTime":1517207717000,"title":"<em class='highlight'>A<\/em>ndroid 音频技术开发总结","visible":1,"zan":0},{"apkLink":"","author":" 陈文超happylion","chapterId":185,"chapterName":"组件化","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2236,"link":"https://mp.weixin.qq.com/s/Tw-04it4_G4AgUmRO8imaw","niceDate":"2018-01-29","origin":"","projectLink":"","publishTime":1517192099000,"title":"美团猫眼电影<em class='highlight'>a<\/em>ndroid模块化实战","visible":1,"zan":0},{"apkLink":"http://www.wanandroid.com/blogimgs/57a54bc0-5855-433c-8af6-59c0a68fc0c5.apk","author":"wangzailfm","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"使用Kotlin构建的wanandroid客户端\r\nKotlin + MVP + Kotlin-Coroutines + Retrofit2(GsonCallAdapterFactory + CoroutineCallAdapterFactory)\r\n\r\n","envelopePic":"http://www.wanandroid.com/blogimgs/2f98fdd8-523f-48fc-a2a0-d20b90041b34.jpeg","id":2235,"link":"http://www.wanandroid.com/blog/show/2029","niceDate":"2018-01-28","origin":"","projectLink":"https://github.com/wangzailfm/WanAndroidClient","publishTime":1517150407000,"title":"【开源完整项目】w<em class='highlight'>a<\/em>n<em class='highlight'>a<\/em>ndroid客户端","visible":1,"zan":0},{"apkLink":"http://www.wanandroid.com/blogimgs/2840d80f-b099-417f-a00b-17e1910bd21a.apk","author":"DuanJiaNing","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"【我的音乐-Musicoco】 音乐播放器，功能：通过耳机和通知栏快捷控制音乐播放、创建歌单、本地歌曲搜索、记忆播放、自动切换到夜间模式、定时停止播放、应用主题自定义以及播放界面风格选择等功能。\r\n","envelopePic":"http://www.wanandroid.com/blogimgs/fb84255b-697a-48f8-9cba-d785b22266fd.jpg","id":2234,"link":"http://www.wanandroid.com/blog/show/2027","niceDate":"2018-01-28","origin":"","projectLink":"https://github.com/DuanJiaNing/Musicoco","publishTime":1517149791000,"title":"【开源完整项目】Musicoco 管理本地音乐的<em class='highlight'>a<\/em>pp","visible":1,"zan":0},{"apkLink":"http://www.wanandroid.com/blogimgs/538bddd9-eda7-4568-800c-2cd1bc77ab93.apk","author":"Kyson","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"Android开发者在性能检测方面的工具一直比较匮乏，仅有的一些工具，比如Android Device Monitor，使用起来也有些繁琐，使用起来对开发者有一定的要求。而线上的App监控更无从谈起。所以需要有一个系统能够提供Debug和Release阶段全方位的监控，更深入地了解对App运行时的状态。\r\n","envelopePic":"http://www.wanandroid.com/blogimgs/8483ff55-692b-4ac3-ae01-d7605b870d1f.png","id":2233,"link":"http://www.wanandroid.com/blog/show/2026","niceDate":"2018-01-28","origin":"","projectLink":"https://github.com/Kyson/AndroidGodEye/","publishTime":1517149661000,"title":"【开源完整项目】 <em class='highlight'>A<\/em>ndroidGodEye 监控<em class='highlight'>A<\/em>ndroid数据指标","visible":1,"zan":0},{"apkLink":"http://www.wanandroid.com/blogimgs/e4d48142-8668-487d-8d37-83a6566555ba.apk","author":"Rayhahah","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"一款资讯类应用~~~o(*￣▽￣*)ブ，MVP+Retrofit+Rxjava\r\n","envelopePic":"http://www.wanandroid.com/blogimgs/b8ed8741-75f9-47a8-8148-0540644f3f83.jpg","id":2232,"link":"http://www.wanandroid.com/blog/show/2024","niceDate":"2018-01-28","origin":"","projectLink":"https://github.com/Rayhahah/EasySports","publishTime":1517149531000,"title":"【开源完整项目】仿虎扑应用E<em class='highlight'>a<\/em>sySport","visible":1,"zan":0},{"apkLink":"http://www.wanandroid.com/blogimgs/be28932a-5946-4eed-89ee-9d919ba7ec75.apk","author":"maoruibin","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"一个实现『划词翻译』功能的 Android 应用 ，可能是目前 Android 市场上翻译效率最高的一款应用。\r\n\r\n","envelopePic":"http://www.wanandroid.com/blogimgs/9249453d-0578-410f-8237-3c6e204c0c4b.gif","id":2231,"link":"http://www.wanandroid.com/blog/show/2025","niceDate":"2018-01-28","origin":"","projectLink":"https://github.com/maoruibin/TranslateApp","publishTime":1517149256000,"title":"【开源完整项目】咕咚翻译<em class='highlight'>A<\/em>pp","visible":1,"zan":0},{"apkLink":"","author":" JensenChen","chapterId":307,"chapterName":"Apk诞生记","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2229,"link":"https://juejin.im/post/5a69c0ccf265da3e2a0dc9aa","niceDate":"2018-01-26","origin":"","projectLink":"","publishTime":1516936185000,"title":"10分钟了解<em class='highlight'>A<\/em>ndroid项目构建流程","visible":1,"zan":0},{"apkLink":"","author":"BryantPang","chapterId":254,"chapterName":"新闻资讯","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2228,"link":"https://github.com/BryantPang/ReadHub","niceDate":"2018-01-26","origin":"","projectLink":"","publishTime":1516935679000,"title":"Re<em class='highlight'>a<\/em>dHub 新闻资讯客户端","visible":1,"zan":0},{"apkLink":"","author":"DuanJiaNing","chapterId":256,"chapterName":"音乐、视频类","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2227,"link":"https://github.com/DuanJiaNing/Musicoco","niceDate":"2018-01-26","origin":"","projectLink":"","publishTime":1516935645000,"title":"Musicoco  管理本地音乐的<em class='highlight'>a<\/em>pp","visible":1,"zan":0}],"offset":0,"over":false,"pageCount":57,"size":20,"total":1129}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean {
        /**
         * curPage : 1
         * datas : [{"apkLink":"","author":"小编","chapterId":292,"chapterName":"pdf电子书","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2254,"link":"http://www.wanandroid.com/blog/show/2036","niceDate":"18小时前","origin":"","projectLink":"","publishTime":1517562829000,"title":"[PDF] Cm<em class='highlight'>a<\/em>ke实践下载","visible":1,"zan":0},{"apkLink":"","author":"cfanr","chapterId":182,"chapterName":"JNI编程","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2253,"link":"http://cfanr.cn/2017/08/26/Android-NDK-dev-CMake-s-usage/","niceDate":"18小时前","origin":"","projectLink":"","publishTime":1517561475000,"title":"<em class='highlight'>A<\/em>ndroid NDK 开发：CM<em class='highlight'>a<\/em>ke 使用","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2250,"link":"http://www.jianshu.com/p/cd984dd5aae8","niceDate":"22小时前","origin":"","projectLink":"","publishTime":1517548568000,"title":"<em class='highlight'>A<\/em>ndroid RxJ<em class='highlight'>a<\/em>v<em class='highlight'>a<\/em>：这是一份全面 & 详细 的RxJ<em class='highlight'>a<\/em>v<em class='highlight'>a<\/em>操作符 使用攻略","visible":1,"zan":0},{"apkLink":"","author":"看书的小蜗牛","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2251,"link":"http://www.jianshu.com/p/18e4efa2e0a2","niceDate":"22小时前","origin":"","projectLink":"","publishTime":1517548568000,"title":"<em class='highlight'>A<\/em>ndroid面试题：bindService获取代理是同步还是异步","visible":1,"zan":0},{"apkLink":"","author":"依然范特稀西","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2252,"link":"http://www.jianshu.com/p/a44bd13d2fa0","niceDate":"22小时前","origin":"","projectLink":"","publishTime":1517548568000,"title":"高效 | 几个<em class='highlight'>A<\/em>ndroid Studio 小技巧","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2249,"link":"http://www.jianshu.com/p/e1c48a00951a","niceDate":"22小时前","origin":"","projectLink":"","publishTime":1517548567000,"title":"<em class='highlight'>A<\/em>ndroid RxJ<em class='highlight'>a<\/em>v<em class='highlight'>a<\/em> 2.0：手把手带你 源码分析RxJ<em class='highlight'>a<\/em>v<em class='highlight'>a<\/em>","visible":1,"zan":0},{"apkLink":"","author":"恋猫月亮","chapterId":97,"chapterName":"音视频","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1630,"link":"http://www.jianshu.com/p/bb5876f34902","niceDate":"2天前","origin":"","projectLink":"","publishTime":1517407935000,"title":"<em class='highlight'>A<\/em>ndroid 列表视频的全屏、自动小窗口优化实践","visible":1,"zan":0},{"apkLink":"","author":"小编","chapterId":247,"chapterName":"防逆向","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2246,"link":"https://chaman.gitbooks.io/techblog/Android/apk-enchance/apk-enchance.html","niceDate":"2018-01-30","origin":"","projectLink":"","publishTime":1517302918000,"title":"<em class='highlight'>A<\/em>ndroid <em class='highlight'>A<\/em>PK加固技术初探","visible":1,"zan":0},{"apkLink":"","author":"小编","chapterId":305,"chapterName":"各类工具","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2245,"link":"http://www.wanandroid.com/blog/show/2034","niceDate":"2018-01-30","origin":"","projectLink":"","publishTime":1517297965000,"title":"工具分享 ：J<em class='highlight'>a<\/em>dx 反编译神器","visible":1,"zan":0},{"apkLink":"","author":"LowCoder","chapterId":99,"chapterName":"具体案例","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2242,"link":"http://blog.csdn.net/sdfsdfdfa/article/details/79120665","niceDate":"2018-01-30","origin":"","projectLink":"","publishTime":1517277762000,"title":"<em class='highlight'>A<\/em>ndroid拼图滑块验证码控件","visible":1,"zan":0},{"apkLink":"","author":"箫鉴哥","chapterId":97,"chapterName":"音视频","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2237,"link":"https://yq.aliyun.com/articles/8637","niceDate":"2018-01-29","origin":"","projectLink":"","publishTime":1517207717000,"title":"<em class='highlight'>A<\/em>ndroid 音频技术开发总结","visible":1,"zan":0},{"apkLink":"","author":" 陈文超happylion","chapterId":185,"chapterName":"组件化","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2236,"link":"https://mp.weixin.qq.com/s/Tw-04it4_G4AgUmRO8imaw","niceDate":"2018-01-29","origin":"","projectLink":"","publishTime":1517192099000,"title":"美团猫眼电影<em class='highlight'>a<\/em>ndroid模块化实战","visible":1,"zan":0},{"apkLink":"http://www.wanandroid.com/blogimgs/57a54bc0-5855-433c-8af6-59c0a68fc0c5.apk","author":"wangzailfm","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"使用Kotlin构建的wanandroid客户端\r\nKotlin + MVP + Kotlin-Coroutines + Retrofit2(GsonCallAdapterFactory + CoroutineCallAdapterFactory)\r\n\r\n","envelopePic":"http://www.wanandroid.com/blogimgs/2f98fdd8-523f-48fc-a2a0-d20b90041b34.jpeg","id":2235,"link":"http://www.wanandroid.com/blog/show/2029","niceDate":"2018-01-28","origin":"","projectLink":"https://github.com/wangzailfm/WanAndroidClient","publishTime":1517150407000,"title":"【开源完整项目】w<em class='highlight'>a<\/em>n<em class='highlight'>a<\/em>ndroid客户端","visible":1,"zan":0},{"apkLink":"http://www.wanandroid.com/blogimgs/2840d80f-b099-417f-a00b-17e1910bd21a.apk","author":"DuanJiaNing","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"【我的音乐-Musicoco】 音乐播放器，功能：通过耳机和通知栏快捷控制音乐播放、创建歌单、本地歌曲搜索、记忆播放、自动切换到夜间模式、定时停止播放、应用主题自定义以及播放界面风格选择等功能。\r\n","envelopePic":"http://www.wanandroid.com/blogimgs/fb84255b-697a-48f8-9cba-d785b22266fd.jpg","id":2234,"link":"http://www.wanandroid.com/blog/show/2027","niceDate":"2018-01-28","origin":"","projectLink":"https://github.com/DuanJiaNing/Musicoco","publishTime":1517149791000,"title":"【开源完整项目】Musicoco 管理本地音乐的<em class='highlight'>a<\/em>pp","visible":1,"zan":0},{"apkLink":"http://www.wanandroid.com/blogimgs/538bddd9-eda7-4568-800c-2cd1bc77ab93.apk","author":"Kyson","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"Android开发者在性能检测方面的工具一直比较匮乏，仅有的一些工具，比如Android Device Monitor，使用起来也有些繁琐，使用起来对开发者有一定的要求。而线上的App监控更无从谈起。所以需要有一个系统能够提供Debug和Release阶段全方位的监控，更深入地了解对App运行时的状态。\r\n","envelopePic":"http://www.wanandroid.com/blogimgs/8483ff55-692b-4ac3-ae01-d7605b870d1f.png","id":2233,"link":"http://www.wanandroid.com/blog/show/2026","niceDate":"2018-01-28","origin":"","projectLink":"https://github.com/Kyson/AndroidGodEye/","publishTime":1517149661000,"title":"【开源完整项目】 <em class='highlight'>A<\/em>ndroidGodEye 监控<em class='highlight'>A<\/em>ndroid数据指标","visible":1,"zan":0},{"apkLink":"http://www.wanandroid.com/blogimgs/e4d48142-8668-487d-8d37-83a6566555ba.apk","author":"Rayhahah","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"一款资讯类应用~~~o(*￣▽￣*)ブ，MVP+Retrofit+Rxjava\r\n","envelopePic":"http://www.wanandroid.com/blogimgs/b8ed8741-75f9-47a8-8148-0540644f3f83.jpg","id":2232,"link":"http://www.wanandroid.com/blog/show/2024","niceDate":"2018-01-28","origin":"","projectLink":"https://github.com/Rayhahah/EasySports","publishTime":1517149531000,"title":"【开源完整项目】仿虎扑应用E<em class='highlight'>a<\/em>sySport","visible":1,"zan":0},{"apkLink":"http://www.wanandroid.com/blogimgs/be28932a-5946-4eed-89ee-9d919ba7ec75.apk","author":"maoruibin","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"一个实现『划词翻译』功能的 Android 应用 ，可能是目前 Android 市场上翻译效率最高的一款应用。\r\n\r\n","envelopePic":"http://www.wanandroid.com/blogimgs/9249453d-0578-410f-8237-3c6e204c0c4b.gif","id":2231,"link":"http://www.wanandroid.com/blog/show/2025","niceDate":"2018-01-28","origin":"","projectLink":"https://github.com/maoruibin/TranslateApp","publishTime":1517149256000,"title":"【开源完整项目】咕咚翻译<em class='highlight'>A<\/em>pp","visible":1,"zan":0},{"apkLink":"","author":" JensenChen","chapterId":307,"chapterName":"Apk诞生记","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2229,"link":"https://juejin.im/post/5a69c0ccf265da3e2a0dc9aa","niceDate":"2018-01-26","origin":"","projectLink":"","publishTime":1516936185000,"title":"10分钟了解<em class='highlight'>A<\/em>ndroid项目构建流程","visible":1,"zan":0},{"apkLink":"","author":"BryantPang","chapterId":254,"chapterName":"新闻资讯","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2228,"link":"https://github.com/BryantPang/ReadHub","niceDate":"2018-01-26","origin":"","projectLink":"","publishTime":1516935679000,"title":"Re<em class='highlight'>a<\/em>dHub 新闻资讯客户端","visible":1,"zan":0},{"apkLink":"","author":"DuanJiaNing","chapterId":256,"chapterName":"音乐、视频类","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2227,"link":"https://github.com/DuanJiaNing/Musicoco","niceDate":"2018-01-26","origin":"","projectLink":"","publishTime":1516935645000,"title":"Musicoco  管理本地音乐的<em class='highlight'>a<\/em>pp","visible":1,"zan":0}]
         * offset : 0
         * over : false
         * pageCount : 57
         * size : 20
         * total : 1129
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        @SerializedName("datas")
        private List<Result> results;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<Result> getResults() {
            return results;
        }

        public void setResults(List<Result> results) {
            this.results = results;
        }

        public static class Result {
            /**
             * apkLink :
             * author : 小编
             * chapterId : 292
             * chapterName : pdf电子书
             * collect : false
             * courseId : 13
             * desc :
             * envelopePic :
             * id : 2254
             * link : http://www.wanandroid.com/blog/show/2036
             * niceDate : 18小时前
             * origin :
             * projectLink :
             * publishTime : 1517562829000
             * title : [PDF] Cm<em class='highlight'>a</em>ke实践下载
             * visible : 1
             * zan : 0
             */

            private String apkLink;
            private String author;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String envelopePic;
            private int id;
            private String link;
            private String niceDate;
            private String origin;
            private String projectLink;
            private long publishTime;
            private String title;
            private int visible;
            private int zan;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }
        }
    }
}
