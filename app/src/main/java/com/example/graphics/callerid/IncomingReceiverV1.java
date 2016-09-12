package com.example.graphics.callerid;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import java.util.Date;

/**
 * Created by graphics on 9/12/2016.
 */
public class IncomingReceiverV1 extends BaseReceiver {

    @Override
    protected void onIncomingCallReceived(Context ctx, String number, Date start) {
        Log.v("RECEIVING FLOW: ","Incoming nmber :"+number);
        Toast.makeText(ctx,"Incoming Call!     "+number,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onIncomingCallAnswered(Context ctx, String number, Date start) {
        Log.v("RECEIVING FLOW: ","Incoming nmber :"+number);
        Toast.makeText(ctx,"Incoming Call!"+number,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onIncomingCallEnded(Context ctx, String number, Date start, Date end) {
        Log.v("RECEIVING FLOW: ","Incoming nmber :"+number);
        Toast.makeText(ctx,"Incoming Call!"+number,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onOutgoingCallStarted(Context ctx, String number, Date start) {
        Log.v("RECEIVING FLOW: ","Incoming nmber :"+number);
        Toast.makeText(ctx,"Incoming Call!"+number,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onOutgoingCallEnded(Context ctx, String number, Date start, Date end) {
        Log.v("RECEIVING FLOW: ","Incoming nmber :"+number);
        Toast.makeText(ctx,"Incoming Call!"+number,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onMissedCall(Context ctx, String number, Date start) {
        Log.v("RECEIVING FLOW: ","Incoming nmber :"+number);
        Toast.makeText(ctx,"Incoming Call!"+number,Toast.LENGTH_LONG).show();
    }
}
