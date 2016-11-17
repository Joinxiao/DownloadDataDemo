package cn.yhz.jsj.xc.hxu.downloaddatademo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Toast;


import com.google.gson.Gson;

import org.xutils.HttpManager;
import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.x;

import cn.yhz.jsj.xc.hxu.constant.Constant;
import cn.yhz.jsj.xc.hxu.enitity.Data;
import cn.yhz.jsj.xc.hxu.views.AboutItemClickView;

import static android.R.attr.name;
import static android.R.attr.value;
import static android.icu.util.BuddhistCalendar.BE;


public class MainActivity extends AppCompatActivity {

    private AboutItemClickView aiClickMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        initDasta();
        //        RequestParams argPar=new RequestParams(url);
        //        argPar.addBodyParameter(name, value);
        //        argPar.addHeader(name, value);
        //        x.http().request(HttpMethod.GET, argPar, new CommonCallback<String>());
        String url = Constant.SECOND_PAGE_ALLPOPULARRECIPES;
        RequestParams params = new RequestParams(url);

        params.addBodyParameter("limit", "10");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid", "0");
        params.addBodyParameter("uuid", "b3b08f17bca548949af2ddc9c88e65f5");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("appqs", "haodourecipe://haodou" +
                ".com/recommend/recipe/?keyword=%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1&title=%E7%83" +
                "%AD%E9%97%A8%E8%8F%9C%E8%B0%B1&tab=%E5%85%A8%E9%83%A8%3A%E7%83%AD%E9%97%A8%E8%8F" +
                "%9C%E8%B0%B1%7C%E7%A7%81%E4%BA%BA%3A%E7%A7%81%E4%BA%BA%E5%AE%9A%E5%88%B6%7C%E6" +
                "%97%B6%E4%BB%A4%3A%E6%97%B6%E4%BB%A4%E4%BD%B3%E8%82%B4%7C%E8%BE%BE%E4%BA%BA%3A" +
                "%E8%BE%BE%E4%BA%BA%E8%8F%9C%E8%B0%B1%7C%E6%9C%80%E6%96%B0%3A%E6%9C%80%E6%96%B0" +
                "%E8%8F%9C%E8%B0%B1%7C%E7%83%98%E7%84%99%3A%E5%BF%AB%E4%B9%90%E7%9A%84%E7%83%98" +
                "%E7%84%99");
        params.addBodyParameter("type", "热门菜谱");

        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String s) {
                Log.i("Log", "下载的数据是：" + s);
            }

            @Override
            public void onError(Throwable throwable, boolean b) {

            }

            @Override
            public void onCancelled(CancelledException e) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    /**
     * 解析数据
     *
     * @param result
     */
    private void parseData(String result) {
        Gson gson = new Gson();
        Data data = gson.fromJson(result, Data.class);
        Log.i("Log", data.toString());
    }

    /**
     * 填充数据源
     */
    private void initDasta() {
        aiClickMenu = (AboutItemClickView) findViewById(R.id.ai_click_menu);
        aiClickMenu.setTvTitle("发布菜单");
        aiClickMenu.setIcon(R.mipmap.ico_center_camera);
        aiClickMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "点击了哦", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
