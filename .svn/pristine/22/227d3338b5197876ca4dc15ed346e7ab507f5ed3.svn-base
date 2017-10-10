/**
 * 获取 #section1和#section3元素
 */
var section1 = document.querySelector('#section1');
var section3 = document.querySelector('#section3');
/**
 * 获取 .comtent元素的height 也就是网页可见区域的高度
 */
var height = section1.querySelector('.content').offsetHeight;
/**
 * 滚动监听
 */
window.onscroll = scroll;
/**
 * 当浏览器改变大小的时候重新获取.comtent元素的height(网页高度)
 */
window.onresize = function() {
    height = section1.querySelector('.content').offsetHeight;
    scroll();
};

function scroll() {
    /**
     * 获取滚动的高度(单位px)
     */
    var t = document.documentElement.scrollTop || document.body.scrollTop;
    section1.style.top = -t / 2 + 'px';
    /**
     * 1:10的比例
     */
    section3.style.top = (t / height >= 4 ? height - ((t - height * 4) * 10) : height) + 'px';
}