package org.jodconverter.core.office;

public interface OfficeRestarter {

    /**
     * Restarts all idle processes in the pool. Only processes that are not currently handling tasks
     * will be restarted.
     *
     * <p>The restart behavior depends on the configured {@link
     * org.jodconverter.local.office.RestartStrategy}. With automatic restart strategy, processes
     * restart immediately in background threads. With manual restart strategy, restarts are queued
     * and must be triggered externally.
     *
     * @return The number of idle processes that were requested to restart.
     */
    int restartIdleProcesses();

    /**
     * Gets the number of idle (available) processes in the pool.
     *
     * @return The count of idle processes.
     */
    int getIdleCount();

    /**
     * Gets the number of busy (unavailable) processes in the pool.
     *
     * @return The count of busy processes.
     */
    int getBusyCount();

}
