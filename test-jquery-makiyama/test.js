//問題1
$(function() {
    console.log("牧山純");
});


//問題2
$(function() {
    $('#btn-red').on('click', function() {
        $('#my-name').css('color', 'red');
        console.log("名前の色を赤にする");
    });
});


//問題3
$(function() {
    $('#btn-alert').on('click', function() {
        const val = $('#age-input').val();
        alert(val);
    });
});


//問題4
$(function() {
    $('#submit-btn').on('click', function() {
        $(this).prop('disabled', true);
    });
});


//問題5
$(function() {
    $('#lang-select').on('change', function() {
        
    });
});
