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

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> colors_words = new ArrayList<>();
        colors_words.add(new Word("red", "weṭeṭṭi", R.drawable.color_red));
        colors_words.add(new Word("green", "chokokki", R.drawable.color_green));
        colors_words.add(new Word("brown", "ṭakaakki", R.drawable.color_brown));
        colors_words.add(new Word("gray", "ṭopoppi", R.drawable.color_gray));
        colors_words.add(new Word("black", "kululli", R.drawable.color_black));
        colors_words.add(new Word("white", "kelelli", R.drawable.color_white));
        colors_words.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        colors_words.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));

        CustomAdapter wordAdapter = new CustomAdapter(this, colors_words);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);

        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(wordAdapter);
        }
    }
}
