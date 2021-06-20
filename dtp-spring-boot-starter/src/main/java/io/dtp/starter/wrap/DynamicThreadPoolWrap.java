package io.dtp.starter.wrap;

import io.dtp.starter.common.CommonThreadPool;
import lombok.Data;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 线程池包装
 *
 * @author chen.ma
 * @date 2021/6/20 16:55
 */
@Data
public class DynamicThreadPoolWrap {

    private String tenant;

    private String itemId;

    private String tpId;

    private ThreadPoolExecutor pool;

    /**
     * 首选服务端线程池, 为空使用默认线程池 {@link CommonThreadPool#getInstance(String)}
     *
     * @param tenant
     * @param itemId
     * @param threadPoolId
     */
    public DynamicThreadPoolWrap(String tenant, String itemId, String threadPoolId) {
        this.tenant = tenant;
        this.itemId = itemId;
        this.tpId = threadPoolId;
    }

    /**
     * 首选服务端线程池, 为空使用 threadPoolExecutor
     *
     * @param tenant
     * @param itemId
     * @param threadPoolId
     * @param threadPoolExecutor
     */
    public DynamicThreadPoolWrap(String tenant, String itemId, String threadPoolId, ThreadPoolExecutor threadPoolExecutor) {
        this.tpId = threadPoolId;
        this.pool = threadPoolExecutor;
    }

    /**
     * 提交任务
     *
     * @param command
     */
    public void execute(Runnable command) {
        pool.execute(command);
    }

    /**
     * 提交任务
     *
     * @param task
     * @return
     */
    public Future<?> submit(Runnable task) {
        return pool.submit(task);
    }

    /**
     * 提交任务
     *
     * @param task
     * @param <T>
     * @return
     */
    public <T> Future<T> submit(Callable<T> task) {
        return pool.submit(task);
    }

}
