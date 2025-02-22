package me.definedoddy.fluidapi;

import org.bukkit.Bukkit;

public abstract class RepeatingTask {
    private final int taskId;

    public RepeatingTask(long initialDelay, long repeatingDelay) {
        taskId = Bukkit.getScheduler().scheduleSyncRepeatingTask(FluidPlugin.getPlugin(), this::run, initialDelay, repeatingDelay);
    }

    public abstract void run();

    public void cancel() {
        Bukkit.getScheduler().cancelTask(taskId);
    }

    public int getId() {
        return taskId;
    }
}
