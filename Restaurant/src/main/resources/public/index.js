class ReservationService {
	getLastName() {
		return axios.get('/guest');
	}
	getNumInParty(numInParty) {
		return axios.get('/guest');
	}
}

class TableComponent {
	constructor(tableNum, numSeats, isAvailable) {
		this.tableNum = tableNum;
		this.numSeats = numSeats;
		this.isAvailable = isAvailable;
		this.template = `<p></p>`;
	}
}
class GuestComponent {
	constructor(firstName, lastName, numInParty) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.numInParty = numInParty;
		this.template2 = `<div> </div>`;
	}
}
class TableListComponent {
	construtor(ReservationService) {
		ReservationService.getNumInParty().then((res) => {
			this.TableListComponent = res.data;
			this.TableComponent = this.TableListComponent.map((e) => e.numInParty);

			this.template = `
            ,<div>
            ${this.TableListComponent.map((e) => new TableComponent(e).template).join('')}
            </div>
            `;
		});
	}
}
class GuestListComponent {
	constructor(ReservationService) {
		ReservationService.getLastName().then((res) => {
			this.GuestListComponent = res.data;
			this.GuestListComponent = this.GuestListComponent.map((e) => e.lastName);

			this.template = `
            ,<div>
            ${this.GuestListComponent.map((e) => new GuestComponent(e).template2).join('')}
            </div>            
            `;
			document.getElementById('root').innerHTML = this.template;
			document.getElementById('root').innerHTML = this.template2;
		});
	}
}
const service = new ReservationService();
const component = new TableListComponent(service);
const component2 = new GuestListComponent(service);

document.getElementById('addGuest').addEventListener('click', function(e) {
	const headers = {
		headers: {
			'Content-Type': 'application/Json'
		}
	};
	let firstName = document.getElementById('firstName').value;
	let lastName = document.getElementById('lastName').value;
	let numInParty = document.getElementById('numInParty').value;
	let tableNum = document.getElementById('tableNum').value;

	let guest = {
		firstName: firstName,
		lastName: lastName,
		numInParty: numInParty
	};
	axios
		.post('/guest', JSON.stringify(guest), headers)
		.then(function(response) {
			console.log(response);
		})
		.catch(function(error) {
			console.log(error);
		});
});
