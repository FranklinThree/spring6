package proxy.service;

/**
 * 订单服务
 *
 * @author FranklinThree
 * @date 2023/04/04
 * @className OrderService
 * @see
 * @since 1.0.0
 */

// 代理对象和目标对象的公共接口
public interface OrderService {
    String getName();


    /**
     * 生成订单
     */
    void generate();

    /**
     * 修改订单信息
     */
    void modify();

    /**
     * 查看订单详情
     */
    void detail();
}
