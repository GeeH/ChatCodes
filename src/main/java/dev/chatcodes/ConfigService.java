package dev.chatcodes;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.StoragePathMacros;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@State(name = StoragePathMacros.WORKSPACE_FILE)
public class ConfigService implements PersistentStateComponent<ConfigService.State> {

    private State configState = new State();

    @Nullable
    @Override
    public State getState() {
        return configState;
    }

    @Override
    public void loadState(@NotNull State state) {
        configState = (State) state;
    }

    static class State {
        public Boolean toolTipEnabled = true;
    }
}
