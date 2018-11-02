<?php
$dbhost = 'localhost';
$dbuser = 'root';
$dbpass = 'BAba55ko';
$dbname = 'dinperpa';

$conn = mysqli_connect($dbhost, $dbuser, $dbpass) or die('Could not connect: ' . mysqli_error());
mysqli_select_db($conn, $dbname);

$response = array();

$zsql = "select 
			b.id_berita,
			b.judul_berita,
			b.jenis_berita,
			b.isi_berita,
			b.gambar_berita,
			b.timestamp_berita,
			k.nama_kategori,
			u.nama_user
			FROM tb_berita b
			LEFT JOIN tb_kategori k ON b.kategori_id=k.id_kategori
			LEFT JOIN tb_user u ON b.user_id=u.id_user";


$result = mysqli_query($conn, $zsql);

if (mysqli_num_rows($result) > 0) {

    $response["datauser"] = array();

    while ($row = mysqli_fetch_array($result)) {

        $datafield = array();
        $datafield["id_berita"] = $row["id_berita"];
        $datafield["judul_berita"] = $row["judul_berita"];
        $datafield["gambar_berita"] = $row["gambar_berita"];
        $datafield["nama_kategori"] = $row["nama_kategori"];
        $datafield["nama_user"] = $row["nama_user"];
        $datafield["timestamp_berita"] = $row["timestamp_berita"];
        array_push($response["datauser"], $datafield);
    }
 // success
    $response["success"] = 1;

 // echoing JSON response
    echo json_encode($response);

} else {
    $response["success"] = 0;
    $response["message"] = "No user found";
    echo json_encode($response);
}

mysqli_close($conn);

?>