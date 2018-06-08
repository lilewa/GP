package wuliu.centrin.com.gp.util;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import wuliu.centrin.com.gp.R;
/**
 * Created by lile on 2018/6/5.
 */

public class ToastUtils {

    private static int GRAVITY = Gravity.CENTER;

    public static void showLong(Context context, String message) {
        show(context, message, Toast.LENGTH_LONG);
    }

    public static void showShort(Context context, String message) {
        show(context, message, Toast.LENGTH_SHORT);
    }

    public static void showLong(Context context, int textId) {
        show(context, textId, Toast.LENGTH_LONG);
    }

    public static void showShort(Context context, int textId) {
        show(context, textId, Toast.LENGTH_SHORT);
    }

    public static void show(Context context, String text, int duration) {
        Toast toast = Toast.makeText(context, text, duration);
        LinearLayout layout = (LinearLayout) toast.getView();
        layout.setBackgroundResource(R.drawable.bt_blue_bg_toast);
        layout.setGravity(GRAVITY);
        layout.setPadding(10,10,10,10);
        TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
        v.setGravity(GRAVITY);
        v.setTextColor(Color.WHITE);
        v.setTextSize(17);
        toast.show();
    }

    public static void show(Context context, int textId, int duration) {
        Toast toast = Toast.makeText(context, textId, duration);
        LinearLayout layout = (LinearLayout) toast.getView();
        layout.setBackgroundResource(R.drawable.bt_blue_bg_toast);
        layout.setGravity(GRAVITY);
        layout.setPadding(10,10,10,10);
        TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
        v.setGravity(GRAVITY);
        v.setTextColor(Color.WHITE);
        v.setTextSize(17);
        toast.show();
    }

    public static void showSuccess(Context context, int textId) {
        showIconToast(context, textId, R.drawable.ic_launcher, R.color.app_color_bg);
    }

    public static void showFailure(Context context, int textId) {
        showIconToast(context, textId, R.drawable.ic_launcher, R.color.app_color_bg);
    }

    public static void showIconToast(Context context, int textId, int iconId, int colorId) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(android.R.layout.simple_list_item_1, null);
        ((TextView) layout).setText(textId);
        ((TextView) layout).setTextColor(context.getResources().getColor( colorId));
        ((TextView) layout).setCompoundDrawablesWithIntrinsicBounds(iconId, 0,0, 0);
        Toast toast = new Toast(context);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}
