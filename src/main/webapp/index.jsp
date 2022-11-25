<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="${pageContext.request.contextPath}/123" method="post">
    <label>Product Description</label>
    <label>
        <input type="text" name="txtInput" placeholder="Ten san pham">
    </label>
    <br>
    <label>List Price</label>
    <label>
        <input type="text" name="listPrice" placeholder=" Giá niêm yết của sản phẩm">
    </label>
    <br>
    <label>Discount Percent</label>
    <label>
        <input type="text" name="discountPercent" placeholder="Tỷ lệ chiết khấu (phần trăm)">
    </label>
    <br>
    <label>
        <input type="submit" name="Calculate Discount" id="submit">
    </label>
</form>
</body>
</html>