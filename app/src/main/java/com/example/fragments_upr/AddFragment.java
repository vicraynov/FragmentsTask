package com.example.fragments_upr;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;


public class AddFragment extends DialogFragment implements View.OnClickListener {

    private EditText nameText;
    private EditText addressText;
    private EditText imageUrl;
    private Button addButton;
    private AddDialogListener addContactDialogListener;

    public AddFragment() {
        // Required empty public constructor
    }

    public static AddFragment newInstance() {
        return new AddFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.add_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        nameText = view.findViewById(R.id.nameEditText);
        addressText = view.findViewById(R.id.addressEditText);
        imageUrl = view.findViewById(R.id.imageUrlEditText);
        addButton = view.findViewById(R.id.addButton);
        addButton.setOnClickListener(this);


        nameText.requestFocus();


        getDialog().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        addContactDialogListener = (AddDialogListener) context;
    }

    @Override
    public void onClick(View v) {
        Contact contact = new Contact(
                nameText.getText().toString(),
                addressText.getText().toString(),
                imageUrl.getText().toString());

        addContactDialogListener.onFinishAddDialog(contact);
        dismiss();
    }
}