import Mock from "mockjs";

// 示例 1：模拟一个简单的 GET 请求
Mock.mock("/api/user", "get", {
    code: 200,
    message: "成功",
    data: {
        id: "@id", // 随机生成 ID
        name: "@cname", // 随机生成中文姓名
        age: "@integer(20, 50)", // 随机生成 20-50 之间的整数
        email: "@email", // 随机生成邮箱
    },
});