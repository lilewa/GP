package wuliu.centrin.com.gp.activity;



import android.view.View;
import android.widget.AdapterView;


import wuliu.centrin.com.gp.base.BaseActivity;
import wuliu.centrin.com.gp.util.HttpUtil;

/**
 * Created by lile on 2018/6/5.
 */

public class MainActivity extends BaseActivity implements AdapterView.OnItemClickListener, HttpUtil.OnHttpPost {


    /**
     * Callback method to be invoked when an item in this AdapterView has
     * been clicked.
     * <p>
     * Implementers can call getItemAtPosition(position) if they need
     * to access the data associated with the selected item.
     *
     * @param parent   The AdapterView where the click happened.
     * @param view     The view within the AdapterView that was clicked (this
     *                 will be a view provided by the adapter)
     * @param position The position of the view in the adapter.
     * @param id       The row id of the item that was clicked.
     */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onHttpSuccess(String result, int type) {

    }

    @Override
    public void onHttpFailure(String msg, int type) {

    }
}
