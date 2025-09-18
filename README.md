# Buat Custom Exception (pake Bahasa Indonesia)
- Custom Exception artinya kita bikin kelas exception sendiri, sesuai kebutuhan.
- Misalnya: bikin TinggiBadanTidakCukupException untuk nge-handle kasus tinggi badan prajurit yang kurang.
- Tujuannya biar error lebih spesifik dan gampang dipahami (nggak cuma error umum Exception).
- Cara bikinnya cukup buat class baru yang extends Exception → kasih pesan sesuai aturan kita.
- Exception = error yang muncul saat program jalan (misalnya salah input, data kosong, dll).
- Custom Exception = kita bikin error versi kita sendiri, biar lebih jelas sesuai kebutuhan program.
Contoh: bikin TinggiBadanTidakCukupException kalau tinggi badan calon prajurit kurang dari 170 cm.
- Gunanya supaya program bisa ngasih pesan error yang spesifik dan mudah dipahami, bukan cuma error umum.
# Membuat CRUD pake Java Form
- CRUD = Create, Read, Update, Delete → operasi dasar untuk ngelola data.
- Kalau pake Java Form (Swing/NetBeans), CRUD biasanya digabung dengan database (MySQL/SQLite/PostgreSQL).
- Create → form input dipakai untuk nambah data ke database.
- Read → data dari database ditampilkan di tabel (misalnya JTable).
- Update → data yang sudah ada bisa di-edit lewat form lalu disimpan kembali ke database.
- Delete → data tertentu bisa dihapus langsung dari tabel/database lewat tombol hapus.
- CRUD singkatan dari Create, Read, Update, Delete → operasi dasar untuk mengelola data.
- Kalau pakai Java Form (Swing/NetBeans GUI):
Create → tambah data lewat form ke database.
Read → tampilkan data dari database ke tabel di GUI.
Update → ubah data yang sudah ada lewat form.
Delete → hapus data dari tabel/database.
- Intinya CRUD pakai Java Form = aplikasi GUI sederhana untuk menginput, menampilkan, mengedit, dan menghapus data langsung dari database.
# Kesimpulannya
- Custom Exception = bikin error sendiri biar lebih jelas (contoh: tinggi badan nggak cukup).
- CRUD pake Java Form = bikin aplikasi sederhana di Java yang bisa tambah, lihat, edit, dan hapus data dari database lewat form GUI.
