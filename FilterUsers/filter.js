function filterUsers(users, criteria) {
    let result = []; 
    
    for (let i = 0; i < users.length; i++) {
        let user = users[i]; 
        let correctAge = user.age >= criteria.age; 
        let correctEmail = false; 

        
        for (let j = 0; j <= user.email.length - criteria.email.length; j++) {
           
            if (user.email.substring(j, j + criteria.email.length) === criteria.email) {
                correctEmail = true;
                break; 
            }
        }

        if (correctAge && correctEmail) {
            result.push(user);
        }
    }

    return result; 
}

let characters = [
    { name: "John", email: "john_the_one@gmail.com", age: 18 },
    { name: "Diane", email: "princess.diane@gmail.com", age: 43 },
    { name: "Snoop", email: "hip-hop@gmail.com", age: 4 },
    { name: "Ice T", email: "OG_ice@gmail.com", age: 14 },
    { name: "Vanilla Ice", email: "wannabeIce@gmail.com", age: 216 },
    { name: "Eminem", email: "theOne@gmail.com", age: 17 },
];

const criteria = {
    age: 18,
    email: "gmail.com",
};

const filteredUsers = filterUsers(characters, criteria);
console.log(filteredUsers);