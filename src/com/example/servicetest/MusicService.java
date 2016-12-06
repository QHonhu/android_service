package com.example.servicetest;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MusicService extends Service {
	private MediaPlayer mMediaPlayer;
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		mMediaPlayer=MediaPlayer.create(this, R.raw.test);
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		mMediaPlayer.start();
		return super.onStartCommand(intent, flags, startId);
	}
	
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		mMediaPlayer.stop();
		super.onDestroy();
	}
	
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
