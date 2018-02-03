package com.didi.wancore.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by didi on 2018/2/3.
 */

public class ArticleBean {

    /**
     * http://www.wanandroid.com/article/list/1/json
     * http://www.wanandroid.com/article/list/0/json?cid=168
     * data : {"curPage":2,"datas":[{"apkLink":"","author":" JensenChen","chapterId":307,"chapterName":"Apk诞生记","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2229,"link":"https://juejin.im/post/5a69c0ccf265da3e2a0dc9aa","niceDate":"2018-01-26","origin":"","projectLink":"","publishTime":1516936185000,"title":"10分钟了解Android项目构建流程","visible":1,"zan":0},{"apkLink":"","author":"BryantPang","chapterId":254,"chapterName":"新闻资讯","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2228,"link":"https://github.com/BryantPang/ReadHub","niceDate":"2018-01-26","origin":"","projectLink":"","publishTime":1516935679000,"title":"ReadHub 新闻资讯客户端","visible":1,"zan":0},{"apkLink":"","author":"DuanJiaNing","chapterId":256,"chapterName":"音乐、视频类","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2227,"link":"https://github.com/DuanJiaNing/Musicoco","niceDate":"2018-01-26","origin":"","projectLink":"","publishTime":1516935645000,"title":"Musicoco  管理本地音乐的app","visible":1,"zan":0},{"apkLink":"","author":"Kyson","chapterId":255,"chapterName":"工具类","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2226,"link":"https://github.com/Kyson/AndroidGodEye/","niceDate":"2018-01-26","origin":"","projectLink":"","publishTime":1516935614000,"title":"AndroidGodEye 监控Android数据指标","visible":1,"zan":0},{"apkLink":"","author":"小编","chapterId":292,"chapterName":"pdf电子书","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2225,"link":"http://wanandroid.com/blog/show/2022","niceDate":"2018-01-25","origin":"","projectLink":"","publishTime":1516872111000,"title":"1月24日 区块链线上分享 ppt下载","visible":1,"zan":0},{"apkLink":"","author":"看书的小蜗牛","chapterId":99,"chapterName":"具体案例","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2224,"link":"https://mp.weixin.qq.com/s/tHkltAvN1Ila8L3brdAYGQ","niceDate":"2018-01-25","origin":"","projectLink":"","publishTime":1516846304000,"title":"仿天猫、京东拖拽商品详情","visible":1,"zan":0},{"apkLink":"","author":"一口仨馍","chapterId":306,"chapterName":"多线程与并发","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2223,"link":"https://mp.weixin.qq.com/s/KuKROR8c4Bc1CdXE6AxB2g","niceDate":"2018-01-25","origin":"","projectLink":"","publishTime":1516846283000,"title":"应该了解的一些并发基础知识","visible":1,"zan":0},{"apkLink":"","author":"小编","chapterId":305,"chapterName":"各类工具","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2221,"link":"http://www.wanandroid.com/blog/show/2021","niceDate":"2018-01-24","origin":"","projectLink":"","publishTime":1516778328000,"title":"工具分享 ：Jad 实现Class转Java文件","visible":1,"zan":0},{"apkLink":"","author":"MikanMu","chapterId":304,"chapterName":"基础源码","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2220,"link":"http://blog.csdn.net/mhmyqn/article/details/48087247","niceDate":"2018-01-24","origin":"","projectLink":"","publishTime":1516771306000,"title":"java枚举类型的实现原理","visible":1,"zan":0},{"apkLink":"","author":"许强_Rrtoyewx","chapterId":97,"chapterName":"音视频","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2219,"link":"http://blog.csdn.net/zhi184816/article/details/52514138","niceDate":"2018-01-23","origin":"","projectLink":"","publishTime":1516700285000,"title":"Android 视频分离和合成(MediaMuxer和MediaExtractor)","visible":1,"zan":0},{"apkLink":"","author":" 狼王2","chapterId":97,"chapterName":"音视频","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2218,"link":"http://blog.csdn.net/langwang2/article/details/50189977","niceDate":"2018-01-23","origin":"","projectLink":"","publishTime":1516691445000,"title":"[译]Android音频: 如何使用AudioTrack播放一个WAV格式文件?","visible":1,"zan":0},{"apkLink":"","author":"小编","chapterId":301,"chapterName":"快速开发","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2217,"link":"https://github.com/jpush/aurora-imui","niceDate":"2018-01-23","origin":"","projectLink":"","publishTime":1516687965000,"title":"通用IM UI组件","visible":1,"zan":0},{"apkLink":"","author":"池建强","chapterId":303,"chapterName":"区块链","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2216,"link":"https://mp.weixin.qq.com/s/i1gXPKl17Lby4P9kbqKB4A","niceDate":"2018-01-23","origin":"","projectLink":"","publishTime":1516671517000,"title":"九分钟了解区块链","visible":1,"zan":0},{"apkLink":"","author":" Kai Sun","chapterId":233,"chapterName":"framework-四大组件","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2215,"link":"https://juejin.im/post/5a61973bf265da3e2d338196","niceDate":"2018-01-22","origin":"","projectLink":"","publishTime":1516632365000,"title":"探究 Android View 绘制流程，Activity 的 View 如何展示到屏幕","visible":1,"zan":0},{"apkLink":"","author":"依然范特稀西","chapterId":70,"chapterName":"retrofit","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2032,"link":"http://www.jianshu.com/p/5bc866b9cbb9","niceDate":"2018-01-22","origin":"","projectLink":"","publishTime":1516632217000,"title":"Retrofit + RxJava ＋ OkHttp 让网络请求变的简单-基础篇","visible":1,"zan":0},{"apkLink":"","author":"依然范特稀西","chapterId":70,"chapterName":"retrofit","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2031,"link":"http://www.jianshu.com/p/811ba49d0748","niceDate":"2018-01-22","origin":"","projectLink":"","publishTime":1516632214000,"title":"Retrofit + RxJava ＋ OkHttp 让网络请求变的简单-封装篇","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":77,"chapterName":"响应式编程","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2070,"link":"http://www.jianshu.com/p/2c54f9ccd52f","niceDate":"2018-01-22","origin":"","projectLink":"","publishTime":1516632186000,"title":"Android：Retrofit 结合 RxJava的优雅使用（含实例教程）","visible":1,"zan":0},{"apkLink":"","author":"JensenChen","chapterId":169,"chapterName":"gradle","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2214,"link":"https://juejin.im/post/5a634e4df265da3e2b168233","niceDate":"2018-01-20","origin":"","projectLink":"","publishTime":1516461803000,"title":"关于Android Gradle你需要知道这些（2）","visible":1,"zan":0},{"apkLink":"","author":"JensenChen","chapterId":169,"chapterName":"gradle","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2213,"link":"https://juejin.im/post/5a634ddff265da3e3c6c3dbe","niceDate":"2018-01-20","origin":"","projectLink":"","publishTime":1516461788000,"title":"关于Android Gradle你需要知道这些（1）","visible":1,"zan":0},{"apkLink":"","author":"今日头条技术团队","chapterId":302,"chapterName":"ANR","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2212,"link":"https://mp.weixin.qq.com/s/IFgXvPdiEYDs5cDriApkxQ","niceDate":"2018-01-19","origin":"","projectLink":"","publishTime":1516360528000,"title":"剖析 SharedPreference apply 引起的 ANR 问题","visible":1,"zan":0}],"offset":20,"over":false,"pageCount":52,"size":20,"total":1038}
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
         * curPage : 2
         * datas : [{"apkLink":"","author":" JensenChen","chapterId":307,"chapterName":"Apk诞生记","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2229,"link":"https://juejin.im/post/5a69c0ccf265da3e2a0dc9aa","niceDate":"2018-01-26","origin":"","projectLink":"","publishTime":1516936185000,"title":"10分钟了解Android项目构建流程","visible":1,"zan":0},{"apkLink":"","author":"BryantPang","chapterId":254,"chapterName":"新闻资讯","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2228,"link":"https://github.com/BryantPang/ReadHub","niceDate":"2018-01-26","origin":"","projectLink":"","publishTime":1516935679000,"title":"ReadHub 新闻资讯客户端","visible":1,"zan":0},{"apkLink":"","author":"DuanJiaNing","chapterId":256,"chapterName":"音乐、视频类","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2227,"link":"https://github.com/DuanJiaNing/Musicoco","niceDate":"2018-01-26","origin":"","projectLink":"","publishTime":1516935645000,"title":"Musicoco  管理本地音乐的app","visible":1,"zan":0},{"apkLink":"","author":"Kyson","chapterId":255,"chapterName":"工具类","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2226,"link":"https://github.com/Kyson/AndroidGodEye/","niceDate":"2018-01-26","origin":"","projectLink":"","publishTime":1516935614000,"title":"AndroidGodEye 监控Android数据指标","visible":1,"zan":0},{"apkLink":"","author":"小编","chapterId":292,"chapterName":"pdf电子书","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2225,"link":"http://wanandroid.com/blog/show/2022","niceDate":"2018-01-25","origin":"","projectLink":"","publishTime":1516872111000,"title":"1月24日 区块链线上分享 ppt下载","visible":1,"zan":0},{"apkLink":"","author":"看书的小蜗牛","chapterId":99,"chapterName":"具体案例","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2224,"link":"https://mp.weixin.qq.com/s/tHkltAvN1Ila8L3brdAYGQ","niceDate":"2018-01-25","origin":"","projectLink":"","publishTime":1516846304000,"title":"仿天猫、京东拖拽商品详情","visible":1,"zan":0},{"apkLink":"","author":"一口仨馍","chapterId":306,"chapterName":"多线程与并发","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2223,"link":"https://mp.weixin.qq.com/s/KuKROR8c4Bc1CdXE6AxB2g","niceDate":"2018-01-25","origin":"","projectLink":"","publishTime":1516846283000,"title":"应该了解的一些并发基础知识","visible":1,"zan":0},{"apkLink":"","author":"小编","chapterId":305,"chapterName":"各类工具","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2221,"link":"http://www.wanandroid.com/blog/show/2021","niceDate":"2018-01-24","origin":"","projectLink":"","publishTime":1516778328000,"title":"工具分享 ：Jad 实现Class转Java文件","visible":1,"zan":0},{"apkLink":"","author":"MikanMu","chapterId":304,"chapterName":"基础源码","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2220,"link":"http://blog.csdn.net/mhmyqn/article/details/48087247","niceDate":"2018-01-24","origin":"","projectLink":"","publishTime":1516771306000,"title":"java枚举类型的实现原理","visible":1,"zan":0},{"apkLink":"","author":"许强_Rrtoyewx","chapterId":97,"chapterName":"音视频","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2219,"link":"http://blog.csdn.net/zhi184816/article/details/52514138","niceDate":"2018-01-23","origin":"","projectLink":"","publishTime":1516700285000,"title":"Android 视频分离和合成(MediaMuxer和MediaExtractor)","visible":1,"zan":0},{"apkLink":"","author":" 狼王2","chapterId":97,"chapterName":"音视频","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2218,"link":"http://blog.csdn.net/langwang2/article/details/50189977","niceDate":"2018-01-23","origin":"","projectLink":"","publishTime":1516691445000,"title":"[译]Android音频: 如何使用AudioTrack播放一个WAV格式文件?","visible":1,"zan":0},{"apkLink":"","author":"小编","chapterId":301,"chapterName":"快速开发","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2217,"link":"https://github.com/jpush/aurora-imui","niceDate":"2018-01-23","origin":"","projectLink":"","publishTime":1516687965000,"title":"通用IM UI组件","visible":1,"zan":0},{"apkLink":"","author":"池建强","chapterId":303,"chapterName":"区块链","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2216,"link":"https://mp.weixin.qq.com/s/i1gXPKl17Lby4P9kbqKB4A","niceDate":"2018-01-23","origin":"","projectLink":"","publishTime":1516671517000,"title":"九分钟了解区块链","visible":1,"zan":0},{"apkLink":"","author":" Kai Sun","chapterId":233,"chapterName":"framework-四大组件","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2215,"link":"https://juejin.im/post/5a61973bf265da3e2d338196","niceDate":"2018-01-22","origin":"","projectLink":"","publishTime":1516632365000,"title":"探究 Android View 绘制流程，Activity 的 View 如何展示到屏幕","visible":1,"zan":0},{"apkLink":"","author":"依然范特稀西","chapterId":70,"chapterName":"retrofit","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2032,"link":"http://www.jianshu.com/p/5bc866b9cbb9","niceDate":"2018-01-22","origin":"","projectLink":"","publishTime":1516632217000,"title":"Retrofit + RxJava ＋ OkHttp 让网络请求变的简单-基础篇","visible":1,"zan":0},{"apkLink":"","author":"依然范特稀西","chapterId":70,"chapterName":"retrofit","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2031,"link":"http://www.jianshu.com/p/811ba49d0748","niceDate":"2018-01-22","origin":"","projectLink":"","publishTime":1516632214000,"title":"Retrofit + RxJava ＋ OkHttp 让网络请求变的简单-封装篇","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":77,"chapterName":"响应式编程","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2070,"link":"http://www.jianshu.com/p/2c54f9ccd52f","niceDate":"2018-01-22","origin":"","projectLink":"","publishTime":1516632186000,"title":"Android：Retrofit 结合 RxJava的优雅使用（含实例教程）","visible":1,"zan":0},{"apkLink":"","author":"JensenChen","chapterId":169,"chapterName":"gradle","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2214,"link":"https://juejin.im/post/5a634e4df265da3e2b168233","niceDate":"2018-01-20","origin":"","projectLink":"","publishTime":1516461803000,"title":"关于Android Gradle你需要知道这些（2）","visible":1,"zan":0},{"apkLink":"","author":"JensenChen","chapterId":169,"chapterName":"gradle","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2213,"link":"https://juejin.im/post/5a634ddff265da3e3c6c3dbe","niceDate":"2018-01-20","origin":"","projectLink":"","publishTime":1516461788000,"title":"关于Android Gradle你需要知道这些（1）","visible":1,"zan":0},{"apkLink":"","author":"今日头条技术团队","chapterId":302,"chapterName":"ANR","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2212,"link":"https://mp.weixin.qq.com/s/IFgXvPdiEYDs5cDriApkxQ","niceDate":"2018-01-19","origin":"","projectLink":"","publishTime":1516360528000,"title":"剖析 SharedPreference apply 引起的 ANR 问题","visible":1,"zan":0}]
         * offset : 20
         * over : false
         * pageCount : 52
         * size : 20
         * total : 1038
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        @SerializedName("datas")
        private List<Article> articles;

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

        public List<Article> getArticles() {
            return articles;
        }

        public void setArticles(List<Article> articles) {
            this.articles = articles;
        }

        public static class Article {
            /**
             * apkLink :
             * author :  JensenChen
             * chapterId : 307
             * chapterName : Apk诞生记
             * collect : false
             * courseId : 13
             * desc :
             * envelopePic :
             * id : 2229
             * link : https://juejin.im/post/5a69c0ccf265da3e2a0dc9aa
             * niceDate : 2018-01-26
             * origin :
             * projectLink :
             * publishTime : 1516936185000
             * title : 10分钟了解Android项目构建流程
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
