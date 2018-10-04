/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import helpers.CustomAdapter;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> numbers_words = new ArrayList<>();
        numbers_words.add(new Word("one", "lutti", R.drawable.number_one));
        numbers_words.add(new Word("two", "otiiko", R.drawable.number_two));
        numbers_words.add(new Word("three", "tolookosu", R.drawable.number_three));
        numbers_words.add(new Word("four", "oyyisa", R.drawable.number_four));
        numbers_words.add(new Word("five", "massokka", R.drawable.number_five));
        numbers_words.add(new Word("six", "temmokka", R.drawable.number_six));
        numbers_words.add(new Word("seven", "kenekaku", R.drawable.number_seven));
        numbers_words.add(new Word("eight", "kawinta", R.drawable.number_eight));
        numbers_words.add(new Word("nine", "wo'e", R.drawable.number_nine));
        numbers_words.add(new Word("ten", "na'aacha", R.drawable.number_ten));


        //Words displayed with linear layout and for loop
        /*LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        for(String s : numbers_words) {
            TextView wordView = new TextView(this);
            wordView.setTag("tv" + s);
            wordView.setText(s);
            rootView.addView(wordView);
        }*/

        //ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numbers_words);
        CustomAdapter wordAdapter = new CustomAdapter(this, numbers_words);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);

        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(wordAdapter);
        }

        /*ListView listView = (ListView) findViewById(R.id.list);

        if (listView != null) {
            listView.setAdapter(itemsAdapter);
        }
*/
    }
}
