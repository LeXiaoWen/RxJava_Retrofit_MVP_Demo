package com.leo.rxjava_retrofit_mvp_demo.mvp;


import java.util.List;

/**
 * Created by Leo on 2017/3/15.
 */

public class CookListModel {


    /**
     * 菜谱实体类
     * status : true
     * total : 101254
     * tngou : [{"count":40,"description":"我这次做的量刚好是一袋太古红糖，一罐六必居芝麻酱，这样不会剩下多余的料，不过做出来比较甜，不喜欢甜口的可以适当减量，不过做的就是糖火烧，还是甜一些好吃，味道更醇厚","fcount":0,"food":"富强粉,黄油,芝麻酱,红糖,色拉油,酵母,泡打粉","id":11778,"images":"","img":"/cook/080222/1bd191b98d375ee2c8f5b0aa499026f1.jpg","keywords":"红糖 色拉油 芝麻酱 火烧 擀面杖 ","name":"糖火烧","rcount":0},{"count":40,"description":"有材料一起搅拌均匀即可","fcount":0,"food":"黑芝麻粉,花生酱,黑糖,奶油","id":30505,"images":"","img":"/cook/080301/bb7cef41256e7d860565b1e0aaca44c3.jpg","keywords":"材料 花生酱 黑芝麻 做法 均匀 ","name":"芝麻面包酱","rcount":0},{"count":40,"description":"莴笋洗净，削去表皮和老筋，用擦丝器擦成细丝，加1/2小勺盐拌匀，放置10分钟；活虾洗净，放入滚水中汆烫2分钟后，捞起放入凉开水中过凉，去掉虾头和虾壳备用；（虾子汆烫的时间不要过长，放入锅中等水再次沸腾煮2分钟即可，煮得过久会使虾肉变老，失去爽口的感觉）2","fcount":0,"food":"莴笋,活虾,朝天椒,白醋","id":11806,"images":"","img":"/cook/080222/a3c4db4f91bc98ba2ae2b373e2cb417b.jpg","keywords":"放入 小勺 莴笋 朝天椒 调味汁 ","name":"酸辣莴笋虾","rcount":0},{"count":40,"description":"依个人喜好放入适量蜂蜜调匀即可","fcount":0,"food":"黄耆,红枣,甘草,麻仁,陈皮,蜂蜜","id":30522,"images":"","img":"/cook/080301/347f227abfb27ff07cdfea18c3ef44de.jpg","keywords":"蜂蜜 材料 放入 红枣 适量 ","name":"枣耆美颜汤","rcount":0},{"count":40,"description":"材料燕麦片80公克，胚芽2大匙，枸杞子1小匙，果糖15克做法1","fcount":0,"food":"燕麦片,胚芽,枸杞子,果糖","id":30538,"images":"","img":"/cook/080301/bc3039111f6247fc4f814e6765318114.jpg","keywords":"材料 燕麦片 枸杞子 小匙 混入 ","name":"胚芽燕麦粥","rcount":0},{"count":40,"description":"将冷冻后的优格与其他材料放入果汁机打匀即可","fcount":0,"food":"香蕉,优格,柳橙汁","id":30558,"images":"","img":"/cook/080301/ad697e401c3819cb14eed8c3dd34719f.jpg","keywords":"材料 放入 冷冻 果汁机 柳橙汁 ","name":"香蕉冷饮","rcount":0},{"count":40,"description":"材料猪肉萝卜丝馅：，萝卜1根，猪肉馅适量，香葱，姜片，盐，鸡精，酱油，花椒油，香油，白胡椒粉，蚝油，料酒，饺子：，面粉250克，热水220ml做法1","fcount":0,"food":"猪肉,萝卜丝,萝卜,猪肉馅,香葱,姜片,鸡精,酱油,花椒油,香油,白胡椒粉,蚝油,料酒,饺子,面粉","id":11852,"images":"","img":"/cook/080222/e52c14a5c3826cc46983eb42e4a41b6e.jpg","keywords":"萝卜丝 饺子 搅拌 白萝卜 肉馅 ","name":"红油香醋萝卜丝蒸饺","rcount":0},{"count":40,"description":"菜谱简介卷土司时可先铺上一张玻璃纸，再将土司卷起，一来方便携带，二来可以防止土司失水变干","fcount":0,"food":"土司,地瓜,柳橙汁","id":30585,"images":"","img":"/cook/080301/e34ab168106cde2c0b5d57eeed3360d6.jpg","keywords":"土司 餐巾纸 地瓜 柳橙汁 三色 ","name":"黄金薯泥土司卷","rcount":0},{"count":40,"description":"（我卷的面团总是在二发中发的不一样高，为了解决擀卷时间差的问题，我特意把三个面团都擀成长条状再卷，想这样可以弥补一点时间差，哪想还是发的不一样高","fcount":0,"food":"蛋液,牛奶,面粉","id":11864,"images":"","img":"/cook/080222/a79a57be14c13339a39ef91233039ffe.jpg","keywords":"面团 保鲜膜 发酵 椭圆形 不一样 ","name":"鲜奶吐司","rcount":0},{"count":40,"description":"将作法1静置20∼30分钟，等其略出盐水汁后再将菜馅的水分稍微压干，加入鲜肉馅以顺时钟方向搅拌均匀即可","fcount":0,"food":"雪里红","id":30595,"images":"","img":"/cook/080301/a5c632e68e9ecfa0ee51a3d0d56649d6.jpg","keywords":"雪里红 顺时钟方向 加入 盛器 洗净 ","name":"饺子雪里红馅","rcount":0},{"count":40,"description":"松弛好的面团取出，用擀面棍擀成长度是玛琪琳3倍，宽度稍微多一点的面片；然后将玛琪琳放中间，两头的面片折过来包住玛琪琳，包上保鲜膜，冷藏30分钟5","fcount":0,"food":"低筋面粉,酥油,椰蓉","id":11870,"images":"","img":"/cook/080222/5caab57116cda5883862c3162a01b33d.jpg","keywords":"保鲜膜 面团 冷藏 第二层 敲击 ","name":"起酥椰蓉条","rcount":0},{"count":40,"description":"材料九层塔末2大匙，蛋白1个，酱油1又1/2大匙，辣油1又1/2大匙，果糖2/3大匙，冷开水1又1/2大匙做法所有材料全部搅拌均匀即可","fcount":0,"food":"九层塔,蛋白,酱油,辣油,果糖","id":30628,"images":"","img":"/cook/080301/4ba14ed6c72085828445003045bc2c01.jpg","keywords":"大匙 材料 冷开水 蛋白 所有 ","name":"麻辣沾酱","rcount":0},{"count":40,"description":"材料沙茶酱2大匙，蛋黄1个，葱花1又1/2大匙，蒜末1/2大匙，酱油1又1/2大匙，细砂糖1/3大匙，冷开水1大匙做法所有材料全部搅拌均匀即可","fcount":0,"food":"沙茶酱,蛋黄,葱花,酱油","id":30631,"images":"","img":"/cook/080301/a057b3e2139417cf5277644ad3990401.jpg","keywords":"大匙 材料 细砂糖 冷开水 所有 ","name":"沙茶蛋黄沾酱","rcount":0},{"count":40,"description":"菜谱简介老妈买了南瓜，准备给毛毛吃的，被我拿来做面包了前2天做了芒果餐包，忽然觉得金色的面包好漂亮，所以今天我玩南瓜","fcount":0,"food":"高粉,南瓜泥,酵母,动物性鲜奶油,牛奶,南瓜,黄油","id":11896,"images":"","img":"/cook/080222/0068e92f8537c58900f0496a33e40501.jpg","keywords":"面团 南瓜 模具 发酵 即可 ","name":"南瓜吐司","rcount":0},{"count":40,"description":"研发了这款红枣低糖版感觉非常适合俺，红枣的好处只怕大伙都知道俺就不说啦，配方公布如下（独家秘方噢），喜欢的朋友不防试下","fcount":0,"food":"鸡蛋,低粉,玉米油,牛奶,白醋,红枣","id":11900,"images":"","img":"/cook/080222/b39e23af20d21d45ee21e1b6296d7da5.jpg","keywords":"蛋白 红枣 蛋糕 加入 油纸 ","name":"红枣蛋糕卷","rcount":0},{"count":40,"description":"将嫩姜洗净、切片，放入冷水中浸泡约3小时以去除苦涩味，然后用纱布拧干，放入甘醋汁中浸泡1小时以上即可","fcount":0,"food":"嫩姜","id":30739,"images":"","img":"/cook/080301/10ebb70fce9f69aa75bf54a7788d1b20.jpg","keywords":"砂糖 浸泡 放入 水中 苦涩味 ","name":"寿司姜","rcount":0},{"count":40,"description":"准备1个寿司卷帘，将海苔光滑的一面朝下舖在卷帘上，前端预留1公分，其余平舖一层寿司饭，再分别摆入事先准备好的各式材料，卷起后，即完成所有细卷","fcount":0,"food":"小黄瓜,寿司饭,海苔","id":30746,"images":"","img":"/cook/080301/25ae0c044dedd65c67a64bdd27fef9c9.jpg","keywords":"小黄瓜 寿司 材料 卷帘 海苔 ","name":"河童细卷","rcount":0},{"count":40,"description":"将作法1与作法2的材料以及黑芝麻一起混入寿司饭中搅拌均匀，然后取适量填入豆皮即可","fcount":0,"food":"豆皮,厚蛋烧,香菇,干瓢,红萝卜,黑芝麻,鸭儿芹,寿司饭","id":30749,"images":"","img":"/cook/080301/25a2541842ec338bc4ec76e654a75d27.jpg","keywords":"红萝卜 黑芝麻 材料 备用 切碎 ","name":"稻荷寿司","rcount":0},{"count":40,"description":"在周末洒满阳光的午后，黑枣的微酸，冰糖的清甜，和红枣的香味，在空中漫溢开来，整个房间也变得温暖甜蜜起来","fcount":0,"food":"红枣,黑枣,冰糖,蜂蜜","id":11937,"images":"","img":"/cook/080222/4435b3b44de286a78a64dc796e077e94.jpg","keywords":"冰糖 枣泥 红枣 黑枣 适量 ","name":"蜂蜜双枣茶","rcount":0},{"count":40,"description":"将长汤匙抵住杯中边缘，再将奇异果汁沿汤匙徐徐倒入，让果汁顺着汤匙滑入杯底，即可形成上下两个颜色层","fcount":0,"food":"仙草,奇异果,冰块","id":30808,"images":"","img":"/cook/080301/0194ec67c83f3943ddd143acb6ce61af.jpg","keywords":"果汁 仙草 冰块 汤匙 奇异 ","name":"奇异仙草冰沙","rcount":0}]
     */

    private boolean status;
    private int total;
    private List<TngouBean> tngou;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<TngouBean> getTngou() {
        return tngou;
    }

    public void setTngou(List<TngouBean> tngou) {
        this.tngou = tngou;
    }

    public static class TngouBean {
        /**
         * count : 40
         * description : 我这次做的量刚好是一袋太古红糖，一罐六必居芝麻酱，这样不会剩下多余的料，不过做出来比较甜，不喜欢甜口的可以适当减量，不过做的就是糖火烧，还是甜一些好吃，味道更醇厚
         * fcount : 0
         * food : 富强粉,黄油,芝麻酱,红糖,色拉油,酵母,泡打粉
         * id : 11778
         * images :
         * img : /cook/080222/1bd191b98d375ee2c8f5b0aa499026f1.jpg
         * keywords : 红糖 色拉油 芝麻酱 火烧 擀面杖
         * name : 糖火烧
         * rcount : 0
         */

        private int count;
        private String description;
        private int fcount;
        private String food;
        private int id;
        private String images;
        private String img;
        private String keywords;
        private String name;
        private int rcount;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getFcount() {
            return fcount;
        }

        public void setFcount(int fcount) {
            this.fcount = fcount;
        }

        public String getFood() {
            return food;
        }

        public void setFood(String food) {
            this.food = food;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImages() {
            return images;
        }

        public void setImages(String images) {
            this.images = images;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRcount() {
            return rcount;
        }

        public void setRcount(int rcount) {
            this.rcount = rcount;
        }
    }
}
