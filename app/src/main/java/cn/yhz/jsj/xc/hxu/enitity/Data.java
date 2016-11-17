package cn.yhz.jsj.xc.hxu.enitity;

import java.util.List;

/**
 * Simple to Introduction
 *
 * @Description: [一句话描述该类的功能]
 * @Author: 原海忠
 * @CreateDate: 2016/11/16
 * @Version: [v1.0]
 */
public class Data {


    /**
     * status : 200
     * result : {"count":200,"list":[{"StoreId":4862,"StoreTitle":"本来物语",
     * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/11/26/56567f2aa1036.jpg",
     * "UserId":"9040630","UserName":"本来物语","GoodsId":2135,"Title":"六星骏枣｜顶级品质 肉厚劲道 不打生长素 无甜蜜素处理",
     * "SubTitle":"来自新疆喀什，每棵枣树只臻选6-7颗的树冠枣","DealPrice":"￥24.00","ShippingInfo":"配送上门/全国快递",
     * "CoverUrl":"http://pimg3.hoto.cn/goods/2016/01/04/2135_568a4cb88afba_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2135","LikeCount":18,"Stock":121,
     * "IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":[],"Weight":"160克","Price":"￥40.00"},
     * {"StoreId":4862,"StoreTitle":"本来物语","StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/11/26/56567f2aa1036.jpg","UserId":"9040630","UserName":"本来物语",
     * "GoodsId":3837,"Title":"高原藜麦｜全营养 完全蛋白 天然碱性 宇航员的食品",
     * "SubTitle":"高原粮品，合作社自己种植，原生态、不打农药、施有机肥","DealPrice":"￥88.00","ShippingInfo":"配送上门/全国快递",
     * "CoverUrl":"http://pimg1.hoto.cn/goods/2016/01/04/3837_568a550de9387_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=3837","LikeCount":2,"Stock":1283,
     * "IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["包邮"],"Weight":"500克","Price":"￥108
     * .00"},{"StoreId":4862,"StoreTitle":"本来物语","StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/11/26/56567f2aa1036.jpg","UserId":"9040630","UserName":"本来物语",
     * "GoodsId":2109,"Title":"琉璃苣蜜｜淡雅别致 舌尖2 全球第一大马场",
     * "SubTitle":"180万亩草原，欧洲使用了七百年的药草，珍贵自在一滴特别的甜","DealPrice":"￥59.00",
     * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1.hoto
     * .cn/goods/2016/01/12/2109_5694948e93b9b_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=2109","LikeCount":11,"Stock":658,"IsShippingFree":2,"IsLike":0,
     * "CartNum":0,"Labels":["包邮"],"Weight":"220克","Price":"￥80.00"},{"StoreId":4862,
     * "StoreTitle":"本来物语","StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/11/26/56567f2aa1036
     * .jpg","UserId":"9040630","UserName":"本来物语","GoodsId":2040,"Title":"山花蜂蜜｜舌尖2 皇家马场 自然花香",
     * "SubTitle":"在180万亩草原，臻选真正大自然花香的甜蜜","DealPrice":"￥59.00","ShippingInfo":"配送上门/全国快递",
     * "CoverUrl":"http://pimg1.hoto.cn/goods/2016/01/12/2040_56949654a520b_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2040","LikeCount":19,"Stock":613,
     * "IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["包邮"],"Weight":"220克","Price":"￥80
     * .00"},{"StoreId":4862,"StoreTitle":"本来物语","StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/11/26/56567f2aa1036.jpg","UserId":"9040630","UserName":"本来物语",
     * "GoodsId":3833,"Title":"六星灰枣｜顶级品质 肉厚 润口甘甜 不打生长素 无甜蜜素处理",
     * "SubTitle":"来自新疆喀什，每棵枣树只臻选6-7颗的树冠枣","DealPrice":"￥38.00","ShippingInfo":"配送上门/全国快递",
     * "CoverUrl":"http://pimg3.hoto.cn/goods/2016/01/04/3833_568a4c0372b33_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=3833","LikeCount":0,"Stock":250,
     * "IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":[],"Weight":"180克","Price":"￥50.00"},
     * {"StoreId":4862,"StoreTitle":"本来物语","StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/11/26/56567f2aa1036.jpg","UserId":"9040630","UserName":"本来物语",
     * "GoodsId":4317,"Title":"【年货】顶级西梅+六星大枣 钟情初恋 养颜小食 送给心爱的她","SubTitle":"顶级西梅2罐+六星灰枣1罐+六星骏枣1罐",
     * "DealPrice":"￥138.00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1.hoto
     * .cn/goods/2016/01/18/4317_569bc78cee7b3_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=4317","LikeCount":1,"Stock":88,"IsShippingFree":2,"IsLike":0,
     * "CartNum":0,"Labels":["包邮"],"Weight":"660克","Price":"￥198.00"},{"StoreId":4742,
     * "StoreTitle":"薇薇美食坊","StoreLogoUrl":"http://pimg1.hoto.cn/store/2016/03/15/56e78aaa2b9a7
     * .jpg","UserId":"9020555","UserName":"薇薇安1004","GoodsId":5178,"Title":"野生蓝莓干（10包包邮）",
     * "SubTitle":"微信175408310","DealPrice":"￥5.00","ShippingInfo":"配送上门/全国快递",
     * "CoverUrl":"http://pimg1.hoto.cn/goods/2016/03/08/5178_56de381e506b3_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=5178","LikeCount":2,"Stock":100,
     * "IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":[],"Weight":"16克","Price":"￥8.00"},
     * {"StoreId":4742,"StoreTitle":"薇薇美食坊","StoreLogoUrl":"http://pimg1.hoto
     * .cn/store/2016/03/15/56e78aaa2b9a7.jpg","UserId":"9020555","UserName":"薇薇安1004",
     * "GoodsId":2047,"Title":"枣夹核桃","SubTitle":"店主微信175408310","DealPrice":"￥48.00",
     * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2.hoto
     * .cn/goods/2015/11/27/2047_5657b25b5197c_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=2047","LikeCount":4,"Stock":50,"IsShippingFree":2,"IsLike":0,
     * "CartNum":0,"Labels":["包邮"],"Weight":"250克","Price":"￥58.00"},{"StoreId":3880,
     * "StoreTitle":"嘉礼出品","StoreLogoUrl":"http://pimg3.hoto.cn/store/2016/07/31/579e0cede73f2
     * .jpg","UserId":"8880675","UserName":"觅甜宝宝","GoodsId":1303,"Title":"老北京酸梅汤原料包 5份装",
     * "SubTitle":"宫廷传承清凉品 地道老北京味儿","DealPrice":"￥39.00","ShippingInfo":"同城快递",
     * "CoverUrl":"http://pimg2.hoto.cn/goods/2016/02/22/1303_56cb2c96ed086_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1303","LikeCount":18,"Stock":58,
     * "IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":[],"Weight":"325克","Price":"￥50.00"},
     * {"StoreId":4742,"StoreTitle":"薇薇美食坊","StoreLogoUrl":"http://pimg1.hoto
     * .cn/store/2016/03/15/56e78aaa2b9a7.jpg","UserId":"9020555","UserName":"薇薇安1004",
     * "GoodsId":3078,"Title":"【春节预售】李大肚古方红糖","SubTitle":"店主微信175408310","DealPrice":"￥30.00",
     * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1.hoto
     * .cn/goods/2015/12/14/3078_566e8e395984e_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=3078","LikeCount":11,"Stock":193,"IsShippingFree":2,"IsLike":0,
     * "CartNum":0,"Labels":["包邮"],"Weight":"250克","Price":"￥32.00"},{"StoreId":4802,
     * "StoreTitle":"一地一味","StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/11/24/565412a84dacf
     * .jpg","UserId":"9028689","UserName":"一地一味","GoodsId":1983,"Title":"【新疆】有机若羌灰枣",
     * "SubTitle":"无添加 产量少 自然风干","DealPrice":"￥29.90","ShippingInfo":"全国快递",
     * "CoverUrl":"http://pimg1.hoto.cn/goods/2015/11/25/1983_565588d01eeab_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1983","LikeCount":6,"Stock":200,
     * "IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["新人价","包邮"],"Weight":"300克",
     * "Price":"￥35.00"},{"StoreId":1699,"StoreTitle":"牛牛爱电影","StoreLogoUrl":"http://pimg2.hoto
     * .cn/store/2015/09/07/55ed654fc6e93.jpg","UserId":"8506955","UserName":"爱吃的喜多多",
     * "GoodsId":2794,"Title":"东北黑蜂 百花花粉","SubTitle":"养生养颜，美容护肤","DealPrice":"￥39.00",
     * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2.hoto
     * .cn/goods/2015/12/09/2794_5667c63751c07_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=2794","LikeCount":1,"Stock":55,"IsShippingFree":1,"IsLike":0,
     * "CartNum":0,"Labels":["新人价"],"Weight":"250克","Price":"￥55.00"},{"StoreId":4802,
     * "StoreTitle":"一地一味","StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/11/24/565412a84dacf
     * .jpg","UserId":"9028689","UserName":"一地一味","GoodsId":3167,"Title":"【安徽】富硒大米500g*4",
     * "SubTitle":"手工筛选不打蜡含硒最高的石台富硒米","DealPrice":"￥29.90","ShippingInfo":"全国快递",
     * "CoverUrl":"http://pimg3.hoto.cn/goods/2015/12/16/3167_56712405b02de_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=3167","LikeCount":3,"Stock":500,
     * "IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["新人价","包邮"],"Weight":"2000克",
     * "Price":"￥68.00"},{"StoreId":4802,"StoreTitle":"一地一味","StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/11/24/565412a84dacf.jpg","UserId":"9028689","UserName":"一地一味",
     * "GoodsId":2837,"Title":"【辽宁】有机糙米300g*3","SubTitle":"辽宁建平有机糙米","DealPrice":"￥29.90",
     * "ShippingInfo":"全国快递","CoverUrl":"http://pimg3.hoto
     * .cn/goods/2015/12/10/2837_56692c37634ff_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=2837","LikeCount":1,"Stock":600,"IsShippingFree":2,"IsLike":0,
     * "CartNum":0,"Labels":["新人价","包邮"],"Weight":"900克","Price":"￥58.00"},{"StoreId":4802,
     * "StoreTitle":"一地一味","StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/11/24/565412a84dacf
     * .jpg","UserId":"9028689","UserName":"一地一味","GoodsId":2141,"Title":"【辽宁】有机红小豆300g*3",
     * "SubTitle":"心之谷，来自三北防护林","DealPrice":"￥29.90","ShippingInfo":"全国快递",
     * "CoverUrl":"http://pimg3.hoto.cn/goods/2015/11/30/2141_565c23755b091_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2141","LikeCount":1,"Stock":500,
     * "IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["新人价","包邮"],"Weight":"900克",
     * "Price":"￥58.00"},{"StoreId":1699,"StoreTitle":"牛牛爱电影","StoreLogoUrl":"http://pimg2.hoto
     * .cn/store/2015/09/07/55ed654fc6e93.jpg","UserId":"8506955","UserName":"爱吃的喜多多",
     * "GoodsId":2793,"Title":"自家一比一调配花粉蜜","SubTitle":"易吸收，美容养颜","DealPrice":"￥69.00",
     * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1.hoto
     * .cn/goods/2015/12/09/2793_5667c2ff24101_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=2793","LikeCount":0,"Stock":900,"IsShippingFree":1,"IsLike":0,
     * "CartNum":0,"Labels":["新人价"],"Weight":"500克","Price":"￥90.00"},{"StoreId":4802,
     * "StoreTitle":"一地一味","StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/11/24/565412a84dacf
     * .jpg","UserId":"9028689","UserName":"一地一味","GoodsId":3302,"Title":"【辽宁】有机黑米300g*3",
     * "SubTitle":"美味养生吃出来","DealPrice":"￥29.00","ShippingInfo":"全国快递","CoverUrl":"http://pimg3
     * .hoto.cn/goods/2015/12/19/3302_567506a9eae55_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=3302","LikeCount":1,"Stock":1000,"IsShippingFree":2,"IsLike":0,
     * "CartNum":0,"Labels":["新人价","包邮"],"Weight":"900克","Price":"￥58.00"},{"StoreId":3354,
     * "StoreTitle":"黄师傅的悦生活","StoreLogoUrl":"http://pimg1.hoto.cn/store/2015/10/27/562f259435e8b
     * .jpg","UserId":"8803700","UserName":"黄师傅的悦生活","GoodsId":1177,"Title":"【包邮】黄师傅 荔枝蜜 润肤养颜",
     * "SubTitle":"买即送水果手动榨汁器 柠檬压一个","DealPrice":"￥59.00","ShippingInfo":"全国快递",
     * "CoverUrl":"http://pimg2.hoto.cn/goods/2015/11/04/1177_563a0806678e3_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1177","LikeCount":2,"Stock":47,
     * "IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["新人价","包邮"],"Weight":"500克",
     * "Price":"￥120.00"},{"StoreId":6533,"StoreTitle":"暖乡知味","StoreLogoUrl":"http://pimg1.hoto
     * .cn/store/2016/01/15/5698a1c784f6b.jpg","UserId":"9359334","UserName":"暖乡知味",
     * "GoodsId":4375,"Title":"手工面条","SubTitle":"从此让你分辨面条和面条的区别，特别注意：凉水下锅！","DealPrice":"￥10.00",
     * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2.hoto
     * .cn/goods/2016/01/19/4375_569dc002c20e9_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=4375","LikeCount":6,"Stock":50,"IsShippingFree":1,"IsLike":0,
     * "CartNum":0,"Labels":[],"Weight":"500克"},{"StoreId":4214,"StoreTitle":"客家Lisa_shop",
     * "StoreLogoUrl":"http://pimg1.hoto.cn/store/2015/11/11/56429eff6acb6.jpg",
     * "UserId":"8933409","UserName":"客家Lisa","GoodsId":1460,"Title":"黑蒜","SubTitle":"改善人体健康",
     * "DealPrice":"￥25.00","ShippingInfo":"配送上门/同城快递","CoverUrl":"http://pimg3.hoto
     * .cn/goods/2015/11/11/1460_5642a7630ef25_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=1460","LikeCount":1,"Stock":100,"IsShippingFree":1,"IsLike":0,
     * "CartNum":0,"Labels":["新人价"],"Weight":"90克","Price":"￥45.00"}],"CartTotalNum":0,
     * "CateInfos":[{"CateId":0,"CateName":"全部"},{"CateId":"58","CateName":"家传秘制"},
     * {"CateId":"59","CateName":"肉禽蛋类"},{"CateId":"60","CateName":"烘焙面点"},{"CateId":"61",
     * "CateName":"水产海鲜"},{"CateId":"62","CateName":"腌腊制品"},{"CateId":"63","CateName":"调味酱料"},
     * {"CateId":"64","CateName":"养生养颜"},{"CateId":"65","CateName":"小吃零嘴"},{"CateId":"66",
     * "CateName":"冲调饮品"},{"CateId":"67","CateName":"生鲜果蔬"}]}
     */

    private int status;
    private ResultBean result;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * count : 200
         * list : [{"StoreId":4862,"StoreTitle":"本来物语","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/11/26/56567f2aa1036.jpg","UserId":"9040630","UserName":"本来物语",
         * "GoodsId":2135,"Title":"六星骏枣｜顶级品质 肉厚劲道 不打生长素 无甜蜜素处理",
         * "SubTitle":"来自新疆喀什，每棵枣树只臻选6-7颗的树冠枣","DealPrice":"￥24.00","ShippingInfo":"配送上门/全国快递",
         * "CoverUrl":"http://pimg3.hoto.cn/goods/2016/01/04/2135_568a4cb88afba_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2135","LikeCount":18,"Stock":121,
         * "IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":[],"Weight":"160克","Price":"￥40
         * .00"},{"StoreId":4862,"StoreTitle":"本来物语","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/11/26/56567f2aa1036.jpg","UserId":"9040630","UserName":"本来物语",
         * "GoodsId":3837,"Title":"高原藜麦｜全营养 完全蛋白 天然碱性 宇航员的食品",
         * "SubTitle":"高原粮品，合作社自己种植，原生态、不打农药、施有机肥","DealPrice":"￥88.00",
         * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1.hoto
         * .cn/goods/2016/01/04/3837_568a550de9387_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=3837","LikeCount":2,"Stock":1283,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["包邮"],"Weight":"500克","Price":"￥108.00"},{"StoreId":4862,
         * "StoreTitle":"本来物语","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/11/26/56567f2aa1036.jpg","UserId":"9040630","UserName":"本来物语",
         * "GoodsId":2109,"Title":"琉璃苣蜜｜淡雅别致 舌尖2 全球第一大马场",
         * "SubTitle":"180万亩草原，欧洲使用了七百年的药草，珍贵自在一滴特别的甜","DealPrice":"￥59.00",
         * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1.hoto
         * .cn/goods/2016/01/12/2109_5694948e93b9b_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=2109","LikeCount":11,"Stock":658,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["包邮"],"Weight":"220克","Price":"￥80.00"},{"StoreId":4862,
         * "StoreTitle":"本来物语","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/11/26/56567f2aa1036.jpg","UserId":"9040630","UserName":"本来物语",
         * "GoodsId":2040,"Title":"山花蜂蜜｜舌尖2 皇家马场 自然花香","SubTitle":"在180万亩草原，臻选真正大自然花香的甜蜜",
         * "DealPrice":"￥59.00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1.hoto
         * .cn/goods/2016/01/12/2040_56949654a520b_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=2040","LikeCount":19,"Stock":613,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["包邮"],"Weight":"220克","Price":"￥80.00"},{"StoreId":4862,
         * "StoreTitle":"本来物语","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/11/26/56567f2aa1036.jpg","UserId":"9040630","UserName":"本来物语",
         * "GoodsId":3833,"Title":"六星灰枣｜顶级品质 肉厚 润口甘甜 不打生长素 无甜蜜素处理",
         * "SubTitle":"来自新疆喀什，每棵枣树只臻选6-7颗的树冠枣","DealPrice":"￥38.00","ShippingInfo":"配送上门/全国快递",
         * "CoverUrl":"http://pimg3.hoto.cn/goods/2016/01/04/3833_568a4c0372b33_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=3833","LikeCount":0,"Stock":250,
         * "IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":[],"Weight":"180克","Price":"￥50
         * .00"},{"StoreId":4862,"StoreTitle":"本来物语","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/11/26/56567f2aa1036.jpg","UserId":"9040630","UserName":"本来物语",
         * "GoodsId":4317,"Title":"【年货】顶级西梅+六星大枣 钟情初恋 养颜小食 送给心爱的她",
         * "SubTitle":"顶级西梅2罐+六星灰枣1罐+六星骏枣1罐","DealPrice":"￥138.00","ShippingInfo":"配送上门/全国快递",
         * "CoverUrl":"http://pimg1.hoto.cn/goods/2016/01/18/4317_569bc78cee7b3_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=4317","LikeCount":1,"Stock":88,
         * "IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["包邮"],"Weight":"660克",
         * "Price":"￥198.00"},{"StoreId":4742,"StoreTitle":"薇薇美食坊","StoreLogoUrl":"http://pimg1
         * .hoto.cn/store/2016/03/15/56e78aaa2b9a7.jpg","UserId":"9020555","UserName":"薇薇安1004",
         * "GoodsId":5178,"Title":"野生蓝莓干（10包包邮）","SubTitle":"微信175408310","DealPrice":"￥5.00",
         * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1.hoto
         * .cn/goods/2016/03/08/5178_56de381e506b3_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=5178","LikeCount":2,"Stock":100,"IsShippingFree":1,"IsLike":0,
         * "CartNum":0,"Labels":[],"Weight":"16克","Price":"￥8.00"},{"StoreId":4742,
         * "StoreTitle":"薇薇美食坊","StoreLogoUrl":"http://pimg1.hoto
         * .cn/store/2016/03/15/56e78aaa2b9a7.jpg","UserId":"9020555","UserName":"薇薇安1004",
         * "GoodsId":2047,"Title":"枣夹核桃","SubTitle":"店主微信175408310","DealPrice":"￥48.00",
         * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2015/11/27/2047_5657b25b5197c_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=2047","LikeCount":4,"Stock":50,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["包邮"],"Weight":"250克","Price":"￥58.00"},{"StoreId":3880,
         * "StoreTitle":"嘉礼出品","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2016/07/31/579e0cede73f2.jpg","UserId":"8880675","UserName":"觅甜宝宝",
         * "GoodsId":1303,"Title":"老北京酸梅汤原料包 5份装","SubTitle":"宫廷传承清凉品 地道老北京味儿","DealPrice":"￥39
         * .00","ShippingInfo":"同城快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2016/02/22/1303_56cb2c96ed086_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=1303","LikeCount":18,"Stock":58,"IsShippingFree":1,"IsLike":0,
         * "CartNum":0,"Labels":[],"Weight":"325克","Price":"￥50.00"},{"StoreId":4742,
         * "StoreTitle":"薇薇美食坊","StoreLogoUrl":"http://pimg1.hoto
         * .cn/store/2016/03/15/56e78aaa2b9a7.jpg","UserId":"9020555","UserName":"薇薇安1004",
         * "GoodsId":3078,"Title":"【春节预售】李大肚古方红糖","SubTitle":"店主微信175408310","DealPrice":"￥30
         * .00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1.hoto
         * .cn/goods/2015/12/14/3078_566e8e395984e_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=3078","LikeCount":11,"Stock":193,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["包邮"],"Weight":"250克","Price":"￥32.00"},{"StoreId":4802,
         * "StoreTitle":"一地一味","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/11/24/565412a84dacf.jpg","UserId":"9028689","UserName":"一地一味",
         * "GoodsId":1983,"Title":"【新疆】有机若羌灰枣","SubTitle":"无添加 产量少 自然风干","DealPrice":"￥29.90",
         * "ShippingInfo":"全国快递","CoverUrl":"http://pimg1.hoto
         * .cn/goods/2015/11/25/1983_565588d01eeab_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=1983","LikeCount":6,"Stock":200,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["新人价","包邮"],"Weight":"300克","Price":"￥35.00"},{"StoreId":1699,
         * "StoreTitle":"牛牛爱电影","StoreLogoUrl":"http://pimg2.hoto
         * .cn/store/2015/09/07/55ed654fc6e93.jpg","UserId":"8506955","UserName":"爱吃的喜多多",
         * "GoodsId":2794,"Title":"东北黑蜂 百花花粉","SubTitle":"养生养颜，美容护肤","DealPrice":"￥39.00",
         * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2015/12/09/2794_5667c63751c07_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=2794","LikeCount":1,"Stock":55,"IsShippingFree":1,"IsLike":0,
         * "CartNum":0,"Labels":["新人价"],"Weight":"250克","Price":"￥55.00"},{"StoreId":4802,
         * "StoreTitle":"一地一味","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/11/24/565412a84dacf.jpg","UserId":"9028689","UserName":"一地一味",
         * "GoodsId":3167,"Title":"【安徽】富硒大米500g*4","SubTitle":"手工筛选不打蜡含硒最高的石台富硒米",
         * "DealPrice":"￥29.90","ShippingInfo":"全国快递","CoverUrl":"http://pimg3.hoto
         * .cn/goods/2015/12/16/3167_56712405b02de_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=3167","LikeCount":3,"Stock":500,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["新人价","包邮"],"Weight":"2000克","Price":"￥68.00"},{"StoreId":4802,
         * "StoreTitle":"一地一味","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/11/24/565412a84dacf.jpg","UserId":"9028689","UserName":"一地一味",
         * "GoodsId":2837,"Title":"【辽宁】有机糙米300g*3","SubTitle":"辽宁建平有机糙米","DealPrice":"￥29.90",
         * "ShippingInfo":"全国快递","CoverUrl":"http://pimg3.hoto
         * .cn/goods/2015/12/10/2837_56692c37634ff_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=2837","LikeCount":1,"Stock":600,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["新人价","包邮"],"Weight":"900克","Price":"￥58.00"},{"StoreId":4802,
         * "StoreTitle":"一地一味","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/11/24/565412a84dacf.jpg","UserId":"9028689","UserName":"一地一味",
         * "GoodsId":2141,"Title":"【辽宁】有机红小豆300g*3","SubTitle":"心之谷，来自三北防护林","DealPrice":"￥29
         * .90","ShippingInfo":"全国快递","CoverUrl":"http://pimg3.hoto
         * .cn/goods/2015/11/30/2141_565c23755b091_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=2141","LikeCount":1,"Stock":500,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["新人价","包邮"],"Weight":"900克","Price":"￥58.00"},{"StoreId":1699,
         * "StoreTitle":"牛牛爱电影","StoreLogoUrl":"http://pimg2.hoto
         * .cn/store/2015/09/07/55ed654fc6e93.jpg","UserId":"8506955","UserName":"爱吃的喜多多",
         * "GoodsId":2793,"Title":"自家一比一调配花粉蜜","SubTitle":"易吸收，美容养颜","DealPrice":"￥69.00",
         * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1.hoto
         * .cn/goods/2015/12/09/2793_5667c2ff24101_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=2793","LikeCount":0,"Stock":900,"IsShippingFree":1,"IsLike":0,
         * "CartNum":0,"Labels":["新人价"],"Weight":"500克","Price":"￥90.00"},{"StoreId":4802,
         * "StoreTitle":"一地一味","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/11/24/565412a84dacf.jpg","UserId":"9028689","UserName":"一地一味",
         * "GoodsId":3302,"Title":"【辽宁】有机黑米300g*3","SubTitle":"美味养生吃出来","DealPrice":"￥29.00",
         * "ShippingInfo":"全国快递","CoverUrl":"http://pimg3.hoto
         * .cn/goods/2015/12/19/3302_567506a9eae55_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=3302","LikeCount":1,"Stock":1000,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["新人价","包邮"],"Weight":"900克","Price":"￥58.00"},{"StoreId":3354,
         * "StoreTitle":"黄师傅的悦生活","StoreLogoUrl":"http://pimg1.hoto
         * .cn/store/2015/10/27/562f259435e8b.jpg","UserId":"8803700","UserName":"黄师傅的悦生活",
         * "GoodsId":1177,"Title":"【包邮】黄师傅 荔枝蜜 润肤养颜","SubTitle":"买即送水果手动榨汁器 柠檬压一个",
         * "DealPrice":"￥59.00","ShippingInfo":"全国快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2015/11/04/1177_563a0806678e3_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=1177","LikeCount":2,"Stock":47,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["新人价","包邮"],"Weight":"500克","Price":"￥120.00"},{"StoreId":6533,
         * "StoreTitle":"暖乡知味","StoreLogoUrl":"http://pimg1.hoto
         * .cn/store/2016/01/15/5698a1c784f6b.jpg","UserId":"9359334","UserName":"暖乡知味",
         * "GoodsId":4375,"Title":"手工面条","SubTitle":"从此让你分辨面条和面条的区别，特别注意：凉水下锅！","DealPrice":"￥10
         * .00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2016/01/19/4375_569dc002c20e9_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=4375","LikeCount":6,"Stock":50,"IsShippingFree":1,"IsLike":0,
         * "CartNum":0,"Labels":[],"Weight":"500克"},{"StoreId":4214,"StoreTitle":"客家Lisa_shop",
         * "StoreLogoUrl":"http://pimg1.hoto.cn/store/2015/11/11/56429eff6acb6.jpg",
         * "UserId":"8933409","UserName":"客家Lisa","GoodsId":1460,"Title":"黑蒜",
         * "SubTitle":"改善人体健康","DealPrice":"￥25.00","ShippingInfo":"配送上门/同城快递",
         * "CoverUrl":"http://pimg3.hoto.cn/goods/2015/11/11/1460_5642a7630ef25_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1460","LikeCount":1,"Stock":100,
         * "IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":["新人价"],"Weight":"90克","Price":"￥45
         * .00"}]
         * CartTotalNum : 0
         * CateInfos : [{"CateId":0,"CateName":"全部"},{"CateId":"58","CateName":"家传秘制"},
         * {"CateId":"59","CateName":"肉禽蛋类"},{"CateId":"60","CateName":"烘焙面点"},{"CateId":"61",
         * "CateName":"水产海鲜"},{"CateId":"62","CateName":"腌腊制品"},{"CateId":"63",
         * "CateName":"调味酱料"},{"CateId":"64","CateName":"养生养颜"},{"CateId":"65",
         * "CateName":"小吃零嘴"},{"CateId":"66","CateName":"冲调饮品"},{"CateId":"67","CateName":"生鲜果蔬"}]
         */

        private int count;
        private int CartTotalNum;
        private List<ListBean> list;
        private List<CateInfosBean> CateInfos;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getCartTotalNum() {
            return CartTotalNum;
        }

        public void setCartTotalNum(int CartTotalNum) {
            this.CartTotalNum = CartTotalNum;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public List<CateInfosBean> getCateInfos() {
            return CateInfos;
        }

        public void setCateInfos(List<CateInfosBean> CateInfos) {
            this.CateInfos = CateInfos;
        }

        public static class ListBean {
            /**
             * StoreId : 4862
             * StoreTitle : 本来物语
             * StoreLogoUrl : http://pimg3.hoto.cn/store/2015/11/26/56567f2aa1036.jpg
             * UserId : 9040630
             * UserName : 本来物语
             * GoodsId : 2135
             * Title : 六星骏枣｜顶级品质 肉厚劲道 不打生长素 无甜蜜素处理
             * SubTitle : 来自新疆喀什，每棵枣树只臻选6-7颗的树冠枣
             * DealPrice : ￥24.00
             * ShippingInfo : 配送上门/全国快递
             * CoverUrl : http://pimg3.hoto.cn/goods/2016/01/04/2135_568a4cb88afba_680_450.jpg
             * OpenUrl : haodourecipe://haodou.com/goods/detail?id=2135
             * LikeCount : 18
             * Stock : 121
             * IsShippingFree : 1
             * IsLike : 0
             * CartNum : 0
             * Labels : []
             * Weight : 160克
             * Price : ￥40.00
             */

            private int StoreId;
            private String StoreTitle;
            private String StoreLogoUrl;
            private String UserId;
            private String UserName;
            private int GoodsId;
            private String Title;
            private String SubTitle;
            private String DealPrice;
            private String ShippingInfo;
            private String CoverUrl;
            private String OpenUrl;
            private int LikeCount;
            private int Stock;
            private int IsShippingFree;
            private int IsLike;
            private int CartNum;
            private String Weight;
            private String Price;
            private List<?> Labels;

            public int getStoreId() {
                return StoreId;
            }

            public void setStoreId(int StoreId) {
                this.StoreId = StoreId;
            }

            public String getStoreTitle() {
                return StoreTitle;
            }

            public void setStoreTitle(String StoreTitle) {
                this.StoreTitle = StoreTitle;
            }

            public String getStoreLogoUrl() {
                return StoreLogoUrl;
            }

            public void setStoreLogoUrl(String StoreLogoUrl) {
                this.StoreLogoUrl = StoreLogoUrl;
            }

            public String getUserId() {
                return UserId;
            }

            public void setUserId(String UserId) {
                this.UserId = UserId;
            }

            public String getUserName() {
                return UserName;
            }

            public void setUserName(String UserName) {
                this.UserName = UserName;
            }

            public int getGoodsId() {
                return GoodsId;
            }

            public void setGoodsId(int GoodsId) {
                this.GoodsId = GoodsId;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getSubTitle() {
                return SubTitle;
            }

            public void setSubTitle(String SubTitle) {
                this.SubTitle = SubTitle;
            }

            public String getDealPrice() {
                return DealPrice;
            }

            public void setDealPrice(String DealPrice) {
                this.DealPrice = DealPrice;
            }

            public String getShippingInfo() {
                return ShippingInfo;
            }

            public void setShippingInfo(String ShippingInfo) {
                this.ShippingInfo = ShippingInfo;
            }

            public String getCoverUrl() {
                return CoverUrl;
            }

            public void setCoverUrl(String CoverUrl) {
                this.CoverUrl = CoverUrl;
            }

            public String getOpenUrl() {
                return OpenUrl;
            }

            public void setOpenUrl(String OpenUrl) {
                this.OpenUrl = OpenUrl;
            }

            public int getLikeCount() {
                return LikeCount;
            }

            public void setLikeCount(int LikeCount) {
                this.LikeCount = LikeCount;
            }

            public int getStock() {
                return Stock;
            }

            public void setStock(int Stock) {
                this.Stock = Stock;
            }

            public int getIsShippingFree() {
                return IsShippingFree;
            }

            public void setIsShippingFree(int IsShippingFree) {
                this.IsShippingFree = IsShippingFree;
            }

            public int getIsLike() {
                return IsLike;
            }

            public void setIsLike(int IsLike) {
                this.IsLike = IsLike;
            }

            public int getCartNum() {
                return CartNum;
            }

            public void setCartNum(int CartNum) {
                this.CartNum = CartNum;
            }

            public String getWeight() {
                return Weight;
            }

            public void setWeight(String Weight) {
                this.Weight = Weight;
            }

            public String getPrice() {
                return Price;
            }

            public void setPrice(String Price) {
                this.Price = Price;
            }

            public List<?> getLabels() {
                return Labels;
            }

            public void setLabels(List<?> Labels) {
                this.Labels = Labels;
            }

            @Override
            public String toString() {
                return "ListBean{" +
                        "StoreId=" + StoreId +
                        ", StoreTitle='" + StoreTitle + '\'' +
                        ", StoreLogoUrl='" + StoreLogoUrl + '\'' +
                        ", UserId='" + UserId + '\'' +
                        ", UserName='" + UserName + '\'' +
                        ", GoodsId=" + GoodsId +
                        ", Title='" + Title + '\'' +
                        ", SubTitle='" + SubTitle + '\'' +
                        ", DealPrice='" + DealPrice + '\'' +
                        ", ShippingInfo='" + ShippingInfo + '\'' +
                        ", CoverUrl='" + CoverUrl + '\'' +
                        ", OpenUrl='" + OpenUrl + '\'' +
                        ", LikeCount=" + LikeCount +
                        ", Stock=" + Stock +
                        ", IsShippingFree=" + IsShippingFree +
                        ", IsLike=" + IsLike +
                        ", CartNum=" + CartNum +
                        ", Weight='" + Weight + '\'' +
                        ", Price='" + Price + '\'' +
                        ", Labels=" + Labels +
                        '}';
            }
        }

        public static class CateInfosBean {
            /**
             * CateId : 0
             * CateName : 全部
             */

            private int CateId;
            private String CateName;

            public int getCateId() {
                return CateId;
            }

            public void setCateId(int CateId) {
                this.CateId = CateId;
            }

            public String getCateName() {
                return CateName;
            }

            public void setCateName(String CateName) {
                this.CateName = CateName;
            }
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "count=" + count +
                    ", CartTotalNum=" + CartTotalNum +
                    ", list=" + list +
                    ", CateInfos=" + CateInfos +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Data{" +
                "status=" + status +
                ", result=" + result +
                '}';
    }
}