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
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_items);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Daughter","lutti",R.drawable.family_daughter));
        words.add(new Word("Father","otiiko",R.drawable.family_father));
        words.add(new Word("Grandfather","tolookosu",R.drawable.family_grandfather));
        words.add(new Word("Grandmother","olisa",R.drawable.family_grandmother));
        words.add(new Word("Mother","temokka",R.drawable.family_mother));
        words.add(new Word("Brother","nicha",R.drawable.family_older_brother));
        words.add(new Word("Sister","tilikotuu",R.drawable.family_older_sister));
        words.add(new Word("Father","forula",R.drawable.family_father));
        words.add(new Word("Son","olyyaisa",R.drawable.family_son));
        words.add(new Word("Young Brother","vilisu",R.drawable.family_younger_brother));
        words.add(new Word("Young Sister","vilisu",R.drawable.family_younger_sister));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
