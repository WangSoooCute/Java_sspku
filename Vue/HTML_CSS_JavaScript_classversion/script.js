//给按钮添加点击事件监听器
document.getElementById('changeButton').addEventListener('click', () => {
    const title = document.getElementById('title'); //获取标题元素
    title.textContent = 'You clicked the button!'; //修改标题的文字内容
    title.style.color = '#007bff'; //修改标题的颜色
});