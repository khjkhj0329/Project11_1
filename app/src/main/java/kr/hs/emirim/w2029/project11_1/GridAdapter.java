package kr.hs.emirim.w2029.project11_1;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {
    Context context;
    int[] posterIds = {R.drawable.al, R.drawable.andgame, R.drawable.black, R.drawable.boss, R.drawable.kiss,
                        R.drawable.kissingbooth, R.drawable.moana, R.drawable.mygirs, R.drawable.place2, R.drawable.police,
                        R.drawable.al, R.drawable.andgame, R.drawable.black, R.drawable.boss, R.drawable.kiss,
                        R.drawable.kissingbooth, R.drawable.moana, R.drawable.mygirs, R.drawable.place2, R.drawable.police};

    public GridAdapter(Context context){
        this.context = context;
    }
    @Override
    public int getCount() {
        return posterIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new ViewGroup.LayoutParams(200, 300));
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setPadding(5,5,5,5);
        imgv.setImageResource(posterIds[i]);

        final  int pos = i;
        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(context);
                View dialogView = View.inflate(context, R.layout.dialog1, null);
                ImageView imgvLarge = dialogView.findViewById(R.id.imgv_large);
                imgvLarge.setImageResource(posterIds[pos]);
                dialog.setTitle("Large Poster");
                dialog.setIcon(R.drawable.icon);
                dialog.setView(dialogView);
                dialog.setNegativeButton("close", null);
                dialog.show();
            }
        });
        return imgv;
    }
}
