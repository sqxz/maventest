import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName JsonConveterToMysql
 * @Description TDD
 * @Author shenzhenghuan
 * @Date 2021/2/3 14:27
 **/
public class JsonConveterToMysql {
    public String json;
    public String tableName;
    public String tableComment;

    public String ConvteToMysql(String json) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DROP TABLE IF EXISTS `CreateBrandDeposit`;\n" +
                "CREATE TABLE `CreateBrandDeposit`  (\n" +
                "  `id` int(11) NOT NULL,\n");
        Gson gson= new Gson();
        JsonObject jsonObject = gson.fromJson(json,JsonObject.class);
        Set<Map.Entry<String, JsonElement>> set = jsonObject.entrySet();
        for (Map.Entry<String, JsonElement> entry : set) {
            if (entry.getValue().toString().indexOf("\"") == 0
                    || entry.getValue().isJsonArray()
                    || entry.getValue().toString().indexOf("{") ==0
                    || entry.getValue().toString().contains("false")
                    || entry.getValue().toString().contains("true")
                    || entry.getValue().toString().length() > 4) {
                stringBuilder.append("`"+entry.getKey()+"`"+" varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,"+"\n");
            }else{
                stringBuilder.append("`"+entry.getKey()+"`"+" int(11) NULL DEFAULT NULL,"+"\n");

            }

        }
        stringBuilder.append("`comment` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,\n" +
                "  `expected` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,\n" +
                "  PRIMARY KEY (`id`) USING BTREE,\n" +
                "  UNIQUE INDEX `CreateBrandDeposit_id_uindex`(`id`) USING BTREE\n" +
                ") ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '创建品牌储值卡' ROW_FORMAT = Compact;\n" +
                "\n" +
                "SET FOREIGN_KEY_CHECKS = 1;");
        return stringBuilder.toString();
    }


    public String insertValueByJson(String json,String tableName){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("insert into "+ tableName +"(id,");
        Gson gson= new Gson();
        JsonObject jsonObject = gson.fromJson(json,JsonObject.class);
        Set<Map.Entry<String, JsonElement>> set = jsonObject.entrySet();
        for (Map.Entry<String, JsonElement> entry : set) {
            stringBuilder.append(entry.getKey()+",");
        }
        stringBuilder.append("comment,expected) VALUES(1,");
        for (Map.Entry<String, JsonElement> entry : set) {
            if (entry.getValue().isJsonArray() || entry.getValue().toString().indexOf("{") == 0){
                stringBuilder.append("\'"+entry.getValue()+"\'"+",");
            }else {
                stringBuilder.append(entry.getValue()+",");
            }
        }

        stringBuilder.append("null,null)");
        return stringBuilder.toString();
    }




    public static void main(String[] args) {
        JsonConveterToMysql jsonConveterToMysql = new JsonConveterToMysql();
        String json = "{\"card_name\":\"储值卡0203\",\"special_note\":\"预约购课更方便更优惠\",\"card_price\":\"100\",\"sell_price\":\"10\",\"num\":\"10\",\"unit\":1,\"card_consumer_id\":[1,2,3,4,5,6,7,8],\"consumption_range\":1,\"consumer_shop_list\":[],\"support_sales\":1,\"sell_shop_list\":[],\"start_time\":\"2021-02-03\",\"end_time\":\"2021-02-28\",\"endOpen\":false,\"bg_image\":{\"color\":\"#514847\",\"image_id\":0,\"image_key\":\"image/default/bg-card-selection-1.png\",\"image_url\":\"http://styd-saas-public.oss-cn-shanghai.aliyuncs.com/image/default/bg-card-selection-1.png\",\"index\":1},\"appConfig\":true,\"card_contents\":\"\",\"description\":\"\",\"_is_transfer\":true,\"is_transfer\":1,\"transfer_unit\":2,\"transfer_num\":4,\"card_sell_type\":[2,1]}";
        System.out.println(jsonConveterToMysql.ConvteToMysql(json));
        System.out.println(jsonConveterToMysql.insertValueByJson(json,"createDepositCard"));

    }
}
