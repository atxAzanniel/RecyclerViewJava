package com.azanniel.recyclerviewjava;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.azanniel.recyclerviewjava.models.Email;
import com.azanniel.recyclerviewjava.models.Emails;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;

import io.github.serpro69.kfaker.Faker;

public class MainActivity extends AppCompatActivity {

    private EmailAdapter emailAdapter;
    private Faker faker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        faker = new Faker();

        emailAdapter = new EmailAdapter(new ArrayList<Email>(Emails.fakeEmails()));

        RecyclerView rv = findViewById(R.id.recycler_view);
        rv.setAdapter(emailAdapter);

        findViewById(R.id.fb).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addEmail();
                rv.scrollToPosition(0);
            }
        });

        ItemTouchHelper helper = new ItemTouchHelper(
            new ItemTouchHandler(
                ItemTouchHelper.UP | ItemTouchHelper.DOWN,
                    ItemTouchHelper.LEFT
            )
        );
        helper.attachToRecyclerView(rv);

        emailAdapter.setListener(new EmailAdapter.EmailAdapterListener() {
            @Override
            public void onItemClick(int position) {
                Log.i("ItemClick", "Cliquei em um");
            }

            @Override
            public void onItemLongClick(int position) {
                Log.i("ItemLongClick", "Selecionando itens");
            }
        });
    }

    private class ItemTouchHandler extends ItemTouchHelper.SimpleCallback {

        public ItemTouchHandler(int dragDirs, int swipeDirs) {
            super(dragDirs, swipeDirs);
        }

        @Override
        public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
            int from = viewHolder.getAdapterPosition();
            int to = target.getAdapterPosition();

            Collections.swap(emailAdapter.getEmails(), from, to);
            emailAdapter.notifyItemMoved(from, to);
            return true;
        }

        @Override
        public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
            emailAdapter.getEmails().remove(viewHolder.getAdapterPosition());
            emailAdapter.notifyItemRemoved(viewHolder.getAdapterPosition());
        }
    }

    private void addEmail(){
        String date = new SimpleDateFormat(
            "d MMM",
            new Locale("pt", "BR")
        ).format(new Date(System.currentTimeMillis()));

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++){
            stringBuilder.append(faker.getLorem().words());
            stringBuilder.append(" ");
        }

        Email email = Email.EmailBuilder.builder()
            .setStared(false)
            .setUnread(true)
            .setUser(faker.getName().firstName())
            .setSubject(faker.getCompany().name())
            .setPreview(stringBuilder.toString())
            .setDate(date)
            .build();

        emailAdapter.getEmails().add(0, email);
        emailAdapter.notifyItemInserted(0);
    }
}