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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> phrases_words = new ArrayList<>();
        phrases_words.add(new Word("Where are you going?", "minto wuksus"));
        phrases_words.add(new Word("What is your name?", "tinnә oyaase'nә"));
        phrases_words.add(new Word("My name is...", "oyaaset..."));
        phrases_words.add(new Word("How are you feeling?", "michәksәs?"));
        phrases_words.add(new Word("I’m feeling good.", "kuchi achit"));
        phrases_words.add(new Word("Are you coming?", "әәnәs'aa?"));
        phrases_words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        phrases_words.add(new Word("I’m coming.", "әәnәm"));
        phrases_words.add(new Word("Let’s go.", "yoowutis"));
        phrases_words.add(new Word("Come here.", "әnni'nem"));


        CustomAdapter wordAdapter = new CustomAdapter(this, phrases_words);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);

        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(wordAdapter);
        }
    }
}
