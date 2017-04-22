package com.aiaiai.bestfintechappever.model.vh;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.aiaiai.bestfintechappever.R;
import com.aiaiai.bestfintechappever.model.Offer;
import com.bumptech.glide.Glide;

/**
 * Created by Slavik on 22.04.2017.
 * Yippie-Kai-Yay!
 */

public class OfferVH extends RecyclerView.ViewHolder {

    private ImageView pic;
    private TextView title;
    private TextView price;
    private TextView cashback;

    public OfferVH(View v) {
        super(v);
        pic = (ImageView) v.findViewById(R.id.offer_pic);
        title = (TextView) v.findViewById(R.id.offer_title);
        price = (TextView) v.findViewById(R.id.offer_price);
        cashback = (TextView) v.findViewById(R.id.offer_cashback);
//        price = (TextView) v.findViewById(R.id.);
    }

    public void bind(Offer offer) {
        Glide.with(pic.getContext())
                .load(offer.getPicUrl())
                .centerCrop()
                .into(pic);
        title.setText(offer.getTitle());
        price.setText(offer.getDescription());
        cashback.setText(offer.getDescription());
    }
}
