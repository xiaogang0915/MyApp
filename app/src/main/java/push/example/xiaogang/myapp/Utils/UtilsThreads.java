package push.example.xiaogang.myapp.Utils;

import android.os.Handler;

/**
 * Created by xiaogang on 2017/5/8.
 */

public class UtilsThreads {
 static    Handler handler=new Handler();
    private static void OnUIThread(Runnable task){
        handler.post(task);

    }
    private static void OnSonThread(Runnable task){
    new Thread(task).start();

    }

}
