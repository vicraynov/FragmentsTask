package com.example.fragments_upr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements AddDialogListener {

    private RecyclerView contactRecyclerView;
    private ContactAdapter contactAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactRecyclerView = findViewById(R.id.contactsRecyclerView);

        this.contactAdapter = new ContactAdapter(ContactsRepository.getContacts());
        contactRecyclerView.setAdapter(contactAdapter);
        contactRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        FloatingActionButton fab = findViewById(R.id.addContactFloatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                AddFragment addAnimalFragment = AddFragment.newInstance();
                addAnimalFragment.show(fm, "fragment_add_contact");
            }
        });
    }

    @Override
    public void onFinishAddDialog(Contact contact) {
        this.contactAdapter.addContact(contact);
    }
}
