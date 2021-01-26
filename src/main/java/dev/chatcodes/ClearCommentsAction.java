package dev.chatcodes;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.components.ServiceManager;
import org.jetbrains.annotations.NotNull;

public class ClearCommentsAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        ChatCommentModel service = ServiceManager.getService(ChatCommentModel.class);
        service.clearAllComments();
    }

    @Override
    public boolean isDumbAware() {
        return false;
    }
}
