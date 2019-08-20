axios
	.get('/guest')
	.then(function(response) {
		// handle success
		let available = response.data.filter((table) => room.available);
		let kingAvailable = available.filter((room) => room.bedSize === 'king');
		let queenAvailable = available.filter((room) => room.bedSize === 'queen');
		let doubleAvailable = available.filter((room) => room.bedSize === 'double');

		document.getElementById('root').innerHTML = `
		    <p>${kingAvailable.length} King Rooms available</p>
		    <p>${queenAvailable.length} Queen Rooms available</p>
		    <p>${doubleAvailable.length} Double Rooms available</p>
		`;
		console.log(response);
	})
	.catch(function(error) {
		// handle error
		console.log(error);
	})
	.finally(function() {
		// always executed
	});
