var curImage = document.getElementById("photo");
var galleryStarter;
var isGalleryOn = true;
var images = [ "David.jpeg", "Dad.png" ]
var preloadedImgs = [];
var counter = 0;
function init() {
	for (var i = 0; i < images.length; i++) {
		preloadedImgs[i] = new Image();
	}
	for (var i = 0; i < preloadedImgs.length; i++) {
		preloadedImgs[i].src = images[i];
	}
	var btnStart = document.getElementById("btnStart");
	var btnStop = document.getElementById("btnStop");
	btnStart.onclick = startGallery;
	btnStop.onclick = stopGallery;
	if (isGalleryOn) {
		startGallery();
	}
}
onload = init;
function startGallery() {
	curImage.src = preloadedImgs[counter].src;
	counter++;
	if (counter == preloadedImgs.length) {
		counter = 0;
	}
	galleryStarter = setTimeout("startGallery()", 2000);
	isGalleryOn = true;
}
function stopGallery() {
	clearTimeout(galleryStarter);
	isGalleryOn = false;
}
