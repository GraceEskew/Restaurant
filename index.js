class ReservationService {
	getLastName() {
		return axios.get('/guest');
	}
	getNumInParty(numInParty) {
		return axios.get('/guest');
	}
}

class TableComponent {
	constructor(id, numSeats, isAvailable) {
		this.id = id;
		this.numSeats = numSeats;
		this.isAvailable = isAvailable;
	}
}
class GuestComponent {
	constructor(firstName, lastName, numInParty) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.numInParty = numInParty;
		this.template = `<div> </div>`;
	}
}
class TableListComponent {}
