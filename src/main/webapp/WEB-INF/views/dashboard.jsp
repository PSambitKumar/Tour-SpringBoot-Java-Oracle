<%--
  Created by IntelliJ IDEA.
  User: sambit.pradhan
  Date: 7/27/2022
  Time: 11:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.13/css/jquery.dataTables.min.css">
    <script src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.min.js"> </script>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" >
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <title>Dashboard</title>
</head>
<body style="margin: 2rem;">
<style>
    a{
        cursor: pointer;
    }
</style>
<h3>Dashboard</h3>
<div class="card text-center">
    <div class="card-header">
        <ul class="nav nav-tabs card-header-tabs">
            <li class="nav-item"><a class="nav-link active" id="addId" onclick="openAdd()" <%--href="/add"--%>>Add</a></li>
            <li class="nav-item"><a class="nav-link" id="viewId" onclick="openView()" <%--href="/view"--%>>View</a></li>
            <li class="nav-item"><a class="nav-link" id="editId" onclick="openEdit()" <%--href="/edit"--%>>Edit</a></li>
            <li class="nav-item"><a class="nav-link" id="editSrchiveId" onclick="openEditArchive()" <%--href="/editArchive"--%>>Edit Archive</a></li>
            <li class="nav-item"><a class="nav-link" id="deleteId" onclick="openDelete()" <%--href="/delete"--%>>Delete</a></li>
        </ul>
    </div>

    <div class="card-body">
        <div id="add">Add Page</div>
        <div id="view">View Page</div>
        <div id="edit">Edit Page</div>
        <div id="editArchive">Edit Archive Page</div>
        <div id="delete">Delete Page</div>
    </div>
</div>

</body>

<script>
    $(document).ready(function (){
        $('#add').show();
        $('#edit').hide();
        $('#editArchive').hide();
        $('#delete').hide();
        $('#view').hide();
    });

    function openAdd(){
        $('#view').hide();
        $('#add').show();
        $('#edit').hide();
        $('#editArchive').hide();
        $('#delete').hide();

        $('#addId').addClass("active");
        $('#viewId').removeClass("active");
        $('#editId').removeClass("active");
        $('#editSrchiveId').removeClass("active");
        $('#deleteId').removeClass("active");
    }
    function openView(){
        $('#view').show();
        $('#add').hide();
        $('#edit').hide();
        $('#editArchive').hide();
        $('#delete').hide();

        $('#addId').removeClass("active");
        $('#viewId').addClass("active");
        $('#editId').removeClass("active");
        $('#editSrchiveId').removeClass("active");
        $('#deleteId').removeClass("active");
    }
    function openEdit(){
        $('#view').hide();
        $('#add').hide();
        $('#edit').show();
        $('#editArchive').hide();
        $('#delete').hide();

        $('#addId').removeClass("active");
        $('#viewId').removeClass("active");
        $('#editId').addClass("active");
        $('#editSrchiveId').removeClass("active");
        $('#deleteId').removeClass("active");
    }
    function openEditArchive(){
        $('#view').hide();
        $('#add').hide();
        $('#edit').hide();
        $('#editArchive').show();
        $('#delete').hide();

        $('#addId').removeClass("active");
        $('#viewId').removeClass("active");
        $('#editId').removeClass("active");
        $('#editSrchiveId').addClass("active");
        $('#deleteId').removeClass("active");
    }
    function openDelete(){
        $('#view').hide();
        $('#add').hide();
        $('#edit').hide();
        $('#editArchive').hide();
        $('#delete').show();

        $('#addId').removeClass("active");
        $('#viewId').removeClass("active");
        $('#editId').removeClass("active");
        $('#editSrchiveId').removeClass("active");
        $('#deleteId').addClass("active");
    }

</script>
</html>
