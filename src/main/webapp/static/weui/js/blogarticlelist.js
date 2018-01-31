$(function () {
    var geting = false;//是否加载信息，默认为false
    $(window).scroll(function () {
        //$(window).scrollTop()这个方法是当前滚动条滚动的距离
        //$(window).height()获取当前窗体的高度
        //$(document).height()获取当前文档的高度
        var bot = 50; 
        //bot是底部距离的高度
        if ((bot + $(window).scrollTop()) >=
        ($(document).height() - $(window).height())) {
            //当底部基本距离+滚动的高度〉=文档的高度-窗体的高度时；
            //我们需要去异步加载数据了 
            blogarticlelist();
        }        
    });     

    function blogarticlelist() {
        if (geting) {
            return;
        }

        var page = $(".blog_wrap").attr("page");
        try {
            page = parseInt(page);
        } catch (e) {
            page = 1;
        }

        var url = "/blog/getlist?username=" + username + "&page=" + page;

        $.get(url, function (data) {
            $.each(data, function (i) {
                var art = data[i];
                var html = '<dl class="blog_list clearfix"> <dt><a href="/article/details?id=' + art.articleid + '">';

                if (art.channel != "") {
                    html += '【' + art.type + '】';
                }

                html += art.title + '</a></dt>';
                html += '         <dd><span><em>' + art.posttime + '</em><em>|</em><a href="#">' + art.viewcount + '阅读</a></span></dd>';
                html += '     </dl>';

                $(".blog_wrap").append(html);
            });

            setTimeout(function () {
                $(".blog_wrap").attr("page", page + 1);
                geting = false;
            }, 2000);
        });
    }

});

