package org.EBook.search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class IntroAdapter extends RecyclerView.Adapter<IntroAdapter.IntroViewHolder> {

    private final List<IntroItem> introItems;

    public IntroAdapter(List<IntroItem> introItems) {
        this.introItems = introItems;
    }

    @NonNull
    @Override
    public IntroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new IntroViewHolder(LayoutInflater.from(parent.getContext()).inflate(
                R.layout.intro_item, parent, false
        ));
    }

    @Override
    public void onBindViewHolder(@NonNull IntroViewHolder holder, int position) {
        holder.bind(introItems.get(position));
    }

    @Override
    public int getItemCount() {
        return introItems.size();
    }

    static class IntroViewHolder extends RecyclerView.ViewHolder {
        private final TextView title, desc;
        private final ImageView image;

        IntroViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.introTitle);
            desc = view.findViewById(R.id.introDesc);
            image = view.findViewById(R.id.introImage);
        }

        void bind(IntroItem item) {
            title.setText(item.getTitle());
            desc.setText(item.getDescription());
            image.setImageResource(item.getImageResId());
        }
    }
}
