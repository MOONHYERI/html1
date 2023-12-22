$(function () {

    var duration = 300;

    var $side = $('#sidebar');
    var $toggleButton = $('#toggleButton');
    var $toggleIcon = $('#toggleIcon');

    $toggleButton.on('click', function () {
        $side.toggleClass('open');

        if ($side.hasClass('open')) {
            $side.stop(true).animate({ left: '0px' }, duration);
            $toggleButton.find('.btn_t');
            $toggleIcon.attr('src', './image/angle-left-solid.svg');
        } else {
            $side.stop(true).animate({ left: '-400px' }, duration);
            $toggleButton.find('.btn_t');
            $toggleIcon.attr('src', './image/angle-right-solid.svg');
        }
    });
});