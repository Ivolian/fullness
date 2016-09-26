package ivo.fullness;

/**
 * Created by ivolianer on 2016/9/25.
 * 这个类放一路完成这个 DEMO 上遇到的问题和探索
 */
public class Question {

    // 1. 如何不显示白屏。
    // http://www.jianshu.com/p/cd6ef8d3d74d
    // 注意避免图片太大，造成 OOM。

    // 2. 什么是 OOM。
    // 运行如下代码。
    /*
        int MB = 250;
        int length = 1024 * 1024 * MB;
        byte[] bytes = new byte[length];
     */
    /*
        java.lang.OutOfMemoryError: Failed to allocate a 262144012 byte allocation with 16777216 free bytes and 46MB until OOM
     */
    // 这段异常我也看不懂，allocate 250 MB with 16MB free and 46MB until OOM...
    // 应该就是说申请的内存太多了，具体内存限制应该会根据手机不同而有所差异。
    // 有时我在 debug 下能编译通过， release 后却 OOM 了。

    // 3. 图片 OOM
    /*
        可以看下这个：http://blog.csdn.net/guolin_blog/article/details/50727753
        比如我的 1加3手机，就是 480dpi，所以 xxhdpi 下的图片不会被缩放。
        xxxhdpi 中的图片反而会被缩小高和宽，放在 ldpi 下的同一张图片则可能造成 OOM。

        bitmap 内存占用计算： 宽 * 高 * 4，单位字节。
        Image are loaded with the {@link Bitmap.Config#ARGB_8888} config by default.
        Each pixel is stored on 4 bytes.
     */
    /*
        dpi范围	        密度
        0dpi ~ 120dpi	ldpi
        120dpi ~ 160dpi	mdpi
        160dpi ~ 240dpi	hdpi
        240dpi ~ 320dpi	xhdpi
        320dpi ~ 480dpi	xxhdpi
        480dpi ~ 640dpi	xxxhdpi
     */
    /*
        估计 scaleType 也会对内存大小占用造成影响，这个暂时不研究咯。
     */



}
