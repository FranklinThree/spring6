package proxy.service;

/**
 * 订单服务impl
 *
 * @author FranklinThree
 * @date 2023/04/04
 * @className OrderServiceImpl
 * @see
 * @since 1.0.0
 */

// 目标对象
public class OrderServiceImpl implements OrderService {

    @Override
    public String getName() {
        System.out.println("getName");
        return "FranklinThree";
    }

    // 目标方法
    @Override
    public void generate() {
        // 模拟生成订单的耗时
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("生成订单");
    }

    // 目标方法
    @Override
    public void modify() {
        // 模拟修改订单的耗时
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("修改订单");
    }


    // 目标方法
    @Override
    public void detail() {
        // 模拟查看订单详情的耗时
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("查看订单详情");
    }
}

