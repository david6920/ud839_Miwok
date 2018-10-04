package helpers;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.miwok.R;
import com.example.android.miwok.Word;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private Context context;
    private ArrayList<Word> words;

    public CustomAdapter(Context context, ArrayList<Word> words) {
        this.inflater = LayoutInflater.from(context);
        this.context = context;
        this.words = words;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_word_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Word currentWord = words.get(position);
        holder.word_miwok_tv.setText(currentWord.getmMiwokTranslation());
        holder.word_eng_tv.setText(currentWord.getmDefaultTranslation());
        if (currentWord.hasImage()) {
            holder.word_iv.setImageResource(currentWord.getmImageResourceID());
            holder.word_iv.setVisibility(View.VISIBLE);
        }
        else {
            holder.word_iv.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return words.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView word_iv;
        TextView word_miwok_tv;
        TextView word_eng_tv;
        Context context;

        public MyViewHolder(View itemView) {
            super(itemView);
            word_miwok_tv = (TextView)itemView.findViewById(R.id.word_miwok);
            word_eng_tv = (TextView) itemView.findViewById(R.id.word_eng);
            word_iv = (ImageView) itemView.findViewById(R.id.image);
            context = itemView.getContext();
        }
    }
}