﻿# commacoffeeshop
Project 2: Commacofffeshop (C-System)
Phần mềm quản lý cửa hàng (các dịch vụ ăn uống, kho trữ,...)
  - Phục vụ đặt hàng/gọi món, nhập đơn hàng kho, Cho phép nhên viên đăng nhập và tự động chấm công khi đăng xuất
  - Quản lý nguyên vật liệu trong kho (giám sát/thông báo các trạng thái nguyên vật liệu: còn, hết)
  - Phần mềm được chia cấp: dành cho nhân viên và dành cho quản lý
    + Employee: thực hiện order, điều chỉnh tài khoản của bản thân, nhập hoá đơn nguyên liệu nhập kho, thực hiện order cho khách hàng,...
    + Admin: quản lý nhân viên, lương, lịch làm việc, nguyên liệu trong kho, menu sản phẩm (món ăn,...), tài khoản các admin khác
  - Thống kê Thu chi theo tuần/tháng/năm

Phần mềm được viết trên nền tảng JAVA với giao diện đồ hoạ JAVA SWING. Kết hợp một số thư viện mở như Jasper report, JFreechart,...
Đây là phiên bản thử nghiệm, dự kiến trong thời gian tới sẽ phát triển các phiên bản tốt hơn về hiệu xuất, tính năng cũng như giao diện (điển hình là JAVAFX, ITEXT report, processing,....)


**Note:**
 - file "nn" là file rỗng, bù nhìn, giúp giữ cho folder tồn tại khi mà folder không chưa file nào khác
 - Nếu bạn tham gia phát triển cùng chúng tôi xin hãy xem kĩ phần code style requirement
 - Khi clone project về máy, lấy code dữ liệu từ folder chứa source code "src" và link các thư viện "java" (jdk) và "lib" vào project
 - Phần precession trong readme.md dùng để báo cáo tiến độ phát triển, do các thành phiên được phân chia để code và cập nhật các trạng thái mới nhất của project (có thể báo các phần đã xong, chưa hoàn thành, gặp khó khăn, yêu cầu bàn luận giúp đỡ, lỗi, vướng mắt,.....). Các phần phân công được chia ra rõ ràng vì vậy khi cập nhật tiến trình cho phần nào thì chỉ viết nội dung liên quan đến phần đó, nếu ngoài lề sẽ bị xoá


# Project's procession:
  - **FrLogin**:
    + đã xong : đăng nhập cho nhân viên và quản lý
    + đã xong : cập nhật thêm chức năng thay đổi cấu hình đăng nhập database, sau khi chỉnh sửa và đăng nhập thành công, chương trình tự động lưu dữ liệu của database đó (lần sau không cần điều chỉnh nữa). Thông tin database sẽ được lưu vào databaseinfo.txt
    + chưa hoàn thành : cho phép người dùng mở cả frame admin và frame employee song song, nhưng mỗi frame chỉ được mở một lần 

(*) dự kiến thêm khả năng mã hoá mật khẩu trong database

  - **FrEmployeeWorkspace**:
    + đã xong : đăng nhập/xuất của nhân viên. Tự động chấm công và phát sinh lịch làm việc trong ngày, bảng lương của tháng hiện tại vào trong database
    + đã xong : Phân chia cửa sổ đã hoàn thành
    + đã xong : các cửa sổ xuất menu (thêm ảnh cho món ăn nếu cần)
    + đã xong : cửa sổ nhập bill order, sau khi khách hàng tính tiền sẽ tự động sinh dữ liệu Order và OrderDetails trong database
    + đã xong : xây dựng cửa sổ nhập đơn hàng, sau khi nhân viên nhập đơn hàng sẽ tự động sinh dữ liệu ReceitpNote và ReceiptNoteDetails trong database
    + đã xong : xây dựng của sổ Setting cho các tuỳ chỉnh trong EmployeeWorkspace, các tuỳ chỉnh lưu vào settinginfo.txt
    + đã xong : xây dựng cửa sổ Empoyee Info cho phép nhân viên chỉnh sủa tài khoản cá nhân
    + đã xong : In bill thông qua printer. Tính năng tuỳ chỉnh hiển thị văn bản in trước khi in
    + đã xong : In thêm note của từng món ăn trong bill (kitchen print)
    + đã xong : thêm giá mặc định cho các nguyên liệu (FoodMaterials) => Sẽ cần phải điều chỉnh database, entities class, model class query, giao diện của FrEmployeeWorkspace và FrAdminWorkspace
    + đã xong : In report (theo dạng tài liệu pdf hoặc dạng hoá đơn liệt kê) sau một ngày làm việc (cần cập nhật thêm)
    + đã xong : thêm chức năng lưu nhật kí phòng trường hợp chương trình bị đóng đột ngột (Nhưng lưu thông tin nhân viên thì chưa khả thi)
    + đã xong : swap/merge table (chức năng swap/merge vẫn trong tình trạng thử nghiệm, có thể sẽ phát sinh lỗi chưa biết trước)
    + đã xong : xuất bill dưới dạng pdf
    + chưa hoàn thành : cho phép chia bill ra để thanh toán theo từng đợt
    + chưa hoàn thành : cho phép nhân viên chỉnh sửa trực tiếp quantity trong order form
    + chưa hoàn thành : tách code
    

(*) dự kiến : sẽ thêm chức năng Internationalization (cho ngôn ngữ Anh, Việt, Hàn), tạo hiệu ứng annimation trong quá trình chờ load chương trình (bằng processing). Bổ sung thông tin khách hàng, thêm chức năng xuất thông tin và hình ảnh nhận diện khách hàng quen thuộc, khi xuất danh sách khách hàng cho nhân viên xem có thể sort theo số lần khách hàng đã đến quán, thêm chức năng gửi nhận tin nhắn qua mạng internet

  - **FrAdminWorkspace**:
  	+ đã xong : Employee information form (giao diện/xem/xoá**/sửa thông tin/tìm kiếm(theo tên, ?))
  	+ đã xong : Customer information form (giao diện/xem/xoá**/sửa thông tin/tìm kiếm(theo tên, ?))
  	+ đã xong : Food information form (giao diện/xem/xoá**/sửa thông tin/tìm kiếm(theo tên, ?))
  	+ đã xong : Food Materials information form (giao diện/xem/xoá**/sửa thông tin/tìm kiếm(theo tên, ?))
  	+ đã xong : Order information form (giao diện/xem/tìm kiếm(theo ngày, ?))
  	+ đã xong : Admin profile information form (giao diện/xem/sửa thông tin) _ không có quyền xóa bất kì admin nào
  	+ đã xong : xuất report cho dữ liệu order/order details, empschedule/salarynote
	+ đã xong : hiển thị data chart cho order/order details, empschedule/salarynote, receipnote/receiptnote details

  	+ chưa hoàn thành : Salary Note information form (giao diện/xem/xoá**/sửa thông tin)
  	+ chưa hoàn thành : Receipt Note information form (giao diện/xem/tìm kiếm(theo ngày, ?))
	+ **Các phần xóa đã hoàn thành, nhưng sẽ bàn lại sau vì code hiện tại đã xong, chạy ổn, nhưng vẫn phải bàn lại, đặc biệt là Employee. Có thể sẽ sửa đổi trong lần gặp tới. Nếu phần xóa này đã ổn thì phần việc của Admin đã hoàn thành.
	+ Đã cập nhật các phần có thiết kế thay đổi trong file Comma Review(các phần có dấu ** là phần đã update)
	+ chưa hoàn thành : xuất report cho dữ liệu receiptnote/receiptnote details

	+ Salary Note -> ComboBox Is Paid: dự định là dùng để lọc ra những ai đã paid(yes) và những ai chưa paid(no), nhưng vẫn chưa thực hiện được, vì còn phải tính toán lại cho hợp lí. Từ giờ đến sáng mai vẫn chưa code tiếp được


(*) dự kiến : Chức năng cho phép admin thêm lịch làm việc cho nhân viên hằng tuần, và nhân viên chỉ có thể login trong khung giờ mà admin đã sắp xếp (nếu login trễ hơn tức là đã đi làm trễ, logout sớm hơn giờ đã định => thông báo cho admin, trừ lương). Chức năng kiểm toán thu chi theo ngày/tháng/năm. Chức năng đồ hoạ vẽ biểu đồ thu nhập (bằng JFreeChart, datascient library). 

(*) dự kiến: chuyển tất cả các swing frame thành javafx để tăng độ thẩm mĩ

(*) dự kiến: tạo file patch mỗi khi update mã nguồn phần mềm để người dùng cập nhật trực tiếp mà không cần phải gửi toàn bộ phần mềm mới
  
# Login Frame
  ![alt text](https://github.com/luuductrung1234/commacoffeeshop/blob/master/repo%20picture/login_image.png)


# Employee Workspace Frame
  ![alt text](https://github.com/luuductrung1234/commacoffeeshop/blob/master/repo%20picture/emp_workspace.png)


# Admin Workspace Frame  
  ![alt text](https://github.com/luuductrung1234/commacoffeeshop/blob/master/repo%20picture/admin_workspace.png)
  
