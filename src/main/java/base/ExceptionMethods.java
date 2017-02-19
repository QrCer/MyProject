package base;

import java.util.ArrayList;

/**
 * Created by QrCeric on 17/02/2017.
 */
public class ExceptionMethods {

    public static void main(String[] var0) {
        Object var1 = null;

        try {
            ((ArrayList) var1).get(1);
        } catch (Exception var3) {
            var3.initCause(new Exception("234//**\n     * 酒店详情页新旧版mvt的实验ID、变量ID\n     *//*\n    public static final String hotelDetailPageExpId = \"34\";\n    public static final String hotelDetailPageVarId = \"28\";\n\n    /**\n     * 房型展示名称mvt\n     *//*\n    public static final String RateplanDisplayNamePageExpId = \"77\";\n    public static final String RateplanDisplayNamePageVarId = \"73\";\n\n    //**\n     * 酒店详情页RP最大露出数量\n     *//*\n    public static final String rpMaxNumberExpId = \"96\";\n    public static final String rpMaxNumberVarId = \"83\";\n    */\n\n\n\t\t// 酒店详情页rp露出数量mvt\n        String rpMaxNumberMvtResult = mvtProxyService.getRPMaxNumberMvtResult();\n        vm.setRpMaxNumber(MvtUtils.getRPMaxNumber(rpMaxNumberMvtResult));\n\n        // 详情页新旧版MVT\n        String hotelDetailMvtResult = mvtProxyService.getHotelDetailMvtResult();\n        String hotelDetailView = MvtUtils.getDetailView(hotelDetailMvtResult, detailBean.getMvtPageVersion());\n        mvtResultModelMap.put(\"h5fx_hotel_detail\", new MvtResultModel(\"h5fx_hotel_detail\", hotelDetailView));\n        model.addAttribute(\"hotelDetailView\", hotelDetailView);\n\n        // 详情页新旧版MVT\n        String hotelDetailMvtResult = mvtProxyService.getHotelDetailMvtResult();\n        String hotelDetailView = MvtUtils.getDetailView(hotelDetailMvtResult, detailBean.getMvtPageVersion());\n        mvtResultModelMap.put(\"h5fx_hotel_detail\", new MvtResultModel(\"h5fx_hotel_detail\", hotelDetailView));\n        model.addAttribute(\"hotelDetailView\", hotelDetailView);   \n\n详情页：\n        RpMaxNumber\n        hotelDetailView\n\n        h5fx_hotel_detail"));
            System.out.println(var3.getLocalizedMessage());
            System.out.println(var3.getMessage());
            System.out.println(var3.toString());
            System.out.println(var3.getStackTrace());
            System.out.println(var3.getCause());
        }

    }

}
