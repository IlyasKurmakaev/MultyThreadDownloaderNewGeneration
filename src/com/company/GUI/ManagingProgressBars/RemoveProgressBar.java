package com.company.GUI.ManagingProgressBars;

import com.company.GUI.GUI;
import com.company.GUI.ProgressBar;

/**
 * Created by Lite on 08.08.2017.
 */
public class RemoveProgressBar implements IInvokeLaterMethod {
    @Override
    public void useMethodForProgressBar(ProgressBar progressBar) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUI.getInstance().jPanel.remove(progressBar);
                GUI.getInstance().revalidate();
                GUI.getInstance().repaint();
            }
        });
    }

    @Override
    public void useMethodForProgressBar(ProgressBar progressBar, int progress) {

    }
}
